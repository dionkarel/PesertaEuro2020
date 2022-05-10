package com.dicoding.pesertaeuro2020

import android.view.LayoutInflater
import android.view.PixelCopy.request
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAdapterA (private val listDataA : ArrayList<PesertaA>)  : RecyclerView.Adapter<ListAdapterA.ListViewHolder> () {

    private lateinit var click1: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.click1 = onItemClickCallback
    }
    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNameA : TextView = itemView.findViewById(R.id.nama_pesertaA)
        var tvDetailA : TextView = itemView.findViewById(R.id.detail_pesertaA)
        var imgFotoA : ImageView = itemView.findViewById(R.id.fotoA)
        var btnFavA : Button = itemView.findViewById(R.id.btn_favA)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i : Int): ListViewHolder {
        val viewA : View = LayoutInflater.from(viewGroup.context).inflate(R.layout.list_peserta_a, viewGroup, false)
        return ListViewHolder(viewA)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val pesertaA = listDataA[position]
        Glide.with(holder.itemView.context)
            .load(pesertaA.fotoA)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgFotoA)
        holder.tvNameA.text = pesertaA.nameA
        holder.tvDetailA.text = pesertaA.detailA
        holder.itemView.setOnClickListener { click1.onItemClicked(listDataA[holder.layoutPosition]) }
        holder.btnFavA.setOnClickListener { Toast.makeText(holder.itemView.context, "Tim Favorite Saya " + pesertaA.nameA, Toast.LENGTH_SHORT).show() }
        }

    override fun getItemCount(): Int {
        return listDataA.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: PesertaA)
    }
}

class ListAdapterB (private val listDataB : ArrayList<PesertaB>)  : RecyclerView.Adapter<ListAdapterB.ListViewHolder> () {
    private lateinit var click2: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.click2 = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNameB: TextView = itemView.findViewById(R.id.nama_pesertaB)
        var tvDetailB: TextView = itemView.findViewById(R.id.detail_pesertaB)
        var imgFotoB: ImageView = itemView.findViewById(R.id.fotoB)
        var btnFavB : Button = itemView.findViewById(R.id.btn_favB)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val viewB: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list_peserta_b, viewGroup, false)
        return ListViewHolder(viewB)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val pesertaB = listDataB[position]
        Glide.with(holder.itemView.context)
            .load(pesertaB.fotoB)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgFotoB)
        holder.tvNameB.text = pesertaB.nameB
        holder.tvDetailB.text = pesertaB.detailB
        holder.itemView.setOnClickListener { click2.onItemClicked(listDataB[holder.layoutPosition])}
        holder.btnFavB.setOnClickListener { Toast.makeText(holder.itemView.context, "Tim Favorite Saya " + pesertaB.nameB, Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int {
        return listDataB.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: PesertaB)
    }
}

class ListAdapterC (private val listDataC : ArrayList<PesertaC>)  : RecyclerView.Adapter<ListAdapterC.ListViewHolder> () {
    private lateinit var click3: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.click3 = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNameC: TextView = itemView.findViewById(R.id.nama_pesertaC)
        var tvDetailC: TextView = itemView.findViewById(R.id.detail_pesertaC)
        var imgFotoC: ImageView = itemView.findViewById(R.id.fotoC)
        var btnFavC : Button = itemView.findViewById(R.id.btn_favC)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val viewC: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list_peserta_c, viewGroup, false)
        return ListViewHolder(viewC)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val pesertaC = listDataC[position]
        Glide.with(holder.itemView.context)
            .load(pesertaC.fotoC)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgFotoC)
        holder.tvNameC.text = pesertaC.nameC
        holder.tvDetailC.text = pesertaC.detailC
        holder.itemView.setOnClickListener { click3.onItemClicked(listDataC[holder.layoutPosition])}
        holder.btnFavC.setOnClickListener { Toast.makeText(holder.itemView.context, "Tim Favorite Saya " + pesertaC.nameC, Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int {
        return listDataC.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: PesertaC)
    }
}

class ListAdapterD (private val listDataD : ArrayList<PesertaD>)  : RecyclerView.Adapter<ListAdapterD.ListViewHolder> () {
    private lateinit var click4: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.click4 = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNameD: TextView = itemView.findViewById(R.id.nama_pesertaD)
        var tvDetailD: TextView = itemView.findViewById(R.id.detail_pesertaD)
        var imgFotoD: ImageView = itemView.findViewById(R.id.fotoD)
        var btnFavD : Button = itemView.findViewById(R.id.btn_favD)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val viewD: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list_peserta_d, viewGroup, false)
        return ListViewHolder(viewD)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val pesertaD = listDataD[position]
        Glide.with(holder.itemView.context)
            .load(pesertaD.fotoD)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgFotoD)
        holder.tvNameD.text = pesertaD.nameD
        holder.tvDetailD.text = pesertaD.detailD
        holder.itemView.setOnClickListener { click4.onItemClicked(listDataD[holder.layoutPosition])}
        holder.btnFavD.setOnClickListener { Toast.makeText(holder.itemView.context, "Tim Favorite Saya " + pesertaD.nameD, Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int {
        return listDataD.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: PesertaD)
    }
}

class ListAdapterE (private val listDataE : ArrayList<PesertaE>)  : RecyclerView.Adapter<ListAdapterE.ListViewHolder> () {
    private lateinit var click5: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.click5 = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNameE: TextView = itemView.findViewById(R.id.nama_pesertaE)
        var tvDetailE: TextView = itemView.findViewById(R.id.detail_pesertaE)
        var imgFotoE: ImageView = itemView.findViewById(R.id.fotoE)
        var btnFavE : Button = itemView.findViewById(R.id.btn_favE)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val viewE: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list_peserta_e, viewGroup, false)
        return ListViewHolder(viewE)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val pesertaE = listDataE[position]
        Glide.with(holder.itemView.context)
            .load(pesertaE.fotoE)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgFotoE)
        holder.tvNameE.text = pesertaE.nameE
        holder.tvDetailE.text = pesertaE.detailE
        holder.itemView.setOnClickListener { click5.onItemClicked(listDataE[holder.layoutPosition])}
        holder.btnFavE.setOnClickListener { Toast.makeText(holder.itemView.context, "Tim Favorite Saya " + pesertaE.nameE, Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int {
        return listDataE.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: PesertaE)
    }
}
class ListAdapterF (private val listDataF : ArrayList<PesertaF>)  : RecyclerView.Adapter<ListAdapterF.ListViewHolder> () {
    private lateinit var click6: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.click6 = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNameF: TextView = itemView.findViewById(R.id.nama_pesertaF)
        var tvDetailF: TextView = itemView.findViewById(R.id.detail_pesertaF)
        var imgFotoF: ImageView = itemView.findViewById(R.id.fotoF)
        var btnFavF : Button = itemView.findViewById(R.id.btn_favF)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val viewF: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list_peserta_f, viewGroup, false)
        return ListViewHolder(viewF)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val pesertaF = listDataF[position]
        Glide.with(holder.itemView.context)
            .load(pesertaF.fotoF)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgFotoF)
        holder.tvNameF.text = pesertaF.nameF
        holder.tvDetailF.text = pesertaF.detailF
        holder.itemView.setOnClickListener { click6.onItemClicked(listDataF[holder.layoutPosition])}
        holder.btnFavF.setOnClickListener { Toast.makeText(holder.itemView.context, "Tim Favorite Saya " + pesertaF.nameF, Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int {
        return listDataF.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: PesertaF)
    }
}