package p;

import android.media.MediaCodec;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xl31 extends a8d1 implements vu30 {
    public final /* synthetic */ x550 X;
    public o811 a;
    public int b;
    public float c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ gpj1 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ ssw0 i;
    public final /* synthetic */ MediaCodec t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl31(int i, gpj1 gpj1Var, long j, ssw0 ssw0Var, MediaCodec mediaCodec, x550 x550Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = i;
        this.g = gpj1Var;
        this.h = j;
        this.i = ssw0Var;
        this.t = mediaCodec;
        this.X = x550Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        xl31 xl31Var = new xl31(this.f, this.g, this.h, this.i, this.t, this.X, lnmVar);
        xl31Var.e = obj;
        return xl31Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0092 A[PHI: r1 r7 r14
      0x0092: PHI (r1v2 int) = (r1v4 int), (r1v9 int) binds: [B:24:0x008f, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r7v0 p.o811) = (r7v1 p.o811), (r7v7 p.o811) binds: [B:24:0x008f, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r14v2 float) = (r14v5 float), (r14v8 float) binds: [B:24:0x008f, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (p.xpn1.H(r13) == r6) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a0 -> B:8:0x001c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.e
            p.c9n r0 = (p.c9n) r0
            byte r1 = r13.d
            int r2 = r13.f
            r3 = 3
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L3a
            if (r1 == r5) goto L32
            if (r1 == r4) goto L25
            if (r1 != r3) goto L1e
            int r1 = r13.b
            p.o811 r7 = r13.a
            p.hm5.M(r14)
        L1c:
            r11 = r7
            goto L44
        L1e:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            r13 = 0
            return r13
        L25:
            float r1 = r13.c
            int r7 = r13.b
            p.o811 r8 = r13.a
            p.hm5.M(r14)
            r14 = r1
            r1 = r7
            r7 = r8
            goto L92
        L32:
            int r1 = r13.b
            p.o811 r7 = r13.a
            p.hm5.M(r14)
            goto L67
        L3a:
            p.hm5.M(r14)
            p.o811 r14 = new p.o811
            r14.<init>()
            r1 = 0
            r11 = r14
        L44:
            if (r1 >= r2) goto La3
            p.smo1.t(r0)
            int r14 = r1 + 1
            p.wl31 r7 = new p.wl31
            long r9 = r13.h
            r12 = 0
            p.x550 r8 = r13.X
            r7.<init>(r8, r9, r11, r12)
            r13.e = r0
            r13.a = r11
            r13.b = r1
            r13.d = r5
            p.gpj1 r8 = r13.g
            java.lang.Object r14 = r8.e(r14, r7, r13)
            if (r14 != r6) goto L66
            goto La2
        L66:
            r7 = r11
        L67:
            long r8 = r7.a
            long r10 = r13.h
            long r8 = r8 + r10
            r7.a = r8
            int r1 = r1 + r5
            float r14 = (float) r1
            float r8 = (float) r2
            float r14 = r14 / r8
            p.kpj1 r8 = new p.kpj1
            r9 = 1065353216(0x3f800000, float:1.0)
            int r10 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r10 <= 0) goto L7b
            goto L7c
        L7b:
            r9 = r14
        L7c:
            r8.<init>(r9)
            r13.e = r0
            r13.a = r7
            r13.b = r1
            r13.c = r14
            r13.d = r4
            p.ssw0 r9 = r13.i
            java.lang.Object r8 = r9.b(r8, r13)
            if (r8 != r6) goto L92
            goto La2
        L92:
            r13.e = r0
            r13.a = r7
            r13.b = r1
            r13.c = r14
            r13.d = r3
            java.lang.Object r14 = p.xpn1.H(r13)
            if (r14 != r6) goto L1c
        La2:
            return r6
        La3:
            android.media.MediaCodec r13 = r13.t
            r13.signalEndOfInputStream()
            p.rih1 r13 = p.rih1.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xl31.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
