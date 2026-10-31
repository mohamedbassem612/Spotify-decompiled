package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a1q0 extends hab0 implements xu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ gdx e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ e0q0 g;
    public final /* synthetic */ j82 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1q0(String str, int i, boolean z, float f, gdx gdxVar, ven0 ven0Var, e0q0 e0q0Var, j82 j82Var) {
        super(3);
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = gdxVar;
        this.f = ven0Var;
        this.g = e0q0Var;
        this.h = j82Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        hdx idxVar;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.h(zBooleanValue) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            String str = this.a;
            if (ihc1.y0(str)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return null;
            }
            gbx gbxVar = new gbx(new y50(str), (Function0) this.f.getValue());
            if (zBooleanValue) {
                x340Var2.i0(737785899);
                Object objT = x340Var2.T();
                if (objT == m4cVar) {
                    objT = w0q0.d;
                    x340Var2.s0(objT);
                }
                idxVar = new hdx(0, (vu30) objT, (vu30) null, (vu30) null, (hw61) null, 29);
                x340Var2.r(false);
            } else {
                x340Var2.i0(737788246);
                x340Var2.r(false);
                idxVar = new idx(this.b);
            }
            boolean z = this.c;
            boolean zH = x340Var2.h(z);
            float f = this.d;
            boolean zD = zH | x340Var2.d(f);
            Object objT2 = x340Var2.T();
            if (zD || objT2 == m4cVar) {
                objT2 = new ik6(z, f, (byte) 3);
                x340Var2.s0(objT2);
            }
            wro1.h(gbxVar, idxVar, i541.C(nim0.a, (iu30) objT2), (max) null, this.e, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(271422190, new jyo0(this.g, this.h, (byte) 8), x340Var2), x340Var2, 0, 6, 984);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
