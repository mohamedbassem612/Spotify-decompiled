package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nxl extends z031 implements vu30 {
    public hav0 b;
    public hav0 c;
    public long d;
    public int e;
    public byte f;
    public /* synthetic */ Object g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxl(iu30 iu30Var, float f, Function0 function0, lnm lnmVar) {
        super(2, lnmVar);
        this.h = iu30Var;
        this.i = f;
        this.t = function0;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        nxl nxlVar = new nxl(this.h, this.i, this.t, lnmVar);
        nxlVar.g = obj;
        return nxlVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1.a);
        return d9n.a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7 A[PHI: r2 r10
      0x00b7: PHI (r2v4 int) = (r2v7 int), (r2v8 int) binds: [B:16:0x0052, B:29:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r10v2 p.hav0) = (r10v3 p.hav0), (r10v4 p.hav0) binds: [B:16:0x0052, B:29:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0066 -> B:20:0x0069). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nxl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
