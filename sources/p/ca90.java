package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ca90 implements nku {
    public final /* synthetic */ long a;
    public final /* synthetic */ da90 b;

    public ca90(long j, da90 da90Var) {
        this.a = j;
        this.b = da90Var;
    }

    public final void dispose() {
        long j = this.a;
        if (j != 0) {
            da90 da90Var = this.b;
            da90Var.c = (System.nanoTime() - j) + da90Var.c;
        }
    }
}
