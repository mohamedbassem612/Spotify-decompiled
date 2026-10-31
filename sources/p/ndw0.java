package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ndw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ pdw0 a;

    public ndw0(pdw0 pdw0Var) {
        this.a = pdw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r14.b(r15, r0) == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r13, p.r261 r14, p.onm r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof p.mdw0
            if (r0 == 0) goto L13
            r0 = r15
            p.mdw0 r0 = (p.mdw0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.mdw0 r0 = new p.mdw0
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
            goto L6b
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r4
        L31:
            p.r261 r14 = r0.d
            p.hm5.M(r15)
            goto L60
        L37:
            p.hm5.M(r15)
            p.ybw0 r13 = (p.ybw0) r13
            r0.d = r14
            r0.b = r3
            p.pdw0 r12 = r12.a
            p.jr30 r12 = r12.f
            java.lang.String r15 = r13.a
            java.lang.Long r12 = r12.a(r15)
            p.few0 r6 = new p.few0
            if (r12 == 0) goto L53
            long r7 = r12.longValue()
            goto L55
        L53:
            r7 = 0
        L55:
            long r9 = r13.b
            p.tv80 r11 = r13.c
            r6.<init>(r7, r9, r11)
            if (r6 != r5) goto L5f
            goto L6a
        L5f:
            r15 = r6
        L60:
            r0.d = r4
            r0.b = r2
            java.lang.Object r12 = r14.b(r15, r0)
            if (r12 != r5) goto L6b
        L6a:
            return r5
        L6b:
            p.rih1 r12 = p.rih1.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ndw0.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
