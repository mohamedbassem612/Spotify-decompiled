package p;

import android.util.Pair;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class a3i0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d3i0 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ a3i0(d3i0 d3i0Var, Pair pair, byte b) {
        this.a = b;
        this.b = d3i0Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Pair pair = this.c;
        d3i0 d3i0Var = this.b;
        switch (b) {
            case 0:
                d3i0Var.b.i.z(((Integer) pair.first).intValue(), (p2i0) pair.second);
                break;
            case 1:
                d3i0Var.b.i.U(((Integer) pair.first).intValue(), (p2i0) pair.second);
                break;
            default:
                d3i0Var.b.i.q(((Integer) pair.first).intValue(), (p2i0) pair.second);
                break;
        }
    }
}
