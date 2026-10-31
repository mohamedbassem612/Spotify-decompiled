package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t0a0 {
    public final n381 a;
    public final q8n b;

    public t0a0(n381 n381Var, q8n q8nVar) {
        this.a = n381Var;
        this.b = q8nVar;
    }

    public final Object a(pp90 pp90Var, String str, onm onmVar) {
        if (pp90Var.h.b.e) {
            return fn31.Y(this.b, new z290(this, pp90Var, str, (lnm) null, (byte) 2), onmVar);
        }
        n57.e("You cannot remove a participant from a Jam if you are not the Host of that Jam!");
        return Boolean.FALSE;
    }
}
