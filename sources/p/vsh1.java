package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vsh1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ kly0 a;

    public vsh1(kly0 kly0Var) {
        this.a = kly0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (r9.b(r10, r0) == r5) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r8, p.r261 r9, p.onm r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.ush1
            if (r0 == 0) goto L13
            r0 = r10
            p.ush1 r0 = (p.ush1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.ush1 r0 = new p.ush1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r10)
            goto L85
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L31:
            p.ish1 r7 = r0.e
            p.r261 r9 = r0.d
            p.hm5.M(r10)
            p.e331 r10 = (p.e331) r10
            java.lang.Object r8 = r10.a
            goto L5c
        L3d:
            p.hm5.M(r10)
            p.ish1 r8 = (p.ish1) r8
            p.kly0 r7 = r7.a
            java.lang.Object r7 = r7.get()
            p.umu0 r7 = (p.umu0) r7
            java.lang.String r10 = r8.a
            r0.d = r9
            r0.e = r8
            r0.b = r3
            java.lang.Object r7 = p.zsh1.a(r7, r10, r0)
            if (r7 != r5) goto L59
            goto L84
        L59:
            r6 = r8
            r8 = r7
            r7 = r6
        L5c:
            java.lang.Throwable r10 = p.e331.a(r8)
            if (r10 != 0) goto L76
            java.lang.String r8 = (java.lang.String) r8
            p.cth1 r10 = new p.cth1
            if (r8 == 0) goto L71
            java.lang.String r7 = r7.b
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L71
            goto L72
        L71:
            r3 = 0
        L72:
            r10.<init>(r3)
            goto L78
        L76:
            p.dth1 r10 = p.dth1.a
        L78:
            r0.d = r4
            r0.e = r4
            r0.b = r2
            java.lang.Object r7 = r9.b(r10, r0)
            if (r7 != r5) goto L85
        L84:
            return r5
        L85:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vsh1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
