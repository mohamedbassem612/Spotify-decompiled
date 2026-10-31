package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xu41 extends a8d1 implements vu30 {
    public boolean a;
    public boolean b;
    public long c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ c9n f;
    public final /* synthetic */ yqg g;
    public final /* synthetic */ drr0 h;
    public final /* synthetic */ ven0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu41(c9n c9nVar, yqg yqgVar, drr0 drr0Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = c9nVar;
        this.g = yqgVar;
        this.h = drr0Var;
        this.i = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        xu41 xu41Var = new xu41(this.f, this.g, this.h, this.i, lnmVar);
        xu41Var.e = obj;
        return xu41Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((yvg1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0047 A[PHI: r0 r1 r6
      0x0047: PHI (r0v5 boolean) = (r0v4 boolean), (r0v6 boolean) binds: [B:14:0x0046, B:28:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r1v5 boolean) = (r1v4 boolean), (r1v6 boolean) binds: [B:14:0x0046, B:28:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r6v1 long) = (r6v0 long), (r6v2 long) binds: [B:14:0x0046, B:28:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0076 -> B:22:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.e
            p.yvg1 r0 = (p.yvg1) r0
            boolean r1 = r11.d
            r2 = 0
            p.rih1 r3 = p.rih1.a
            p.ven0 r4 = r11.i
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 != r5) goto L1a
            boolean r0 = r11.b
            long r6 = r11.c
            boolean r1 = r11.a
            p.hm5.M(r12)
            goto L79
        L1a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r2
        L20:
            p.hm5.M(r12)
            java.lang.Object r12 = r0.a
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            java.lang.Object r1 = r0.b
            java.lang.Number r1 = (java.lang.Number) r1
            long r6 = r1.longValue()
            java.lang.Object r0 = r0.c
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Laa
            if (r12 == 0) goto Laa
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 > 0) goto L46
            goto Laa
        L46:
            r1 = r12
        L47:
            p.c9n r12 = r11.f
            boolean r12 = p.smo1.u(r12)
            if (r12 == 0) goto Laa
            java.lang.Object r12 = r4.getValue()
            p.pu41 r12 = (p.pu41) r12
            float r12 = r12.d
            r8 = 0
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 <= 0) goto Laa
            p.ej41 r12 = p.ej41.Y
            r11.e = r2
            r11.a = r1
            r11.c = r6
            r11.b = r0
            r11.d = r5
            p.o8n r8 = r11.getContext()
            p.rjm0 r8 = p.s110.h(r8)
            java.lang.Object r12 = r8.D(r12, r11)
            p.d9n r8 = p.d9n.a
            if (r12 != r8) goto L79
            return r8
        L79:
            java.lang.Object r12 = r4.getValue()
            p.pu41 r12 = (p.pu41) r12
            p.yqg r8 = r11.g
            long r8 = r8.b()
            float r12 = r12.c(r8)
            p.drr0 r8 = r11.h
            float r9 = r8.s()
            float r9 = r12 - r9
            float r9 = java.lang.Math.abs(r9)
            r10 = 990057071(0x3b03126f, float:0.002)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r9 > 0) goto La2
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 < 0) goto La5
        La2:
            r8.t(r12)
        La5:
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 < 0) goto L47
        Laa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xu41.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
