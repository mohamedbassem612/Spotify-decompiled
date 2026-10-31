package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class abs extends a8d1 implements bv30 {
    public z72 a;
    public Iterator b;
    public int c;
    public byte d;
    public /* synthetic */ eom0 e;
    public /* synthetic */ gom0 f;
    public /* synthetic */ dom0 g;
    public /* synthetic */ tqw h;
    public final /* synthetic */ z72 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abs(z72 z72Var, lnm lnmVar) {
        super(5, lnmVar);
        this.i = z72Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        abs absVar = new abs(this.i, (lnm) obj5);
        absVar.e = (eom0) obj;
        absVar.f = (gom0) obj2;
        absVar.g = (dom0) obj3;
        absVar.h = (tqw) obj4;
        return absVar.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[PHI: r13
      0x0029: PHI (r13v20 java.lang.Object) = (r13v15 java.lang.Object), (r13v0 java.lang.Object) binds: [B:28:0x00c7, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:22:0x007d->B:47:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ed, code lost:
    
        if (p.fn31.Y(r13, r0, r12) == r10) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.abs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
