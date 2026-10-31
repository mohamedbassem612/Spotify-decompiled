package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a4d1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ b4d1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4d1(b4d1 b4d1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = b4d1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        b4d1 b4d1Var = this.c;
        switch (b) {
            case 0:
                return new a4d1(b4d1Var, lnmVar, (byte) 0);
            default:
                return new a4d1(b4d1Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r0 == r8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        if (r0 == r8) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.a
            p.rih1 r7 = p.rih1.a
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p.d9n r8 = p.d9n.a
            r6 = 1
            r9 = 2
            p.b4d1 r10 = r11.c
            switch(r0) {
                case 0: goto L5c;
                default: goto L13;
            }
        L13:
            byte r0 = r11.b
            if (r0 == 0) goto L29
            if (r0 == r6) goto L25
            if (r0 != r9) goto L20
            p.hm5.M(r12)
            r0 = r12
            goto L59
        L20:
            p.eg.m(r4)
            r7 = r3
            goto L5b
        L25:
            p.hm5.M(r12)
            goto L3e
        L29:
            p.hm5.M(r12)
            p.o95 r0 = r10.h1
            if (r0 == 0) goto L3e
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r2)
            r11.b = r6
            java.lang.Object r0 = r0.g(r3, r11)
            if (r0 != r8) goto L3e
            goto L57
        L3e:
            p.o95 r0 = r10.h1
            if (r0 == 0) goto L5b
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            r1 = r2
            p.pxg1 r2 = p.x3d1.c
            r11.b = r9
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r11
            java.lang.Object r0 = p.o95.b(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L59
        L57:
            r7 = r8
            goto L5b
        L59:
            p.ce5 r0 = (p.ce5) r0
        L5b:
            return r7
        L5c:
            byte r0 = r11.b
            if (r0 == 0) goto L72
            if (r0 == r6) goto L6e
            if (r0 != r9) goto L69
            p.hm5.M(r12)
            r0 = r12
            goto La2
        L69:
            p.eg.m(r4)
            r7 = r3
            goto La4
        L6e:
            p.hm5.M(r12)
            goto L87
        L72:
            p.hm5.M(r12)
            p.o95 r0 = r10.g1
            if (r0 == 0) goto L87
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r2)
            r11.b = r6
            java.lang.Object r0 = r0.g(r3, r11)
            if (r0 != r8) goto L87
            goto La0
        L87:
            p.o95 r0 = r10.g1
            if (r0 == 0) goto La4
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            r1 = r2
            p.n8b1 r2 = p.x3d1.a
            r11.b = r9
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r11
            java.lang.Object r0 = p.o95.b(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto La2
        La0:
            r7 = r8
            goto La4
        La2:
            p.ce5 r0 = (p.ce5) r0
        La4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a4d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
