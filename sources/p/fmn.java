package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fmn extends a8d1 implements vu30 {
    public final /* synthetic */ gmn X;
    public qmn a;
    public List b;
    public Collection c;
    public Iterator d;
    public int e;
    public int f;
    public int g;
    public byte h;
    public /* synthetic */ Object i;
    public final /* synthetic */ bmn t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmn(bmn bmnVar, gmn gmnVar, lnm lnmVar) {
        super(2, lnmVar);
        this.t = bmnVar;
        this.X = gmnVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        fmn fmnVar = new fmn(this.t, this.X, lnmVar);
        fmnVar.i = obj;
        return fmnVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0074  */
    /* JADX WARN: Code duplicated, block: B:22:0x009f  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e2 A[PHI: r2 r3
      0x00e2: PHI (r2v7 java.util.List) = (r2v5 java.util.List), (r2v11 java.util.List) binds: [B:29:0x00df, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r3v4 java.lang.Object) = (r3v3 java.lang.Object), (r3v6 java.lang.Object) binds: [B:29:0x00df, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
    
        if (r5 == r9) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f6, code lost:
    
        if (r1.emit(r4, r16) == r9) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0093 -> B:18:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fmn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
