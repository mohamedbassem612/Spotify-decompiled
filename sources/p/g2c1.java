package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g2c1 implements kwn {
    public final y1c1 a;
    public final mr20 b;

    public g2c1(y1c1 y1c1Var) {
        this.a = y1c1Var;
        mmr0 mmr0VarV = ((w2c1) y1c1Var).V(jwn.class);
        this.b = t5p1.i(wgo1.F((ymd0) mmr0VarV.a, mmr0VarV.b));
    }

    public final mr20 a() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r12.invoke(r0) == r6) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r10, java.lang.String r11, p.l24 r12, p.lnm r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof p.f2c1
            if (r0 == 0) goto L13
            r0 = r13
            p.f2c1 r0 = (p.f2c1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            p.f2c1 r0 = new p.f2c1
            p.onm r13 = (p.onm) r13
            r0.<init>(r9, r13)
        L1a:
            java.lang.Object r13 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            int r9 = r0.b
            p.hm5.M(r13)
            goto L75
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r5
        L36:
            p.l24 r12 = r0.a
            p.hm5.M(r13)
            goto L5d
        L3c:
            p.hm5.M(r13)
            p.svn r13 = new p.svn
            r13.<init>(r10, r11)
            p.y1c1 r10 = r9.a
            p.w2c1 r10 = (p.w2c1) r10
            r10.T(r13)
            p.e2c1 r10 = new p.e2c1
            r10.<init>(r9, r5, r4)
            r0.a = r12
            r0.e = r4
            r7 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r13 = p.rc2.O(r7, r10, r0)
            if (r13 != r6) goto L5d
            goto L74
        L5d:
            p.jwn r13 = (p.jwn) r13
            if (r13 == 0) goto L63
            r9 = r4
            goto L64
        L63:
            r9 = r2
        L64:
            if (r9 == 0) goto L75
            if (r12 == 0) goto L75
            r0.a = r5
            r0.b = r9
            r0.e = r3
            java.lang.Object r10 = r12.invoke(r0)
            if (r10 != r6) goto L75
        L74:
            return r6
        L75:
            if (r9 == 0) goto L78
            r2 = r4
        L78:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g2c1.b(java.lang.String, java.lang.String, p.l24, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, String str2, lnm lnmVar) {
        d2c1 d2c1Var;
        if (lnmVar instanceof d2c1) {
            d2c1Var = (d2c1) lnmVar;
            int i = d2c1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d2c1Var.c = i - Integer.MIN_VALUE;
            } else {
                d2c1Var = new d2c1(this, (onm) lnmVar);
            }
        } else {
            d2c1Var = new d2c1(this, (onm) lnmVar);
        }
        Object objO = d2c1Var.a;
        int i2 = d2c1Var.c;
        if (i2 == 0) {
            hm5.M(objO);
            this.a.T(new rvn(str, str2));
            e2c1 e2c1Var = new e2c1(this, null, (byte) 0);
            d2c1Var.c = 1;
            objO = rc2.O(2000L, e2c1Var, d2c1Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
        }
        return Boolean.valueOf(((jwn) objO) != null);
    }
}
