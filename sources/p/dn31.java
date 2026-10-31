package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dn31 extends a8d1 implements vu30 {
    public String[] a;
    public int b;
    public int c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ String[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn31(String[] strArr, lnm lnmVar) {
        super(2, lnmVar);
        this.f = strArr;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        dn31 dn31Var = new dn31(this.f, lnmVar);
        dn31Var.e = obj;
        return dn31Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((t7g1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0053 -> B:16:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.d
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 == r2) goto L1f
            if (r0 != r1) goto L18
            int r0 = r8.c
            int r3 = r8.b
            java.lang.String[] r4 = r8.a
            java.lang.Object r5 = r8.e
            p.t7g1 r5 = (p.t7g1) r5
            p.hm5.M(r9)
            goto L56
        L18:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            r8 = 0
            return r8
        L1f:
            java.lang.Object r0 = r8.e
            p.t7g1 r0 = (p.t7g1) r0
            p.hm5.M(r9)
            goto L2f
        L27:
            p.hm5.M(r9)
            java.lang.Object r9 = r8.e
            r0 = r9
            p.t7g1 r0 = (p.t7g1) r0
        L2f:
            java.lang.String[] r9 = r8.f
            int r3 = r9.length
            r4 = 0
            r5 = r0
            r0 = r3
            r3 = r4
            r4 = r9
        L37:
            if (r3 >= r0) goto L58
            r9 = r4[r3]
            java.lang.String r6 = "DELETE FROM `"
            r7 = 96
            java.lang.String r9 = p.cy30.n(r6, r9, r7)
            r8.e = r5
            r8.a = r4
            r8.b = r3
            r8.c = r0
            r8.d = r1
            java.lang.Object r9 = p.anm1.x(r5, r9, r8)
            p.d9n r6 = p.d9n.a
            if (r9 != r6) goto L56
            return r6
        L56:
            int r3 = r3 + r2
            goto L37
        L58:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dn31.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
