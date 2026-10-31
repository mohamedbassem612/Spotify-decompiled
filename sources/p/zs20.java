package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zs20 extends a8d1 implements vu30 {
    public byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public zs20(long j, lnm lnmVar) {
        super(2, lnmVar);
        this.c = (int) j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        zs20 zs20Var = new zs20(this.c, lnmVar);
        zs20Var.b = obj;
        return zs20Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1.a);
        return d9n.a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:15:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.c
            long r0 = (long) r0
            java.lang.Object r2 = r8.b
            p.ssw0 r2 = (p.ssw0) r2
            byte r3 = r8.a
            r4 = 3
            r5 = 2
            r6 = 1
            p.d9n r7 = p.d9n.a
            if (r3 == 0) goto L26
            if (r3 == r6) goto L22
            if (r3 == r5) goto L1e
            if (r3 != r4) goto L17
            goto L22
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            r8 = 0
            return r8
        L1e:
            p.hm5.M(r9)
            goto L45
        L22:
            p.hm5.M(r9)
            goto L34
        L26:
            p.hm5.M(r9)
            r8.b = r2
            r8.a = r6
            java.lang.Object r9 = p.hap1.i(r0, r8)
            if (r9 != r7) goto L34
            goto L4f
        L34:
            p.r261 r9 = r2.c()
            r8.b = r2
            r8.a = r5
            p.rih1 r3 = p.rih1.a
            java.lang.Object r9 = r9.b(r3, r8)
            if (r9 != r7) goto L45
            goto L4f
        L45:
            r8.b = r2
            r8.a = r4
            java.lang.Object r9 = p.hap1.i(r0, r8)
            if (r9 != r7) goto L34
        L4f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zs20.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
