package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gbf0 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ faa0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ kbf0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbf0(int i, faa0 faa0Var, int i2, int i3, kbf0 kbf0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = i;
        this.c = faa0Var;
        this.d = i2;
        this.e = i3;
        this.f = kbf0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new gbf0(this.b, this.c, this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0050 -> B:22:0x0053). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r4.a
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            p.hm5.M(r5)
            goto L53
        Lb:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r4)
            r4 = 0
            return r4
        L12:
            p.hm5.M(r5)
        L15:
            int[] r5 = p.fbf0.a
            int r0 = r4.b
            int r0 = p.l1d.C(r0)
            r5 = r5[r0]
            int r0 = r4.d
            if (r5 != r1) goto L2e
            p.faa0 r5 = r4.c
            boolean r5 = r5.isActive()
            if (r5 == 0) goto L2c
            goto L2e
        L2c:
            int r0 = r4.e
        L2e:
            r4.a = r1
            p.kbf0 r5 = r4.f
            r5.getClass()
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r2) goto L45
            p.ibf0 r2 = new p.ibf0
            r3 = 0
            r2.<init>(r5, r0, r3)
            java.lang.Object r5 = p.k5p1.x(r2, r4)
            goto L4e
        L45:
            p.ibf0 r2 = new p.ibf0
            r2.<init>(r5, r0, r1)
            java.lang.Object r5 = p.s110.r(r2, r4)
        L4e:
            p.d9n r0 = p.d9n.a
            if (r5 != r0) goto L53
            return r0
        L53:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L15
            p.rih1 r4 = p.rih1.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gbf0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
