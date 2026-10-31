package p;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class igf extends hab0 implements xu30 {
    public final /* synthetic */ gv2 N0;
    public final /* synthetic */ znb0 O0;
    public final /* synthetic */ bgd0 P0;
    public final /* synthetic */ tvu0 Q0;
    public final /* synthetic */ uuu0 R0;
    public final /* synthetic */ onu0 S0;
    public final /* synthetic */ boolean T0;
    public final /* synthetic */ boolean U0;
    public final /* synthetic */ boolean V0;
    public final /* synthetic */ boolean W0;
    public final /* synthetic */ bqm X;
    public final /* synthetic */ boolean X0;
    public final /* synthetic */ yyh Y;
    public final /* synthetic */ boolean Y0;
    public final /* synthetic */ ysd1 Z;
    public final /* synthetic */ boolean Z0;
    public final /* synthetic */ uef a;
    public final /* synthetic */ boolean a1;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ res b1;
    public final /* synthetic */ vzq0 c;
    public final /* synthetic */ rwj c1;
    public final /* synthetic */ d0r d;
    public final /* synthetic */ ipb1 d1;
    public final /* synthetic */ bzi0 e;
    public final /* synthetic */ ven0 e1;
    public final /* synthetic */ r171 f;
    public final /* synthetic */ f5f g;
    public final /* synthetic */ ig31 h;
    public final /* synthetic */ i2j0 i;
    public final /* synthetic */ h001 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igf(uef uefVar, iu30 iu30Var, vzq0 vzq0Var, d0r d0rVar, bzi0 bzi0Var, r171 r171Var, f5f f5fVar, ig31 ig31Var, i2j0 i2j0Var, h001 h001Var, bqm bqmVar, yyh yyhVar, ysd1 ysd1Var, gv2 gv2Var, znb0 znb0Var, bgd0 bgd0Var, tvu0 tvu0Var, uuu0 uuu0Var, onu0 onu0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, res resVar, rwj rwjVar, ipb1 ipb1Var, ven0 ven0Var) {
        super(3);
        this.a = uefVar;
        this.b = iu30Var;
        this.c = vzq0Var;
        this.d = d0rVar;
        this.e = bzi0Var;
        this.f = r171Var;
        this.g = f5fVar;
        this.h = ig31Var;
        this.i = i2j0Var;
        this.t = h001Var;
        this.X = bqmVar;
        this.Y = yyhVar;
        this.Z = ysd1Var;
        this.N0 = gv2Var;
        this.O0 = znb0Var;
        this.P0 = bgd0Var;
        this.Q0 = tvu0Var;
        this.R0 = uuu0Var;
        this.S0 = onu0Var;
        this.T0 = z;
        this.U0 = z2;
        this.V0 = z3;
        this.W0 = z4;
        this.X0 = z5;
        this.Y0 = z6;
        this.Z0 = z7;
        this.a1 = z8;
        this.b1 = resVar;
        this.c1 = rwjVar;
        this.d1 = ipb1Var;
        this.e1 = ven0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        h5f h5fVar = (h5f) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        uef uefVar = this.a;
        List list = uefVar.h;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.e(h5fVar.ordinal()) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            int iOrdinal = h5fVar.ordinal();
            vzq0 vzq0Var = this.c;
            if (iOrdinal != 0) {
                nim0 nim0Var = nim0.a;
                if (iOrdinal == 1) {
                    x340Var2.i0(321505614);
                    otw.c(this.b1, new gx71(uefVar.b, uefVar.c, uefVar.f, list, uefVar.q), uyn1.w(nim0Var, vzq0Var), (ipb1) null, x340Var2, 0, 8);
                    x340Var2.r(false);
                } else {
                    if (iOrdinal != 2) {
                        throw p3d1.k(x340Var2, 321447879, false);
                    }
                    x340Var2.i0(321521806);
                    String str = uefVar.b;
                    jwm jwmVar = uefVar.f;
                    List listSingletonList = Collections.singletonList(jwmVar.a);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((jwm) it.next()).a);
                    }
                    qm80 qm80Var = new qm80(str, jwmVar.a.a, o7h.N0(arrayList, listSingletonList));
                    qim0 qim0VarW = uyn1.w(nim0Var, vzq0Var);
                    Parcelable.Creator creator = w4i1.CREATOR;
                    otw.c(this.c1, qm80Var, qim0VarW, this.d1, x340Var2, 0, 0);
                    x340Var2.r(false);
                }
            } else {
                x340Var2.i0(321448598);
                Object objT = x340Var2.T();
                if (objT == fkj0.X) {
                    objT = new cy7(this.e1, (byte) 25);
                    x340Var2.s0(objT);
                }
                zso1.u(uefVar, this.b, vzq0Var, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, this.R0, this.S0, this.T0, this.U0, this.V0, this.W0, this.X0, this.Y0, this.Z0, this.a1, (iu30) objT, x340Var2, 134217728);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
