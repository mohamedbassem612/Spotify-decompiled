package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v91 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ aa1 a;

    public v91(aa1 aa1Var) {
        this.a = aa1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r13.b(r14, r7) == r10) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r12, p.r261 r13, p.onm r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p.u91
            if (r0 == 0) goto L14
            r0 = r14
            p.u91 r0 = (p.u91) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.b = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            p.u91 r0 = new p.u91
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.a
            int r0 = r7.b
            r8 = 2
            r1 = 1
            r9 = 0
            p.d9n r10 = p.d9n.a
            if (r0 == 0) goto L39
            if (r0 == r1) goto L33
            if (r0 != r8) goto L2d
            p.hm5.M(r14)
            goto L63
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r9
        L33:
            p.r261 r13 = r7.d
            p.hm5.M(r14)
            goto L58
        L39:
            p.hm5.M(r14)
            p.u81 r12 = (p.u81) r12
            p.aa1 r11 = r11.a
            p.d91 r11 = r11.a
            java.lang.String r2 = r12.c
            java.lang.String r3 = r12.d
            p.g4a r4 = r12.e
            p.g4a r5 = r12.f
            boolean r6 = r12.g
            r7.d = r13
            r7.b = r1
            r1 = r11
            java.lang.Object r14 = r1.e(r2, r3, r4, r5, r6, r7)
            if (r14 != r10) goto L58
            goto L62
        L58:
            r7.d = r9
            r7.b = r8
            java.lang.Object r11 = r13.b(r14, r7)
            if (r11 != r10) goto L63
        L62:
            return r10
        L63:
            p.rih1 r11 = p.rih1.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.v91.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
