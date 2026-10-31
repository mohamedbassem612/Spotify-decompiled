package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bbc0 extends a8d1 implements xu30 {
    public byte a;
    public /* synthetic */ vr20 b;
    public /* synthetic */ n1i c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbc0(int i, lnm lnmVar) {
        super(3, lnmVar);
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        bbc0 bbc0Var = new bbc0(this.d, (lnm) obj3);
        bbc0Var.b = (vr20) obj;
        bbc0Var.c = (n1i) obj2;
        return bbc0Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r0.emit(r3, r9) == r8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r0.emit(r1, r9) == r8) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            p.vr20 r0 = r9.b
            p.n1i r1 = r9.c
            byte r2 = r9.a
            p.n1i r3 = p.n1i.d
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            p.d9n r8 = p.d9n.a
            if (r2 == 0) goto L25
            if (r2 == r6) goto L21
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L17
            goto L1d
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r7
        L1d:
            p.hm5.M(r10)
            goto L54
        L21:
            p.hm5.M(r10)
            goto L3a
        L25:
            p.hm5.M(r10)
            if (r1 != r3) goto L47
            int r10 = r9.d
            long r1 = (long) r10
            r9.b = r0
            r9.c = r7
            r9.a = r6
            java.lang.Object r10 = p.hap1.i(r1, r9)
            if (r10 != r8) goto L3a
            goto L53
        L3a:
            r9.b = r7
            r9.c = r7
            r9.a = r5
            java.lang.Object r9 = r0.emit(r3, r9)
            if (r9 != r8) goto L54
            goto L53
        L47:
            r9.b = r7
            r9.c = r7
            r9.a = r4
            java.lang.Object r9 = r0.emit(r1, r9)
            if (r9 != r8) goto L54
        L53:
            return r8
        L54:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bbc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
