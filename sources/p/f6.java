package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ idn0 c;
    public final /* synthetic */ r9w0 d;
    public final /* synthetic */ i6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6(idn0 idn0Var, r9w0 r9w0Var, i6 i6Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = idn0Var;
        this.d = r9w0Var;
        this.e = i6Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new f6(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new f6(this.c, this.d, this.e, lnmVar, (byte) 1);
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.b(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r3.b(r9, r10) == r6) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.a
            p.rih1 r1 = p.rih1.a
            p.i6 r2 = r10.e
            p.idn0 r3 = r10.c
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.d9n r6 = p.d9n.a
            r7 = 1
            r8 = 2
            p.r9w0 r9 = r10.d
            switch(r0) {
                case 0: goto L44;
                default: goto L14;
            }
        L14:
            byte r0 = r10.b
            if (r0 == 0) goto L29
            if (r0 == r7) goto L25
            if (r0 != r8) goto L20
            p.hm5.M(r11)
            goto L41
        L20:
            p.eg.m(r5)
            r1 = r4
            goto L43
        L25:
            p.hm5.M(r11)
            goto L37
        L29:
            p.hm5.M(r11)
            long r4 = p.yhg.a
            r10.b = r7
            java.lang.Object r11 = p.hap1.i(r4, r10)
            if (r11 != r6) goto L37
            goto L3f
        L37:
            r10.b = r8
            java.lang.Object r10 = r3.b(r9, r10)
            if (r10 != r6) goto L41
        L3f:
            r1 = r6
            goto L43
        L41:
            r2.c1 = r9
        L43:
            return r1
        L44:
            byte r0 = r10.b
            if (r0 == 0) goto L59
            if (r0 == r7) goto L55
            if (r0 != r8) goto L50
            p.hm5.M(r11)
            goto L71
        L50:
            p.eg.m(r5)
            r1 = r4
            goto L73
        L55:
            p.hm5.M(r11)
            goto L67
        L59:
            p.hm5.M(r11)
            long r4 = p.yhg.a
            r10.b = r7
            java.lang.Object r11 = p.hap1.i(r4, r10)
            if (r11 != r6) goto L67
            goto L6f
        L67:
            r10.b = r8
            java.lang.Object r10 = r3.b(r9, r10)
            if (r10 != r6) goto L71
        L6f:
            r1 = r6
            goto L73
        L71:
            r2.g1 = r9
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
