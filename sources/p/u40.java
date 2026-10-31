package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u40 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u40(iu30 iu30Var, List list) {
        super(3);
        this.a = (byte) 1;
        this.b = iu30Var;
        this.c = list;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        z50 z50Var = z50.c;
        iu30 iu30Var = this.b;
        rih1 rih1Var = rih1.a;
        List list = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int iIntValue = ((Number) obj).intValue();
                x340 x340Var = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var.e(iIntValue) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x40 x40Var = (x40) list.get(iIntValue);
                    x340Var2.i0(-192789072);
                    if (x40Var instanceof m40) {
                        x340Var2.i0(1517802525);
                        boolean zG = x340Var2.g(iu30Var) | x340Var2.i(x40Var);
                        Object objT = x340Var2.T();
                        if (zG || objT == fkj0.X) {
                            objT = new y4(iu30Var, (m40) x40Var, (byte) 6);
                            x340Var2.s0(objT);
                        }
                        m40 m40Var = (m40) x40Var;
                        poo1.e(new gbx(z50Var, (Function0) objT), m40Var.d, yoo1.z(x340Var2), anm1.N("action_chip_".concat(m40Var.a), nim0Var), 0, m40Var.e, null, apo.r(-1257824576, new s40(m40Var, (byte) 0), x340Var2), null, null, null, false, null, apo.r(1121556499, new s40(m40Var, (byte) 1), x340Var2), x340Var2, 12582912, 3072, 8016);
                        x340Var2.r(false);
                    } else {
                        if (!(x40Var instanceof n20)) {
                            throw p3d1.k(x340Var2, 1517801651, false);
                        }
                        x340Var2.i0(1517830903);
                        cwl1.b(sgc1.H(2, nim0Var), (tl3) null, (hw61) null, (pgx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(670914584, new wf((byte) 4, (n20) x40Var, iu30Var), x340Var2), x340Var2, 24582, 48, 2030);
                        x340Var2.r(false);
                    }
                    x340Var2.r(false);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean zG2 = x340Var4.g(iu30Var) | x340Var4.g(list);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new vnk(iu30Var, list, (byte) 2);
                        x340Var4.s0(objT2);
                    }
                    l4o1.f((Function0) objT2, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                int iIntValue4 = ((Number) obj).intValue();
                x340 x340Var5 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= x340Var5.e(iIntValue4) ? 4 : 2;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    txs0 txs0Var = (txs0) list.get(iIntValue4);
                    x340Var6.i0(2064909922);
                    String str = txs0Var.b;
                    boolean z = txs0Var.c;
                    iu30 iu30Var2 = this.b;
                    boolean zG3 = x340Var6.g(iu30Var2) | ((((iIntValue5 & 14) ^ 6) > 4 && x340Var6.e(iIntValue4)) || (iIntValue5 & 6) == 4) | x340Var6.i(txs0Var);
                    Object objT3 = x340Var6.T();
                    if (zG3 || objT3 == m4cVar) {
                        v2b v2bVar = new v2b(iu30Var2, iIntValue4, txs0Var, (lnm) null, (byte) 10);
                        x340Var6.s0(v2bVar);
                        objT3 = v2bVar;
                    }
                    qxd0.t(str, x340Var6, (vu30) objT3);
                    boolean zG4 = x340Var6.g(iu30Var2) | x340Var6.i(txs0Var);
                    Object objT4 = x340Var6.T();
                    if (zG4 || objT4 == m4cVar) {
                        objT4 = new shq0((byte) 20, txs0Var, iu30Var2);
                        x340Var6.s0(objT4);
                    }
                    poo1.e(new gbx(z50Var, (Function0) objT4), z ? new nex(4) : pex.b, yoo1.z(x340Var6), anm1.N("allboarding_picker_filter_chip", nim0Var), 0, f4i1.e(txs0Var.a, z ? ", filter, selected" : ", filter"), null, null, null, null, null, false, null, apo.r(1121444584, new nso0(txs0Var, (byte) 26), x340Var6), x340Var6, 0, 3072, 8144);
                    x340Var6.r(false);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                int iIntValue6 = ((Number) obj).intValue();
                x340 x340Var7 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= x340Var7.e(iIntValue6) ? 4 : 2;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    xdv0 xdv0Var = (xdv0) list.get(iIntValue6);
                    x340Var8.i0(45688580);
                    boolean zG5 = x340Var8.g(xdv0Var) | x340Var8.g(iu30Var);
                    Object objT5 = x340Var8.T();
                    if (zG5 || objT5 == m4cVar2) {
                        objT5 = new wpu0((byte) 22, xdv0Var, iu30Var);
                        x340Var8.s0(objT5);
                    }
                    gbx gbxVar = new gbx(z50Var, (Function0) objT5);
                    nex nexVar = xdv0Var.c ? new nex(4) : pex.b;
                    lex lexVarZ = yoo1.z(x340Var8);
                    String str2 = xdv0Var.a;
                    qim0 qim0VarN = anm1.N("popular-releases-category-".concat(str2 != null ? "tag:".concat(str2) : "all"), nim0Var);
                    boolean zG6 = x340Var8.g(xdv0Var);
                    Object objT6 = x340Var8.T();
                    if (zG6 || objT6 == m4cVar2) {
                        objT6 = new n5u0(xdv0Var, (byte) 21);
                        x340Var8.s0(objT6);
                    }
                    poo1.e(gbxVar, nexVar, lexVarZ, s161.b(qim0VarN, false, (iu30) objT6), 0, null, null, null, null, null, null, false, null, apo.r(975037769, new t1t0(xdv0Var, (byte) 22), x340Var8), x340Var8, 0, 3072, 8176);
                    x340Var8.r(false);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            default:
                int iIntValue8 = ((Number) obj).intValue();
                x340 x340Var9 = (b0k) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= x340Var9.e(iIntValue8) ? 4 : 2;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    oh91 oh91Var = (oh91) list.get(iIntValue8);
                    x340Var10.i0(2022681587);
                    boolean z2 = oh91Var.c;
                    boolean zG7 = x340Var10.g(iu30Var) | x340Var10.g(oh91Var);
                    Object objT7 = x340Var10.T();
                    if (zG7 || objT7 == fkj0.X) {
                        objT7 = new iv81(iu30Var, oh91Var, (byte) 4);
                        x340Var10.s0(objT7);
                    }
                    poo1.g(z2, (iu30) objT7, new nex(4), yoo1.z(x340Var10), null, 0, null, null, null, null, null, null, null, false, null, apo.r(-651385844, new wh91(oh91Var, (byte) 0), x340Var10), x340Var10, 0, 196608, 32752);
                    x340Var10.r(false);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u40(List list, iu30 iu30Var, byte b) {
        super(3);
        this.a = b;
        this.c = list;
        this.b = iu30Var;
    }
}
