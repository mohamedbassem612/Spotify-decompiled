package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lw20 implements vr20 {
    public final /* synthetic */ vr20 a;
    public final /* synthetic */ en31 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;

    public lw20(vr20 vr20Var, en31 en31Var, boolean z, iu30 iu30Var) {
        this.a = vr20Var;
        this.b = en31Var;
        this.c = z;
        this.d = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r6.emit(r8, r0) == r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r7, p.lnm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.kw20
            if (r0 == 0) goto L13
            r0 = r8
            p.kw20 r0 = (p.kw20) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.kw20 r0 = new p.kw20
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.b
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r8)
            goto L5b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            p.vr20 r6 = r0.c
            p.hm5.M(r8)
            goto L50
        L37:
            p.hm5.M(r8)
            java.util.Set r7 = (java.util.Set) r7
            p.vr20 r7 = r6.a
            r0.c = r7
            r0.b = r4
            p.iu30 r8 = r6.d
            p.en31 r1 = r6.b
            boolean r6 = r6.c
            java.lang.Object r8 = p.qyo1.z(r0, r8, r1, r4, r6)
            if (r8 != r5) goto L4f
            goto L5a
        L4f:
            r6 = r7
        L50:
            r0.c = r2
            r0.b = r3
            java.lang.Object r6 = r6.emit(r8, r0)
            if (r6 != r5) goto L5b
        L5a:
            return r5
        L5b:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lw20.emit(java.lang.Object, p.lnm):java.lang.Object");
    }
}
