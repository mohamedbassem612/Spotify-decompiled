package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mv91 extends z031 implements vu30 {
    public long[] b;
    public int c;
    public int d;
    public byte e;
    public /* synthetic */ Object f;
    public final /* synthetic */ nv91 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv91(nv91 nv91Var, lnm lnmVar) {
        super(2, lnmVar);
        this.g = nv91Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        mv91 mv91Var = new mv91(this.g, lnmVar);
        mv91Var.f = obj;
        return mv91Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((r561) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:26:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x0095
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            p.nv91 r1 = r0.g
            long r2 = r1.a
            long r4 = r1.c
            long r6 = r1.b
            byte r8 = r0.e
            r9 = 0
            r12 = 64
            r13 = 3
            r14 = 2
            r16 = 0
            r18 = 1
            r10 = 1
            p.d9n r11 = p.d9n.a
            if (r8 == 0) goto L4b
            if (r8 == r10) goto L3c
            if (r8 == r14) goto L32
            if (r8 != r13) goto L2c
            int r1 = r0.c
            java.lang.Object r6 = r0.f
            p.r561 r6 = (p.r561) r6
            p.hm5.M(r23)
            r7 = r13
            goto Lbe
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r9
        L32:
            int r1 = r0.c
            java.lang.Object r8 = r0.f
            p.r561 r8 = (p.r561) r8
            p.hm5.M(r23)
            goto L93
        L3c:
            int r1 = r0.d
            int r8 = r0.c
            long[] r15 = r0.b
            java.lang.Object r13 = r0.f
            p.r561 r13 = (p.r561) r13
            p.hm5.M(r23)
            int r8 = r8 + r10
            goto L59
        L4b:
            p.hm5.M(r23)
            java.lang.Object r8 = r0.f
            r13 = r8
            p.r561 r13 = (p.r561) r13
            long[] r15 = r1.d
            if (r15 == 0) goto L70
            int r1 = r15.length
            r8 = 0
        L59:
            if (r8 >= r1) goto L70
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.f = r13
            r0.b = r15
            r0.c = r8
            r0.d = r1
            r0.e = r10
            r13.b(r4, r0)
            return r11
        L70:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L96
            r8 = r13
            r1 = 0
        L76:
            if (r1 >= r12) goto L95
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r13 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r13 == 0) goto L93
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.f = r8
            r0.b = r9
            r0.c = r1
            r0.e = r14
            r8.b(r2, r0)
            return r11
        L93:
            int r1 = r1 + r10
            goto L76
        L95:
            r13 = r8
        L96:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc1
            r6 = r13
            r15 = 0
        L9c:
            if (r15 >= r12) goto Lc1
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbc
            long r1 = (long) r15
            long r4 = r4 + r1
            r1 = 64
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.f = r6
            r0.b = r9
            r0.c = r15
            r7 = 3
            r0.e = r7
            r6.b(r1, r0)
            return r11
        Lbc:
            r7 = 3
            r1 = r15
        Lbe:
            int r15 = r1 + 1
            goto L9c
        Lc1:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mv91.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
