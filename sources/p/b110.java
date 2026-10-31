package p;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b110 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ b110(RecyclerView recyclerView, byte b) {
        this.a = b;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        RecyclerView recyclerView = this.b;
        switch (b) {
            case 0:
                recyclerView.scrollBy(0, Integer.MAX_VALUE);
                break;
            default:
                e611 e611Var = recyclerView.p1;
                if (e611Var != null) {
                    e611Var.j();
                }
                recyclerView.N1 = false;
                break;
        }
    }
}
