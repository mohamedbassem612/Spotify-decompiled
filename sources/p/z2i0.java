package p;

import android.util.Pair;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class z2i0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d3i0 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ qqh0 d;

    public /* synthetic */ z2i0(d3i0 d3i0Var, Pair pair, qqh0 qqh0Var, byte b) {
        this.a = b;
        this.b = d3i0Var;
        this.c = pair;
        this.d = qqh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qqh0 qqh0Var = this.d;
        Pair pair = this.c;
        d3i0 d3i0Var = this.b;
        switch (b) {
            case 0:
                pfr pfrVar = d3i0Var.b.i;
                int iIntValue = ((Integer) pair.first).intValue();
                p2i0 p2i0Var = (p2i0) pair.second;
                p2i0Var.getClass();
                pfrVar.D(iIntValue, p2i0Var, qqh0Var);
                break;
            default:
                d3i0Var.b.i.F(((Integer) pair.first).intValue(), (p2i0) pair.second, qqh0Var);
                break;
        }
    }
}
