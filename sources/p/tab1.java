package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tab1 implements ylt0 {
    public final wdm a;
    public final lag b;
    public final xrc0 c;
    public final b7r0 d;
    public final myq0 e;
    public final ruz f;

    public tab1(wdm wdmVar, lag lagVar, xrc0 xrc0Var, b7r0 b7r0Var, myq0 myq0Var, ruz ruzVar) {
        this.a = wdmVar;
        this.b = lagVar;
        this.c = xrc0Var;
        this.d = b7r0Var;
        this.e = myq0Var;
        this.f = ruzVar;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // p.ylt0
    public final Object a(slt0 slt0Var, ast0 ast0Var, r840 r840Var, y4m y4mVar, tv80 tv80Var, ijk0 ijk0Var, boolean z, onm onmVar) {
        rab1 rab1Var;
        String str;
        String str2;
        tv80 tv80Var2;
        boolean z2;
        ast0 ast0Var2 = ast0Var;
        if (onmVar instanceof rab1) {
            rab1Var = (rab1) onmVar;
            int i = rab1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                rab1Var.g = i - Integer.MIN_VALUE;
            } else {
                rab1Var = new rab1(this, onmVar);
            }
        } else {
            rab1Var = new rab1(this, onmVar);
        }
        Object objO = rab1Var.e;
        int i2 = rab1Var.g;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objO);
            if (slt0Var instanceof qlt0) {
                str = ((qlt0) slt0Var).a;
            } else if (slt0Var instanceof plt0) {
                str = ((plt0) slt0Var).a;
            } else {
                if (!(slt0Var instanceof rlt0)) {
                    eg.o();
                    return null;
                }
                str = ((rlt0) slt0Var).b;
            }
            if (y4mVar instanceof w4m) {
                w4m w4mVar = (w4m) y4mVar;
                if (!w4mVar.b) {
                    u4m u4mVar = w4mVar.a;
                    rab1Var.a = null;
                    rab1Var.b = null;
                    rab1Var.c = null;
                    rab1Var.d = z;
                    rab1Var.g = 1;
                    if (this.b.t(str, u4mVar, tv80Var, rab1Var) == obj) {
                        return obj;
                    }
                    return rih1Var;
                }
            }
            if (r840Var instanceof o840) {
                rab1Var.a = ast0Var2;
                rab1Var.b = tv80Var;
                rab1Var.c = str;
                rab1Var.d = z;
                rab1Var.g = 2;
                objO = this.a.O(str, (o840) r840Var, tv80Var, rab1Var);
                if (objO != obj) {
                    str2 = str;
                    tv80Var2 = tv80Var;
                    z2 = z;
                }
            } else {
                ou80 ou80Var = tv80Var.a;
                rab1Var.a = null;
                rab1Var.b = null;
                rab1Var.c = null;
                rab1Var.d = z;
                rab1Var.g = 4;
                if (c(str, ast0Var2, ou80Var, rab1Var) != obj) {
                    return rih1Var;
                }
            }
            return obj;
        }
        if (i2 == 1) {
            hm5.M(objO);
            return rih1Var;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                hm5.M(objO);
                return rih1Var;
            }
            if (i2 == 4) {
                hm5.M(objO);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z2 = rab1Var.d;
        String str3 = rab1Var.c;
        tv80Var2 = rab1Var.b;
        ast0 ast0Var3 = rab1Var.a;
        hm5.M(objO);
        str2 = str3;
        ast0Var2 = ast0Var3;
        if (((x840) objO) instanceof w840) {
            ou80 ou80Var2 = tv80Var2.a;
            rab1Var.a = null;
            rab1Var.b = null;
            rab1Var.c = null;
            rab1Var.d = z2;
            rab1Var.g = 3;
            if (c(str2, ast0Var2, ou80Var2, rab1Var) == obj) {
                return obj;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0112, code lost:
    
        if (r18.e.o(r1, r4, r13) == r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r19, p.ast0 r20, p.ou80 r21, p.onm r22) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tab1.c(java.lang.String, p.ast0, p.ou80, p.onm):java.lang.Object");
    }
}
