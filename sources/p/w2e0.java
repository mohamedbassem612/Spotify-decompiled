package p;

import com.spotify.home.evopage.mobius.Effect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w2e0 extends a8d1 implements vu30 {
    public s2t a;
    public l2t b;
    public boolean c;
    public boolean d;
    public byte e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Effect.LoadHomeStructure g;
    public final /* synthetic */ y2e0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2e0(Effect.LoadHomeStructure loadHomeStructure, lnm lnmVar, y2e0 y2e0Var) {
        super(2, lnmVar);
        this.g = loadHomeStructure;
        this.h = y2e0Var;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        w2e0 w2e0Var = new w2e0(this.g, lnmVar, this.h);
        w2e0Var.f = obj;
        return w2e0Var;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((w2e0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af A[PHI: r1 r2 r5
      0x00af: PHI (r1v6 java.lang.Object) = (r1v5 java.lang.Object), (r1v13 java.lang.Object) binds: [B:21:0x00ac, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r2v8 boolean) = (r2v7 boolean), (r2v15 boolean) binds: [B:21:0x00ac, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r5v5 boolean) = (r5v4 boolean), (r5v8 boolean) binds: [B:21:0x00ac, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x00c4  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d6, code lost:
    
        if (r0 == r14) goto L29;
     */
    @Override // p.faa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w2e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
