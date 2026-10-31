package p;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vqi extends hab0 implements bv30 {
    public static final vqi N0;
    public static final vqi O0;
    public static final vqi P0;
    public static final vqi Q0;
    public static final vqi R0;
    public static final vqi S0;
    public static final vqi T0;
    public static final vqi U0;
    public static final vqi V0;
    public static final vqi W0;
    public static final vqi X;
    public static final vqi X0;
    public static final vqi Y;
    public static final vqi Y0;
    public static final vqi Z;
    public static final vqi Z0;
    public static final vqi a1;
    public static final vqi b;
    public static final vqi b1;
    public static final vqi c;
    public static final vqi c1;
    public static final vqi d;
    public static final vqi d1;
    public static final vqi e;
    public static final vqi e1;
    public static final vqi f;
    public static final vqi g;
    public static final vqi h;
    public static final vqi i;
    public static final vqi t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new vqi(i2, (byte) 0);
        c = new vqi(i2, (byte) 1);
        d = new vqi(i2, (byte) 2);
        e = new vqi(i2, (byte) 3);
        f = new vqi(i2, (byte) 4);
        g = new vqi(i2, (byte) 5);
        h = new vqi(i2, (byte) 6);
        i = new vqi(i2, (byte) 7);
        t = new vqi(i2, (byte) 8);
        X = new vqi(i2, (byte) 9);
        Y = new vqi(i2, (byte) 10);
        Z = new vqi(i2, (byte) 11);
        N0 = new vqi(i2, (byte) 12);
        O0 = new vqi(i2, (byte) 13);
        P0 = new vqi(i2, (byte) 14);
        Q0 = new vqi(i2, (byte) 15);
        R0 = new vqi(i2, (byte) 16);
        S0 = new vqi(i2, (byte) 17);
        T0 = new vqi(i2, (byte) 18);
        U0 = new vqi(i2, (byte) 19);
        V0 = new vqi(i2, (byte) 20);
        W0 = new vqi(i2, (byte) 21);
        X0 = new vqi(i2, (byte) 22);
        Y0 = new vqi(i2, (byte) 23);
        Z0 = new vqi(i2, (byte) 24);
        a1 = new vqi(i2, (byte) 25);
        b1 = new vqi(i2, (byte) 26);
        c1 = new vqi(i2, (byte) 27);
        d1 = new vqi(i2, (byte) 28);
        e1 = new vqi(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vqi(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        ta60 ta60Var = (ta60) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        la60 la60Var = ta60Var.e;
        if (la60Var instanceof ga60) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(2144672625);
            kno1.i(ta60Var, (qim0) null, x340Var2, (iIntValue >> 3) & 14);
            x340Var2.r(false);
        } else if (la60Var instanceof ia60) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(2144674741);
            poo1.i(ta60Var, (qim0) null, x340Var3, (iIntValue >> 3) & 14);
            x340Var3.r(false);
        } else if (la60Var instanceof ja60) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(2144676981);
            too1.c(ta60Var, (qim0) null, x340Var4, (iIntValue >> 3) & 14);
            x340Var4.r(false);
        } else if (la60Var instanceof ka60) {
            x340 x340Var5 = x340Var;
            x340Var5.i0(2144679221);
            voo1.e(ta60Var, (qim0) null, x340Var5, (iIntValue >> 3) & 14);
            x340Var5.r(false);
        } else {
            if (!(la60Var instanceof ha60)) {
                throw p3d1.k(x340Var, 2144671369, false);
            }
            x340 x340Var6 = x340Var;
            x340Var6.i0(2144681560);
            ioo1.f(ta60Var, (qim0) null, x340Var6, (iIntValue >> 3) & 14);
            x340Var6.r(false);
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        fc60 fc60Var = (fc60) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new rri(iu30Var, (byte) 4);
            x340Var2.s0(objT);
        }
        bno1.b(0, (Function0) objT, x340Var2, (qim0) null, fc60Var.f);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        qim0 qim0VarN;
        hd60 hd60Var = (hd60) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String str = hd60Var.i;
        nim0 nim0Var = nim0.a;
        if (str != null) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-198087418);
            boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new rri(iu30Var, (byte) 5);
                x340Var2.s0(objT);
            }
            qim0VarN = hqn1.s("highlight-preview-card", cwl1.o0(x340Var2, 2131956565), (Function0) objT, nim0Var);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-197780394);
            x340Var3.r(false);
            qim0VarN = anm1.N("highlight-preview-card", nim0Var);
        }
        boo1.c(hd60Var, qim0VarN, x340Var, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        iox ioxVar = iox.c;
        String strO0 = cwl1.o0(x340Var, 2131953871);
        String strO1 = cwl1.o0(x340Var, 2131953870);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new rri(iu30Var, (byte) 6);
            x340Var2.s0(objT);
        }
        hqn1.h(ioxVar, strO0, strO1, (Function0) objT, anm1.N("artifact-page-ideas-button", nim0.a), 0L, false, false, (max) null, (vu30) null, x340Var2, iox.d, 992);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        ly70 ly70Var = (ly70) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        x340 x340Var = (b0k) obj4;
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        iy70 iy70Var = ly70Var.c;
        boolean zI = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var.i(ly70Var);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            objT = new pid(ly70Var, iu30Var, (lnm) null, (byte) 29);
            x340Var.s0(objT);
        }
        qxd0.t(iy70Var, x340Var, (vu30) objT);
        if ((iy70Var instanceof hy70) || (iy70Var instanceof gy70)) {
            x340Var.i0(-2000531923);
            x340Var.r(false);
        } else {
            if (!(iy70Var instanceof iy70)) {
                throw p3d1.k(x340Var, 905294887, false);
            }
            x340Var.i0(-2000414495);
            iy70 iy70Var2 = iy70Var;
            i2p1.e(context, ly70Var.a, iy70Var2.a, iy70Var2.b, ly70Var.d, (qim0) null, ly70Var.b, x340Var, 0);
            x340Var.r(false);
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        d980 d980Var = ((a980) obj2).b;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, qim0VarF);
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        String strO0 = cwl1.o0(x340Var, 2131954265);
        lee1 lee1Var = cbx.d(x340Var).k;
        long j = cbx.a(x340Var).b.b;
        cvx cvxVar2 = cbx.b(x340Var).b;
        uwo1.e(strO0, uyn1.z(12.0f, 0.0f, 2, nim0Var), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        String strO1 = cwl1.o0(x340Var, 2131954262);
        boolean z = d980Var == d980.a;
        int i2 = (iIntValue & 896) ^ 384;
        boolean z2 = (i2 > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT = x340Var3.T();
        if (z2 || objT == m4cVar) {
            objT = new rri(iu30Var, (byte) 7);
            x340Var3.s0(objT);
        }
        k4p1.d(0, strO1, (Function0) objT, x340Var, z);
        String strO2 = cwl1.o0(x340Var, 2131954264);
        boolean z3 = d980Var == d980.b;
        boolean z4 = (i2 > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var3.T();
        if (z4 || objT2 == m4cVar) {
            objT2 = new rri(iu30Var, (byte) 8);
            x340Var3.s0(objT2);
        }
        k4p1.d(0, strO2, (Function0) objT2, x340Var, z3);
        String strO3 = cwl1.o0(x340Var, 2131954263);
        boolean z5 = d980Var == d980.c;
        boolean z6 = (i2 > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT3 = x340Var3.T();
        if (z6 || objT3 == m4cVar) {
            objT3 = new rri(iu30Var, (byte) 9);
            x340Var3.s0(objT3);
        }
        k4p1.d(0, strO3, (Function0) objT3, x340Var, z5);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        mb80 mb80Var = (mb80) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        int i2 = (iIntValue & 896) ^ 384;
        boolean z = (i2 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == m4cVar) {
            objT = new cci(iu30Var, (byte) 21);
            x340Var2.s0(objT);
        }
        iu30 iu30Var2 = (iu30) objT;
        boolean z2 = ((i2 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256) | ((((iIntValue & 112) ^ 48) > 32 && x340Var2.i(mb80Var)) || (iIntValue & 48) == 32);
        Object objT2 = x340Var2.T();
        if (z2 || objT2 == m4cVar) {
            objT2 = new puh(iu30Var, mb80Var, (byte) 11);
            x340Var2.s0(objT2);
        }
        w5p1.c(mb80Var, (qim0) null, iu30Var2, (iu30) objT2, x340Var2, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        ldx ldxVar = ldx.c;
        gdx gdxVarR = yla.r(x340Var);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new rri(iu30Var, (byte) 10);
            x340Var2.s0(objT);
        }
        wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, anm1.N("parental_hub_entity_row_information_button_trailing_action", nim0.a), (max) null, gdxVarR, (vzq0) null, false, (idn0) null, (ga80) null, tsi.a, x340Var2, 0, 6, 984);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        Object obj6 = fkj0.X;
        ge80 ge80Var = ((oe80) obj2).b;
        if (ge80Var instanceof ge80) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1064208628);
            ge80 ge80Var2 = ge80Var;
            boolean zG = x340Var2.g(ge80Var2);
            Object objT = x340Var2.T();
            if (zG || objT == obj6) {
                objT = ge80Var2.c;
                x340Var2.s0(objT);
            }
            View view = (View) objT;
            boolean zI = x340Var2.i(view);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == obj6) {
                objT2 = new xy2(view, (byte) 3);
                x340Var2.s0(objT2);
            }
            dm5.a((iu30) objT2, (qim0) null, (iu30) null, x340Var2, 0, 6);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1064319143);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        boolean z;
        String strK;
        Function0 function0;
        int i2;
        byte b2 = this.a;
        nim0 nim0Var = nim0.a;
        boolean z2 = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                cd50 cd50Var = (cd50) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                if (cd50Var instanceof bd50) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-440166136);
                    bd50 bd50Var = (bd50) cd50Var;
                    double d2 = bd50Var.a;
                    long j = bd50Var.b;
                    c380 c380Var = bd50Var.c;
                    if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
                        z2 = false;
                    }
                    Object objT = x340Var2.T();
                    if (z2 || objT == fkj0.X) {
                        objT = new roi(iu30Var, (byte) 21);
                        x340Var2.s0(objT);
                    }
                    qon1.e(d2, j, c380Var, (Function0) objT, (qim0) null, x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    if (!(cd50Var instanceof zc50)) {
                        throw p3d1.k(x340Var, 1786915254, false);
                    }
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-439894638);
                    x340Var3.r(false);
                }
                return rih1Var;
            case 1:
                tf50 tf50Var = (tf50) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var4 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                int i3 = (iIntValue2 & 48) == 0 ? iIntValue2 | (x340Var4.g(tf50Var) ? 32 : 16) : iIntValue2;
                if ((iIntValue2 & 384) == 0) {
                    i3 |= x340Var4.i(iu30Var2) ? 256 : 128;
                }
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(i3 & 1, (i3 & 1169) != 1168)) {
                    eqn1.b(tf50Var, iu30Var2, x340Var5, (i3 >> 3) & 126);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 2:
                jg50 jg50Var = (jg50) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var6 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                int i4 = (iIntValue3 & 48) == 0 ? iIntValue3 | (x340Var6.g(jg50Var) ? 32 : 16) : iIntValue3;
                if ((iIntValue3 & 384) == 0) {
                    i4 |= x340Var6.i(iu30Var3) ? 256 : 128;
                }
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    hqn1.b(jg50Var, iu30Var3, x340Var7, (i4 >> 3) & 126);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 3:
                si50 si50Var = (si50) obj2;
                int iIntValue4 = ((Number) obj5).intValue();
                w4i1 w4i1Var = si50Var.c;
                c380 c380Var2 = si50Var.d;
                int i5 = si50Var.e;
                String str = si50Var.b;
                Parcelable.Creator creator = w4i1.CREATOR;
                kqn1.g(w4i1Var, c380Var2, i5, str, (iu30) obj3, (qim0) null, (b0k) obj4, (iIntValue4 << 9) & 458752);
                return rih1Var;
            case 4:
                yi50 yi50Var = (yi50) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                int iIntValue5 = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                c380 c380Var3 = yi50Var.c;
                x340 x340Var8 = (b0k) obj4;
                boolean zG = x340Var8.g(c380Var3);
                Object objT2 = x340Var8.T();
                if (zG || objT2 == m4cVar) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : c380Var3) {
                        if (!u890.j(((jwm) obj6).c, dwm.a)) {
                            arrayList.add(obj6);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        w4i1 w4i1Var2 = ((jwm) it.next()).a;
                        String str2 = w4i1Var2.a;
                        String str3 = w4i1Var2.b;
                        String str4 = w4i1Var2.c;
                        if (str4 == null) {
                            str4 = "";
                        }
                        arrayList2.add(new phx(bro1.q(w4i1Var2.d), str4, str2, str3));
                    }
                    objT2 = mqo1.A(arrayList2);
                    x340Var8.s0(objT2);
                }
                c380 c380Var4 = (c380) objT2;
                hux huxVar = yi50Var.a ? hrx.c : null;
                if ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var8.g(iu30Var4)) && (iIntValue5 & 384) != 256) {
                    z2 = false;
                }
                Object objT3 = x340Var8.T();
                if (z2 || objT3 == m4cVar) {
                    objT3 = new roi(iu30Var4, (byte) 22);
                    x340Var8.s0(objT3);
                }
                fc11.a(c380Var4, (qim0) null, hcx.c, huxVar, false, 0, new gbx(z50.c, (Function0) objT3), (String) null, (idn0) null, x340Var8, 392 | (hrx.d << 9), 434);
                return rih1Var;
            case 5:
                nl50 nl50Var = (nl50) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                int iIntValue6 = ((Number) obj5).intValue();
                x340 x340Var9 = (b0k) obj4;
                boolean zI = x340Var9.i(nl50Var);
                if ((((iIntValue6 & 896) ^ 384) <= 256 || !x340Var9.g(iu30Var5)) && (iIntValue6 & 384) != 256) {
                    z2 = false;
                }
                boolean z3 = zI | z2;
                Object objT4 = x340Var9.T();
                if (z3 || objT4 == fkj0.X) {
                    objT4 = new dfi((byte) 10, (Object) nl50Var, iu30Var5);
                    x340Var9.s0(objT4);
                }
                crn1.d(nl50Var, (Function0) objT4, (qim0) null, x340Var9, (iIntValue6 >> 3) & 14);
                return rih1Var;
            case 6:
                cm50 cm50Var = (cm50) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                String str5 = cm50Var.d;
                int i6 = (iIntValue7 & 48) == 0 ? iIntValue7 | (x340Var10.g(cm50Var) ? 32 : 16) : iIntValue7;
                if ((iIntValue7 & 384) == 0) {
                    i6 |= x340Var10.i(iu30Var6) ? 256 : 128;
                }
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(i6 & 1, (i6 & 1169) != 1168)) {
                    if (cm50Var.f) {
                        x340Var11.i0(1343424009);
                        z = false;
                        sy4.b(een.h, 0L, (Function0) null, new nfv0(24, true, true, false), fri.a, x340Var11, 27654, 6);
                        x340Var11.r(false);
                    } else {
                        z = false;
                        x340Var11.i0(1344121695);
                        x340Var11.r(false);
                    }
                    String strK2 = str5.length() > 0 ? x0d.k(x340Var11, -1342112354, 2131956479, x340Var11, z) : x0d.k(x340Var11, -1342109921, 2131953759, x340Var11, z);
                    if (str5.length() > 0) {
                        x340Var11.i0(-1342105192);
                        strK = cwl1.n0(2131956481, new Object[]{str5}, x340Var11);
                        x340Var11.r(z);
                    } else {
                        strK = x0d.k(x340Var11, -1342101944, 2131956480, x340Var11, z);
                    }
                    String str6 = strK;
                    String strO0 = cwl1.o0(x340Var11, 2131953758);
                    z2 = (i6 & 896) == 256;
                    Object objT5 = x340Var11.T();
                    if (z2 || objT5 == fkj0.X) {
                        objT5 = new roi(iu30Var6, (byte) 23);
                        x340Var11.s0(objT5);
                    }
                    rwq.c(0, strK2, str6, strO0, (Function0) objT5, x340Var11, (qim0) null);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 7:
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                String strO1 = cwl1.o0(x340Var12, 2131953729);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                if ((((iIntValue8 & 896) ^ 384) <= 256 || !x340Var12.g(iu30Var7)) && (iIntValue8 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var13 = x340Var12;
                Object objT6 = x340Var13.T();
                if (z2 || objT6 == fkj0.X) {
                    objT6 = new roi(iu30Var7, (byte) 24);
                    x340Var13.s0(objT6);
                }
                Function0 function1 = (Function0) objT6;
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                jto1.b(qim0VarF, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO1), function1), (gbx) null, (xu30) null, (xu30) null, (xu30) null, gri.a, (xu30) null, (xu30) null, (xu30) null, apo.r(1195012183, new kaf(strO1, (byte) 11), x340Var13), x340Var13, 0, 196656, 30654);
                return rih1Var;
            case 8:
                ep50 ep50Var = (ep50) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                int i7 = (iIntValue9 & 48) == 0 ? iIntValue9 | (x340Var14.g(ep50Var) ? 32 : 16) : iIntValue9;
                if ((iIntValue9 & 384) == 0) {
                    i7 |= x340Var14.i(iu30Var8) ? 256 : 128;
                }
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(i7 & 1, (i7 & 1169) != 1168)) {
                    zv31 zv31Var = ep50Var.a;
                    z2 = (i7 & 896) == 256;
                    Object objT7 = x340Var15.T();
                    if (z2 || objT7 == fkj0.X) {
                        objT7 = new cci(iu30Var8, (byte) 20);
                        x340Var15.s0(objT7);
                    }
                    ltn1.j(zv31Var, (iu30) objT7, (qim0) null, x340Var15, 0);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 9:
                jp50 jp50Var = (jp50) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                int i8 = (iIntValue10 & 48) == 0 ? iIntValue10 | (x340Var16.g(jp50Var) ? 32 : 16) : iIntValue10;
                if ((iIntValue10 & 384) == 0) {
                    i8 |= x340Var16.i(iu30Var9) ? 256 : 128;
                }
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(i8 & 1, (i8 & 1169) != 1168)) {
                    boolean z4 = jp50Var.a;
                    z2 = (i8 & 896) == 256;
                    Object objT8 = x340Var17.T();
                    if (z2 || objT8 == fkj0.X) {
                        objT8 = new roi(iu30Var9, (byte) 25);
                        x340Var17.s0(objT8);
                    }
                    rrn1.m(0, (Function0) objT8, x340Var17, (qim0) null, z4);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 10:
                kq50 kq50Var = (kq50) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                y3g y3gVar = kq50Var.a;
                String str7 = y3gVar.a;
                if ((((iIntValue11 & 896) ^ 384) <= 256 || !x340Var18.g(iu30Var10)) && (iIntValue11 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var19 = x340Var18;
                Object objT9 = x340Var19.T();
                if (z2 || objT9 == m4cVar2) {
                    objT9 = new roi(iu30Var10, (byte) 26);
                    x340Var19.s0(objT9);
                }
                Function0 function2 = (Function0) objT9;
                if (ihc1.y0(str7)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                gbx gbxVar = new gbx(new y50(str7), function2);
                Object objT10 = x340Var19.T();
                if (objT10 == m4cVar2) {
                    objT10 = iri.c;
                    x340Var19.s0(objT10);
                }
                vu30 vu30Var = (vu30) objT10;
                Object objT11 = x340Var19.T();
                if (objT11 == m4cVar2) {
                    objT11 = iri.d;
                    x340Var19.s0(objT11);
                }
                poo1.e(gbxVar, new oex(0, vu30Var, (vu30) objT11, (vu30) null, 9), yoo1.z(x340Var19), (qim0) null, 0, cwl1.n0(2131956510, new Object[]{y3gVar.a}, x340Var19), (max) null, (vu30) null, nri.a, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(-1301006565, new l8i(kq50Var, (byte) 15), x340Var19), x340Var19, 100663296, 3072, 7896);
                return rih1Var;
            case 11:
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                nw50 nw50Var = ((jw50) obj2).a;
                if (nw50Var instanceof kw50) {
                    x340 x340Var21 = x340Var20;
                    x340Var21.i0(-905146341);
                    qim0 qim0VarN = anm1.N("#LyricsCardExpandHeaderButtonTag", nim0Var);
                    inx inxVar = inx.c;
                    jsl jslVar = new jsl(cwl1.o0(x340Var21, 2131957805));
                    String strO2 = cwl1.o0(x340Var21, 2131957804);
                    if (ihc1.y0(strO2)) {
                        hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                        return null;
                    }
                    y50 y50Var = new y50(strO2);
                    if ((((iIntValue12 & 896) ^ 384) <= 256 || !x340Var21.g(iu30Var11)) && (iIntValue12 & 384) != 256) {
                        z2 = false;
                    }
                    Object objT12 = x340Var21.T();
                    if (z2 || objT12 == m4cVar3) {
                        objT12 = new roi(iu30Var11, (byte) 27);
                        x340Var21.s0(objT12);
                    }
                    o4o1.b(inxVar, jslVar, y50Var, qim0VarN, (Function0) objT12, x340Var21, inx.d);
                    x340Var21.r(false);
                    return rih1Var;
                }
                if (nw50Var instanceof lw50) {
                    x340 x340Var22 = x340Var20;
                    x340Var22.i0(-904575879);
                    qim0 qim0VarN2 = anm1.N("#LyricsCardShareHeaderButtonTag", nim0Var);
                    fsx fsxVar = fsx.c;
                    jsl jslVar2 = new jsl(cwl1.o0(x340Var22, 2131957807));
                    String strO3 = cwl1.o0(x340Var22, 2131957806);
                    if (ihc1.y0(strO3)) {
                        hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                        return null;
                    }
                    y50 y50Var2 = new y50(strO3);
                    if ((((iIntValue12 & 896) ^ 384) <= 256 || !x340Var22.g(iu30Var11)) && (iIntValue12 & 384) != 256) {
                        z2 = false;
                    }
                    Object objT13 = x340Var22.T();
                    if (z2 || objT13 == m4cVar3) {
                        objT13 = new roi(iu30Var11, (byte) 28);
                        x340Var22.s0(objT13);
                    }
                    o4o1.b(fsxVar, jslVar2, y50Var2, qim0VarN2, (Function0) objT13, x340Var22, fsx.d);
                    x340Var22.r(false);
                    return rih1Var;
                }
                if (!(nw50Var instanceof mw50)) {
                    throw p3d1.k(x340Var20, 109348707, false);
                }
                x340 x340Var23 = x340Var20;
                x340Var23.i0(-904026714);
                qim0 qim0VarN3 = anm1.N("#LyricsCardTranslationHeaderButtonTag", nim0Var);
                mtx mtxVar = mtx.c;
                jsl jslVar3 = new jsl(cwl1.o0(x340Var23, 2131957813));
                String strO4 = cwl1.o0(x340Var23, 2131957812);
                if (ihc1.y0(strO4)) {
                    hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                    return null;
                }
                y50 y50Var3 = new y50(strO4);
                if ((((iIntValue12 & 896) ^ 384) <= 256 || !x340Var23.g(iu30Var11)) && (iIntValue12 & 384) != 256) {
                    z2 = false;
                }
                Object objT14 = x340Var23.T();
                if (z2 || objT14 == m4cVar3) {
                    objT14 = new roi(iu30Var11, (byte) 29);
                    x340Var23.s0(objT14);
                }
                o4o1.b(mtxVar, jslVar3, y50Var3, qim0VarN3, (Function0) objT14, x340Var23, mtx.d);
                x340Var23.r(false);
                return rih1Var;
            case 12:
                b0k b0kVar = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarP = x0d.p(lhc.g(b0kVar).g, 16, qim0VarF2);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar).b;
                qim0 qim0VarZ = uyn1.z(4.0f, 0.0f, 2, qim0VarP);
                cvx cvxVar2 = cbx.b(b0kVar).b;
                s3o1.f((l060) obj2, (iu30) obj3, uyn1.B(qim0VarZ, 0.0f, 8.0f, 0.0f, 0.0f, 13), b0kVar, (iIntValue13 >> 3) & 126);
                return rih1Var;
            case 13:
                m060 m060Var = (m060) obj2;
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var24 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                String str8 = m060Var.a;
                int i9 = m060Var.b;
                boolean z5 = m060Var.c;
                boolean z6 = m060Var.d;
                int i10 = (iIntValue14 & 896) ^ 384;
                boolean z7 = (i10 > 256 && x340Var24.g(iu30Var12)) || (iIntValue14 & 384) == 256;
                x340 x340Var25 = x340Var24;
                Object objT15 = x340Var25.T();
                if (z7 || objT15 == m4cVar4) {
                    objT15 = new rri(iu30Var12, (byte) 0);
                    x340Var25.s0(objT15);
                }
                Function0 function3 = (Function0) objT15;
                boolean z8 = (i10 > 256 && x340Var25.g(iu30Var12)) || (iIntValue14 & 384) == 256;
                Object objT16 = x340Var25.T();
                if (z8 || objT16 == m4cVar4) {
                    objT16 = new rri(iu30Var12, (byte) 1);
                    x340Var25.s0(objT16);
                }
                n3o1.a(str8, i9, function3, (qim0) null, z5, z6, (Function0) objT16, x340Var25, 0);
                return rih1Var;
            case 14:
                o060 o060Var = (o060) obj2;
                x340 x340Var26 = (b0k) obj4;
                int iIntValue15 = ((Number) obj5).intValue();
                if ((iIntValue15 & 48) == 0) {
                    iIntValue15 |= x340Var26.g(o060Var) ? 32 : 16;
                }
                x340 x340Var27 = x340Var26;
                if (x340Var27.Y(iIntValue15 & 1, (iIntValue15 & 1041) != 1040)) {
                    u2o1.b(o060Var.a, (qim0) null, x340Var27, 0);
                } else {
                    x340Var27.b0();
                }
                return rih1Var;
            case 15:
                k060 k060Var = (k060) obj2;
                x340 x340Var28 = (b0k) obj4;
                int iIntValue16 = ((Number) obj5).intValue();
                if ((iIntValue16 & 48) == 0) {
                    iIntValue16 |= x340Var28.g(k060Var) ? 32 : 16;
                }
                x340 x340Var29 = x340Var28;
                if (x340Var29.Y(iIntValue16 & 1, (iIntValue16 & 1041) != 1040)) {
                    y3o1.c(k060Var.a, x340Var29, 0);
                } else {
                    x340Var29.b0();
                }
                return rih1Var;
            case 16:
                f460 f460Var = (f460) obj2;
                x340 x340Var30 = (b0k) obj4;
                int iIntValue17 = ((Number) obj5).intValue();
                if ((iIntValue17 & 48) == 0) {
                    iIntValue17 |= (iIntValue17 & 64) == 0 ? x340Var30.g(f460Var) : x340Var30.i(f460Var) ? 32 : 16;
                }
                x340 x340Var31 = x340Var30;
                if (x340Var31.Y(iIntValue17 & 1, (iIntValue17 & 1041) != 1040)) {
                    oho1.j(f460Var.a, f460Var.b, (qim0) null, x340Var31, 64);
                } else {
                    x340Var31.b0();
                }
                return rih1Var;
            case 17:
                k460 k460Var = (k460) obj2;
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var32 = (b0k) obj4;
                int iIntValue18 = ((Number) obj5).intValue();
                int i11 = (iIntValue18 & 48) == 0 ? iIntValue18 | (x340Var32.g(k460Var) ? 32 : 16) : iIntValue18;
                if ((iIntValue18 & 384) == 0) {
                    i11 |= x340Var32.i(iu30Var13) ? 256 : 128;
                }
                x340 x340Var33 = x340Var32;
                if (x340Var33.Y(i11 & 1, (i11 & 1169) != 1168)) {
                    if (k460Var.e == null) {
                        x340Var33.i0(981613428);
                        x340Var33.r(false);
                        function0 = null;
                    } else {
                        x340Var33.i0(981613429);
                        z2 = (i11 & 896) == 256;
                        Object objT17 = x340Var33.T();
                        if (z2 || objT17 == fkj0.X) {
                            objT17 = new rri(iu30Var13, (byte) 2);
                            x340Var33.s0(objT17);
                        }
                        function0 = (Function0) objT17;
                        x340Var33.r(false);
                    }
                    who1.e(k460Var, (qim0) null, function0, x340Var33, (i11 >> 3) & 14);
                } else {
                    x340Var33.b0();
                }
                return rih1Var;
            case 18:
                d960 d960Var = (d960) obj2;
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var34 = (b0k) obj4;
                int iIntValue19 = ((Number) obj5).intValue();
                d36 d36Var = new d36(8.0f, true, new um5(false));
                era eraVar = een.Q0;
                qim0 qim0VarH = l6o1.H(u291.f(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var34), false, 14);
                WeakHashMap weakHashMap2 = osl1.x;
                qim0 qim0VarX = uyn1.x(too1.y(qim0VarH, new bgc0(lhc.g(x340Var34).g, 32)), 16.0f);
                mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var34, 0);
                x340 x340Var35 = x340Var34;
                int iHashCode = Long.hashCode(x340Var35.T);
                xos0 xos0VarM = x340Var35.m();
                qim0 qim0VarE = zr7.E(x340Var34, qim0VarX);
                hzj.A.getClass();
                x340 x340Var36 = x340Var34;
                if (x340Var36.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var36.m0();
                if (x340Var36.S) {
                    x340Var36.l(hmb0.t1);
                } else {
                    x340Var36.v0();
                }
                nko1.H(mbhVarA, x340Var34, y580.O0);
                nko1.H(xos0VarM, x340Var34, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var34, y580.R0);
                nko1.F(x340Var34);
                nko1.H(qim0VarE, x340Var34, y580.Y);
                b960 b960Var = d960Var.b;
                if (b960Var == null) {
                    x340Var36.i0(-1203919017);
                    xto1.e(anm1.N("progress_indicator_test_tag", nim0Var), 0, 0L, 0L, x340Var34, 0, 14);
                    x340Var36.r(false);
                } else {
                    x340Var36.i0(-1203778804);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(cwl1.o0(x340Var34, 2131964102), (qim0) null, cbx.d(x340Var34).e, cbx.a(x340Var34).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var34, 0, 0, 2034);
                    lee1 lee1Var = cbx.d(x340Var34).j;
                    long j2 = cbx.a(x340Var34).b.b;
                    int iOrdinal = b960Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            i2 = 2131964099;
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    i2 = 2131964098;
                    uwo1.e(cwl1.o0(x340Var34, i2), (qim0) null, lee1Var, j2, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var34, 0, 0, 2018);
                    String strN = eqq.n(nim0Var, 8.0f, x340Var34, 2131964100, x340Var34);
                    boolean z9 = (((iIntValue19 & 896) ^ 384) > 256 && x340Var36.g(iu30Var14)) || (iIntValue19 & 384) == 256;
                    Object objT18 = x340Var36.T();
                    if (z9 || objT18 == fkj0.X) {
                        objT18 = new rri(iu30Var14, (byte) 3);
                        x340Var36.s0(objT18);
                    }
                    Function0 function4 = (Function0) objT18;
                    if (ihc1.y0(strN)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(strN), function4), new idx(4), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, bsi.a, x340Var34, 0, 48, 2044);
                    x340Var36.r(false);
                }
                x340Var36.r(true);
                return rih1Var;
            case 19:
                return a(obj, obj2, obj3, obj4, obj5);
            case 20:
                return d(obj, obj2, obj3, obj4, obj5);
            case 21:
                return e(obj, obj2, obj3, obj4, obj5);
            case 22:
                return f(obj, obj2, obj3, obj4, obj5);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return g(obj, obj2, obj3, obj4, obj5);
            case 24:
                ((Number) obj5).intValue();
                f4p1.a((qim0) null, (b0k) obj4, 0);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return h(obj, obj2, obj3, obj4, obj5);
            case 26:
                return i(obj, obj2, obj3, obj4, obj5);
            case 27:
                return j(obj, obj2, obj3, obj4, obj5);
            case 28:
                return k(obj, obj2, obj3, obj4, obj5);
            default:
                oh80.a((nh80) obj2, (iu30) obj3, (qim0) null, 0L, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
        }
    }
}
