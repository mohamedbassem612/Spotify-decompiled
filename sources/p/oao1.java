package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oao1 {
    public final n5n1 a;
    public long c;
    public boolean e;
    public ayh f;
    public final qeh1 g;
    public e2x0 b = e2x0.a1;
    public final xgn0 d = ygn0.a();

    public oao1(qeh1 qeh1Var, n5n1 n5n1Var) {
        this.g = qeh1Var;
        this.a = n5n1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(oao1 oao1Var, onm onmVar) {
        x8o1 x8o1Var;
        if (onmVar instanceof x8o1) {
            x8o1Var = (x8o1) onmVar;
            int i = x8o1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x8o1Var.c = i - Integer.MIN_VALUE;
            } else {
                x8o1Var = new x8o1(oao1Var, onmVar);
            }
        } else {
            x8o1Var = new x8o1(oao1Var, onmVar);
        }
        Object obj = x8o1Var.a;
        int i2 = x8o1Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        long j = oao1Var.c;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        if (b == 3) {
            ayh ayhVarK = nko1.K(oao1Var.a.a(new h7n1(j)));
            x8o1Var.c = 1;
            Object objQ = ayhVarK.Q(x8o1Var);
            d9n d9nVar = d9n.a;
            return objQ == d9nVar ? d9nVar : objQ;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((b & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        eg.m("Missing required properties:".concat(sb.toString()));
        return null;
    }

    public final ayh a() {
        ayh ayhVar = this.f;
        if (ayhVar != null) {
            return ayhVar;
        }
        return null;
    }

    public final void b(long j) {
        this.c = j;
    }

    public final qwo1 c() {
        return new qwo1(new l53(this, (lnm) null, (byte) 3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r8 == r5) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.String r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.p9o1
            if (r0 == 0) goto L13
            r0 = r8
            p.p9o1 r0 = (p.p9o1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.p9o1 r0 = new p.p9o1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r8)
            goto L68
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            java.lang.String r7 = r0.d
            p.hm5.M(r8)
            goto L4a
        L37:
            p.hm5.M(r8)
            p.ayh r6 = r6.f
            if (r6 == 0) goto L3f
            goto L40
        L3f:
            r6 = r2
        L40:
            r0.d = r7
            r0.c = r4
            java.lang.Object r8 = r6.Q(r0)
            if (r8 == r5) goto L73
        L4a:
            p.c6n1 r8 = (p.c6n1) r8
            p.j5n1 r6 = p.j5n1.X
            if (r6 == 0) goto L6d
            p.l7n1 r1 = new p.l7n1
            r1.<init>(r7, r6)
            p.hfp1 r6 = r8.a(r1)
            p.ayh r6 = p.nko1.K(r6)
            r0.d = r2
            r0.c = r3
            java.lang.Object r8 = r6.Q(r0)
            if (r8 != r5) goto L68
            goto L73
        L68:
            p.b6n1 r8 = (p.b6n1) r8
            java.lang.String r6 = r8.a
            return r6
        L6d:
            java.lang.String r6 = "Null verdictOptOut"
            p.bhn0.i(r6)
            return r2
        L73:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.oao1.j(java.lang.String, p.onm):java.lang.Object");
    }
}
