package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mx51 extends z031 implements vu30 {
    public final /* synthetic */ byte b = 0;
    public long c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx51(long j, o811 o811Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = j;
        this.f = o811Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.b;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                mx51 mx51Var = new mx51(this.c, (o811) obj2, lnmVar);
                mx51Var.e = obj;
                return mx51Var;
            default:
                mx51 mx51Var2 = new mx51((hav0) obj2, lnmVar);
                mx51Var2.e = obj;
                return mx51Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        i8d1 i8d1Var = (i8d1) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0045
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.b
            java.lang.Object r1 = r9.f
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            p.d9n r4 = p.d9n.a
            r5 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Ld;
            }
        Ld:
            boolean r0 = r9.d
            if (r0 == 0) goto L21
            if (r0 != r5) goto L1d
            long r0 = r9.c
            java.lang.Object r2 = r9.e
            p.i8d1 r2 = (p.i8d1) r2
            p.hm5.M(r10)
            goto L47
        L1d:
            p.eg.m(r3)
            goto L50
        L21:
            p.hm5.M(r10)
            java.lang.Object r10 = r9.e
            p.i8d1 r10 = (p.i8d1) r10
            p.hav0 r1 = (p.hav0) r1
            long r0 = r1.b
            p.e8k1 r2 = r10.c()
            r2.getClass()
            r2 = 40
            long r2 = r2 + r0
            r0 = r2
            r2 = r10
        L38:
            r9.e = r2
            r9.c = r0
            r9.d = r5
            r10 = 3
            java.lang.Object r10 = p.rqd1.b(r2, r9, r10)
            if (r10 != r4) goto L47
            r2 = r4
            goto L50
        L47:
            p.hav0 r10 = (p.hav0) r10
            long r6 = r10.b
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L38
            r2 = r10
        L50:
            return r2
        L51:
            p.o811 r1 = (p.o811) r1
            boolean r0 = r9.d
            if (r0 == 0) goto L65
            if (r0 != r5) goto L61
            java.lang.Object r9 = r9.e
            p.i8d1 r9 = (p.i8d1) r9
            p.hm5.M(r10)
            goto L84
        L61:
            p.eg.m(r3)
            goto Lb6
        L65:
            p.hm5.M(r10)
            java.lang.Object r10 = r9.e
            p.i8d1 r10 = (p.i8d1) r10
            long r2 = r9.c
            p.w9 r0 = new p.w9
            r6 = 22
            r0.<init>(r1, r6)
            r9.e = r10
            r9.d = r5
            java.lang.Object r9 = p.g5v.f(r10, r2, r0, r9)
            if (r9 != r4) goto L81
            r2 = r4
            goto Lb6
        L81:
            r8 = r10
            r10 = r9
            r9 = r8
        L84:
            p.hav0 r10 = (p.hav0) r10
            if (r10 == 0) goto L9c
            long r0 = r1.a
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L9c
            p.eru r2 = p.eru.b
            goto Lb6
        L9c:
            p.j8d1 r9 = r9.e
            p.bav0 r9 = r9.T0
            java.util.List r9 = r9.a
            java.lang.Object r9 = p.o7h.q0(r9)
            p.hav0 r9 = (p.hav0) r9
            boolean r10 = p.p8p1.k(r9)
            if (r10 == 0) goto Lb4
            r9.a()
            p.eru r2 = p.eru.a
            goto Lb6
        Lb4:
            p.eru r2 = p.eru.d
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mx51.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx51(hav0 hav0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = hav0Var;
    }
}
