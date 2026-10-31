package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pfa extends z031 implements vu30 {
    public cav0 b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ c9n e;
    public final /* synthetic */ w5f1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfa(c9n c9nVar, w5f1 w5f1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = c9nVar;
        this.f = w5f1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        pfa pfaVar = new pfa(this.e, this.f, lnmVar);
        pfaVar.d = obj;
        return pfaVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1.a);
        return d9n.a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:12:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r8.c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 != r2) goto L12
            p.cav0 r0 = r8.b
            java.lang.Object r3 = r8.d
            p.i8d1 r3 = (p.i8d1) r3
            p.hm5.M(r9)
            goto L31
        L12:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r1
        L18:
            p.hm5.M(r9)
            java.lang.Object r9 = r8.d
            p.i8d1 r9 = (p.i8d1) r9
            p.cav0 r0 = p.cav0.b
            r3 = r9
        L22:
            r8.d = r3
            r8.b = r0
            r8.c = r2
            java.lang.Object r9 = r3.a(r0, r8)
            p.d9n r4 = p.d9n.a
            if (r9 != r4) goto L31
            return r4
        L31:
            p.bav0 r9 = (p.bav0) r9
            java.util.List r4 = r9.a
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            p.hav0 r4 = (p.hav0) r4
            int r4 = r4.i
            r6 = 2
            if (r4 != r6) goto L22
            int r9 = r9.f
            r4 = 4
            p.w5f1 r7 = r8.f
            if (r9 != r4) goto L54
            p.kfa r9 = new p.kfa
            r9.<init>(r7, r1, r6)
            r4 = 3
            p.c9n r6 = r8.e
            p.fn31.T(r6, r1, r5, r9, r4)
            goto L22
        L54:
            r4 = 5
            if (r9 != r4) goto L22
            r7.dismiss()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pfa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
