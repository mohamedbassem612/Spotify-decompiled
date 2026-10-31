package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yxb implements vu30 {
    public final /* synthetic */ iyb a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ hw61 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ vu30 i;
    public final /* synthetic */ j2i t;

    public yxb(iyb iybVar, float f, float f2, boolean z, hw61 hw61Var, long j, long j2, float f3, vu30 vu30Var, j2i j2iVar) {
        this.a = iybVar;
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = hw61Var;
        this.f = j;
        this.g = j2;
        this.h = f3;
        this.i = vu30Var;
        this.t = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            t890.g(this.a.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
