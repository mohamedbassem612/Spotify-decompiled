package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g381 extends a8d1 implements bv30 {
    public byte a;
    public /* synthetic */ e381 b;
    public /* synthetic */ f381 c;
    public /* synthetic */ d381 d;
    public /* synthetic */ tqw e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ yqg g;
    public final /* synthetic */ ccc0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g381(iu30 iu30Var, yqg yqgVar, ccc0 ccc0Var, lnm lnmVar) {
        super(5, lnmVar);
        this.f = iu30Var;
        this.g = yqgVar;
        this.h = ccc0Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        yqg yqgVar = this.g;
        ccc0 ccc0Var = this.h;
        g381 g381Var = new g381(this.f, yqgVar, ccc0Var, (lnm) obj5);
        g381Var.b = (e381) obj;
        g381Var.c = (f381) obj2;
        g381Var.d = (d381) obj3;
        g381Var.e = (tqw) obj4;
        return g381Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        if (r0 == r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        if (r0 == r3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            r28 = this;
            r0 = r28
            p.e381 r1 = r0.b
            p.f381 r2 = r0.c
            p.d381 r3 = r0.d
            p.tqw r4 = r0.e
            byte r5 = r0.a
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L29
            if (r5 == r7) goto L22
            if (r5 != r6) goto L1c
            p.hm5.M(r29)
            r0 = r29
            goto Lbb
        L1c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r8
        L22:
            p.hm5.M(r29)
            r0 = r29
            goto La2
        L29:
            p.hm5.M(r29)
            p.c381 r5 = p.c381.a
            boolean r5 = p.u890.j(r3, r5)
            if (r5 == 0) goto L72
            p.v051 r2 = new p.v051
            java.lang.String r10 = r1.a
            java.lang.String r1 = r1.e
            p.z951 r9 = new p.z951
            r27 = 259568(0x3f5f0, float:3.63732E-40)
            r23 = 0
            r11 = 3
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            p.u951 r18 = p.u951.a
            r19 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r20 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r4 == 0) goto L63
            p.tv80 r8 = p.n3o1.y(r4)
        L63:
            p.yqg r1 = r0.g
            long r3 = r1.b()
            r2.<init>(r9, r8, r3)
            p.iu30 r0 = r0.f
            r0.invoke(r2)
            goto Lc0
        L72:
            p.b381 r5 = p.b381.a
            boolean r3 = p.u890.j(r3, r5)
            if (r3 == 0) goto Lc3
            if (r4 == 0) goto L86
            p.tv80 r3 = p.n3o1.y(r4)
            p.ubc0 r4 = new p.ubc0
            r4.<init>(r3)
            goto L87
        L86:
            r4 = r8
        L87:
            boolean r2 = r2.i
            p.d9n r3 = p.d9n.a
            p.ccc0 r5 = r0.h
            if (r2 == 0) goto La8
            java.lang.String r1 = r1.a
            r0.b = r8
            r0.c = r8
            r0.d = r8
            r0.e = r8
            r0.a = r7
            java.lang.Object r0 = p.ccc0.i(r5, r1, r7, r4, r0)
            if (r0 != r3) goto La2
            goto Lba
        La2:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
            goto Lc0
        La8:
            java.lang.String r1 = r1.a
            r0.b = r8
            r0.c = r8
            r0.d = r8
            r0.e = r8
            r0.a = r6
            java.lang.Object r0 = p.ccc0.c(r5, r1, r7, r4, r0)
            if (r0 != r3) goto Lbb
        Lba:
            return r3
        Lbb:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
        Lc0:
            p.rih1 r0 = p.rih1.a
            return r0
        Lc3:
            p.eg.o()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g381.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
