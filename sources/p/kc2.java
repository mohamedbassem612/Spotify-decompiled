package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kc2 {
    public final w0g a;
    public final a1g b;
    public final ov20 c;

    public kc2(w0g w0gVar, a1g a1gVar, ov20 ov20Var) {
        this.a = w0gVar;
        this.b = a1gVar;
        this.c = ov20Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        jc2 jc2Var;
        kc2 kc2Var;
        String str;
        Object objI;
        String str2;
        if (onmVar instanceof jc2) {
            jc2Var = (jc2) onmVar;
            int i = jc2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jc2Var.d = i - Integer.MIN_VALUE;
            } else {
                jc2Var = new jc2(this, onmVar);
            }
        } else {
            jc2Var = new jc2(this, onmVar);
        }
        Object objF = jc2Var.b;
        int i2 = jc2Var.d;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                kc2Var = (kc2) jc2Var.a;
                hm5.M(objF);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = (String) jc2Var.a;
                hm5.M(objF);
            }
            return new ahm0(mdh1.a, false, str2, ((Boolean) objF).booleanValue());
        }
        hm5.M(objF);
        z0g z0gVarB = this.b.b();
        if (z0gVarB != null) {
            z0g z0gVar = z0gVarB.a == 2 ? z0gVarB : null;
            if (z0gVar != null) {
                str = z0gVar.b;
                mr20 mr20VarA = this.c.a("has-addons-terminated-by-transition", false);
                jc2Var.a = str;
                jc2Var.d = 2;
                objI = b5p1.i(mr20VarA, jc2Var);
                if (objI != d9nVar) {
                    String str3 = str;
                    objF = objI;
                    str2 = str3;
                    return new ahm0(mdh1.a, false, str2, ((Boolean) objF).booleanValue());
                }
            }
            return d9nVar;
        }
        jc2Var.a = this;
        jc2Var.d = 1;
        objF = this.a.f(jc2Var);
        if (objF != d9nVar) {
            kc2Var = this;
        }
        return d9nVar;
        tur0 tur0Var = (tur0) objF;
        a1g a1gVar = kc2Var.b;
        String str4 = tur0Var.a;
        long j = tur0Var.c;
        hma1 hma1VarEdit = a1gVar.a.edit();
        hma1VarEdit.d(a1g.c, "AgeAssurance");
        hma1VarEdit.d(a1g.d, str4);
        hma1VarEdit.c(a1g.e, j);
        hma1VarEdit.g();
        str = tur0Var.a;
        mr20 mr20VarA2 = this.c.a("has-addons-terminated-by-transition", false);
        jc2Var.a = str;
        jc2Var.d = 2;
        objI = b5p1.i(mr20VarA2, jc2Var);
        if (objI != d9nVar) {
            String str5 = str;
            objF = objI;
            str2 = str5;
            return new ahm0(mdh1.a, false, str2, ((Boolean) objF).booleanValue());
        }
        return d9nVar;
    }
}
