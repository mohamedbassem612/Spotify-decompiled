package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jgw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ghw0 a;

    public jgw0(ghw0 ghw0Var) {
        this.a = ghw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r8.b(r6, r0) == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.igw0
            if (r0 == 0) goto L13
            r0 = r9
            p.igw0 r0 = (p.igw0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.igw0 r0 = new p.igw0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L6d
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)
            goto L4f
        L37:
            p.hm5.M(r9)
            p.agw0 r7 = (p.agw0) r7
            java.lang.String r9 = r7.c
            java.lang.String r1 = r7.e
            p.tv80 r7 = r7.f
            r0.d = r8
            r0.b = r3
            p.ghw0 r6 = r6.a
            java.lang.Object r9 = r6.e(r9, r1, r7, r0)
            if (r9 != r5) goto L4f
            goto L6c
        L4f:
            p.bhw0 r9 = (p.bhw0) r9
            p.ahw0 r6 = p.ahw0.a
            boolean r6 = p.u890.j(r9, r6)
            if (r6 == 0) goto L5c
            p.vgw0 r6 = p.vgw0.a
            goto L62
        L5c:
            boolean r6 = r9 instanceof p.zgw0
            if (r6 == 0) goto L70
            p.ugw0 r6 = p.ugw0.a
        L62:
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r6, r0)
            if (r6 != r5) goto L6d
        L6c:
            return r5
        L6d:
            p.rih1 r6 = p.rih1.a
            return r6
        L70:
            p.eg.o()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jgw0.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
