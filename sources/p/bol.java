package p;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bol extends Filter {
    public final List a;
    public final /* synthetic */ col b;

    public bol(col colVar, List list) {
        this.b = colVar;
        this.a = list;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        List list = this.a;
        if (charSequence != null && !ihc1.y0(charSequence)) {
            String string = ihc1.e1(charSequence.toString()).toString();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (ihc1.h0((String) obj, string, true)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = list;
        filterResults.count = list.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj = filterResults != null ? filterResults.values : null;
        col colVar = this.b;
        colVar.a = (List) obj;
        colVar.notifyDataSetChanged();
    }
}
