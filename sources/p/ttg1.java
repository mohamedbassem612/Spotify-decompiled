package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ttg1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ utg1 a;

    public ttg1(utg1 utg1Var) {
        this.a = utg1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r10.b(r9, r0) == r6) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r9, p.r261 r10, p.onm r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p.stg1
            if (r0 == 0) goto L13
            r0 = r11
            p.stg1 r0 = (p.stg1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.stg1 r0 = new p.stg1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.b
            p.utg1 r8 = r8.a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L44
            if (r1 == r4) goto L3c
            if (r1 == r3) goto L36
            if (r1 != r2) goto L30
            p.hm5.M(r11)
            goto L87
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r5
        L36:
            p.r261 r8 = r0.d
            p.hm5.M(r11)
            goto L76
        L3c:
            int r9 = r0.e
            p.r261 r10 = r0.d
            p.hm5.M(r11)
            goto L5c
        L44:
            p.hm5.M(r11)
            p.odw r9 = (p.odw) r9
            p.u4q0 r9 = r8.b
            r0.d = r10
            r11 = 0
            r0.e = r11
            r0.b = r4
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r6) goto L59
            goto L86
        L59:
            r7 = r11
            r11 = r9
            r9 = r7
        L5c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L7a
            p.wgq0 r8 = r8.c
            r0.d = r10
            r0.e = r9
            r0.b = r3
            p.ihq0 r8 = (p.ihq0) r8
            java.lang.Object r8 = r8.f(r0)
            if (r8 != r6) goto L75
            goto L86
        L75:
            r8 = r10
        L76:
            p.exz r9 = p.exz.a
            r10 = r8
            goto L7c
        L7a:
            p.exz r9 = p.exz.e
        L7c:
            r0.d = r5
            r0.b = r2
            java.lang.Object r8 = r10.b(r9, r0)
            if (r8 != r6) goto L87
        L86:
            return r6
        L87:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ttg1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
