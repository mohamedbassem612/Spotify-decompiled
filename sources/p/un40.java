package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class un40 implements sn40 {
    public final Context a;
    public final ox5 b;

    public un40(Context context, ox5 ox5Var) {
        this.a = context;
        this.b = ox5Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[Catch: Exception -> 0x002b, CancellationException -> 0x0079, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0079, Exception -> 0x002b, blocks: (B:12:0x0027, B:26:0x0066, B:20:0x0040, B:22:0x0046, B:27:0x006b, B:19:0x0036), top: B:33:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0063 -> B:26:0x0066). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(p.onm r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof p.tn40
            if (r0 == 0) goto L13
            r0 = r10
            p.tn40 r0 = (p.tn40) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.tn40 r0 = new p.tn40
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2d
            int r1 = r0.b
            java.util.Iterator r5 = r0.a
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            goto L66
        L2b:
            r9 = move-exception
            goto L71
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r2
        L33:
            p.hm5.M(r10)
            java.util.List r10 = p.hiv.a     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            r5 = r10
            r1 = r4
        L40:
            boolean r10 = r5.hasNext()     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            if (r10 == 0) goto L6b
            java.lang.Object r10 = r5.next()     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            p.giv r10 = (p.giv) r10     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            p.ox5 r6 = r9.b     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            android.content.ComponentName r7 = new android.content.ComponentName     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            android.content.Context r8 = r9.a     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            java.lang.String r10 = r10.a     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            r7.<init>(r8, r10)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            r0.a = r5     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            r0.b = r1     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            r0.e = r3     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            java.lang.Object r10 = r6.a(r7, r0)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            p.d9n r6 = p.d9n.a
            if (r10 != r6) goto L66
            return r6
        L66:
            int[] r10 = (int[]) r10     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            int r10 = r10.length     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            int r1 = r1 + r10
            goto L40
        L6b:
            java.lang.Integer r9 = new java.lang.Integer     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            r9.<init>(r1)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L79
            return r9
        L71:
            java.lang.String r10 = "[WidgetBackgroundUpdates] Failed to query installed widgets"
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r9, r10, r0)
            return r2
        L79:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.un40.a(p.onm):java.lang.Object");
    }
}
