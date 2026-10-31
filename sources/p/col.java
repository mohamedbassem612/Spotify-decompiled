package p;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class col extends ArrayAdapter {
    public List a;
    public final bol b;

    public col(Context context, List list) {
        super(context, 2131626327);
        this.a = list;
        this.b = new bol(this, list);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return this.b;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i) {
        return (String) o7h.t0(i, this.a);
    }
}
