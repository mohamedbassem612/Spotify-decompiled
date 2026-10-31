package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o380 extends o280 {
    public gfp0 a;
    public boolean b;

    public final o280 a(Object obj) {
        c(1, obj);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0037 -> B:9:0x0019). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:7:0x000a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void c(int r8, java.lang.Object r9) {
        /*
            r7 = this;
            p.gfp0 r0 = r7.a
            if (r8 != 0) goto L5
            return
        L5:
            boolean r1 = r7.b
            r2 = 0
            if (r1 == 0) goto L3c
            p.gfp0 r1 = new p.gfp0
            r1.<init>()
            int r3 = r0.c
            r1.d(r3)
            int r3 = r0.c
            r4 = -1
            if (r3 != 0) goto L1b
        L19:
            r3 = r4
            goto L1c
        L1b:
            r3 = r2
        L1c:
            if (r3 == r4) goto L3a
            int r5 = r0.c
            p.dm5.q(r3, r5)
            java.lang.Object[] r5 = r0.a
            r5 = r5[r3]
            int r6 = r0.c
            p.dm5.q(r3, r6)
            int[] r6 = r0.b
            r6 = r6[r3]
            r1.e(r6, r5)
            int r3 = r3 + 1
            int r5 = r0.c
            if (r3 >= r5) goto L19
            goto L1c
        L3a:
            r7.a = r1
        L3c:
            r7.b = r2
            r9.getClass()
            p.gfp0 r7 = r7.a
            int r0 = r7.b(r9)
            int r0 = r0 + r8
            r7.e(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.o380.c(int, java.lang.Object):void");
    }
}
