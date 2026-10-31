package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ock extends hab0 implements vu30 {
    public final /* synthetic */ hdk a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ fb5 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ int h;
    public final /* synthetic */ iu30 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ock(hdk hdkVar, boolean z, float f, float f2, iu30 iu30Var, fb5 fb5Var, float f3, int i, iu30 iu30Var2) {
        super(2);
        this.a = hdkVar;
        this.b = z;
        this.c = f;
        this.d = f2;
        this.e = iu30Var;
        this.f = fb5Var;
        this.g = f3;
        this.h = i;
        this.i = iu30Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            hdk hdkVar = this.a;
            boolean z = hdkVar.f.length() > 0 || hdkVar.g.length() > 0;
            boolean z2 = hdkVar.h.getLabel().length() > 0;
            boolean z3 = hdkVar.z || z2;
            int i = this.h;
            iu30 iu30Var = this.i;
            boolean z4 = this.b;
            rck.i(z4, apo.r(-1218715590, new nck(z, z4, hdkVar, z3, this.c, this.d, this.e, z2, this.f, this.g, i, iu30Var), x340Var2), x340Var2, 48);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
