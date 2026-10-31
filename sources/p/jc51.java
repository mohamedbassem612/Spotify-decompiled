package p;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jc51 implements View.OnLayoutChangeListener {
    public final /* synthetic */ SearchView a;

    public jc51(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.j();
    }
}
