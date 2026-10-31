package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rtg1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ utg1 a;

    public rtg1(utg1 utg1Var) {
        this.a = utg1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r8.b(r6, r0) == r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.qtg1
            if (r0 == 0) goto L13
            r0 = r9
            p.qtg1 r0 = (p.qtg1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.qtg1 r0 = new p.qtg1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L6c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)
            p.e331 r9 = (p.e331) r9
            java.lang.Object r6 = r9.a
            goto L4f
        L3b:
            p.hm5.M(r9)
            p.m9w r7 = (p.m9w) r7
            p.utg1 r6 = r6.a
            p.k4q0 r6 = r6.a
            r0.d = r8
            r0.b = r3
            java.io.Serializable r6 = r6.c(r0)
            if (r6 != r5) goto L4f
            goto L6b
        L4f:
            boolean r7 = r6 instanceof p.m231
            if (r7 == 0) goto L54
            r6 = r4
        L54:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r6 = p.u890.j(r6, r7)
            if (r6 == 0) goto L5f
            p.exz r6 = p.exz.g
            goto L61
        L5f:
            p.exz r6 = p.exz.e
        L61:
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r6, r0)
            if (r6 != r5) goto L6c
        L6b:
            return r5
        L6c:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rtg1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
