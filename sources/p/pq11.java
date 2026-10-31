package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pq11 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ op11 a;

    public pq11(op11 op11Var) {
        this.a = op11Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
    
        if (r0.b(r2, r11) == r15) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r18, p.r261 r19, p.onm r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof p.oq11
            if (r2 == 0) goto L18
            r2 = r1
            p.oq11 r2 = (p.oq11) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.b = r3
        L16:
            r11 = r2
            goto L1e
        L18:
            p.oq11 r2 = new p.oq11
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r11.a
            int r2 = r11.b
            r13 = 2
            r3 = 1
            r14 = 0
            p.d9n r15 = p.d9n.a
            if (r2 == 0) goto L41
            if (r2 == r3) goto L37
            if (r2 != r13) goto L31
            p.hm5.M(r1)
            goto L98
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r14
        L37:
            p.r261 r0 = r11.d
            p.hm5.M(r1)
            p.e331 r1 = (p.e331) r1
            java.lang.Object r1 = r1.a
            goto L88
        L41:
            p.hm5.M(r1)
            r1 = r18
            p.dq11 r1 = (p.dq11) r1
            java.lang.String r4 = r1.c
            p.bwn r2 = r1.f
            java.lang.String r5 = r1.a
            java.lang.String r7 = r1.e
            p.wp11 r9 = new p.wp11
            java.util.Map r6 = r2.a
            java.lang.String r8 = "spotify:show"
            r10 = 0
            boolean r8 = p.nhc1.Y(r4, r8, r10)
            if (r8 == 0) goto L69
            java.lang.String r8 = "end_of_context_action"
            java.lang.String r10 = "stop"
            java.util.Map r8 = java.util.Collections.singletonMap(r8, r10)
            java.util.LinkedHashMap r6 = p.sqg0.O(r6, r8)
        L69:
            java.util.Map r2 = r2.b
            r9.<init>(r6, r2)
            java.util.List r6 = r1.d
            r1 = r19
            r11.d = r1
            r11.b = r3
            p.op11 r3 = r0.a
            r8 = 0
            r10 = 0
            r12 = 160(0xa0, float:2.24E-43)
            java.io.Serializable r0 = p.bq11.c(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r15) goto L83
            goto L97
        L83:
            r16 = r1
            r1 = r0
            r0 = r16
        L88:
            p.tvn r2 = new p.tvn
            r2.<init>(r1)
            r11.d = r14
            r11.b = r13
            java.lang.Object r0 = r0.b(r2, r11)
            if (r0 != r15) goto L98
        L97:
            return r15
        L98:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pq11.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
