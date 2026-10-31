package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f1g0 extends z031 implements vu30 {
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ l811 d;
    public final /* synthetic */ l811 e;
    public final /* synthetic */ l811 f;
    public final /* synthetic */ p811 g;
    public final /* synthetic */ c9n h;
    public final /* synthetic */ i0g0 i;
    public final /* synthetic */ lbc0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1g0(l811 l811Var, l811 l811Var2, l811 l811Var3, p811 p811Var, c9n c9nVar, i0g0 i0g0Var, lbc0 lbc0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = l811Var;
        this.e = l811Var2;
        this.f = l811Var3;
        this.g = p811Var;
        this.h = c9nVar;
        this.i = i0g0Var;
        this.t = lbc0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        f1g0 f1g0Var = new f1g0(this.d, this.e, this.f, this.g, this.h, this.i, this.t, lnmVar);
        f1g0Var.c = obj;
        return f1g0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1.a);
        return d9n.a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:0: B:31:0x0077->B:41:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:12:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.c
            p.i8d1 r0 = (p.i8d1) r0
            boolean r1 = r14.b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 != r3) goto L10
            p.hm5.M(r15)
            goto L28
        L10:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r14)
            return r2
        L16:
            p.hm5.M(r15)
        L19:
            r14.c = r0
            r14.b = r3
            p.cav0 r15 = p.cav0.a
            java.lang.Object r15 = r0.a(r15, r14)
            p.d9n r1 = p.d9n.a
            if (r15 != r1) goto L28
            return r1
        L28:
            p.bav0 r15 = (p.bav0) r15
            java.util.List r1 = r15.a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r4 = r1 instanceof java.util.Collection
            p.l811 r7 = r14.d
            p.l811 r5 = r14.e
            r13 = 0
            if (r4 == 0) goto L41
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L41
            goto L61
        L41:
            java.util.Iterator r1 = r1.iterator()
        L45:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L61
            java.lang.Object r4 = r1.next()
            p.hav0 r4 = (p.hav0) r4
            boolean r6 = r4.d
            if (r6 == 0) goto L45
            boolean r4 = r4.h
            if (r4 != 0) goto L45
            r7.a = r13
            r5.a = r3
            p.l811 r1 = r14.f
            r1.a = r13
        L61:
            java.util.List r15 = r15.a
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            boolean r1 = r15 instanceof java.util.Collection
            if (r1 == 0) goto L73
            r1 = r15
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L73
            goto L88
        L73:
            java.util.Iterator r15 = r15.iterator()
        L77:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L88
            java.lang.Object r1 = r15.next()
            p.hav0 r1 = (p.hav0) r1
            boolean r1 = r1.d
            if (r1 == 0) goto L77
            goto L19
        L88:
            r5.a = r13
            p.p811 r9 = r14.g
            java.lang.Object r15 = r9.a
            r8 = r15
            p.v5v r8 = (p.v5v) r8
            if (r8 == 0) goto L19
            p.ary r5 = new p.ary
            r12 = 0
            r6 = 17
            p.i0g0 r10 = r14.i
            p.lbc0 r11 = r14.t
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r15 = 3
            p.c9n r1 = r14.h
            p.fn31.T(r1, r2, r13, r5, r15)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f1g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
