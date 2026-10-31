package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m9e0 extends a8d1 implements vu30 {
    public double a;
    public double b;
    public byte c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ double f;
    public final /* synthetic */ double g;
    public final /* synthetic */ double h;
    public final /* synthetic */ List i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9e0(int i, int i2, double d, double d2, double d3, List list, int i3, lnm lnmVar) {
        super(2, lnmVar);
        this.d = i;
        this.e = i2;
        this.f = d;
        this.g = d2;
        this.h = d3;
        this.i = list;
        this.t = i3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new m9e0(this.d, this.e, this.f, this.g, this.h, this.i, this.t, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b9 A[PHI: r0 r2 r9 r10
      0x00b9: PHI (r0v11 double) = (r0v10 double), (r0v17 double) binds: [B:27:0x00b6, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r2v6 double) = (r2v5 double), (r2v9 double) binds: [B:27:0x00b6, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r9v8 p.d9n) = (r9v6 p.d9n), (r9v11 p.d9n) binds: [B:27:0x00b6, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r10v5 java.util.List) = (r10v4 java.util.List), (r10v8 java.util.List) binds: [B:27:0x00b6, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e3, code lost:
    
        if (p.o95.b(r4, r6, r7, (java.lang.Float) null, (p.iu30) null, r21, 12) == r9) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fb, code lost:
    
        if (r0.g(r1, r21) == r9) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m9e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
