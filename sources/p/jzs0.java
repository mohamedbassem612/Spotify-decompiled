package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jzs0 {
    public final zxm1 a;
    public final idd1 b = new idd1(new hzs0(this, 0));
    public final idd1 c = new idd1(new hzs0(this, 1));

    public jzs0(zxm1 zxm1Var) {
        this.a = zxm1Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0070 -> B:26:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.List r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.izs0
            if (r0 == 0) goto L13
            r0 = r8
            p.izs0 r0 = (p.izs0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.izs0 r0 = new p.izs0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.e
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            int r7 = r0.d
            java.lang.Object r1 = r0.c
            java.util.Iterator r3 = r0.b
            java.util.Collection r4 = r0.a
            java.util.Collection r4 = (java.util.Collection) r4
            p.hm5.M(r8)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L84
            goto L73
        L2f:
            r8 = move-exception
            goto L76
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L38:
            p.hm5.M(r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
            r1 = 0
            r3 = r7
            r4 = r8
            r7 = r1
        L4a:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L86
            java.lang.Object r1 = r3.next()
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            p.zxm1 r5 = r6.a     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L84
            io.reactivex.rxjava3.core.Single r8 = r5.c(r8)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L84
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L84
            r0.a = r5     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L84
            r0.b = r3     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L84
            r0.c = r1     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L84
            r0.d = r7     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L84
            r0.g = r2     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L84
            java.lang.Object r8 = p.fc11.j(r8, r0)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L84
            p.d9n r5 = p.d9n.a
            if (r8 != r5) goto L73
            return r5
        L73:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L84
            goto L7c
        L76:
            p.m231 r5 = new p.m231
            r5.<init>(r8)
            r8 = r5
        L7c:
            boolean r8 = r8 instanceof p.m231
            if (r8 == 0) goto L4a
            r4.add(r1)
            goto L4a
        L84:
            r6 = move-exception
            throw r6
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jzs0.a(java.util.List, p.onm):java.lang.Object");
    }
}
