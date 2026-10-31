package p;

import com.spotify.home.evopage.mobius.Effect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v2e0 extends a8d1 implements vu30 {
    public np60 a;
    public String b;
    public ice0 c;
    public boolean d;
    public byte e;
    public /* synthetic */ Object f;
    public final /* synthetic */ y2e0 g;
    public final /* synthetic */ Effect.LoadHomeStructure h;
    public final /* synthetic */ s2t i;
    public final /* synthetic */ s2t t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2e0(Effect.LoadHomeStructure loadHomeStructure, lnm lnmVar, s2t s2tVar, s2t s2tVar2, y2e0 y2e0Var) {
        super(2, lnmVar);
        this.g = y2e0Var;
        this.h = loadHomeStructure;
        this.i = s2tVar;
        this.t = s2tVar2;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        v2e0 v2e0Var = new v2e0(this.h, lnmVar, this.i, this.t, this.g);
        v2e0Var.f = obj;
        return v2e0Var;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((v2e0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ff  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c8, code lost:
    
        if (r0 == r12) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011f, code lost:
    
        if (r0 == r12) goto L35;
     */
    @Override // p.faa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.v2e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
