package p;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.compose.ui.platform.ComposeView;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o06 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o06(p811 p811Var, p811 p811Var2, p811 p811Var3, Context context, RemoteViews remoteViews, lk80 lk80Var, p811 p811Var4, p811 p811Var5, p811 p811Var6, cng1 cng1Var, p811 p811Var7, p811 p811Var8, p811 p811Var9) {
        super(2);
        this.a = (byte) 0;
        this.b = p811Var;
        this.c = p811Var2;
        this.d = p811Var3;
        this.i = context;
        this.t = remoteViews;
        this.X = lk80Var;
        this.e = p811Var4;
        this.f = p811Var6;
        this.g = p811Var8;
        this.h = p811Var9;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0205  */
    public final Object invoke(Object obj, Object obj2) {
        rzq0 rzq0Var;
        long j;
        String strK;
        Function0 function0;
        Object rbl1Var;
        Object obj3;
        boolean z;
        boolean z2;
        Object tbl1Var;
        boolean z3;
        Object tbl1Var2;
        boolean z4;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        n4k n4kVar = hmb0.t1;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.X;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.b;
        Object obj8 = this.d;
        Object obj9 = this.g;
        Object obj10 = this.t;
        Object obj11 = this.e;
        Object obj12 = this.c;
        Object obj13 = this.f;
        switch (b) {
            case 0:
                iy9 iy9Var = (ft40) obj2;
                if (iy9Var instanceof q60) {
                    ((p811) obj7).a = iy9Var;
                } else if (iy9Var instanceof iql1) {
                    ((p811) obj12).a = iy9Var;
                } else if (iy9Var instanceof f660) {
                    ((p811) obj8).a = iy9Var;
                } else if (iy9Var instanceof jy9) {
                    Context context = (Context) obj5;
                    RemoteViews remoteViews = (RemoteViews) obj10;
                    iy9 iy9Var2 = (jy9) iy9Var;
                    int i = ((lk80) obj4).a;
                    if (iy9Var2 instanceof iy9) {
                        remoteViews.setInt(i, "setBackgroundResource", iy9Var2.a.a);
                    } else if (iy9Var2 instanceof hy9) {
                        hn20 hn20Var = ((hy9) iy9Var2).a;
                        if (hn20Var instanceof hn20) {
                            remoteViews.setInt(i, "setBackgroundColor", z4p1.G(hn20Var.a));
                        } else if (hn20Var instanceof tw21) {
                            int i2 = ((tw21) hn20Var).a;
                            if (Build.VERSION.SDK_INT >= 31) {
                                b421.d(remoteViews, i, "setBackgroundColor", i2);
                            } else {
                                remoteViews.setInt(i, "setBackgroundResource", i2);
                            }
                        } else if (!(hn20Var instanceof l7r)) {
                            Objects.toString(hn20Var);
                        } else if (Build.VERSION.SDK_INT >= 31) {
                            l7r l7rVar = (l7r) hn20Var;
                            b421.f(remoteViews, i, "setBackgroundColor", z4p1.G(l7rVar.a), z4p1.G(l7rVar.b));
                        } else {
                            remoteViews.setInt(i, "setBackgroundColor", z4p1.G(((l7r) hn20Var).a(context)));
                        }
                    }
                } else if (iy9Var instanceof rzq0) {
                    p811 p811Var = (p811) obj11;
                    rzq0 rzq0Var2 = (rzq0) p811Var.a;
                    if (rzq0Var2 != null) {
                        rzq0 rzq0Var3 = (rzq0) iy9Var;
                        rzq0Var = new rzq0(rzq0Var2.a.a(rzq0Var3.a), rzq0Var2.b.a(rzq0Var3.b), rzq0Var2.c.a(rzq0Var3.c), rzq0Var2.d.a(rzq0Var3.d), rzq0Var2.e.a(rzq0Var3.e), rzq0Var2.f.a(rzq0Var3.f));
                    } else {
                        rzq0Var = (rzq0) iy9Var;
                    }
                    p811Var.a = rzq0Var;
                } else if (iy9Var instanceof i8n) {
                    ((p811) obj13).a = ((i8n) iy9Var).a;
                } else if (!(iy9Var instanceof cm3)) {
                    if (iy9Var instanceof eax) {
                        ((p811) obj9).a = iy9Var;
                    } else if (iy9Var instanceof q161) {
                        ((p811) obj6).a = iy9Var;
                    } else {
                        Objects.toString(iy9Var);
                    }
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                dko1.a((vn6) obj7, (iu30) obj12, (em3) obj8, (xfx) obj11, (gw70) obj13, (qfl1) obj9, (q7r0) obj6, (bnr) obj5, (ggr) obj10, (qim0) obj4, (b0k) obj, czo1.p(262145));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                bpo1.b((zkn) obj7, (iu30) obj12, (wn50) obj8, (q251) obj11, (gv51) obj13, (d6o0) obj9, (v361) obj6, (fm50) obj5, (cb0) obj10, (qim0) obj4, (b0k) obj, czo1.p(805306369));
                return rih1Var;
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qsw.c(new obk1((ComposeView) obj7), apo.r(-1560059567, new ho30((kp5) obj12, (hrr0) obj8, (Function0) obj11, (Function0) obj13, (String) obj9, (String) obj6, (String) obj5, (Integer) obj10, (String) obj4, (byte) 2), x340Var2), x340Var2, 48);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                k4k.g((a140) obj7, (String) obj12, (String) obj8, (sip) obj11, (tip) obj13, (uip) obj9, (xip) obj6, (zja1) obj5, (rgn0) obj10, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ihl ihlVar = (ihl) obj4;
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                Function0 function1 = (Function0) obj12;
                txd1 txd1Var = (txd1) obj13;
                m4c m4cVar = fkj0.X;
                ihl ihlVar2 = (ihl) obj11;
                xhl xhlVar = (xhl) obj8;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (((m5a) obj7) instanceof j5a) {
                        x340Var4.i0(-1765642394);
                        j = ((u7h) x340Var4.k(qgx.a)).a;
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-1765640893);
                        uwr uwrVar = cbx.a;
                        j = cbx.a(x340Var4).b.a;
                        x340Var4.r(false);
                    }
                    long j2 = j;
                    if (function1 != null) {
                        x340Var4.i0(-1765638256);
                        Function0 function2 = (Function0) obj12;
                        Object objT = x340Var4.T();
                        if (objT == m4cVar) {
                            objT = vxd1.c;
                            x340Var4.s0(objT);
                        }
                        xhlVar.getClass();
                        qim0 qim0VarJ = xhl.j(nim0Var, ihlVar2, (iu30) objT);
                        u1p1.t(x340Var4);
                        u1p1.t(x340Var4);
                        u1p1.d(function2, j2, u291.a(qim0VarJ, 48.0f, 48.0f), x340Var4, 0);
                        x340Var4.r(false);
                    } else if (txd1Var != null) {
                        x340Var4.i0(1100150622);
                        Object objT2 = x340Var4.T();
                        if (objT2 == m4cVar) {
                            objT2 = vxd1.d;
                            x340Var4.s0(objT2);
                        }
                        xhlVar.getClass();
                        u1p1.c(txd1Var, uyn1.y(xhl.j(nim0Var, ihlVar2, (iu30) objT2), 12.0f, 4.0f), x340Var4, 0, 0);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(1100470883);
                        x340Var4.r(false);
                    }
                    String str = (String) obj9;
                    vu30 vu30Var = (vu30) obj6;
                    ihl ihlVar3 = (ihl) obj5;
                    boolean zD = x340Var4.d(4.0f) | x340Var4.g((Integer) obj10) | x340Var4.i(ihlVar) | x340Var4.d(12.0f) | x340Var4.g(function1) | x340Var4.g(txd1Var) | x340Var4.i(ihlVar2);
                    Integer num = (Integer) obj10;
                    Function0 function3 = (Function0) obj12;
                    txd1 txd1Var2 = (txd1) obj13;
                    Object objT3 = x340Var4.T();
                    if (zD || objT3 == m4cVar) {
                        objT3 = new tjf0(num, ihlVar, function3, txd1Var2, ihlVar2, (byte) 24);
                        x340Var4.s0(objT3);
                    }
                    xhlVar.getClass();
                    u1p1.g(str, vu30Var, 5, u291.b(0.0f, u1p1.v(x340Var4), 1, xhl.j(nim0Var, ihlVar3, (iu30) objT3)), 2, new px8(fc11.G(11), fc11.G(16), fc11.G(1), (mx8) null, 8), j2, x340Var4, 286720, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var6).b;
                    qim0 qim0VarB = uyn1.B(uyn1.x(qim0VarF, 16.0f), 0.0f, 0.0f, 0.0f, ((vzq0) obj7).a(), 7);
                    zci1 zci1Var = (zci1) obj12;
                    lz20 lz20Var = (lz20) obj8;
                    y7e1 y7e1Var = (y7e1) obj11;
                    az20 az20Var = (az20) obj13;
                    k6a1 k6a1Var = (k6a1) obj9;
                    DatePickerDialog datePickerDialog = (DatePickerDialog) obj6;
                    y7e1 y7e1Var2 = (y7e1) obj5;
                    y7e1 y7e1Var3 = (y7e1) obj10;
                    iu30 iu30Var = (iu30) obj4;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var6, 0);
                    int iHashCode = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM = x340Var6.m();
                    qim0 qim0VarE = zr7.E(x340Var6, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(mbhVarA, x340Var6, y580.O0);
                    nko1.H(xos0VarM, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE, x340Var6, y580.Y);
                    String strO0 = cwl1.o0(x340Var6, 2131963586);
                    lee1 lee1Var = cbx.d(x340Var6).d;
                    Object objT4 = x340Var6.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT4 == m4cVar2) {
                        objT4 = osh1.a1;
                        x340Var6.s0(objT4);
                    }
                    uwo1.e(strO0, s161.b(nim0Var, false, (iu30) objT4), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2040);
                    cvx cvxVar2 = cbx.b(x340Var6).b;
                    uwo1.e(ydh.g(16.0f, 2131963582, x340Var6, x340Var6, nim0Var), (qim0) null, cbx.d(x340Var6).k, cbx.a(x340Var6).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2034);
                    cvx cvxVar3 = cbx.b(x340Var6).b;
                    op71.g(x340Var6, u291.h(nim0Var, 8.0f));
                    fyx fyxVarN = fqo1.N(x340Var6);
                    if (zci1Var.b()) {
                        strK = x0d.k(x340Var6, 888450560, 2131963583, x340Var6, false);
                    } else {
                        x340Var6.i0(1772218672);
                        x340Var6.r(false);
                        strK = null;
                    }
                    rwo1.a(y7e1Var, fyxVarN, anm1.N("user_info_name_field", vby0.p(u291.f(nim0Var, 1.0f), lz20Var)), (max) null, strK, (vu30) null, (vu30) null, false, k8p1.m(vy5.e, 20), (lee1) null, (kua0) null, (yta0) null, d6e1.b, (vu30) null, (idn0) null, (uwg) null, (es41) null, (vzq0) null, 0.0f, false, x340Var6, 0, 0, 0, 2088424);
                    cvx cvxVar4 = cbx.b(x340Var6).b;
                    uwo1.e(ydh.g(16.0f, 2131963573, x340Var6, x340Var6, nim0Var), (qim0) null, cbx.d(x340Var6).k, cbx.a(x340Var6).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2034);
                    cvx cvxVar5 = cbx.b(x340Var6).b;
                    op71.g(x340Var6, u291.h(nim0Var, 8.0f));
                    if (zci1Var.b()) {
                        x340Var6.i0(1772913228);
                        uwo1.e(cwl1.o0(x340Var6, 2131963572), (qim0) null, cbx.d(x340Var6).j, cbx.a(x340Var6).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2034);
                        cvx cvxVar6 = cbx.b(x340Var6).b;
                        x0d.s(nim0Var, 8.0f, x340Var6, false);
                    } else {
                        x340Var6.i0(1773198645);
                        x340Var6.r(false);
                    }
                    boolean z5 = zci1Var.e == 3;
                    String str2 = zci1Var.b.b;
                    String strO1 = cwl1.o0(x340Var6, zci1Var.b() ? 2131963576 : 2131963574);
                    boolean zI = x340Var6.i(az20Var) | x340Var6.i(k6a1Var) | x340Var6.i(datePickerDialog);
                    Object objT5 = x340Var6.T();
                    if (zI || objT5 == m4cVar2) {
                        objT5 = new o8e1(az20Var, k6a1Var, datePickerDialog, (byte) 18);
                        x340Var6.s0(objT5);
                    }
                    fqo1.d(0, str2, strO1, (Function0) objT5, x340Var6, anm1.N("user_info_dob_field", nim0Var), z5);
                    if (z5) {
                        x340Var6.i0(1773848777);
                        cvx cvxVar7 = cbx.b(x340Var6).b;
                        uwo1.e(ydh.g(8.0f, 2131963575, x340Var6, x340Var6, nim0Var), (qim0) null, cbx.d(x340Var6).j, cbx.a(x340Var6).b.d, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2034);
                        x340Var6.r(false);
                    } else {
                        x340Var6.i0(1774137077);
                        x340Var6.r(false);
                    }
                    if (zci1Var.b()) {
                        x340Var6.i0(1774179237);
                        fqo1.e(y7e1Var2, y7e1Var3, zci1Var.t || y7e1Var2.d().d.length() > 0, x340Var6, 0);
                        x340Var6.r(false);
                    } else {
                        x340Var6.i0(1774409877);
                        x340Var6.r(false);
                    }
                    int iG = zci1Var.g();
                    boolean z6 = iG == 0;
                    yxa0 yxa0Var = zci1Var.f;
                    String strO2 = cwl1.o0(x340Var6, iG == 2 ? 2131963579 : 2131963585);
                    boolean zG = x340Var6.g(iu30Var);
                    Object objT6 = x340Var6.T();
                    if (zG || objT6 == m4cVar2) {
                        objT6 = new uyh1(iu30Var, (byte) 16);
                        x340Var6.s0(objT6);
                    }
                    fqo1.u(z6, yxa0Var, strO2, (Function0) objT6, x340Var6, 0);
                    yxa0 yxa0Var2 = zci1Var.f;
                    boolean zG2 = x340Var6.g(iu30Var);
                    Object objT7 = x340Var6.T();
                    if (zG2 || objT7 == m4cVar2) {
                        objT7 = new ceg1(iu30Var, (byte) 6);
                        x340Var6.s0(objT7);
                    }
                    fqo1.t(yxa0Var2, (iu30) objT7, x340Var6, 0);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                o0i o0iVar = (o0i) obj13;
                ybl1 ybl1Var = (ybl1) obj11;
                vbl1 vbl1Var = (vbl1) obj9;
                ven0 ven0Var = (ven0) obj12;
                ven0 ven0Var2 = (ven0) obj8;
                m4c m4cVar3 = fkj0.X;
                boolean z7 = (iIntValue4 & 3) != 2;
                int i3 = iIntValue4 & 1;
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(i3, z7)) {
                    x340Var8.b0();
                    return rih1Var;
                }
                ybl1 ybl1Var2 = (ybl1) obj11;
                o0i o0iVar2 = (o0i) obj13;
                ven0 ven0Var3 = (ven0) obj6;
                ven0 ven0Var4 = (ven0) obj5;
                c9n c9nVar = (c9n) obj10;
                ylv ylvVar = (ylv) obj4;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var8.T);
                xos0 xos0VarM2 = x340Var8.m();
                qim0 qim0VarE2 = zr7.E(x340Var8, (qim0) obj7);
                hzj.A.getClass();
                if (x340Var8.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var8.m0();
                if (x340Var8.S) {
                    x340Var8.l(n4kVar);
                } else {
                    x340Var8.v0();
                }
                nko1.H(gfh0VarC, x340Var8, y580.O0);
                nko1.H(xos0VarM2, x340Var8, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var8, y580.R0);
                nko1.F(x340Var8);
                nko1.H(qim0VarE2, x340Var8, y580.Y);
                cce cceVar = vbl1Var.a;
                boolean zBooleanValue = ((Boolean) ven0Var3.getValue()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) ven0Var4.getValue()).booleanValue();
                int iIntValue5 = ((Number) ven0Var2.getValue()).intValue();
                int iIntValue6 = ((Number) ven0Var.getValue()).intValue();
                boolean zI2 = x340Var8.i(vbl1Var);
                Object objT8 = x340Var8.T();
                if (zI2 || objT8 == m4cVar3) {
                    sjf1 sjf1Var = new sjf1(0, vbl1Var, vbl1.class, "onSingleTap", "onSingleTap()V", 0, (byte) 19);
                    x340Var8.s0(sjf1Var);
                    objT8 = sjf1Var;
                }
                if (!vbl1Var.e.h()) {
                    objT8 = null;
                }
                Function0 function4 = (nla0) objT8;
                if (function4 == null) {
                    x340Var8.i0(1735277149);
                    Object objT9 = x340Var8.T();
                    if (objT9 == m4cVar3) {
                        objT9 = w3l1.X;
                        x340Var8.s0(objT9);
                    }
                    function0 = (Function0) objT9;
                    x340Var8.r(false);
                } else {
                    x340Var8.i0(-1190951260);
                    x340Var8.r(false);
                    function0 = function4;
                }
                Function0 function5 = function0;
                boolean zI3 = x340Var8.i(vbl1Var);
                Object objT10 = x340Var8.T();
                if (zI3 || objT10 == m4cVar3) {
                    objT10 = new sjf1(0, vbl1Var, vbl1.class, "onDoubleTap", "onDoubleTap()V", 0, (byte) 20);
                    x340Var8.s0(objT10);
                }
                Function0 function6 = (Function0) objT10;
                boolean zG3 = x340Var8.g(ven0Var3) | x340Var8.i(vbl1Var) | x340Var8.i(o0iVar2);
                Object objT11 = x340Var8.T();
                if (zG3 || objT11 == m4cVar3) {
                    objT11 = new ubl1(vbl1Var, o0iVar2, ven0Var3, (byte) 0);
                    x340Var8.s0(objT11);
                }
                Function0 function7 = (Function0) objT11;
                boolean zG4 = x340Var8.g(ven0Var3) | x340Var8.i(vbl1Var) | x340Var8.i(o0iVar2);
                Object objT12 = x340Var8.T();
                if (zG4 || objT12 == m4cVar3) {
                    objT12 = new ubl1(vbl1Var, o0iVar2, ven0Var3, (byte) 1);
                    x340Var8.s0(objT12);
                }
                Function0 function8 = (Function0) objT12;
                boolean zG5 = x340Var8.g(ven0Var3) | x340Var8.g(ven0Var4) | x340Var8.i(c9nVar) | x340Var8.i(ylvVar) | x340Var8.i(vbl1Var) | x340Var8.i(o0iVar2);
                Object objT13 = x340Var8.T();
                if (zG5 || objT13 == m4cVar3) {
                    rbl1Var = new rbl1(c9nVar, vbl1Var, o0iVar2, ven0Var3, ven0Var4, ylvVar, (byte) 1);
                    x340Var8.s0(rbl1Var);
                } else {
                    rbl1Var = objT13;
                }
                kxt0 kxt0Var = o0iVar2.c.a;
                if (kxt0Var != null) {
                    obj3 = rbl1Var;
                    if (!kxt0Var.a) {
                        obj3 = null;
                    }
                } else {
                    obj3 = null;
                }
                iu30 iu30Var2 = (iu30) obj3;
                if (iu30Var2 == null) {
                    x340Var8.i0(1736174909);
                    Object objT14 = x340Var8.T();
                    if (objT14 == m4cVar3) {
                        objT14 = v5l1.Z0;
                        x340Var8.s0(objT14);
                    }
                    iu30Var2 = (iu30) objT14;
                    z = false;
                } else {
                    z = false;
                    x340Var8.i0(-1190937924);
                }
                x340Var8.r(z);
                iu30 iu30Var3 = iu30Var2;
                boolean zG6 = x340Var8.g(ven0Var3) | x340Var8.g(ven0Var4) | x340Var8.i(c9nVar) | x340Var8.i(ylvVar) | x340Var8.i(vbl1Var) | x340Var8.i(o0iVar2);
                Object objT15 = x340Var8.T();
                if (zG6 || objT15 == m4cVar3) {
                    rbl1 rbl1Var2 = new rbl1(c9nVar, vbl1Var, o0iVar2, ven0Var3, ven0Var4, ylvVar, (byte) 0);
                    x340Var8.s0(rbl1Var2);
                    objT15 = rbl1Var2;
                }
                if (kxt0Var == null || !kxt0Var.a) {
                    objT15 = null;
                }
                iu30 iu30Var4 = (iu30) objT15;
                if (iu30Var4 == null) {
                    x340Var8.i0(1736799869);
                    Object objT16 = x340Var8.T();
                    if (objT16 == m4cVar3) {
                        objT16 = v5l1.Y0;
                        x340Var8.s0(objT16);
                    }
                    iu30Var4 = (iu30) objT16;
                    z2 = false;
                } else {
                    z2 = false;
                    x340Var8.i0(-1190918043);
                }
                x340Var8.r(z2);
                iu30 iu30Var5 = iu30Var4;
                boolean zI4 = x340Var8.i(o0iVar2) | x340Var8.g(ven0Var2) | x340Var8.i(c9nVar) | x340Var8.i(ylvVar) | x340Var8.i(vbl1Var);
                Object objT17 = x340Var8.T();
                if (zI4 || objT17 == m4cVar3) {
                    tbl1Var = new tbl1(o0iVar2, c9nVar, vbl1Var, ven0Var2, ylvVar, (byte) 0);
                    x340Var8.s0(tbl1Var);
                } else {
                    tbl1Var = objT17;
                }
                if (kxt0Var == null || !kxt0Var.b) {
                    tbl1Var = null;
                }
                Function0 function9 = (Function0) tbl1Var;
                if (function9 == null) {
                    x340Var8.i0(1737593469);
                    Object objT18 = x340Var8.T();
                    if (objT18 == m4cVar3) {
                        objT18 = w3l1.i;
                        x340Var8.s0(objT18);
                    }
                    function9 = (Function0) objT18;
                    z3 = false;
                } else {
                    z3 = false;
                    x340Var8.i0(-1190897899);
                }
                x340Var8.r(z3);
                Function0 function10 = function9;
                boolean zI5 = x340Var8.i(o0iVar2) | x340Var8.g(ven0Var) | x340Var8.i(c9nVar) | x340Var8.i(ylvVar) | x340Var8.i(vbl1Var);
                Object objT19 = x340Var8.T();
                if (zI5 || objT19 == m4cVar3) {
                    tbl1Var2 = new tbl1(o0iVar2, c9nVar, vbl1Var, ven0Var, ylvVar, (byte) 1);
                    x340Var8.s0(tbl1Var2);
                } else {
                    tbl1Var2 = objT19;
                }
                if (kxt0Var == null || !kxt0Var.b) {
                    tbl1Var2 = null;
                }
                Function0 function11 = (Function0) tbl1Var2;
                if (function11 == null) {
                    x340Var8.i0(1738445597);
                    Object objT20 = x340Var8.T();
                    if (objT20 == m4cVar3) {
                        objT20 = w3l1.t;
                        x340Var8.s0(objT20);
                    }
                    function11 = (Function0) objT20;
                    z4 = false;
                } else {
                    z4 = false;
                    x340Var8.i0(-1190872209);
                }
                x340Var8.r(z4);
                a8o.t(cceVar, ybl1Var2, o0iVar2, zBooleanValue, zBooleanValue2, iIntValue5, iIntValue6, function5, function6, function7, function8, iu30Var3, iu30Var5, function10, function11, ylvVar, x340Var8, 512);
                x340Var8.r(true);
                Integer numValueOf = Integer.valueOf(((Number) ven0Var.getValue()).intValue());
                boolean zG7 = x340Var8.g(ven0Var);
                Object objT21 = x340Var8.T();
                if (zG7 || objT21 == m4cVar3) {
                    objT21 = new hj6(ven0Var, (lnm) null, (byte) 24);
                    x340Var8.s0(objT21);
                }
                qxd0.t(numValueOf, x340Var8, (vu30) objT21);
                Integer numValueOf2 = Integer.valueOf(((Number) ven0Var2.getValue()).intValue());
                boolean zG8 = x340Var8.g(ven0Var2);
                Object objT22 = x340Var8.T();
                if (zG8 || objT22 == m4cVar3) {
                    objT22 = new hj6(ven0Var2, (lnm) null, (byte) 25);
                    x340Var8.s0(objT22);
                }
                qxd0.t(numValueOf2, x340Var8, (vu30) objT22);
                boolean zI6 = x340Var8.i(vbl1Var) | x340Var8.i(o0iVar) | x340Var8.g(ybl1Var);
                Object objT23 = x340Var8.T();
                if (zI6 || objT23 == m4cVar3) {
                    objT23 = new jyi1(vbl1Var, o0iVar, ybl1Var, (byte) 12);
                    x340Var8.s0(objT23);
                }
                oto1.c(ybl1Var, o0iVar, (iu30) objT23, x340Var8, 64);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o06(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.t = obj9;
        this.X = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o06(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.t = obj9;
        this.X = obj10;
    }
}
