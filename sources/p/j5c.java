package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j5c {
    public final bfn0 a = new bfn0(0, new k5c[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(p.n511 r8, p.lnm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.i5c
            if (r0 == 0) goto L13
            r0 = r9
            p.i5c r0 = (p.i5c) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.i5c r0 = new p.i5c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.e
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            int r7 = r0.d
            int r8 = r0.c
            java.lang.Object[] r1 = r0.b
            p.n511 r3 = r0.a
            p.hm5.M(r9)
            r9 = r3
            goto L63
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            r7 = 0
            return r7
        L35:
            p.hm5.M(r9)
            p.bfn0 r7 = r7.a
            java.lang.Object[] r9 = r7.a
            int r7 = r7.c
            r1 = 0
            r6 = r9
            r9 = r8
            r8 = r1
            r1 = r6
        L43:
            if (r8 >= r7) goto L65
            r3 = r1[r8]
            p.k5c r3 = (p.k5c) r3
            p.hx4 r4 = new p.hx4
            r5 = 10
            r4.<init>(r9, r5)
            r0.a = r9
            r0.b = r1
            r0.c = r8
            r0.d = r7
            r0.g = r2
            java.lang.Object r3 = p.u7n0.t(r3, r4, r0)
            p.d9n r4 = p.d9n.a
            if (r3 != r4) goto L63
            return r4
        L63:
            int r8 = r8 + r2
            goto L43
        L65:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.j5c.a(p.n511, p.lnm):java.lang.Object");
    }
}
