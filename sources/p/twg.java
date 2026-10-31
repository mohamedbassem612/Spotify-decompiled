package p;

import android.view.View;
import android.widget.AdapterView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class twg implements AdapterView.OnItemClickListener {
    public p700 a;
    public WeakReference b;
    public WeakReference c;
    public AdapterView.OnItemClickListener d;
    public boolean e;

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AdapterView.OnItemClickListener onItemClickListener = this.d;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i, j);
        }
        View view2 = (View) this.c.get();
        AdapterView adapterView2 = (AdapterView) this.b.get();
        if (view2 == null || adapterView2 == null) {
            return;
        }
        uwg.c(this.a, view2, adapterView2);
    }
}
