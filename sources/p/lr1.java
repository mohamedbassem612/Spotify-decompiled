package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lr1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qr1 a;

    public lr1(qr1 qr1Var) {
        this.a = qr1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        if (r12.b(r13, r0) == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r11, p.r261 r12, p.onm r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof p.kr1
            if (r0 == 0) goto L13
            r0 = r13
            p.kr1 r0 = (p.kr1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.kr1 r0 = new p.kr1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            p.hm5.M(r13)
            goto Lbb
        L2c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r4
        L32:
            p.r261 r12 = r0.d
            p.hm5.M(r13)
            goto Lb0
        L39:
            p.hm5.M(r13)
            p.pp1 r11 = (p.pp1) r11
            p.qr1 r10 = r10.a
            p.n381 r10 = r10.j
            r0.d = r12
            r0.b = r3
            p.ohd r11 = new p.ohd
            p.lnm r13 = p.aym.t(r0)
            r11.<init>(r3, r13)
            r11.t()
            java.lang.Object r13 = r10.b
            p.nx1 r13 = (p.nx1) r13
            java.lang.Object r10 = r10.c
            p.so1 r10 = (p.so1) r10
            p.ria1 r1 = r10.d
            java.lang.String r10 = r10.S0
            p.pia1 r10 = r1.a(r10)
            p.sdg r1 = new p.sdg
            r3 = 6
            r1.<init>(r11, r3)
            p.u4a0 r3 = new p.u4a0
            r6 = 4
            r3.<init>(r11, r6)
            p.h21 r7 = r13.b
            p.zf30 r7 = r7.a()
            p.lx1 r7 = (p.lx1) r7
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r9 = "selected_sort_order"
            r8.putParcelable(r9, r10)
            r7.T0(r8)
            p.jm1 r10 = new p.jm1
            r10.<init>(r3, r6)
            p.d4 r3 = new p.d4
            r6 = 25
            r3.<init>(r10, r7, r6)
            p.ix1 r10 = r7.e2
            if (r10 == 0) goto L9e
            if (r10 == 0) goto L98
            r10.g = r3
            goto L9e
        L98:
            java.lang.String r10 = "addToPlaylistSortAdapter"
            p.u890.C(r10)
            throw r4
        L9e:
            r7.g2 = r3
            r7.f2 = r1
            p.th30 r10 = r13.a
            java.lang.String r13 = "add-to-playlist-sort-popup-bottom-sheet"
            r7.g1(r10, r13)
            java.lang.Object r13 = r11.r()
            if (r13 != r5) goto Lb0
            goto Lba
        Lb0:
            r0.d = r4
            r0.b = r2
            java.lang.Object r10 = r12.b(r13, r0)
            if (r10 != r5) goto Lbb
        Lba:
            return r5
        Lbb:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lr1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
