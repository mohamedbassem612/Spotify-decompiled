package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zkb1 extends a8d1 implements xu30 {
    public byte a;
    public /* synthetic */ vr20 b;
    public /* synthetic */ int c;
    public final /* synthetic */ alb1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zkb1(alb1 alb1Var, lnm lnmVar) {
        super(3, lnmVar);
        this.d = alb1Var;
    }

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        zkb1 zkb1Var = new zkb1(this.d, (lnm) obj3);
        zkb1Var.b = (vr20) obj;
        zkb1Var.c = iIntValue;
        return zkb1Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r4.emit(p.cy71.a, r16) == r13) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r4.emit(p.cy71.c, r16) == r13) goto L34;
     */
    @Override // p.faa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            p.alb1 r1 = r0.d
            long r2 = r1.b
            p.vr20 r4 = r0.b
            int r5 = r0.c
            byte r6 = r0.a
            r7 = 0
            r8 = 5
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = 1
            p.d9n r13 = p.d9n.a
            if (r6 == 0) goto L37
            if (r6 == r12) goto L33
            if (r6 == r11) goto L2f
            if (r6 == r10) goto L2b
            if (r6 == r9) goto L27
            if (r6 != r8) goto L21
            goto L33
        L21:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r7
        L27:
            p.hm5.M(r17)
            goto L7c
        L2b:
            p.hm5.M(r17)
            goto L6f
        L2f:
            p.hm5.M(r17)
            goto L5a
        L33:
            p.hm5.M(r17)
            goto L8b
        L37:
            p.hm5.M(r17)
            if (r5 <= 0) goto L4b
            r0.b = r7
            r0.c = r5
            r0.a = r12
            p.cy71 r1 = p.cy71.a
            java.lang.Object r0 = r4.emit(r1, r0)
            if (r0 != r13) goto L8b
            goto L8a
        L4b:
            long r14 = r1.a
            r0.b = r4
            r0.c = r5
            r0.a = r11
            java.lang.Object r1 = p.hap1.i(r14, r0)
            if (r1 != r13) goto L5a
            goto L8a
        L5a:
            r11 = 0
            int r1 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r1 <= 0) goto L7c
            r0.b = r4
            r0.c = r5
            r0.a = r10
            p.cy71 r1 = p.cy71.b
            java.lang.Object r1 = r4.emit(r1, r0)
            if (r1 != r13) goto L6f
            goto L8a
        L6f:
            r0.b = r4
            r0.c = r5
            r0.a = r9
            java.lang.Object r1 = p.hap1.i(r2, r0)
            if (r1 != r13) goto L7c
            goto L8a
        L7c:
            r0.b = r7
            r0.c = r5
            r0.a = r8
            p.cy71 r1 = p.cy71.c
            java.lang.Object r0 = r4.emit(r1, r0)
            if (r0 != r13) goto L8b
        L8a:
            return r13
        L8b:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zkb1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
