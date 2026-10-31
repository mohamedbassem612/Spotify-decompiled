package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l011 extends hab0 implements vu30 {
    public final /* synthetic */ c380 a;
    public final /* synthetic */ mp10 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ fg50 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l011(c380 c380Var, mp10 mp10Var, String str, float f, float f2, boolean z, boolean z2, boolean z3, fg50 fg50Var) {
        super(2);
        this.a = c380Var;
        this.b = mp10Var;
        this.c = str;
        this.d = f;
        this.e = f2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = fg50Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            x340Var2.b0();
        } else if (this.a.isEmpty()) {
            x340Var2.i0(-976854351);
            ljo1.f((gt40) null, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340Var2.i0(-976799140);
            y3o1.h(this.a, this.b, this.c, this.d, this.e, (gt40) null, this.f, this.g, this.h, this.i, x340Var2, 0);
            x340Var2.r(false);
        }
        return rih1.a;
    }
}
