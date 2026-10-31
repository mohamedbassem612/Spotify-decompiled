package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hv00 {
    public final uu00 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, onm onmVar) {
        gv00 gv00Var;
        if (onmVar instanceof gv00) {
            gv00Var = (gv00) onmVar;
            int i = gv00Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gv00Var.d = i - Integer.MIN_VALUE;
            } else {
                gv00Var = new gv00(this, onmVar);
            }
        } else {
            gv00Var = new gv00(this, onmVar);
        }
        Object objJ = gv00Var.b;
        int i2 = gv00Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                ezc ezcVarG = yoi1.g(this.a.b(new oi("music-quiz", false, new kq00(str, (byte) 3))));
                afv afvVar = new afv(2, (lnm) null, (byte) 11);
                gv00Var.a = str;
                gv00Var.d = 1;
                objJ = b5p1.j(ezcVarG, afvVar, gv00Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = gv00Var.a;
                hm5.M(objJ);
            }
            z1g1 z1g1Var = ((uv00) objJ).a(z1g1.class, str).b;
            return z1g1Var != null ? z1g1Var.e : "";
        } catch (Throwable unused) {
            return "";
        }
    }
}
