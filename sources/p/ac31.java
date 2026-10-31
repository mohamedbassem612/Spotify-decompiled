package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ac31 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ccq a;
    public final /* synthetic */ String b;
    public final /* synthetic */ x390 c;

    public ac31(ccq ccqVar, String str, x390 x390Var) {
        this.a = ccqVar;
        this.b = str;
        this.c = x390Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r14.b(r15, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r13, p.r261 r14, p.onm r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof p.zb31
            if (r0 == 0) goto L13
            r0 = r15
            p.zb31 r0 = (p.zb31) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.zb31 r0 = new p.zb31
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r15)
            goto L5f
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r4
        L31:
            p.r261 r14 = r0.d
            p.hm5.M(r15)
            goto L54
        L37:
            p.hm5.M(r15)
            r7 = r13
            p.ya31 r7 = (p.ya31) r7
            p.af0 r6 = new p.af0
            p.x390 r10 = r12.c
            r11 = 0
            p.ccq r8 = r12.a
            java.lang.String r9 = r12.b
            r6.<init>(r7, r8, r9, r10, r11)
            r0.d = r14
            r0.b = r3
            java.lang.Object r15 = p.smo1.s(r6, r0)
            if (r15 != r5) goto L54
            goto L5e
        L54:
            r0.d = r4
            r0.b = r2
            java.lang.Object r12 = r14.b(r15, r0)
            if (r12 != r5) goto L5f
        L5e:
            return r5
        L5f:
            p.rih1 r12 = p.rih1.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ac31.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
