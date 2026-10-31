package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class piq0 implements m111 {
    public final zhq0 a;
    public final mih0 b;
    public s2t c;
    public final xgn0 d = ygn0.a();

    public piq0(zhq0 zhq0Var, mih0 mih0Var) {
        this.a = zhq0Var;
        this.b = mih0Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.m111
    public final Object a(onm onmVar) throws Throwable {
        niq0 niq0Var;
        vgn0 vgn0Var;
        int i;
        Throwable th;
        vgn0 vgn0Var2;
        l2t l2tVar;
        Object objE;
        if (onmVar instanceof niq0) {
            niq0Var = (niq0) onmVar;
            int i2 = niq0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                niq0Var.e = i2 - Integer.MIN_VALUE;
            } else {
                niq0Var = new niq0(this, onmVar);
            }
        } else {
            niq0Var = new niq0(this, onmVar);
        }
        Object obj = niq0Var.c;
        int i3 = niq0Var.e;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                vgn0Var = this.d;
                niq0Var.a = vgn0Var;
                i = 0;
                niq0Var.b = 0;
                niq0Var.e = 1;
                if (vgn0Var.a(niq0Var) != d9nVar) {
                }
                return d9nVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vgn0Var2 = niq0Var.a;
                try {
                    hm5.M(obj);
                    l2tVar = (l2t) obj;
                    vgn0Var = vgn0Var2;
                    vgn0Var.c(null);
                    niq0Var.a = null;
                    niq0Var.e = 3;
                    objE = l2tVar.E(niq0Var);
                    if (objE == d9nVar) {
                        return d9nVar;
                    }
                    return objE;
                } catch (Throwable th2) {
                    th = th2;
                    vgn0Var2.c(null);
                    throw th;
                }
            }
            i = niq0Var.b;
            vgn0 vgn0Var3 = niq0Var.a;
            hm5.M(obj);
            vgn0Var = vgn0Var3;
            l2tVar = this.c;
            if (l2tVar != null) {
                vgn0Var.c(null);
                niq0Var.a = null;
                niq0Var.e = 3;
                objE = l2tVar.E(niq0Var);
                if (objE == d9nVar) {
                    return objE;
                }
            } else {
                e3p0 e3p0Var = new e3p0(this, (lnm) null, (byte) 5);
                niq0Var.a = vgn0Var;
                niq0Var.b = i;
                niq0Var.e = 2;
                Object objS = smo1.s(e3p0Var, niq0Var);
                if (objS != d9nVar) {
                    vgn0 vgn0Var4 = vgn0Var;
                    obj = objS;
                    vgn0Var2 = vgn0Var4;
                    l2tVar = (l2t) obj;
                    vgn0Var = vgn0Var2;
                    vgn0Var.c(null);
                    niq0Var.a = null;
                    niq0Var.e = 3;
                    objE = l2tVar.E(niq0Var);
                    if (objE == d9nVar) {
                        return objE;
                    }
                }
            }
            return d9nVar;
        } catch (Throwable th3) {
            vgn0 vgn0Var5 = vgn0Var;
            th = th3;
            vgn0Var2 = vgn0Var5;
            vgn0Var2.c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r7 == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.onm r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p.oiq0
            if (r0 == 0) goto L13
            r0 = r7
            p.oiq0 r0 = (p.oiq0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.oiq0 r0 = new p.oiq0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r7)
            goto L5e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            p.hm5.M(r7)
            goto L43
        L35:
            p.hm5.M(r7)
            r0.c = r4
            p.zhq0 r7 = r6.a
            p.fi20 r7 = r7.g()
            if (r7 != r5) goto L43
            goto L5d
        L43:
            p.fi20 r7 = (p.fi20) r7
            boolean r1 = r7 instanceof p.di20
            if (r1 == 0) goto L66
            p.di20 r7 = (p.di20) r7
            android.content.ComponentName r7 = r7.a()
            p.mih0 r6 = r6.b
            p.d520 r6 = r6.a(r7)
            r0.c = r3
            java.lang.Object r7 = r6.o(r0)
            if (r7 != r5) goto L5e
        L5d:
            return r5
        L5e:
            java.util.List r7 = (java.util.List) r7
            p.l111 r6 = new p.l111
            r6.<init>(r7, r4)
            return r6
        L66:
            java.lang.String r6 = "Spotify MediaBrowser not found"
            p.eg.m(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.piq0.b(p.onm):java.lang.Object");
    }
}
