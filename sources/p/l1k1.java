package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class l1k1 extends a8d1 implements vu30 {
    public s2t a;
    public boolean b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ zrj1 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1k1(long j, long j2, String str, String str2, String str3, lnm lnmVar, zrj1 zrj1Var) {
        super(2, lnmVar);
        this.e = zrj1Var;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = j;
        this.t = j2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        l1k1 l1k1Var = new l1k1(this.i, this.t, this.f, this.g, this.h, lnmVar, this.e);
        l1k1Var.d = obj;
        return l1k1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007f, code lost:
    
        if (r0 == r7) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            java.lang.Object r1 = r0.d
            p.c9n r1 = (p.c9n) r1
            byte r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r2 == 0) goto L2b
            if (r2 == r5) goto L23
            if (r2 != r4) goto L1d
            boolean r0 = r0.b
            p.hm5.M(r26)
            r2 = r0
            r0 = r26
            goto L82
        L1d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r6
        L23:
            p.s2t r1 = r0.a
            p.hm5.M(r26)
            r2 = r26
            goto L6d
        L2b:
            p.hm5.M(r26)
            p.nsf1 r8 = new p.nsf1
            r13 = 0
            r14 = 14
            p.zrj1 r9 = r0.e
            java.lang.String r10 = r0.f
            java.lang.String r11 = r0.g
            java.lang.String r12 = r0.h
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r24 = r9
            r22 = r10
            r21 = r12
            r2 = 3
            p.s2t r8 = p.fn31.q(r1, r6, r3, r8, r2)
            p.m9i0 r15 = new p.m9i0
            long r9 = r0.t
            r23 = 0
            long r11 = r0.i
            java.lang.String r13 = r0.g
            r18 = r9
            r16 = r11
            r20 = r13
            r15.<init>(r16, r18, r20, r21, r22, r23, r24)
            p.s2t r1 = p.fn31.q(r1, r6, r3, r15, r2)
            r0.d = r6
            r0.a = r1
            r0.c = r5
            java.lang.Object r2 = r8.Q(r0)
            if (r2 != r7) goto L6d
            goto L81
        L6d:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0.d = r6
            r0.a = r6
            r0.b = r2
            r0.c = r4
            java.lang.Object r0 = r1.E(r0)
            if (r0 != r7) goto L82
        L81:
            return r7
        L82:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r2 != 0) goto L8d
            if (r0 == 0) goto L8d
            r3 = r5
        L8d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l1k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
