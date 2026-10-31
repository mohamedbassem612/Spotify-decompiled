package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bnj1 {
    public final Context a;
    public final mr20 b;

    public bnj1(Context context, mr20 mr20Var) {
        this.a = context;
        this.b = rqt0.u(new xkb1(new uji1(mr20Var, (byte) 4), (byte) 15));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r7.a(r1, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r8, p.onm r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.xmj1
            if (r0 == 0) goto L13
            r0 = r9
            p.xmj1 r0 = (p.xmj1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.xmj1 r0 = new p.xmj1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L6e
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L31:
            boolean r10 = r0.b
            java.lang.String r8 = r0.a
            p.hm5.M(r9)
            goto L4b
        L39:
            p.hm5.M(r9)
            r0.a = r8
            r0.b = r10
            r0.e = r3
            p.mr20 r9 = r7.b
            java.lang.Object r9 = p.b5p1.i(r9, r0)
            if (r9 != r5) goto L4b
            goto L6d
        L4b:
            java.lang.String r9 = (java.lang.String) r9
            p.u4r r1 = p.cnj1.b
            p.mma0[] r3 = p.cnj1.a
            r6 = 0
            r3 = r3[r6]
            android.content.Context r7 = r7.a
            java.lang.Object r7 = r1.a(r7, r3)
            p.r4r r7 = (p.r4r) r7
            p.vxg1 r1 = new p.vxg1
            r1.<init>(r9, r10, r8, r4)
            r0.a = r4
            r0.b = r10
            r0.e = r2
            java.lang.Object r7 = r7.a(r1, r0)
            if (r7 != r5) goto L6e
        L6d:
            return r5
        L6e:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bnj1.a(java.lang.String, p.onm, boolean):java.lang.Object");
    }
}
