package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yuy0 {
    public final Set a;

    public yuy0(t380 t380Var) {
        this.a = t380Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:0: B:19:0x0044->B:46:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0064 -> B:42:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(p.rba r6, p.onm r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p.xuy0
            if (r0 == 0) goto L13
            r0 = r7
            p.xuy0 r0 = (p.xuy0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            p.xuy0 r0 = new p.xuy0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            p.wuy0 r5 = r0.c
            java.util.Iterator r6 = r0.b
            p.rba r1 = r0.a
            p.hm5.M(r7)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L90
            r4 = r7
            r7 = r5
            r5 = r1
            r1 = r4
            goto L67
        L2f:
            r6 = move-exception
            goto L70
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L38:
            p.hm5.M(r7)
            java.util.Set r5 = r5.a
            java.util.Iterator r5 = r5.iterator()
            r4 = r6
            r6 = r5
            r5 = r4
        L44:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L92
            java.lang.Object r7 = r6.next()
            p.wuy0 r7 = (p.wuy0) r7
            boolean r1 = r7.a(r5)     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L90
            if (r1 == 0) goto L44
            r0.a = r5     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L90
            r0.b = r6     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L90
            r0.c = r7     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L90
            r0.f = r2     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L90
            java.lang.Object r1 = r7.b(r0)     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L90
            p.d9n r3 = p.d9n.a
            if (r1 != r3) goto L67
            return r3
        L67:
            p.pb r1 = (p.pb) r1     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L90
            boolean r7 = r1 instanceof p.mb     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L90
            if (r7 != 0) goto L44
            return r1
        L6e:
            r6 = move-exception
            r5 = r7
        L70:
            java.lang.Class r5 = r5.getClass()
            p.jd11 r7 = p.rc11.a
            p.tka0 r5 = r7.b(r5)
            java.lang.String r5 = r5.r()
            java.lang.String r7 = "PushAcceptHandler failed: "
            java.lang.String r5 = p.l1d.m(r7, r5)
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            com.spotify.base.java.logging.Logger.e(r6, r5, r7)
            p.nb r5 = new p.nb
            r5.<init>()
            return r5
        L90:
            r5 = move-exception
            throw r5
        L92:
            p.mb r5 = p.mb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yuy0.a(p.rba, p.onm):java.lang.Object");
    }
}
