package p;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ic51 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ ic51(SearchView searchView, byte b) {
        this.a = b;
        this.b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        SearchView searchView = this.b;
        switch (b) {
            case 0:
                searchView.t();
                break;
            default:
                moo mooVar = searchView.s1;
                if (mooVar instanceof wwc1) {
                    mooVar.b(null);
                }
                break;
        }
    }
}
