package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yfx0 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ frr0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ double g;
    public final /* synthetic */ yqg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfx0(boolean z, frr0 frr0Var, long j, long j2, long j3, double d, yqg yqgVar, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.c = frr0Var;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = d;
        this.h = yqgVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new yfx0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0023 -> B:13:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r6.a
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            p.hm5.M(r7)
            goto L26
        Lb:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L12:
            p.hm5.M(r7)
            boolean r7 = r6.b
            if (r7 == 0) goto L4a
        L19:
            r6.a = r1
            r2 = 250(0xfa, double:1.235E-321)
            java.lang.Object r7 = p.hap1.i(r2, r6)
            p.d9n r0 = p.d9n.a
            if (r7 != r0) goto L26
            return r0
        L26:
            p.yqg r7 = r6.h
            long r2 = r7.b()
            long r4 = r6.f
            long r2 = r2 - r4
            double r2 = (double) r2
            double r4 = r6.g
            double r4 = r4 * r2
            long r2 = (long) r4
            long r4 = r6.d
            long r4 = r4 + r2
            long r2 = r6.e
            long r2 = java.lang.Math.min(r4, r2)
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L44
            r2 = r4
        L44:
            p.frr0 r7 = r6.c
            r7.t(r2)
            goto L19
        L4a:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yfx0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
