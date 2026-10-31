package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rj1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ h971 a;

    public rj1(h971 h971Var) {
        this.a = h971Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (r8.b(r6, r0) == r5) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.qj1
            if (r0 == 0) goto L13
            r0 = r9
            p.qj1 r0 = (p.qj1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.qj1 r0 = new p.qj1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L7e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)     // Catch: java.lang.Throwable -> L37
            goto L4f
        L37:
            r6 = move-exception
            goto L5d
        L39:
            p.hm5.M(r9)
            p.ui1 r7 = (p.ui1) r7
            p.h971 r6 = r6.a     // Catch: java.lang.Throwable -> L37
            java.lang.String r7 = r7.a     // Catch: java.lang.Throwable -> L37
            r0.d = r8     // Catch: java.lang.Throwable -> L37
            r0.b = r3     // Catch: java.lang.Throwable -> L37
            p.s971 r6 = (p.s971) r6     // Catch: java.lang.Throwable -> L37
            java.lang.Object r9 = r6.c(r7, r0)     // Catch: java.lang.Throwable -> L37
            if (r9 != r5) goto L4f
            goto L7d
        L4f:
            p.i971 r9 = (p.i971) r9     // Catch: java.lang.Throwable -> L37
            p.aj1 r6 = new p.aj1     // Catch: java.lang.Throwable -> L37
            java.util.List r7 = r9.a     // Catch: java.lang.Throwable -> L37
            int r1 = r9.c     // Catch: java.lang.Throwable -> L37
            p.w4i1 r9 = r9.d     // Catch: java.lang.Throwable -> L37
            r6.<init>(r7, r1, r9)     // Catch: java.lang.Throwable -> L37
            goto L63
        L5d:
            p.m231 r7 = new p.m231
            r7.<init>(r6)
            r6 = r7
        L63:
            java.lang.Throwable r7 = p.e331.a(r6)
            if (r7 != 0) goto L6a
            goto L73
        L6a:
            p.o8n r6 = r0.getContext()
            p.op71.x(r6)
            p.zi1 r6 = p.zi1.a
        L73:
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r6, r0)
            if (r6 != r5) goto L7e
        L7d:
            return r5
        L7e:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rj1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
