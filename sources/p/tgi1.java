package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tgi1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rgi1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tgi1(rgi1 rgi1Var, byte b) {
        super(3);
        this.a = b;
        this.b = rgi1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rgi1 rgi1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(1 & iIntValue, (iIntValue & 17) != 16)) {
                    igi1 igi1Var = rgi1Var.c;
                    if (igi1Var == null) {
                        x340Var2.i0(220535090);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(220535091);
                        if (igi1Var instanceof igi1) {
                            x340Var2.i0(-2091850582);
                            String str = igi1Var.a;
                            uwr uwrVar = cbx.a;
                            uwo1.e(str, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, null, null, 2, false, new zic0(2), 0, null, x340Var2, 1572864, 0, 1714);
                            x340Var2.r(false);
                        } else {
                            if (!(igi1Var instanceof hgi1)) {
                                throw p3d1.k(x340Var2, -1037312156, false);
                            }
                            x340Var2.i0(-2091535126);
                            af5 af5Var = ((hgi1) igi1Var).a;
                            uwr uwrVar2 = cbx.a;
                            uwo1.d(af5Var, cbx.a(x340Var2).b.b, null, cbx.d(x340Var2).j, null, null, 2, false, new zic0(2), 0, null, null, x340Var2, 1572864, 0, 3764);
                            x340Var2.r(false);
                        }
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    kgi1 kgi1Var = rgi1Var.d;
                    if (u890.j(kgi1Var, lgi1.a)) {
                        x340Var4.i0(37711112);
                        x340Var4.r(false);
                    } else if (kgi1Var instanceof mgi1) {
                        x340Var4.i0(37712735);
                        ero1.e(((mgi1) kgi1Var).a, (qim0) null, x340Var4, 0);
                        x340Var4.r(false);
                    } else {
                        if (!(kgi1Var instanceof kgi1)) {
                            throw p3d1.k(x340Var4, 37709759, false);
                        }
                        x340Var4.i0(1169176224);
                        uwr uwrVar3 = cbx.a;
                        jw31 jw31VarA = ew31.a(new d36(cbx.b(x340Var4).b.a, true, new um5(false)), een.N0, x340Var4, 48);
                        int iHashCode = Long.hashCode(x340Var4.T);
                        xos0 xos0VarM = x340Var4.m();
                        qim0 qim0VarE = zr7.E(x340Var4, nim0.a);
                        hzj.A.getClass();
                        if (x340Var4.a == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var4.m0();
                        if (x340Var4.S) {
                            x340Var4.l(hmb0.t1);
                        } else {
                            x340Var4.v0();
                        }
                        nko1.H(jw31VarA, x340Var4, y580.O0);
                        nko1.H(xos0VarM, x340Var4, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                        nko1.F(x340Var4);
                        nko1.H(qim0VarE, x340Var4, y580.Y);
                        x340Var4.i0(-275168305);
                        Iterator it = kgi1Var.a.iterator();
                        while (it.hasNext()) {
                            ero1.e((qgi1) it.next(), (qim0) null, x340Var4, 0);
                        }
                        us71.m(x340Var4, false, true, false);
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String str2 = rgi1Var.b;
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(str2, null, cbx.d(x340Var6).g, cbx.a(x340Var6).b.a, null, null, 2, false, new zic0(2), 0, null, x340Var6, 1572864, 0, 1714);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
