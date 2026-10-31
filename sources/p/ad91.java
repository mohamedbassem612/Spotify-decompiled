package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ad91 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cd91 a;
    public final /* synthetic */ String b;

    public ad91(String str, cd91 cd91Var) {
        this.a = cd91Var;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r12.b(r13, r0) == r5) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r11, p.r261 r12, p.onm r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof p.zc91
            if (r0 == 0) goto L13
            r0 = r13
            p.zc91 r0 = (p.zc91) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.zc91 r0 = new p.zc91
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r13)
            goto L7f
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r4
        L31:
            p.r261 r12 = r0.d
            p.hm5.M(r13)
            goto L74
        L37:
            p.hm5.M(r13)
            com.spotify.home.slotloading.SlotEffect$FetchLayout r11 = (com.spotify.home.slotloading.SlotEffect$FetchLayout) r11
            p.cd91 r13 = r10.a
            p.w2z r1 = r13.a
            p.d7 r6 = new p.d7
            r7 = 0
            p.t0z r8 = p.qkg.Y
            r6.<init>(r8, r7)
        L48:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L60
            java.lang.Object r7 = r6.next()
            r8 = r7
            p.qkg r8 = (p.qkg) r8
            java.lang.String r8 = r8.b
            java.lang.String r9 = r10.b
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L48
            goto L61
        L60:
            r7 = r4
        L61:
            p.qkg r7 = (p.qkg) r7
            if (r7 != 0) goto L67
            p.qkg r7 = p.qkg.c
        L67:
            p.ks21 r10 = r13.c
            r0.d = r12
            r0.b = r3
            java.lang.Object r13 = r1.g(r11, r7, r10, r0)
            if (r13 != r5) goto L74
            goto L7e
        L74:
            r0.d = r4
            r0.b = r2
            java.lang.Object r10 = r12.b(r13, r0)
            if (r10 != r5) goto L7f
        L7e:
            return r5
        L7f:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ad91.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
