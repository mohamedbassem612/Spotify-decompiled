package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k7e extends hab0 implements vu30 {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ h7e b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7e(iu30 iu30Var, h7e h7eVar, long j, float f, float f2, long j2, float f3) {
        super(2);
        this.a = iu30Var;
        this.b = h7eVar;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.f = j2;
        this.g = f3;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            cwl1.b(anm1.N("browse_category_card", nim0.a), (tl3) null, (hw61) null, (pgx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(623554770, new j7e(this.a, this.b, this.c, this.d, this.e, this.f, this.g), x340Var2), x340Var2, 0, 48, 2030);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
