package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o3y0 implements enn {
    public static final String e = nik1.e6.a;
    public final i5y0 a;
    public final lzn0 b;
    public final x1i1 c;
    public final zwa d;

    public o3y0(i5y0 i5y0Var, lzn0 lzn0Var, x1i1 x1i1Var, zwa zwaVar) {
        this.a = i5y0Var;
        this.b = lzn0Var;
        this.c = x1i1Var;
        this.d = zwaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(qmn qmnVar, lnm lnmVar) {
        l3y0 l3y0Var;
        if (lnmVar instanceof l3y0) {
            l3y0Var = (l3y0) lnmVar;
            int i = l3y0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l3y0Var.c = i - Integer.MIN_VALUE;
            } else {
                l3y0Var = new l3y0(this, (onm) lnmVar);
            }
        } else {
            l3y0Var = new l3y0(this, (onm) lnmVar);
        }
        Object objB = l3y0Var.a;
        int i2 = l3y0Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            l3y0Var.c = 1;
            objB = b(l3y0Var);
            Object obj = d9n.a;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        if (((Boolean) objB).booleanValue()) {
            return new mmn(ulx.c, new Integer(2131954657), new Integer(2131954658), new Integer(2131954656), (String) null, new tm81(0, 10, "prompted_playlist", null, true), (nmn) null, 11, new jmn(g2y0.O0, new cqu0(this, (lnm) null, (byte) 23)), 340);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r8 == r6) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.onm r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p.m3y0
            if (r0 == 0) goto L13
            r0 = r8
            p.m3y0 r0 = (p.m3y0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.m3y0 r0 = new p.m3y0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            p.i5y0 r2 = r7.a
            r3 = 2
            r4 = 0
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L38
            if (r1 == r5) goto L34
            if (r1 != r3) goto L2d
            p.hm5.M(r8)
            goto L5f
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            r7 = 0
            return r7
        L34:
            p.hm5.M(r8)
            goto L4d
        L38:
            p.hm5.M(r8)
            boolean r8 = r2.g()
            if (r8 != 0) goto L42
            goto L6e
        L42:
            r0.c = r5
            p.zwa r8 = r7.d
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r6) goto L4d
            goto L5e
        L4d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L56
            goto L6e
        L56:
            r0.c = r3
            java.lang.Object r8 = r7.c(r0)
            if (r8 != r6) goto L5f
        L5e:
            return r6
        L5f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto L6d
            boolean r7 = r2.d()
            if (r7 == 0) goto L6e
        L6d:
            r4 = r5
        L6e:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.o3y0.b(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        n3y0 n3y0Var;
        if (onmVar instanceof n3y0) {
            n3y0Var = (n3y0) onmVar;
            int i = n3y0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n3y0Var.c = i - Integer.MIN_VALUE;
            } else {
                n3y0Var = new n3y0(this, onmVar);
            }
        } else {
            n3y0Var = new n3y0(this, onmVar);
        }
        Object objP = n3y0Var.a;
        int i2 = n3y0Var.c;
        if (i2 == 0) {
            hm5.M(objP);
            ytw0 ytw0Var = jfv.b;
            long jK0 = fdg1.k0(5, ngv.e);
            c3u0 c3u0Var = new c3u0(this, (lnm) null, (byte) 20);
            n3y0Var.c = 1;
            objP = rc2.P(jK0, c3u0Var, n3y0Var);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objP);
        }
        Boolean bool = (Boolean) objP;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : this.a.c());
    }
}
