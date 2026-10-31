package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b3m implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ tcy a;

    public b3m(tcy tcyVar) {
        this.a = tcyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r8.b(r7, r0) == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.a3m
            if (r0 == 0) goto L13
            r0 = r9
            p.a3m r0 = (p.a3m) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.a3m r0 = new p.a3m
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
            goto L94
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)
            goto L49
        L37:
            p.hm5.M(r9)
            p.w1m r7 = (p.w1m) r7
            r0.d = r8
            r0.b = r3
            p.tcy r6 = r6.a
            java.lang.Object r9 = r6.a(r0)
            if (r9 != r5) goto L49
            goto L93
        L49:
            java.util.List r9 = (java.util.List) r9
            p.smc0 r6 = p.k4p1.n()
            p.k620 r7 = p.k620.a
            r6.add(r7)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r7 = new java.util.ArrayList
            r1 = 10
            int r1 = p.q7h.U(r9, r1)
            r7.<init>(r1)
            java.util.Iterator r9 = r9.iterator()
        L65:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r9.next()
            com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType r1 = (com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType) r1
            p.k620 r1 = p.rqo1.w(r1)
            r7.add(r1)
            goto L65
        L79:
            r6.addAll(r7)
            p.smc0 r6 = p.k4p1.k(r6)
            p.c380 r6 = p.mqo1.A(r6)
            p.j2m r7 = new p.j2m
            r7.<init>(r6)
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r7, r0)
            if (r6 != r5) goto L94
        L93:
            return r5
        L94:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b3m.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
