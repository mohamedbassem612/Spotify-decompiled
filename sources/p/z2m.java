package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z2m implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ g931 a;

    public z2m(g931 g931Var) {
        this.a = g931Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        if (r13.b(r12, r0) == r7) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r12, p.r261 r13, p.onm r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p.y2m
            if (r0 == 0) goto L13
            r0 = r14
            p.y2m r0 = (p.y2m) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.y2m r0 = new p.y2m
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            int r1 = r0.b
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L52
            if (r1 == r5) goto L41
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            p.hm5.M(r14)
            goto Lb7
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r6
        L36:
            p.a2m r11 = r0.e
            p.r261 r13 = r0.d
            p.hm5.M(r14)     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> Lba
            goto L81
        L3e:
            r12 = move-exception
            goto L97
        L41:
            int r12 = r0.f
            p.a2m r13 = r0.e
            p.r261 r1 = r0.d
            p.hm5.M(r14)     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> Lba
            r10 = r13
            r13 = r12
            r12 = r10
            goto L6a
        L4e:
            r12 = move-exception
        L4f:
            r11 = r13
            r13 = r1
            goto L97
        L52:
            p.hm5.M(r14)
            p.a2m r12 = (p.a2m) r12
            r0.d = r13     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> Lba
            r0.e = r12     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> Lba
            r0.f = r2     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> Lba
            r0.b = r5     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> Lba
            r8 = 300(0x12c, double:1.48E-321)
            java.lang.Object r14 = p.hap1.i(r8, r0)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> Lba
            if (r14 != r7) goto L68
            goto Lb6
        L68:
            r1 = r13
            r13 = r2
        L6a:
            p.g931 r11 = r11.a     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> Lba
            java.lang.String r14 = r12.a     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> Lba
            p.k620 r5 = r12.b     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> Lba
            r0.d = r1     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> Lba
            r0.e = r12     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> Lba
            r0.f = r13     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> Lba
            r0.b = r4     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> Lba
            java.lang.Object r14 = r11.v(r14, r5, r0)     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> Lba
            if (r14 != r7) goto L7f
            goto Lb6
        L7f:
            r11 = r12
            r13 = r1
        L81:
            p.c851 r14 = (p.c851) r14     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> Lba
            p.q2m r12 = new p.q2m     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> Lba
            java.util.ArrayList r14 = r14.a     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> Lba
            p.c380 r14 = p.mqo1.A(r14)     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> Lba
            r12.<init>(r14)     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> Lba
            goto Laa
        L8f:
            r11 = move-exception
            r13 = r12
            r12 = r11
            goto L4f
        L93:
            r11 = move-exception
            r10 = r12
            r12 = r11
            r11 = r10
        L97:
            java.lang.String r11 = r11.a
            java.lang.String r14 = "ChatContentPicker: Failed to search for query: "
            java.lang.String r11 = p.l1d.m(r14, r11)
            java.lang.Object[] r14 = new java.lang.Object[r2]
            com.spotify.base.java.logging.Logger.e(r12, r11, r14)
            p.p2m r11 = new p.p2m
            r11.<init>(r12)
            r12 = r11
        Laa:
            r0.d = r6
            r0.e = r6
            r0.b = r3
            java.lang.Object r11 = r13.b(r12, r0)
            if (r11 != r7) goto Lb7
        Lb6:
            return r7
        Lb7:
            p.rih1 r11 = p.rih1.a
            return r11
        Lba:
            r11 = move-exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.z2m.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
