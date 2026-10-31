package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zmk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cnk a;

    public zmk(cnk cnkVar) {
        this.a = cnkVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (r10.b(r2, r0) == r7) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r9, p.r261 r10, p.onm r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p.ymk
            if (r0 == 0) goto L13
            r0 = r11
            p.ymk r0 = (p.ymk) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.ymk r0 = new p.ymk
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.b
            p.nnk r2 = p.nnk.a
            p.cnk r8 = r8.a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L46
            if (r1 == r5) goto L3e
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            p.hm5.M(r11)
            goto L97
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r6
        L38:
            p.r261 r10 = r0.d
            p.hm5.M(r11)     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            goto L84
        L3e:
            int r9 = r0.e
            p.r261 r10 = r0.d
            p.hm5.M(r11)     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            goto L68
        L46:
            p.hm5.M(r11)
            p.emk r9 = (p.emk) r9
            java.util.Set r11 = p.s4b1.f     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            java.lang.String r9 = r9.a     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            p.s4b1 r9 = p.uic.x(r9)     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            java.lang.String r9 = r9.h()     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            p.fnk r11 = r8.a     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            r0.d = r10     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            r1 = 0
            r0.e = r1     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            r0.b = r5     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            java.lang.Object r11 = r11.c(r9, r0)     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            if (r11 != r7) goto L67
            goto L96
        L67:
            r9 = r1
        L68:
            p.cok r11 = (p.cok) r11     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            java.util.List r1 = r11.a     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            if (r1 == 0) goto L73
            goto L8c
        L73:
            p.utw0 r8 = r8.b     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            java.util.List r11 = r11.a     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            r0.d = r10     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            r0.e = r9     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            r0.b = r4     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            java.io.Serializable r11 = r8.p(r11, r0)     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            if (r11 != r7) goto L84
            goto L96
        L84:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            p.onk r8 = new p.onk     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            r8.<init>(r11)     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L9a
            r2 = r8
        L8c:
            r0.d = r6
            r0.b = r3
            java.lang.Object r8 = r10.b(r2, r0)
            if (r8 != r7) goto L97
        L96:
            return r7
        L97:
            p.rih1 r8 = p.rih1.a
            return r8
        L9a:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zmk.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
