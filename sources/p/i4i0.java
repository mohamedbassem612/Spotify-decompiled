package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i4i0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ m4i0 a;

    public i4i0(m4i0 m4i0Var) {
        this.a = m4i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r7.b(r10, r0) == r6) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r8, p.r261 r9, p.onm r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.h4i0
            if (r0 == 0) goto L13
            r0 = r10
            p.h4i0 r0 = (p.h4i0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.h4i0 r0 = new p.h4i0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.b
            p.m4i0 r7 = r7.a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L46
            if (r1 == r4) goto L3c
            if (r1 == r3) goto L36
            if (r1 != r2) goto L30
            p.hm5.M(r10)
            goto L7d
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r5
        L36:
            p.r261 r7 = r0.d
            p.hm5.M(r10)
            goto L70
        L3c:
            int r8 = r0.f
            p.o4i0 r9 = r0.e
            p.r261 r1 = r0.d
            p.hm5.M(r10)
            goto L5e
        L46:
            p.hm5.M(r10)
            p.o4i0 r8 = (p.o4i0) r8
            r0.d = r9
            r0.e = r8
            r10 = 0
            r0.f = r10
            r0.b = r4
            java.lang.Object r1 = r7.a(r0)
            if (r1 != r6) goto L5b
            goto L7c
        L5b:
            r1 = r9
            r9 = r8
            r8 = r10
        L5e:
            long r9 = r9.a
            r0.d = r1
            r0.e = r5
            r0.f = r8
            r0.b = r3
            java.lang.Object r10 = r7.b(r9, r0)
            if (r10 != r6) goto L6f
            goto L7c
        L6f:
            r7 = r1
        L70:
            r0.d = r5
            r0.e = r5
            r0.b = r2
            java.lang.Object r7 = r7.b(r10, r0)
            if (r7 != r6) goto L7d
        L7c:
            return r6
        L7d:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.i4i0.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
