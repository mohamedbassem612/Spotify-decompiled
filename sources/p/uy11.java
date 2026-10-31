package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uy11 extends ov61 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final mr20 d;

    public uy11(ov20 ov20Var, r241 r241Var, String str) {
        this.b = r241Var;
        this.c = str;
        this.d = new lt20(new tu41(((bw20) ov20Var).c(str, ""), (byte) 9), new q8t0(3, (lnm) null, (byte) 13), (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(int i, onm onmVar) {
        ty11 ty11Var;
        int i2;
        if (onmVar instanceof ty11) {
            ty11Var = (ty11) onmVar;
            int i3 = ty11Var.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ty11Var.d = i3 - Integer.MIN_VALUE;
            } else {
                ty11Var = new ty11(this, onmVar);
            }
        } else {
            ty11Var = new ty11(this, onmVar);
        }
        Object objK = ty11Var.b;
        int i4 = ty11Var.d;
        String str = null;
        d9n d9nVar = d9n.a;
        if (i4 == 0) {
            hm5.M(objK);
            mr20 mr20VarD = ((dg90) this.b).d();
            ty11Var.a = i;
            ty11Var.d = 1;
            objK = b5p1.k(mr20VarD, ty11Var);
            if (objK != d9nVar) {
            }
            return d9nVar;
        }
        if (i4 == 1) {
            i = ty11Var.a;
            hm5.M(objK);
        } else {
            if (i4 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = ty11Var.a;
            hm5.M(objK);
        }
        return ((Boolean) objK).booleanValue() ? new it61(new Integer(i2)) : new ht61(new Integer(2131961912), 0);
        q5l q5lVar = (r5l) objK;
        if (q5lVar instanceof q5l) {
            str = q5lVar.a;
        } else if (q5lVar instanceof p5l) {
            p5l p5lVar = (p5l) q5lVar;
            if (p5lVar.b) {
                str = p5lVar.a;
            }
        }
        if (str == null) {
            return new ht61(new Integer(2131961912), 0);
        }
        bah1 bah1Var = (bah1) this.c;
        ty11Var.a = i;
        ty11Var.d = 2;
        objK = bah1Var.c(i, str, ty11Var);
        if (objK != d9nVar) {
            i2 = i;
            if (((Boolean) objK).booleanValue()) {
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (p.fc11.i(r8, r2) == r7) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.String r9, java.lang.String r10, p.onm r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            p.r241 r0 = (p.r241) r0
            java.lang.Object r1 = r8.c
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r11 instanceof p.hvw0
            if (r2 == 0) goto L1b
            r2 = r11
            p.hvw0 r2 = (p.hvw0) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.e = r3
            goto L20
        L1b:
            p.hvw0 r2 = new p.hvw0
            r2.<init>(r8, r11)
        L20:
            java.lang.Object r8 = r2.c
            int r11 = r2.e
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r11 == 0) goto L44
            if (r11 == r5) goto L3a
            if (r11 != r4) goto L34
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L83
            goto L8a
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r6
        L3a:
            java.lang.String r10 = r2.b
            java.lang.String r9 = r2.a
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L42
            goto L58
        L42:
            r8 = move-exception
            goto L5e
        L44:
            p.hm5.M(r8)
            io.reactivex.rxjava3.core.Completable r8 = r0.b(r1, r10)     // Catch: java.lang.Exception -> L42
            r2.a = r9     // Catch: java.lang.Exception -> L42
            r2.b = r10     // Catch: java.lang.Exception -> L42
            r2.e = r5     // Catch: java.lang.Exception -> L42
            java.lang.Object r8 = p.fc11.i(r8, r2)     // Catch: java.lang.Exception -> L42
            if (r8 != r7) goto L58
            goto L82
        L58:
            p.it61 r8 = new p.it61     // Catch: java.lang.Exception -> L42
            r8.<init>(r10)     // Catch: java.lang.Exception -> L42
            return r8
        L5e:
            p.o8n r10 = r2.getContext()
            p.op71.x(r10)
            java.lang.String r10 = "Failed to update product state setting for key "
            java.lang.String r10 = r10.concat(r1)
            java.lang.Object[] r11 = new java.lang.Object[r3]
            com.spotify.base.java.logging.Logger.e(r8, r10, r11)
            if (r9 == 0) goto L8a
            io.reactivex.rxjava3.core.Completable r8 = r0.b(r1, r9)     // Catch: java.lang.Exception -> L83
            r2.a = r6     // Catch: java.lang.Exception -> L83
            r2.b = r6     // Catch: java.lang.Exception -> L83
            r2.e = r4     // Catch: java.lang.Exception -> L83
            java.lang.Object r8 = p.fc11.i(r8, r2)     // Catch: java.lang.Exception -> L83
            if (r8 != r7) goto L8a
        L82:
            return r7
        L83:
            p.o8n r8 = r2.getContext()
            p.op71.x(r8)
        L8a:
            p.ht61 r8 = new p.ht61
            r8.<init>(r6, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.uy11.b(java.lang.String, java.lang.String, p.onm):java.lang.Object");
    }

    public final mr20 getValue() {
        byte b = this.a;
        jge jgeVar = this.d;
        switch (b) {
            case 0:
                return jgeVar;
            default:
                return (lt20) jgeVar;
        }
    }

    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, tv80 tv80Var, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return a(((Number) obj2).intValue(), (onm) lnmVar);
            default:
                return b((String) obj, (String) obj2, (onm) lnmVar);
        }
    }

    public uy11(dg90 dg90Var, bah1 bah1Var) {
        this.b = dg90Var;
        this.c = bah1Var;
        this.d = hu20.e(dg90Var.d(), new af01((lnm) null, this, (byte) 4));
    }
}
