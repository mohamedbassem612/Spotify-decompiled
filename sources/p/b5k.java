package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b5k extends a8d1 implements vu30 {
    public final /* synthetic */ LinkedHashMap N0;
    public final /* synthetic */ iu30 X;
    public final /* synthetic */ iu30 Y;
    public final /* synthetic */ boolean Z;
    public s2t a;
    public u4k b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ x7g1 f;
    public final /* synthetic */ f5k g;
    public final /* synthetic */ String h;
    public final /* synthetic */ z57 i;
    public final /* synthetic */ guq0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5k(boolean z, x7g1 x7g1Var, f5k f5kVar, String str, z57 z57Var, guq0 guq0Var, iu30 iu30Var, iu30 iu30Var2, boolean z2, LinkedHashMap linkedHashMap, lnm lnmVar) {
        super(2, lnmVar);
        this.e = z;
        this.f = x7g1Var;
        this.g = f5kVar;
        this.h = str;
        this.i = z57Var;
        this.t = guq0Var;
        this.X = iu30Var;
        this.Y = iu30Var2;
        this.Z = z2;
        this.N0 = linkedHashMap;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        b5k b5kVar = new b5k(this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, lnmVar);
        b5kVar.d = obj;
        return b5kVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f2, code lost:
    
        if (r1 == r12) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b5k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
