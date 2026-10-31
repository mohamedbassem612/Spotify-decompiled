package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class se3 implements yt11 {
    public final lzn0 a;
    public final q8n b;

    public se3(q8n q8nVar, lzn0 lzn0Var) {
        this.a = lzn0Var;
        this.b = q8nVar;
    }

    public final Object a(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        String str;
        jmb1 jmb1Var = unb1Var instanceof jmb1 ? (jmb1) unb1Var : null;
        if (jmb1Var != null && (str = jmb1Var.a.a) != null) {
            Object objY = fn31.Y(this.b, new hb1(tv80Var, this, str, (lnm) null, (byte) 10), onmVar);
            if (objY == d9n.a) {
                return objY;
            }
        }
        return rih1.a;
    }

    public final s9d1 b() {
        return null;
    }
}
