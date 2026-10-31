package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hsm0 implements ejh {
    public final String a;
    public final msm0 b;
    public final q8n c;
    public utm0 d;
    public r091 e;
    public final gjh f = new gjh();
    public final idd1 g = new idd1(new gsm0(this, (byte) 0));
    public final idd1 h = new idd1(new gsm0(this, (byte) 1));

    public hsm0(String str, msm0 msm0Var, q8n q8nVar) {
        this.a = str;
        this.b = msm0Var;
        this.c = q8nVar;
    }

    public final Object a(String str, onm onmVar) {
        Object objY = fn31.Y(this.c, new d7i0(this, str, (lnm) null, (byte) 26), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }

    public final void b() {
        r091 r091Var = this.e;
        if (r091Var != null) {
            r091Var.g();
        }
        this.e = null;
        utm0 utm0Var = this.d;
        if (utm0Var != null) {
            utm0Var.d();
        }
        this.d = null;
    }
}
