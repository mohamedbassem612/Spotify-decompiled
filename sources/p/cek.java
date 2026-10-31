package p;

import android.graphics.Color;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cek extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bek b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cek(bek bekVar, byte b) {
        super(3);
        this.a = b;
        this.b = bekVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        long j;
        String strK;
        u7h m231Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bek bekVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qim0 qim0VarR = u291.r(nim0.a, 48.0f);
                    Uri uri = Uri.parse(bekVar.c);
                    bnx bnxVar = bnx.c;
                    eso1.e(uri, isl.a, qim0VarR, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(bnxVar, bnxVar), false, false, x340Var2, 1073742256, 0, 3576);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                g2c g2cVar = (g2c) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                iek iekVar = bekVar.d;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var3.g(g2cVar) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean z = iekVar instanceof gek;
                    gek gekVar = z ? (gek) iekVar : null;
                    String str = gekVar != null ? gekVar.a : null;
                    if (z) {
                        x340Var4.i0(-767440524);
                        x340Var4.r(false);
                        if (str != null) {
                            try {
                                m231Var = new u7h(z4p1.e(Color.parseColor(str)));
                            } catch (Throwable th) {
                                m231Var = new m231(th);
                            }
                            if (m231Var instanceof m231) {
                                m231Var = null;
                            }
                            u7h u7hVar = m231Var;
                            if (u7hVar != null) {
                                j = u7hVar.a;
                            } else {
                                j = dek.a;
                            }
                        } else {
                            j = dek.a;
                        }
                    } else {
                        x340Var4.i0(-767310665);
                        uwr uwrVar = cbx.a;
                        j = cbx.a(x340Var4).b.b;
                        x340Var4.r(false);
                    }
                    long j2 = j;
                    if (iekVar instanceof fek) {
                        strK = x0d.k(x340Var4, -265271890, 2131961491, x340Var4, false);
                    } else if (iekVar instanceof gek) {
                        strK = x0d.k(x340Var4, -265268371, 2131961490, x340Var4, false);
                    } else {
                        if (!(iekVar instanceof hek)) {
                            throw p3d1.k(x340Var4, -265273867, false);
                        }
                        strK = x0d.k(x340Var4, -265264850, 2131961491, x340Var4, false);
                    }
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var4, 48);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarE = zr7.E(x340Var4, nim0Var);
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
                    bnx bnxVar2 = bnx.c;
                    uwr uwrVar2 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var4).g;
                    w0h1.a(bnxVar2, isl.a, u291.r(nim0Var, 16.0f), j2, 0L, z, x340Var4, bnx.d | 48, 16);
                    List listM = p7h.M(new String[]{strK, bekVar.e});
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : listM) {
                        if (((String) obj4).length() > 0) {
                            arrayList.add(obj4);
                        }
                    }
                    String strY0 = o7h.y0(arrayList, " · ", (String) null, (String) null, (iu30) null, 62);
                    uwr uwrVar3 = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var4).j;
                    cjc0 cjc0Var = new cjc0(1);
                    cvx cvxVar = cbx.b(x340Var4).b;
                    uwo1.e(strY0, uyn1.B(nim0Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), lee1Var, j2, (a0e1) null, (iu30) null, 0, false, cjc0Var, 0, (qx8) null, x340Var4, 0, 0, 1776);
                    x340Var4.r(true);
                    break;
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String str2 = bekVar.b;
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(str2, (qim0) null, cbx.d(x340Var6).h, cbx.a(x340Var6).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var6, 0, 0, 1778);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
