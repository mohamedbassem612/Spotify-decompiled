package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j75 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j75(boolean z, Object obj, long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.e = obj;
        this.d = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                return new j75(this.c, (k75) obj2, this.d, lnmVar, (byte) 0);
            default:
                return new j75(this.c, (ev91) obj2, this.d, lnmVar, (byte) 1);
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (p.o95.b(r0, r1, r2, (java.lang.Float) null, r4, r13, 4) == r8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        if (r0.g(r1, r13) == r8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r0 == r8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
    
        if (r0 == r8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            byte r0 = r13.a
            p.rih1 r7 = p.rih1.a
            boolean r1 = r13.c
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            p.d9n r8 = p.d9n.a
            java.lang.Object r4 = r13.e
            r6 = 1
            r9 = 2
            switch(r0) {
                case 0: goto L7b;
                default: goto L12;
            }
        L12:
            r10 = r4
            p.ev91 r10 = (p.ev91) r10
            byte r0 = r13.b
            if (r0 == 0) goto L26
            if (r0 == r6) goto L1d
            if (r0 != r9) goto L21
        L1d:
            p.hm5.M(r14)
            goto L77
        L21:
            p.eg.m(r3)
            r7 = r2
            goto L7a
        L26:
            p.hm5.M(r14)
            long r2 = r13.d
            if (r1 != 0) goto L66
            p.g8n r0 = r10.S0
            p.o95 r1 = r10.U0
            java.lang.Object r4 = r1.e()
            androidx.compose.ui.geometry.Offset r4 = (androidx.compose.ui.geometry.Offset) r4
            long r11 = r4.a
            long r11 = r0.a(r11)
            java.lang.Object r0 = r1.e()
            androidx.compose.ui.geometry.Offset r0 = (androidx.compose.ui.geometry.Offset) r0
            long r0 = r0.a
            boolean r0 = androidx.compose.ui.geometry.Offset.c(r11, r0)
            if (r0 != 0) goto L4c
            goto L66
        L4c:
            p.o95 r0 = r10.U0
            androidx.compose.ui.geometry.Offset r1 = new androidx.compose.ui.geometry.Offset
            r1.<init>(r2)
            p.n8b1 r2 = r10.T0
            p.dv91 r4 = new p.dv91
            r4.<init>(r10, r9)
            r13.b = r9
            r3 = 0
            r6 = 4
            r5 = r13
            java.lang.Object r0 = p.o95.b(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L77
            goto L75
        L66:
            p.o95 r0 = r10.U0
            androidx.compose.ui.geometry.Offset r1 = new androidx.compose.ui.geometry.Offset
            r1.<init>(r2)
            r13.b = r6
            java.lang.Object r0 = r0.g(r1, r13)
            if (r0 != r8) goto L77
        L75:
            r7 = r8
            goto L7a
        L77:
            p.dio1.z(r10)
        L7a:
            return r7
        L7b:
            byte r0 = r13.b
            if (r0 == 0) goto L92
            if (r0 == r6) goto L8d
            if (r0 != r9) goto L88
            p.hm5.M(r14)
            r0 = r14
            goto Lbd
        L88:
            p.eg.m(r3)
            r7 = r2
            goto Lc1
        L8d:
            p.hm5.M(r14)
            r0 = r14
            goto La9
        L92:
            p.hm5.M(r14)
            p.k75 r4 = (p.k75) r4
            p.g6o0 r0 = r4.a
            if (r1 != 0) goto Lae
            r13.b = r6
            r1 = 0
            long r3 = r13.d
            r5 = r13
            java.lang.Object r0 = r0.a(r1, r3, r5)
            if (r0 != r8) goto La9
            goto Lbb
        La9:
            p.qui1 r0 = (p.qui1) r0
            long r0 = r0.a
            goto Lc1
        Lae:
            r13.b = r9
            long r1 = r13.d
            r3 = 0
            r5 = r13
            java.lang.Object r0 = r0.a(r1, r3, r5)
            if (r0 != r8) goto Lbd
        Lbb:
            r7 = r8
            goto Lc1
        Lbd:
            p.qui1 r0 = (p.qui1) r0
            long r0 = r0.a
        Lc1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.j75.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
