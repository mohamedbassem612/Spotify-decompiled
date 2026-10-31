package p;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lmi implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ iu30 c;

    public /* synthetic */ lmi(ArrayList arrayList, iu30 iu30Var, byte b) {
        this.a = b;
        this.b = arrayList;
        this.c = iu30Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        ArrayList arrayList = this.b;
        boolean z = true;
        switch (b) {
            case 0:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i = (iIntValue2 & 6) == 0 ? iIntValue2 | (x340Var.g(aqb0Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i & 1, (i & 147) != 146)) {
                    x340Var2.b0();
                } else {
                    tpy tpyVar = (tpy) arrayList.get(iIntValue);
                    x340Var2.i0(-1591211868);
                    boolean zG = x340Var2.g(iu30Var) | x340Var2.g(tpyVar);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new dfi(iu30Var, tpyVar, (byte) 4);
                        x340Var2.s0(objT);
                    }
                    cqy.b(tpyVar, (Function0) objT, null, x340Var2, 0);
                    x340Var2.r(false);
                }
                break;
            case 1:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i2 = (iIntValue4 & 6) == 0 ? iIntValue4 | (x340Var3.g(aqb0Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    x340Var4.b0();
                } else {
                    nom0 nom0Var = (nom0) arrayList.get(iIntValue3);
                    x340Var4.i0(1164635929);
                    qim0 qim0VarN = anm1.N("move_to_folder_full_tree_folder_row_".concat(nom0Var.a), u291.f(nim0Var, 1.0f));
                    uvx uvxVar = new uvx(1, (pgx) null, 3, uyn1.h(2, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498);
                    j2i j2iVar = nom0Var.c ? p2j.f : null;
                    boolean zG2 = x340Var4.g(nom0Var) | x340Var4.g(iu30Var);
                    if ((((i2 & 112) ^ 48) <= 32 || !x340Var4.e(iIntValue3)) && (i2 & 48) != 32) {
                        z = false;
                    }
                    boolean z2 = zG2 | z;
                    Object objT2 = x340Var4.T();
                    if (z2 || objT2 == fkj0.X) {
                        objT2 = new wv1(nom0Var, iu30Var, iIntValue3, (byte) 9);
                        x340Var4.s0(objT2);
                    }
                    jto1.b(qim0VarN, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT2), (gbx) null, (xu30) null, p2j.g, (xu30) null, (xu30) null, j2iVar, (xu30) null, (xu30) null, apo.r(-810292375, new b1s(nom0Var, (byte) 12), x340Var4), x340Var4, 805306432, 196608, 28092);
                    x340Var4.r(false);
                }
                break;
            default:
                aqb0 aqb0Var3 = (aqb0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var5 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i3 = (iIntValue6 & 6) == 0 ? iIntValue6 | (x340Var5.g(aqb0Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i3 |= x340Var5.e(iIntValue5) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(i3 & 1, (i3 & 147) != 146)) {
                    x340Var6.b0();
                } else {
                    r8b r8bVar = (r8b) arrayList.get(iIntValue5);
                    x340Var6.i0(-1239118786);
                    d1u.j(iIntValue5, r8bVar, iu30Var, x340Var6, ((i3 & 126) >> 3) & 14);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var6).b;
                    ywx0.n(nim0Var, 12.0f, x340Var6, false);
                }
                break;
        }
        return rih1Var;
    }
}
