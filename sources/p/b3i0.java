package p;

import android.util.Pair;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class b3i0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d3i0 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ d2e0 d;
    public final /* synthetic */ qqh0 e;

    public /* synthetic */ b3i0(d3i0 d3i0Var, Pair pair, d2e0 d2e0Var, qqh0 qqh0Var, byte b) {
        this.a = b;
        this.b = d3i0Var;
        this.c = pair;
        this.d = d2e0Var;
        this.e = qqh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qqh0 qqh0Var = this.e;
        d2e0 d2e0Var = this.d;
        Pair pair = this.c;
        d3i0 d3i0Var = this.b;
        switch (b) {
            case 0:
                d3i0Var.b.i.h(((Integer) pair.first).intValue(), (p2i0) pair.second, d2e0Var, qqh0Var);
                break;
            default:
                d3i0Var.b.i.d(((Integer) pair.first).intValue(), (p2i0) pair.second, d2e0Var, qqh0Var);
                break;
        }
    }
}
