package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c61 extends hab0 implements vu30 {
    public final /* synthetic */ String X;
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ nl3 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ gdx e;
    public final /* synthetic */ lee1 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ j2i h;
    public final /* synthetic */ vu30 i;
    public final /* synthetic */ qim0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c61(float f, float f2, nl3 nl3Var, List list, gdx gdxVar, lee1 lee1Var, int i, j2i j2iVar, vu30 vu30Var, qim0 qim0Var, String str) {
        super(2);
        this.a = f;
        this.b = f2;
        this.c = nl3Var;
        this.d = list;
        this.e = gdxVar;
        this.f = lee1Var;
        this.g = i;
        this.h = j2iVar;
        this.i = vu30Var;
        this.t = qim0Var;
        this.X = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        tlc1 tlc1Var = (tlc1) obj;
        long j = ((hjl) obj2).a;
        long jB = hjl.b(j, 0, 0, 0, Integer.MAX_VALUE, 3);
        lee1 lee1Var = this.f;
        int i = this.g;
        nl3 nl3Var = this.c;
        List list = this.d;
        q5t0 q5t0VarH = ((afh0) o7h.V0(tlc1Var.P("footerMeasurement", new j2i(1835491906, new z51(nl3Var, list, this.a, this.e, lee1Var, i), true)))).H(jB);
        int i2 = this.g;
        vu30 vu30Var = this.i;
        nl3 nl3Var2 = this.c;
        float f = this.a;
        j2i j2iVar = this.h;
        q5t0 q5t0VarH2 = ((afh0) o7h.V0(tlc1Var.P("content", new j2i(1822486500, new b61(hjl.d(j) && ((afh0) o7h.V0(tlc1Var.P("naturalMeasurement", new j2i(2109693495, new x51(nl3Var2, f, j2iVar, list, this.e, this.f, i2, vu30Var), true)))).H(jB).b > hjl.h(j) && hjl.h(j) - (tlc1Var.i0(this.a) + q5t0VarH.b) >= tlc1Var.i0(this.b), this.c, this.a, this.t, j2iVar, this.i, this.X, list, this.e, this.f, this.g), true)))).H(j);
        return tlc1Var.S(q5t0VarH2.a, q5t0VarH2.b, b7x.a, new f2(q5t0VarH2, (byte) 2));
    }
}
