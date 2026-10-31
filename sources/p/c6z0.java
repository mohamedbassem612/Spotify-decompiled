package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c6z0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dh30 a;

    public c6z0(dh30 dh30Var) {
        this.a = dh30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r10.b(r9, r0) == r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r9, p.r261 r10, p.onm r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p.b6z0
            if (r0 == 0) goto L13
            r0 = r11
            p.b6z0 r0 = (p.b6z0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.b6z0 r0 = new p.b6z0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r11)
            goto L6f
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r4
        L31:
            p.s5z0 r8 = r0.e
            p.r261 r10 = r0.d
            p.hm5.M(r11)
            goto L5b
        L39:
            p.hm5.M(r11)
            p.s5z0 r9 = (p.s5z0) r9
            p.pdh r11 = new p.pdh
            p.m80 r1 = r9.a
            java.lang.String r6 = r1.a
            java.lang.String r1 = r1.b
            p.tv80 r7 = r9.b
            r11.<init>(r6, r1, r7)
            r0.d = r10
            r0.e = r9
            r0.b = r3
            p.dh30 r8 = r8.a
            java.lang.Object r8 = r8.I(r11, r0)
            if (r8 != r5) goto L5a
            goto L6e
        L5a:
            r8 = r9
        L5b:
            p.k8z0 r9 = new p.k8z0
            p.tv80 r8 = r8.b
            r9.<init>(r8)
            r0.d = r4
            r0.e = r4
            r0.b = r2
            java.lang.Object r8 = r10.b(r9, r0)
            if (r8 != r5) goto L6f
        L6e:
            return r5
        L6f:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.c6z0.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
