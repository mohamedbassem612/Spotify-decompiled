package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w5d1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ c6d1 a;

    public w5d1(c6d1 c6d1Var) {
        this.a = c6d1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (r9.b(r10, r0) == r6) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r10, p.r261 r11, p.onm r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof p.v5d1
            if (r0 == 0) goto L13
            r0 = r12
            p.v5d1 r0 = (p.v5d1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.v5d1 r0 = new p.v5d1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.a
            int r1 = r0.b
            p.c6d1 r9 = r9.a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L44
            if (r1 == r4) goto L3c
            if (r1 == r3) goto L36
            if (r1 != r2) goto L30
            p.hm5.M(r12)
            goto L93
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r5
        L36:
            p.r261 r9 = r0.d
            p.hm5.M(r12)
            goto L81
        L3c:
            int r10 = r0.e
            p.r261 r11 = r0.d
            p.hm5.M(r12)
            goto L6f
        L44:
            p.hm5.M(r12)
            p.u4d1 r10 = (p.u4d1) r10
            boolean r10 = r10.a
            r7 = 2000(0x7d0, double:9.88E-321)
            if (r10 == 0) goto L50
            goto L61
        L50:
            p.e6d1 r10 = r9.a
            int r10 = r10.ordinal()
            if (r10 == 0) goto L61
            if (r10 != r4) goto L5d
            r7 = 5000(0x1388, double:2.4703E-320)
            goto L61
        L5d:
            p.eg.o()
            return r5
        L61:
            r0.d = r11
            r10 = 0
            r0.e = r10
            r0.b = r4
            java.lang.Object r12 = p.hap1.i(r7, r0)
            if (r12 != r6) goto L6f
            goto L92
        L6f:
            p.b6d1 r9 = r9.c
            p.iu30 r9 = r9.a
            r0.d = r11
            r0.e = r10
            r0.b = r3
            java.lang.Object r12 = r9.invoke(r0)
            if (r12 != r6) goto L80
            goto L92
        L80:
            r9 = r11
        L81:
            p.a6d1 r12 = (p.a6d1) r12
            p.r6d1 r10 = new p.r6d1
            r10.<init>(r12)
            r0.d = r5
            r0.b = r2
            java.lang.Object r9 = r9.b(r10, r0)
            if (r9 != r6) goto L93
        L92:
            return r6
        L93:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w5d1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
