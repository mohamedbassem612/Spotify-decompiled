package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jhd extends a8d1 implements vu30 {
    public uac a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bbc d;
    public final /* synthetic */ lhd e;
    public final /* synthetic */ b3p0 f;
    public final /* synthetic */ r261 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhd(bbc bbcVar, lhd lhdVar, b3p0 b3p0Var, r261 r261Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = bbcVar;
        this.e = lhdVar;
        this.f = b3p0Var;
        this.g = r261Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        jhd jhdVar = new jhd(this.d, this.e, this.f, this.g, lnmVar);
        jhdVar.c = obj;
        return jhdVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002f -> B:12:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            p.c9n r0 = (p.c9n) r0
            boolean r1 = r8.b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 != r3) goto L12
            p.uac r1 = r8.a
            p.hm5.M(r9)
            goto L32
        L12:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r2
        L18:
            p.hm5.M(r9)
            p.uac r9 = new p.uac
            p.bbc r1 = r8.d
            r9.<init>(r1)
            r1 = r9
        L23:
            r8.c = r0
            r8.a = r1
            r8.b = r3
            java.lang.Object r9 = r1.a(r8)
            p.d9n r4 = p.d9n.a
            if (r9 != r4) goto L32
            return r4
        L32:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L57
            java.lang.Object r9 = r1.c()
            p.lhd r4 = r8.e
            p.saa0 r5 = r4.a
            r5.d(r2)
            p.ihd r5 = new p.ihd
            p.b3p0 r6 = r8.f
            p.r261 r7 = r8.g
            r5.<init>(r6, r9, r7, r2)
            r9 = 3
            r6 = 0
            p.xab1 r9 = p.fn31.T(r0, r2, r6, r5, r9)
            r4.a = r9
            goto L23
        L57:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jhd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
