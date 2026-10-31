package p;

import android.content.ClipData;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.concertcampaignview.v1.CtaType;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class u1p1 {
    public static b180 a;
    public static b180 b;

    public static final String A(kmg kmgVar) {
        CharSequence text;
        ClipData.Item itemAt = kmgVar.a.getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    public static final List B(pfj1 pfj1Var) {
        List list = pfj1Var.g;
        int size = list.size();
        List list2 = pfj1Var.c.b;
        if (size != list2.size()) {
            list = null;
        }
        return list == null ? o7h.l1(p7h.K(list2)) : list;
    }

    public static final void C(dhl dhlVar, boolean z) {
        dhlVar.j.c(dhl.k[2], dhlVar, z ? wjk1.b : wjk1.c);
    }

    public static final kmg D(af5 af5Var) {
        return s1p1.A(af5Var);
    }

    public static final int E(m5a m5aVar) {
        if (m5aVar instanceof k5a) {
            return 13;
        }
        if (m5aVar instanceof l5a) {
            return 15;
        }
        if (m5aVar instanceof j5a) {
            return 1;
        }
        eg.o();
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final ArrayList F(h290 h290Var) {
        aey aeyVar;
        int i;
        int i2;
        int i3;
        nb10 tlbVar;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList = new ArrayList(q7h.U(h290Var, 10));
        Iterator it = h290Var.iterator();
        while (it.hasNext()) {
            YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity yourLibraryDecoratedEntity = (YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) it.next();
            String uri = yourLibraryDecoratedEntity.e().getUri();
            String name = yourLibraryDecoratedEntity.e().getName();
            boolean zU = yourLibraryDecoratedEntity.e().u();
            String strQ = yourLibraryDecoratedEntity.e().q();
            String strO = yourLibraryDecoratedEntity.e().o();
            switch (yourLibraryDecoratedEntity.s().ordinal()) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    aeyVar = aey.c;
                    break;
                case 1:
                    aeyVar = aey.f;
                    break;
                case 2:
                    aeyVar = aey.t;
                    break;
                case 3:
                    aeyVar = aey.b;
                    break;
                case 4:
                    aeyVar = aey.h;
                    break;
                case 5:
                    aeyVar = aey.Y;
                    break;
                case 6:
                    aeyVar = aey.a;
                    break;
                case 7:
                    aeyVar = aey.X;
                    break;
                case 8:
                    aeyVar = aey.d;
                    break;
                case 9:
                    aeyVar = aey.g;
                    break;
                case 10:
                    aeyVar = aey.e;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    aeyVar = aey.Z;
                    break;
                default:
                    aeyVar = aey.O0;
                    break;
            }
            aey aeyVar2 = aeyVar;
            gtm1 gtm1VarS = yourLibraryDecoratedEntity.s();
            int i7 = 1;
            nb10 j93Var = null;
            switch (gtm1VarS == null ? -1 : pf20.a[gtm1VarS.ordinal()]) {
                case 1:
                    String strN = yourLibraryDecoratedEntity.n().n();
                    boolean zP = yourLibraryDecoratedEntity.n().p();
                    boolean isPremiumOnly = yourLibraryDecoratedEntity.n().getIsPremiumOnly();
                    int iOrdinal = yourLibraryDecoratedEntity.n().q().ordinal();
                    if (iOrdinal == 0) {
                        i = 2;
                    } else if (iOrdinal == 1) {
                        i = 3;
                    } else if (iOrdinal != 2) {
                        i = iOrdinal != 3 ? 5 : 1;
                    } else {
                        i = 4;
                    }
                    j93Var = new j93(strN, i, zP, isPremiumOnly);
                    tlbVar = j93Var;
                    break;
                case 2:
                    j93Var = new ho6(true, yourLibraryDecoratedEntity.o().p(), yourLibraryDecoratedEntity.o().o());
                    tlbVar = j93Var;
                    break;
                case 3:
                    j93Var = do8.a;
                    tlbVar = j93Var;
                    break;
                case 4:
                    String strO2 = yourLibraryDecoratedEntity.p().o();
                    int iOrdinal2 = yourLibraryDecoratedEntity.p().n().ordinal();
                    if (iOrdinal2 == 0) {
                        i2 = 1;
                    } else if (iOrdinal2 != 1) {
                        i2 = iOrdinal2 != 2 ? 4 : 3;
                    } else {
                        i2 = 2;
                    }
                    int iR = yourLibraryDecoratedEntity.p().r();
                    int iOrdinal3 = yourLibraryDecoratedEntity.p().s().ordinal();
                    if (iOrdinal3 == 0) {
                        i3 = 1;
                    } else if (iOrdinal3 != 1) {
                        i3 = iOrdinal3 != 2 ? 4 : 3;
                    } else {
                        i3 = 2;
                    }
                    tlbVar = new tlb(i3, i2, iR, yourLibraryDecoratedEntity.p().q(), strO2);
                    break;
                case 5:
                    tlbVar = new ha00(yourLibraryDecoratedEntity.t().q(), yourLibraryDecoratedEntity.t().n(), yourLibraryDecoratedEntity.t().p());
                    break;
                case 6:
                    j93Var = new lxi1(yourLibraryDecoratedEntity.z().o(), yourLibraryDecoratedEntity.z().n());
                    tlbVar = j93Var;
                    break;
                case 7:
                    j93Var = new y030(yourLibraryDecoratedEntity.u().o(), yourLibraryDecoratedEntity.u().p());
                    tlbVar = j93Var;
                    break;
                case 8:
                    j93Var = new h9o0(yourLibraryDecoratedEntity.v().getPublishDate());
                    tlbVar = j93Var;
                    break;
                case 9:
                    boolean zN = yourLibraryDecoratedEntity.w().n();
                    boolean zS = yourLibraryDecoratedEntity.w().s();
                    String strX = yourLibraryDecoratedEntity.w().x();
                    String strO3 = yourLibraryDecoratedEntity.w().o();
                    String strV = yourLibraryDecoratedEntity.w().v();
                    boolean zW = yourLibraryDecoratedEntity.w().w();
                    boolean zU2 = yourLibraryDecoratedEntity.w().u();
                    int iOrdinal4 = yourLibraryDecoratedEntity.w().A().ordinal();
                    if (iOrdinal4 == 1) {
                        i4 = 2;
                    } else if (iOrdinal4 == 2) {
                        i4 = 3;
                    } else if (iOrdinal4 != 3) {
                        i4 = iOrdinal4 != 4 ? 1 : 5;
                    } else {
                        i4 = 4;
                    }
                    j93Var = new xlu0(i4, strO3, strV, strX, zN, zS, zW, zU2);
                    tlbVar = j93Var;
                    break;
                case 10:
                    String strN2 = yourLibraryDecoratedEntity.x().n();
                    int iOrdinal5 = yourLibraryDecoratedEntity.x().p().ordinal();
                    if (iOrdinal5 != 0) {
                        i5 = iOrdinal5 != 1 ? 3 : 2;
                    } else {
                        i5 = 1;
                    }
                    j93Var = new giv0(strN2, i5);
                    tlbVar = j93Var;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    j93Var = new y481(yourLibraryDecoratedEntity.y().n(), Long.valueOf(yourLibraryDecoratedEntity.y().getPublishDate()), yourLibraryDecoratedEntity.y().p());
                    tlbVar = j93Var;
                    break;
                case grn1.d /* 12 */:
                    switch (yourLibraryDecoratedEntity.q().q().ordinal()) {
                        case 1:
                            i6 = 2;
                            break;
                        case 2:
                            i6 = 3;
                            break;
                        case 3:
                            i6 = 4;
                            break;
                        case 4:
                            i6 = 5;
                            break;
                        case 5:
                            i6 = 6;
                            break;
                        case 6:
                            i6 = 7;
                            break;
                        case 7:
                            i6 = 8;
                            break;
                        case 8:
                            i6 = 9;
                            break;
                        default:
                            i6 = 1;
                            break;
                    }
                    long jP = yourLibraryDecoratedEntity.q().p();
                    Long lValueOf = Long.valueOf(jP);
                    if (jP <= 0) {
                        lValueOf = null;
                    }
                    long jO = yourLibraryDecoratedEntity.q().o();
                    tlbVar = new bbk(i6, lValueOf, jO > 0 ? Long.valueOf(jO) : null);
                    break;
                default:
                    tlbVar = j93Var;
                    break;
            }
            int i8 = pf20.b[yourLibraryDecoratedEntity.e().s().ordinal()];
            if (i8 == 1) {
                i7 = 4;
            } else if (i8 == 2) {
                i7 = 3;
            } else if (i8 == 3) {
                i7 = 2;
            }
            arrayList.add(new ttm1(uri, name, zU, strQ, aeyVar2, strO, tlbVar, i7));
        }
        return arrayList;
    }

    public static final void a(jk0 jk0Var, iu30 iu30Var, op0 op0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Object bhVar;
        int i2;
        kl1 kl1Var;
        byte b2;
        iu30 iu30Var2 = iu30Var;
        Object obj = fkj0.X;
        mj0 mj0Var = jk0Var.a;
        List list = mj0Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-955708303);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.i(jk0Var) ? 4 : 2) | (x340Var.i(iu30Var2) ? 32 : 16) | (x340Var.i(op0Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zI = x340Var.i(jk0Var);
            Object objT = x340Var.T();
            if (zI || objT == obj) {
                objT = new g3(jk0Var, (byte) 11);
                x340Var.s0(objT);
            }
            kes kesVarB = lkr0.b(0, (Function0) objT, x340Var, 0, 3);
            kl1 kl1Var2 = ((jkr0) kesVarB).d;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = new LinkedHashSet();
                x340Var.s0(objT2);
            }
            Set set = (Set) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == obj) {
                objT3 = p3d1.n(0L, x340Var);
            }
            ven0 ven0Var = (ven0) objT3;
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objT4 = x340Var.T();
            if (z || objT4 == obj) {
                objT4 = new p1(iu30Var2, (byte) 14);
                x340Var.s0(objT4);
            }
            qxd0.C(rih1.a, (Function0) objT4, x340Var);
            boolean zI2 = x340Var.i(kesVarB) | x340Var.i(jk0Var) | (i4 == 32);
            Object objT5 = x340Var.T();
            if (zI2 || objT5 == obj) {
                i2 = i4;
                kl1Var = kl1Var2;
                b2 = 0;
                bhVar = new bh(kesVarB, jk0Var, set, iu30Var2, (lnm) null, (byte) 3);
                iu30Var2 = iu30Var2;
                x340Var.s0(bhVar);
            } else {
                kl1Var = kl1Var2;
                i2 = i4;
                bhVar = objT5;
                b2 = 0;
            }
            qxd0.t(kesVarB, x340Var, (vu30) bhVar);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarC = u291.c(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0VarC, jA, er31.b(16.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 12.0f, 7);
            boolean zI3 = x340Var.i(ven0Var);
            Object objT6 = x340Var.T();
            if (zI3 || objT6 == obj) {
                objT6 = new xj0(ven0Var, b2);
                x340Var.s0(objT6);
            }
            qim0 qim0VarN = anm1.N(vyd1.a, ern1.x(qim0VarB, (iu30) objT6));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, b2);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            ij0 ij0Var = mj0Var.b;
            String str = ij0Var.a;
            String str2 = ij0Var.b;
            hti1 hti1Var = hti1.c;
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            f6o1.b(str, str2, hti1Var, uyn1.z(6.0f, 0.0f, 2, qim0VarF2), null, null, apo.r(1605536027, new yj0(op0Var, jk0Var, iu30Var2, (byte) 1), x340Var), x340Var, 1573248, 48);
            x340Var = x340Var;
            kes kesVar = kesVarB;
            i(jk0Var, kesVar, iu30Var2, x340Var, ((i3 << 3) & 112) | 6 | ((i3 << 6) & 7168));
            if (list.size() <= 1 || ((int) (((yr80) ven0Var.getValue()).a >> 32)) >= ((int) (((yr80) ven0Var.getValue()).a & 4294967295L))) {
                x340Var.i0(1043421319);
                x340Var.r(false);
            } else {
                x340Var.i0(1043194523);
                qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
                cvx cvxVar3 = cbx.b(x340Var).b;
                qpn1.d(kesVar, anm1.N(vyd1.c, uyn1.B(qim0VarF3, 0.0f, 12.0f, 0.0f, 0.0f, 13)), 0.0f, 0.0f, 0.0f, 0.0f, 0L, 0L, x340Var, 0);
                kesVar = kesVar;
                x340Var = x340Var;
                x340Var.r(false);
            }
            qim0 qim0VarF4 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarF4, 0.0f, 16.0f, 8.0f, 0.0f, 9);
            jw31 jw31VarA = ew31.a(h36.b, een.O0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            kl1 kl1Var3 = kl1Var;
            boolean z3 = ((hj0) list.get(((err0) kl1Var3.c).s())).d.b() || mj0Var.e.b.b();
            String str3 = ((hj0) list.get(((err0) kl1Var3.c).s())).c;
            lee1 lee1Var = cbx.d(x340Var).k;
            boolean zH = x340Var.h(z3) | (i2 == 32) | x340Var.i(kesVar);
            Object objT7 = x340Var.T();
            if (zH || objT7 == obj) {
                objT7 = new zj0(z3, iu30Var2, kesVar);
                x340Var.s0(objT7);
            }
            c0p1.e(str3, 2, lee1Var, (Function0) objT7, apo.r(-1017046394, new bk0(jk0Var, z3, iu30Var2, kesVar, (byte) 0), x340Var), x340Var, 24624);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x2(i, (Object) jk0Var, (Object) iu30Var, (Object) op0Var, (Object) qim0Var2, (byte) 7);
        }
    }

    public static final void b(m5a m5aVar, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1852213153);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(m5aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gfx.b(E(m5aVar), apo.r(1165594326, new juc1(m5aVar, qim0Var, j2iVar), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(m5aVar, qim0Var, j2iVar, i, (byte) 14);
        }
    }

    public static final void c(txd1 txd1Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1048923590);
        int i4 = (x340Var.g(txd1Var) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (x340Var.i(qim0Var) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (i5 != 0) {
                qim0Var = nim0.a;
            }
            gfx.g(8, apo.r(423665895, new sdb1(txd1Var, qim0Var, (byte) 20), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(txd1Var, qim0Var2, i, i2, (byte) 19);
        }
    }

    public static final void d(Function0 function0, long j, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1251617935);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.f(j) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (function0 != null) {
                x340Var.i0(-1801807741);
                gfx.g(7, apo.r(287824157, new pth(function0, j, b2), x340Var), x340Var, 54);
                x340Var.r(false);
            } else {
                x340Var.i0(-1801213843);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qi6((Object) function0, j, (Object) qim0Var, i, (byte) 16);
        }
    }

    public static final void e(Integer num, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1769283040);
        int i2 = (x340Var.g(num) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (num != null) {
                x340Var.i0(110655256);
                jmr0 jmr0VarN = i3o1.n(num.intValue(), x340Var, i2 & 14);
                qim0 qim0VarS = u291.s(nim0.a, v(x340Var), v(x340Var));
                w(x340Var);
                w(x340Var);
                cwl1.f(jmr0VarN, (String) null, u291.a(qim0VarS, 24.0f, 24.0f), een.h, (j6m) null, 0.0f, (ColorFilter) null, x340Var, 56, 112);
                x340Var.r(false);
            } else {
                x340Var.i0(110885896);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fbt0(num, qim0Var, i, (byte) 2);
        }
    }

    public static final void f(String str, vu30 vu30Var, qim0 qim0Var, long j, b0k b0kVar, int i) {
        qim0 qim0Var2 = qim0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1869868678);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(vu30Var) ? 32 : 16) | (x340Var.i(qim0Var2) ? 256 : 128) | (x340Var.f(j) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            if (str != null) {
                x340Var.i0(468268566);
                uwr uwrVar = cbx.a;
                uwo1.e(str, qim0Var2, cbx.d(x340Var).j, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i2 & 14) | ((i2 >> 3) & 112) | (i2 & 7168), 0, 2016);
                x340Var.r(false);
                qim0Var2 = qim0Var;
            } else if (vu30Var != null) {
                x340Var.i0(468485163);
                af5 af5Var = (af5) vu30Var.invoke(x340Var, Integer.valueOf((i2 >> 3) & 14));
                uwr uwrVar2 = cbx.a;
                qim0Var2 = qim0Var;
                uwo1.d(af5Var, j, qim0Var2, cbx.d(x340Var).j, new a0e1(3), null, 0, false, null, 0, null, null, x340Var, ((i2 >> 6) & 112) | (i2 & 896), 0, 4064);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                qim0Var2 = qim0Var;
                x340Var.i0(-1647449230);
                t1c.a(qim0Var2, x340Var, (i2 >> 6) & 14);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cg6((Object) str, (Object) vu30Var, (Object) qim0Var2, j, i, (byte) 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x0114  */
    /* JADX WARN: Code duplicated, block: B:68:0x0119  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0182  */
    /* JADX WARN: Code duplicated, block: B:74:0x018d  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void g(String str, vu30 vu30Var, int i, qim0 qim0Var, int i2, qx8 qx8Var, long j, b0k b0kVar, int i3, int i4) {
        int i5;
        qx8 qx8Var2;
        int i6;
        int i7;
        boolean z;
        int i8;
        qx8 qx8Var3;
        h311 h311VarV;
        int i9;
        qx8 qx8Var4;
        int i10;
        int i11;
        qx8 qx8Var5;
        int i12;
        qim0 qim0Var2 = qim0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1704201334);
        int i13 = (x340Var.g(str) ? 4 : 2) | i3 | (x340Var.i(vu30Var) ? 32 : 16) | (x340Var.e(i) ? 256 : 128) | (x340Var.i(qim0Var2) ? 2048 : 1024);
        int i14 = i4 & 16;
        if (i14 == 0) {
            if ((i3 & 24576) == 0) {
                i5 = i2;
                i13 |= x340Var.e(i5) ? 16384 : 8192;
            }
            if ((i4 & 32) == 0) {
                qx8Var2 = qx8Var;
                int i15 = x340Var.i(qx8Var2) ? 131072 : 65536;
                int i16 = i13 | i15;
                if (x340Var.f(j)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i7 = i16 | i6;
                if ((599187 & i7) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i7 & 1, z)) {
                    x340Var.d0();
                    if ((i3 & 1) != 0 || x340Var.E()) {
                        if (i14 != 0) {
                            i9 = Integer.MAX_VALUE;
                        } else {
                            i9 = i5;
                        }
                        if ((i4 & 32) != 0) {
                            i7 &= -458753;
                            qx8Var4 = ox8.a;
                        } else {
                            qx8Var4 = qx8Var2;
                        }
                        int i17 = i9;
                        i10 = i7;
                        i11 = i17;
                        qx8Var5 = qx8Var4;
                    } else {
                        x340Var.b0();
                        if ((i4 & 32) != 0) {
                            i7 &= -458753;
                        }
                        i10 = i7;
                        i11 = i5;
                        qx8Var5 = qx8Var2;
                    }
                    x340Var.s();
                    if (str != null) {
                        x340Var.i0(1354952357);
                        uwr uwrVar = cbx.a;
                        i12 = i11;
                        uwo1.e(str, qim0Var, cbx.d(x340Var).g, 0L, new a0e1(i), null, 2, false, new cjc0(i11), 0, qx8Var5, x340Var, (57344 & (i10 << 6)) | (i10 & 14) | ((i10 >> 6) & 112), (i10 >> 15) & 14, 680);
                        x340Var.r(false);
                        qim0Var2 = qim0Var;
                    } else {
                        i12 = i11;
                        if (vu30Var != null) {
                            x340Var.i0(-945842309);
                            int i18 = i10 >> 3;
                            af5 af5Var = (af5) vu30Var.invoke(x340Var, Integer.valueOf(i18 & 14));
                            uwr uwrVar2 = cbx.a;
                            int i19 = i10 >> 15;
                            i12 = i12;
                            qim0Var2 = qim0Var;
                            uwo1.d(af5Var, j, qim0Var2, cbx.d(x340Var).g, new a0e1(i), null, 2, false, new cjc0(i12), 0, qx8Var5, null, x340Var, (i18 & 896) | (i19 & 112) | ((i10 << 6) & 57344), i19 & 14, 2720);
                            x340Var = x340Var;
                            x340Var.r(false);
                        } else {
                            qim0Var2 = qim0Var;
                            x340Var.i0(1354972206);
                            t1c.a(qim0Var2, x340Var, (i10 >> 9) & 14);
                            x340Var.r(false);
                        }
                    }
                    qx8Var3 = qx8Var5;
                    i8 = i12;
                } else {
                    x340Var.b0();
                    i8 = i5;
                    qx8Var3 = qx8Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new uxd1(str, vu30Var, i, qim0Var2, i8, qx8Var3, j, i3, i4);
                }
            }
            qx8Var2 = qx8Var;
            int i110 = i13 | i15;
            if (x340Var.f(j)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i7 = i110 | i6;
            if ((599187 & i7) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i7 & 1, z)) {
                x340Var.d0();
                if ((i3 & 1) != 0) {
                    if (i14 != 0) {
                        i9 = Integer.MAX_VALUE;
                    } else {
                        i9 = i5;
                    }
                    if ((i4 & 32) != 0) {
                        i7 &= -458753;
                        qx8Var4 = ox8.a;
                    } else {
                        qx8Var4 = qx8Var2;
                    }
                    int i111 = i9;
                    i10 = i7;
                    i11 = i111;
                    qx8Var5 = qx8Var4;
                } else {
                    if (i14 != 0) {
                        i9 = Integer.MAX_VALUE;
                    } else {
                        i9 = i5;
                    }
                    if ((i4 & 32) != 0) {
                        i7 &= -458753;
                        qx8Var4 = ox8.a;
                    } else {
                        qx8Var4 = qx8Var2;
                    }
                    int i112 = i9;
                    i10 = i7;
                    i11 = i112;
                    qx8Var5 = qx8Var4;
                }
                x340Var.s();
                if (str != null) {
                    x340Var.i0(1354952357);
                    uwr uwrVar3 = cbx.a;
                    i12 = i11;
                    uwo1.e(str, qim0Var, cbx.d(x340Var).g, 0L, new a0e1(i), null, 2, false, new cjc0(i11), 0, qx8Var5, x340Var, (57344 & (i10 << 6)) | (i10 & 14) | ((i10 >> 6) & 112), (i10 >> 15) & 14, 680);
                    x340Var.r(false);
                    qim0Var2 = qim0Var;
                } else {
                    i12 = i11;
                    if (vu30Var != null) {
                        x340Var.i0(-945842309);
                        int i113 = i10 >> 3;
                        af5 af5Var2 = (af5) vu30Var.invoke(x340Var, Integer.valueOf(i113 & 14));
                        uwr uwrVar4 = cbx.a;
                        int i114 = i10 >> 15;
                        i12 = i12;
                        qim0Var2 = qim0Var;
                        uwo1.d(af5Var2, j, qim0Var2, cbx.d(x340Var).g, new a0e1(i), null, 2, false, new cjc0(i12), 0, qx8Var5, null, x340Var, (i113 & 896) | (i114 & 112) | ((i10 << 6) & 57344), i114 & 14, 2720);
                        x340Var = x340Var;
                        x340Var.r(false);
                    } else {
                        qim0Var2 = qim0Var;
                        x340Var.i0(1354972206);
                        t1c.a(qim0Var2, x340Var, (i10 >> 9) & 14);
                        x340Var.r(false);
                    }
                }
                qx8Var3 = qx8Var5;
                i8 = i12;
            } else {
                x340Var.b0();
                i8 = i5;
                qx8Var3 = qx8Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new uxd1(str, vu30Var, i, qim0Var2, i8, qx8Var3, j, i3, i4);
            }
        }
        i13 |= 24576;
        i5 = i2;
        if ((i4 & 32) == 0) {
            qx8Var2 = qx8Var;
            if (x340Var.i(qx8Var2)) {
            }
            int i115 = i13 | i15;
            if (x340Var.f(j)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i7 = i115 | i6;
            if ((599187 & i7) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i7 & 1, z)) {
                x340Var.d0();
                if ((i3 & 1) != 0) {
                    if (i14 != 0) {
                        i9 = Integer.MAX_VALUE;
                    } else {
                        i9 = i5;
                    }
                    if ((i4 & 32) != 0) {
                        i7 &= -458753;
                        qx8Var4 = ox8.a;
                    } else {
                        qx8Var4 = qx8Var2;
                    }
                    int i116 = i9;
                    i10 = i7;
                    i11 = i116;
                    qx8Var5 = qx8Var4;
                } else {
                    if (i14 != 0) {
                        i9 = Integer.MAX_VALUE;
                    } else {
                        i9 = i5;
                    }
                    if ((i4 & 32) != 0) {
                        i7 &= -458753;
                        qx8Var4 = ox8.a;
                    } else {
                        qx8Var4 = qx8Var2;
                    }
                    int i117 = i9;
                    i10 = i7;
                    i11 = i117;
                    qx8Var5 = qx8Var4;
                }
                x340Var.s();
                if (str != null) {
                    x340Var.i0(1354952357);
                    uwr uwrVar5 = cbx.a;
                    i12 = i11;
                    uwo1.e(str, qim0Var, cbx.d(x340Var).g, 0L, new a0e1(i), null, 2, false, new cjc0(i11), 0, qx8Var5, x340Var, (57344 & (i10 << 6)) | (i10 & 14) | ((i10 >> 6) & 112), (i10 >> 15) & 14, 680);
                    x340Var.r(false);
                    qim0Var2 = qim0Var;
                } else {
                    i12 = i11;
                    if (vu30Var != null) {
                        x340Var.i0(-945842309);
                        int i118 = i10 >> 3;
                        af5 af5Var3 = (af5) vu30Var.invoke(x340Var, Integer.valueOf(i118 & 14));
                        uwr uwrVar6 = cbx.a;
                        int i119 = i10 >> 15;
                        i12 = i12;
                        qim0Var2 = qim0Var;
                        uwo1.d(af5Var3, j, qim0Var2, cbx.d(x340Var).g, new a0e1(i), null, 2, false, new cjc0(i12), 0, qx8Var5, null, x340Var, (i118 & 896) | (i119 & 112) | ((i10 << 6) & 57344), i119 & 14, 2720);
                        x340Var = x340Var;
                        x340Var.r(false);
                    } else {
                        qim0Var2 = qim0Var;
                        x340Var.i0(1354972206);
                        t1c.a(qim0Var2, x340Var, (i10 >> 9) & 14);
                        x340Var.r(false);
                    }
                }
                qx8Var3 = qx8Var5;
                i8 = i12;
            } else {
                x340Var.b0();
                i8 = i5;
                qx8Var3 = qx8Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new uxd1(str, vu30Var, i, qim0Var2, i8, qx8Var3, j, i3, i4);
            }
        }
        qx8Var2 = qx8Var;
        int i1110 = i13 | i15;
        if (x340Var.f(j)) {
            i6 = 1048576;
        } else {
            i6 = 524288;
        }
        i7 = i1110 | i6;
        if ((599187 & i7) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i7 & 1, z)) {
            x340Var.d0();
            if ((i3 & 1) != 0) {
                if (i14 != 0) {
                    i9 = Integer.MAX_VALUE;
                } else {
                    i9 = i5;
                }
                if ((i4 & 32) != 0) {
                    i7 &= -458753;
                    qx8Var4 = ox8.a;
                } else {
                    qx8Var4 = qx8Var2;
                }
                int i1111 = i9;
                i10 = i7;
                i11 = i1111;
                qx8Var5 = qx8Var4;
            } else {
                if (i14 != 0) {
                    i9 = Integer.MAX_VALUE;
                } else {
                    i9 = i5;
                }
                if ((i4 & 32) != 0) {
                    i7 &= -458753;
                    qx8Var4 = ox8.a;
                } else {
                    qx8Var4 = qx8Var2;
                }
                int i1112 = i9;
                i10 = i7;
                i11 = i1112;
                qx8Var5 = qx8Var4;
            }
            x340Var.s();
            if (str != null) {
                x340Var.i0(1354952357);
                uwr uwrVar7 = cbx.a;
                i12 = i11;
                uwo1.e(str, qim0Var, cbx.d(x340Var).g, 0L, new a0e1(i), null, 2, false, new cjc0(i11), 0, qx8Var5, x340Var, (57344 & (i10 << 6)) | (i10 & 14) | ((i10 >> 6) & 112), (i10 >> 15) & 14, 680);
                x340Var.r(false);
                qim0Var2 = qim0Var;
            } else {
                i12 = i11;
                if (vu30Var != null) {
                    x340Var.i0(-945842309);
                    int i1113 = i10 >> 3;
                    af5 af5Var4 = (af5) vu30Var.invoke(x340Var, Integer.valueOf(i1113 & 14));
                    uwr uwrVar8 = cbx.a;
                    int i1114 = i10 >> 15;
                    i12 = i12;
                    qim0Var2 = qim0Var;
                    uwo1.d(af5Var4, j, qim0Var2, cbx.d(x340Var).g, new a0e1(i), null, 2, false, new cjc0(i12), 0, qx8Var5, null, x340Var, (i1113 & 896) | (i1114 & 112) | ((i10 << 6) & 57344), i1114 & 14, 2720);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    qim0Var2 = qim0Var;
                    x340Var.i0(1354972206);
                    t1c.a(qim0Var2, x340Var, (i10 >> 9) & 14);
                    x340Var.r(false);
                }
            }
            qx8Var3 = qx8Var5;
            i8 = i12;
        } else {
            x340Var.b0();
            i8 = i5;
            qx8Var3 = qx8Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uxd1(str, vu30Var, i, qim0Var2, i8, qx8Var3, j, i3, i4);
        }
    }

    public static final void h(int i, hj0 hj0Var, int i2, jkr0 jkr0Var, iu30 iu30Var, b0k b0kVar, int i3) {
        int i4;
        int i5;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1389371533);
        if ((i3 & 6) == 0) {
            i4 = (x340Var.e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= x340Var.i(hj0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 = i2;
            i4 |= x340Var.e(i5) ? 256 : 128;
        } else {
            i5 = i2;
        }
        if ((i3 & 3072) == 0) {
            i4 |= x340Var.i(jkr0Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            wj0 wj0Var = (wj0) x340Var.k(jge0.a);
            String strN0 = cwl1.n0(2131951813, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(i5), hj0Var.c}, x340Var);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(4.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            ltd ltdVar = new ltd(4.0f, 1.0f, 6.0f);
            qim0 qim0VarC = i541.C(nim0.a, new ik0(jkr0Var, i, (byte) 0));
            boolean zG = x340Var.g(strN0);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new v1(strN0, (byte) 7);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarC, false, (iu30) objT);
            boolean z = ((57344 & i4) == 16384) | ((i4 & 14) == 4);
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new ck0(iu30Var, i, (byte) 0);
                x340Var.s0(objT2);
            }
            l4o1.a((Function0) objT2, qim0VarB, false, cr31VarB, null, ltdVar, apo.r(-972752126, new dk0(wj0Var, hj0Var, i, iu30Var, jkr0Var), x340Var), x340Var, 100663296, 212);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ek0(i, hj0Var, i2, jkr0Var, iu30Var, i3);
        }
    }

    public static final void i(jk0 jk0Var, jkr0 jkr0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1184051902);
        int i3 = i & 6;
        pbh pbhVar = pbh.a;
        if (i3 == 0) {
            i2 = (x340Var.i(pbhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(jk0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(jkr0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            w2g0.c(pbhVar.a(1.0f, nim0.a, false), (tl3) null, apo.r(694919956, new n891(jkr0Var, jk0Var, iu30Var, (byte) 3), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(jk0Var, jkr0Var, iu30Var, i, (byte) 2);
        }
    }

    public static final void j(yxj0 yxj0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1959134856);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(yxj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            fq7.g(yxj0Var.a, (qim0) null, xay.e(2, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6)), xay.f(2, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6)), (String) null, apo.r(-1040908448, new ipy(iu30Var, (byte) 20), x340Var), x340Var, 200064, 18);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new byj0(yxj0Var, iu30Var, i, (byte) 0);
        }
    }

    public static final void k(me60 me60Var, j2i j2iVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        j2i j2iVar2;
        qim0 qim0Var2;
        qim0 qim0VarD;
        m4c m4cVar = fkj0.X;
        ie60 ie60Var = me60Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1303025012);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(me60Var) ? 4 : 2) | (x340Var.i(j2iVar) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            au70 au70Var = new au70();
            float fS = s1p1.s(au70Var, x340Var);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarV = u291.v(qim0Var3, fS);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarV);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            cu70 cu70Var = me60Var.d;
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new u460(iu30Var, (byte) 19);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z3 = i3 == 256;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new u460(iu30Var, (byte) 20);
                x340Var.s0(objT2);
            }
            s1p1.c(cu70Var, au70Var, function0, (Function0) objT2, null, x340Var, 8);
            if (ie60Var instanceof ge60) {
                x340Var.i0(-265810042);
                x340Var.r(false);
                qim0VarD = qim0Var3;
            } else {
                x340Var.i0(-265775787);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0VarD = eqr0.D(-16.0f, 0.0f, 2, qim0Var3);
                x340Var.r(false);
            }
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            j2iVar2 = j2iVar;
            j2iVar2.J(me60Var.a, ie60Var, x340Var, Integer.valueOf((i2 << 3) & 896));
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60((byte) 5, i, (Object) me60Var, (Object) j2iVar2, iu30Var, qim0Var2);
        }
    }

    public static final void l(yxj0 yxj0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1484412971);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(yxj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            fq7.g(yxj0Var.a, (qim0) null, xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, apo.r(1229780653, new ipy(iu30Var, (byte) 21), x340Var), x340Var, 200064, 18);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new byj0(yxj0Var, iu30Var, i, (byte) 1);
        }
    }

    public static final void m(boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(77685279);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131959796);
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new smt0(iu30Var, (byte) 7);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            wro1.h(new gbx(new y50(strO0), function0), new idx(8), nim0.a, null, yla.s(x340Var), null, false, null, null, apo.r(2065759734, new k750((byte) 18, z), x340Var), x340Var, 384, 6, 984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zm9((byte) 3, i, iu30Var, z);
        }
    }

    public static final void n(mvt0 mvt0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2116261157);
        int i2 = i | (b0kVar3.g(mvt0Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 384;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uvx uvxVar = new uvx(0, (pgx) null, 0, uyn1.h(2, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 503);
            String strO0 = cwl1.o0(b0kVar3, 2131959830);
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new smt0(iu30Var, (byte) 8);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarF, uvxVar, null, false, null, null, new gbx(new y50(strO0), function0), null, null, apo.r(183102940, new qvt0(mvt0Var, (byte) 0), b0kVar3), null, apo.r(106828893, new qvt0(mvt0Var, (byte) 1), b0kVar3), apo.r(1055318622, new ukm0(mvt0Var, iu30Var, (byte) 25), b0kVar3), null, null, apo.r(-394179487, new qvt0(mvt0Var, (byte) 2), b0kVar3), b0kVar2, 805306432, 197040, 26044);
                qim0Var2 = qim0Var3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tbs0(mvt0Var, iu30Var, qim0Var2, i, (byte) 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x0114  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void o(m5a m5aVar, qim0 qim0Var, Integer num, String str, vu30 vu30Var, String str2, vu30 vu30Var2, c380 c380Var, Function0 function0, b0k b0kVar, int i, int i2) {
        int i3;
        String str3;
        int i4;
        vu30 vu30Var3;
        int i5;
        int i6;
        boolean z;
        String str4;
        vu30 vu30Var4;
        h311 h311VarV;
        String str5;
        int i7;
        int i8;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1182943072);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(m5aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.g(num) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var.i(vu30Var) ? 16384 : 8192;
        }
        int i9 = i2 & 32;
        if (i9 == 0) {
            if ((196608 & i) == 0) {
                str3 = str2;
                i3 |= x340Var.g(str3) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    vu30Var3 = vu30Var2;
                    if (x340Var.i(vu30Var3)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                if ((12582912 & i) != 0) {
                    if (x340Var.g(c380Var)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((100663296 & i) != 0) {
                    if (x340Var.i(function0)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i3 |= i7;
                }
                i6 = i3;
                if ((38347923 & i6) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i6 & 1, z)) {
                    if (i9 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i4 != 0) {
                        vu30Var3 = null;
                    }
                    b(m5aVar, qim0Var, apo.r(1407132750, new wy51((Object) c380Var, (Object) function0, (Object) str5, (Object) num, (Object) str, (Object) vu30Var, (Object) m5aVar, (Object) vu30Var3, (byte) 9, false), x340Var), x340Var, (i6 & 14) | 384 | (i6 & 112));
                    str4 = str5;
                } else {
                    x340Var.b0();
                    str4 = str3;
                }
                vu30Var4 = vu30Var3;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new j9m(m5aVar, qim0Var, num, str, vu30Var, str4, vu30Var4, c380Var, function0, i, i2);
                }
            }
            i3 |= 1572864;
            vu30Var3 = vu30Var2;
            if ((12582912 & i) != 0) {
                if (x340Var.g(c380Var)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((100663296 & i) != 0) {
                if (x340Var.i(function0)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i3 |= i7;
            }
            i6 = i3;
            if ((38347923 & i6) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i6 & 1, z)) {
                if (i9 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i4 != 0) {
                    vu30Var3 = null;
                }
                b(m5aVar, qim0Var, apo.r(1407132750, new wy51((Object) c380Var, (Object) function0, (Object) str5, (Object) num, (Object) str, (Object) vu30Var, (Object) m5aVar, (Object) vu30Var3, (byte) 9, false), x340Var), x340Var, (i6 & 14) | 384 | (i6 & 112));
                str4 = str5;
            } else {
                x340Var.b0();
                str4 = str3;
            }
            vu30Var4 = vu30Var3;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new j9m(m5aVar, qim0Var, num, str, vu30Var, str4, vu30Var4, c380Var, function0, i, i2);
            }
        }
        i3 |= 196608;
        str3 = str2;
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((1572864 & i) == 0) {
                vu30Var3 = vu30Var2;
                if (x340Var.i(vu30Var3)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            if ((12582912 & i) != 0) {
                if (x340Var.g(c380Var)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((100663296 & i) != 0) {
                if (x340Var.i(function0)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i3 |= i7;
            }
            i6 = i3;
            if ((38347923 & i6) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i6 & 1, z)) {
                if (i9 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i4 != 0) {
                    vu30Var3 = null;
                }
                b(m5aVar, qim0Var, apo.r(1407132750, new wy51((Object) c380Var, (Object) function0, (Object) str5, (Object) num, (Object) str, (Object) vu30Var, (Object) m5aVar, (Object) vu30Var3, (byte) 9, false), x340Var), x340Var, (i6 & 14) | 384 | (i6 & 112));
                str4 = str5;
            } else {
                x340Var.b0();
                str4 = str3;
            }
            vu30Var4 = vu30Var3;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new j9m(m5aVar, qim0Var, num, str, vu30Var, str4, vu30Var4, c380Var, function0, i, i2);
            }
        }
        i3 |= 1572864;
        vu30Var3 = vu30Var2;
        if ((12582912 & i) != 0) {
            if (x340Var.g(c380Var)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((100663296 & i) != 0) {
            if (x340Var.i(function0)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i3 |= i7;
        }
        i6 = i3;
        if ((38347923 & i6) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i6 & 1, z)) {
            if (i9 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            if (i4 != 0) {
                vu30Var3 = null;
            }
            b(m5aVar, qim0Var, apo.r(1407132750, new wy51((Object) c380Var, (Object) function0, (Object) str5, (Object) num, (Object) str, (Object) vu30Var, (Object) m5aVar, (Object) vu30Var3, (byte) 9, false), x340Var), x340Var, (i6 & 14) | 384 | (i6 & 112));
            str4 = str5;
        } else {
            x340Var.b0();
            str4 = str3;
        }
        vu30Var4 = vu30Var3;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j9m(m5aVar, qim0Var, num, str, vu30Var, str4, vu30Var4, c380Var, function0, i, i2);
        }
    }

    public static final void p(Integer num, String str, vu30 vu30Var, txd1 txd1Var, Function0 function0, m5a m5aVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1044736245);
        int i2 = i | (x340Var.g(num) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(vu30Var) ? 256 : 128) | (x340Var.g(txd1Var) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(m5aVar) ? 131072 : 65536) | 1572864;
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            x340Var.j0(475845883);
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.j0(-492369756);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = x0d.o(watVar, x340Var);
            }
            x340Var.r(false);
            ufh0 ufh0Var = (ufh0) objT;
            x340Var.j0(-492369756);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = x0d.m(x340Var);
            }
            x340Var.r(false);
            xhl xhlVar = (xhl) objT2;
            x340Var.j0(-492369756);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT3);
            }
            x340Var.r(false);
            ven0 ven0Var = (ven0) objT3;
            x340Var.j0(-492369756);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = x0d.n(xhlVar, x340Var);
            }
            x340Var.r(false);
            nil nilVar = (nil) objT4;
            x340Var.j0(-492369756);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = bb00.i(rih1.a, f331.X0, x340Var);
            }
            x340Var.r(false);
            ven0 ven0Var2 = (ven0) objT5;
            who1.h(s161.b(qim0VarF, false, new tu(ufh0Var, (byte) 22)), apo.i(x340Var, -1488813576, new zx(ven0Var2, xhlVar, new su(ven0Var, nilVar, (byte) 18), num, m5aVar, function0, txd1Var, str, vu30Var)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 18), x340Var, 48);
            x340Var.r(false);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ydi0(num, str, vu30Var, txd1Var, function0, m5aVar, qim0Var2, i);
        }
    }

    public static final void q(Integer num, String str, vu30 vu30Var, String str2, vu30 vu30Var2, c380 c380Var, Function0 function0, m5a m5aVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1018906357);
        int i2 = i | (x340Var.g(num) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(vu30Var) ? 256 : 128) | (x340Var.g(str2) ? 2048 : 1024) | (x340Var.i(vu30Var2) ? 16384 : 8192) | (x340Var.g(c380Var) ? 131072 : 65536) | (x340Var.i(function0) ? 1048576 : 524288) | (x340Var.i(m5aVar) ? 8388608 : 4194304) | 100663296;
        if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            x340Var.j0(475845883);
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.j0(-492369756);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = x0d.o(watVar, x340Var);
            }
            x340Var.r(false);
            ufh0 ufh0Var = (ufh0) objT;
            x340Var.j0(-492369756);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = x0d.m(x340Var);
            }
            x340Var.r(false);
            xhl xhlVar = (xhl) objT2;
            x340Var.j0(-492369756);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT3);
            }
            x340Var.r(false);
            ven0 ven0Var = (ven0) objT3;
            x340Var.j0(-492369756);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = x0d.n(xhlVar, x340Var);
            }
            x340Var.r(false);
            nil nilVar = (nil) objT4;
            x340Var.j0(-492369756);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = bb00.i(rih1.a, f331.X0, x340Var);
            }
            x340Var.r(false);
            ven0 ven0Var2 = (ven0) objT5;
            who1.h(s161.b(qim0VarF, false, new tu(ufh0Var, (byte) 23)), apo.i(x340Var, -1488813576, new r6k(ven0Var2, xhlVar, new su(ven0Var, nilVar, (byte) 19), num, m5aVar, c380Var, function0, str, vu30Var, str2, vu30Var2)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 19), x340Var, 48);
            x340Var.r(false);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zx(num, str, vu30Var, str2, vu30Var2, c380Var, function0, m5aVar, qim0Var2, i);
        }
    }

    public static pbq r(cv01 cv01Var, ivj ivjVar, dv01 dv01Var, q7r0 q7r0Var, rih1 rih1Var) {
        cv01Var.getClass();
        ivjVar.getClass();
        rih1Var.getClass();
        return new pbq(cv01Var, ivjVar, dv01Var, q7r0Var);
    }

    public static oi9 s(List list, fi9 fi9Var) {
        di9 di9Var;
        int i;
        if (list.isEmpty()) {
            hhg1.n("Failed requirement.");
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            int iOrdinal = fi9Var.ordinal();
            if (iOrdinal != 1) {
                i = iOrdinal != 2 ? -30 : -39;
            } else {
                i = -47;
            }
            arrayList.add(Double.valueOf(Math.pow(10.0d, (((double) i) - ((double) iIntValue)) / 35.0d)));
        }
        Iterator it2 = arrayList.iterator();
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (it2.hasNext()) {
            dDoubleValue += ((Number) it2.next()).doubleValue();
            i2++;
            if (i2 < 0) {
                p7h.S();
                throw null;
            }
        }
        double d = i2 == 0 ? Double.NaN : dDoubleValue / ((double) i2);
        if (d <= 0.8d) {
            di9Var = di9.a;
        } else {
            di9Var = d <= 3.0d ? di9.b : di9.c;
        }
        return new oi9(d, di9Var);
    }

    public static final void t(x340 x340Var) {
        uwr uwrVar = cbx.a;
        mta mtaVar = cbx.b(x340Var).d;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.full.IllegalPropertyDelegateAccessException */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object u(ic11 ic11Var, Member member) throws IllegalPropertyDelegateAccessException {
        try {
            mgt.N0.getClass();
            Object obj = mgt.P0;
            if (obj == null || obj == null) {
                List parameters = ic11Var.getParameters();
                if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                    Iterator it = parameters.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (((hc11) it.next()).s() != 3);
                }
                throw new RuntimeException('\'' + ic11Var + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objA = fc11.N(ic11Var) ? fc11.A(ic11Var) : null;
            mgt.N0.getClass();
            if (objA == mgt.P0) {
                objA = null;
            }
            fc11.N(ic11Var);
            AccessibleObject accessibleObject = member != 0 ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(yoi1.C(ic11Var));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objA);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objA == null) {
                    objA = bpi1.e(((Method) member).getParameterTypes()[0]);
                }
                return method.invoke(null, objA);
            }
            if (length == 2) {
                return ((Method) member).invoke(null, objA, bpi1.e(((Method) member).getParameterTypes()[1]));
            }
            throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
        } catch (IllegalAccessException e) {
            throw new IllegalPropertyDelegateAccessException("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e);
        }
    }

    public static final float v(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1897890854);
        uwr uwrVar = cbx.a;
        zov0 zov0Var = cbx.b(x340Var).g;
        float fY = ((wat) x340Var.k(t4k.h)).y(fc11.Y(24.0f, 4294967296L));
        x340Var.r(false);
        return fY;
    }

    public static final void w(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        zov0 zov0Var = cbx.b(b0kVar).g;
    }

    public static final go80 x(klm klmVar, xbp0 xbp0Var, xbp0 xbp0Var2, xbp0 xbp0Var3, xbp0 xbp0Var4) {
        return klmVar.a("PlaybackErrorNotifierDaemon", new k7h0(xbp0Var, xbp0Var2, xbp0Var3, xbp0Var4, (byte) 23));
    }

    public static final boolean y(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        return xoi1.b((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)) && (((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).screenWidthDp >= 600) && (ef.b(x340Var).compareTo(af.c) < 0);
    }

    public static final boolean z(ic11 ic11Var) {
        return mla0.a.e(ic11Var.getSignature());
    }
}
