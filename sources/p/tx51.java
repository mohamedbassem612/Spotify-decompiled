package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tx51 implements mk90 {
    public final d0r a;
    public final ov80 b;
    public final xx4 c;
    public final o3r d = ujo1.t();
    public final o3r e = ujo1.u();
    public final o3r f = w3p1.o(new l4r(v061.a, 2, wu51.h, new j4r(wu51.f), wu51.i), wu51.g);

    public tx51(d0r d0rVar, ov80 ov80Var, xx4 xx4Var) {
        this.a = d0rVar;
        this.b = ov80Var;
        this.c = xx4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum d(xj90 xj90Var, onm onmVar) {
        qx51 qx51Var;
        if (onmVar instanceof qx51) {
            qx51Var = (qx51) onmVar;
            int i = qx51Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qx51Var.c = i - Integer.MIN_VALUE;
            } else {
                qx51Var = new qx51(this, onmVar);
            }
        } else {
            qx51Var = new qx51(this, onmVar);
        }
        Object obj = qx51Var.a;
        int i2 = qx51Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            if (!u890.j(f(this.d, rih1.a), Boolean.TRUE)) {
                return lk90.a;
            }
            int i3 = xj90Var.a;
            zuc0 zuc0Var = xj90Var.b;
            qx51Var.c = 1;
            Object objI = i(i3, zuc0Var, qx51Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return lk90.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (i(r10, r9, r0) == r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        if (r1 == r5) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Enum e(p.zj90 r9, p.onm r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p.rx51
            if (r0 == 0) goto L13
            r0 = r10
            p.rx51 r0 = (p.rx51) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.rx51 r0 = new p.rx51
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.zj90 r9 = r0.a
            p.hm5.M(r10)
            goto L96
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r2
        L31:
            p.hm5.M(r10)
            goto La1
        L35:
            p.hm5.M(r10)
            p.xx4 r10 = r8.c
            boolean r10 = r10.a()
            if (r10 != 0) goto L43
            p.lk90 r8 = p.lk90.a
            return r8
        L43:
            p.o3r r10 = r8.d
            p.rih1 r1 = p.rih1.a
            java.lang.Object r10 = r8.f(r10, r1)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r10 = p.u890.j(r10, r5)
            p.d9n r5 = p.d9n.a
            if (r10 == 0) goto L64
            int r10 = r9.a
            p.zuc0 r9 = r9.b
            r0.a = r2
            r0.d = r4
            java.lang.Object r8 = r8.i(r10, r9, r0)
            if (r8 != r5) goto La1
            goto L95
        L64:
            p.zuc0 r10 = r9.b
            java.lang.String r10 = r10.a
            r0.a = r9
            r0.d = r3
            p.o3r r2 = r8.e
            java.lang.Object r2 = r8.f(r2, r1)
            p.gz51 r2 = (p.gz51) r2
            if (r2 != 0) goto L78
            p.gz51 r2 = p.gz51.c
        L78:
            p.pwc0 r3 = p.pwc0.D
            p.dz51 r6 = new p.dz51
            p.gz51 r7 = new p.gz51
            java.util.Set r2 = r2.b
            java.util.LinkedHashSet r10 = p.dm61.x0(r10, r2)
            r7.<init>(r10, r4)
            r6.<init>(r7)
            p.d0r r10 = r8.a
            java.lang.Object r10 = p.d0r.d(r10, r3, r1, r6, r0)
            if (r10 != r5) goto L93
            r1 = r10
        L93:
            if (r1 != r5) goto L96
        L95:
            return r5
        L96:
            p.zuc0 r10 = r9.b
            java.lang.String r10 = r10.c
            int r9 = r9.a
            p.ov80 r8 = r8.b
            r8.a(r9, r10)
        La1:
            p.lk90 r8 = p.lk90.b
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tx51.e(p.zj90, p.onm):java.lang.Enum");
    }

    public final Object f(o3r o3rVar, Object obj) {
        i1r i1rVarN = x2p1.n(this.a, o3rVar, obj);
        i1r i1rVar = i1rVarN instanceof i1r ? i1rVarN : null;
        if (i1rVar != null) {
            return i1rVar.a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object i(int i, zuc0 zuc0Var, onm onmVar) {
        sx51 sx51Var;
        boolean zJ;
        int i2;
        zuc0 zuc0Var2 = zuc0Var;
        if (onmVar instanceof sx51) {
            sx51Var = (sx51) onmVar;
            int i3 = sx51Var.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sx51Var.f = i3 - Integer.MIN_VALUE;
            } else {
                sx51Var = new sx51(this, onmVar);
            }
        } else {
            sx51Var = new sx51(this, onmVar);
        }
        Object obj = sx51Var.d;
        int i4 = sx51Var.f;
        if (i4 == 0) {
            hm5.M(obj);
            zJ = u890.j(f(this.f, zuc0Var2.a), Boolean.TRUE);
            String str = zuc0Var2.a;
            v061 v061Var = v061.a;
            sx51Var.b = zuc0Var2;
            sx51Var.a = i;
            sx51Var.c = zJ;
            sx51Var.f = 1;
            Object objD = d0r.d(this.a, v061Var, str, t061.a, sx51Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
            i2 = i;
        } else {
            if (i4 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z = sx51Var.c;
            i2 = sx51Var.a;
            zuc0 zuc0Var3 = sx51Var.b;
            hm5.M(obj);
            zJ = z;
            zuc0Var2 = zuc0Var3;
        }
        ov80 ov80Var = this.b;
        if (zJ) {
            String str2 = zuc0Var2.c;
            i8h1 i8h1Var = ov80Var.a;
            r6h1 r6h1Var = ov80Var.b;
            Integer numValueOf = Integer.valueOf(i2);
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-playlist-entity-item-list-item";
            x6h1VarI.f = "3.0.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.c = numValueOf;
            x6h1VarI.d = str2;
            y6h1 y6h1VarA = x6h1VarI.a();
            b7x b7xVar = b7x.a;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), y6h1VarA, r6h1Var, System.currentTimeMillis()), (xj61) null);
        } else {
            ov80Var.a(i2, zuc0Var2.c);
        }
        return rih1.a;
    }

    public final Enum t(ak90 ak90Var, lnm lnmVar) {
        if (ak90Var instanceof xj90) {
            return d((xj90) ak90Var, (onm) lnmVar);
        }
        return ak90Var instanceof zj90 ? e((zj90) ak90Var, (onm) lnmVar) : lk90.a;
    }
}
