package p;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class fsb0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fsb0(vu30 vu30Var, uim uimVar, xu30 xu30Var, Function0 function0) {
        this.a = (byte) 1;
        this.b = vu30Var;
        this.c = uimVar;
        this.d = xu30Var;
        this.e = function0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        tsb0 tsb0Var;
        qim0 qim0VarThen;
        Object obj4;
        Object k95Var;
        qim0 qim0VarS;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                tsb0 tsb0Var2 = (tsb0) obj8;
                qim0 qim0Var = (qim0) obj7;
                hsb0 hsb0Var = (hsb0) obj6;
                ven0 ven0Var = (ven0) obj5;
                kd41 kd41Var = (kd41) obj;
                ((Integer) obj3).getClass();
                x340 x340Var = (b0k) obj2;
                Object objT = x340Var.T();
                Object obj9 = fkj0.X;
                if (objT == obj9) {
                    objT = new dsb0(kd41Var, new e45(ven0Var, (byte) 7));
                    x340Var.s0(objT);
                }
                dsb0 dsb0Var = (dsb0) objT;
                Object objT2 = x340Var.T();
                if (objT2 == obj9) {
                    objT2 = new slc1(new ye90(dsb0Var));
                    x340Var.s0(objT2);
                }
                slc1 slc1Var = (slc1) objT2;
                if (tsb0Var2 != null) {
                    x340Var.i0(1743490539);
                    x340Var.i0(887527095);
                    String str = Build.FINGERPRINT;
                    if (str == null || !str.equals("robolectric")) {
                        x340Var.i0(1345729441);
                        View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
                        boolean zG = x340Var.g(view);
                        Object objT3 = x340Var.T();
                        if (zG || objT3 == obj9) {
                            Object tag = view.getTag(2131428152);
                            mov0 ty4Var = tag instanceof mov0 ? (mov0) tag : null;
                            if (ty4Var == null) {
                                ty4Var = new ty4(view);
                                view.setTag(2131428152, ty4Var);
                            }
                            objT3 = ty4Var;
                            x340Var.s0(objT3);
                        }
                        obj4 = (mov0) objT3;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1345548711);
                        Object objT4 = x340Var.T();
                        if (objT4 == obj9) {
                            objT4 = new nov0();
                            x340Var.s0(objT4);
                        }
                        obj4 = (nov0) objT4;
                        x340Var.r(false);
                    }
                    Object obj10 = obj4;
                    x340Var.r(false);
                    Object[] objArr = {tsb0Var2, dsb0Var, slc1Var, obj10};
                    boolean zG2 = x340Var.g(tsb0Var2) | x340Var.i(dsb0Var) | x340Var.i(slc1Var) | x340Var.i(obj10);
                    Object objT5 = x340Var.T();
                    if (zG2 || objT5 == obj9) {
                        tsb0Var = tsb0Var2;
                        k95Var = new k95((Object) tsb0Var, (Object) dsb0Var, (Object) slc1Var, obj10, (byte) 5);
                        x340Var.s0(k95Var);
                    } else {
                        k95Var = objT5;
                        tsb0Var = tsb0Var2;
                    }
                    qxd0.j(objArr, (iu30) k95Var, x340Var);
                    x340Var.r(false);
                } else {
                    tsb0Var = tsb0Var2;
                    x340Var.i0(1744076749);
                    x340Var.r(false);
                }
                int i = usb0.a;
                if (tsb0Var != null && (qim0VarThen = qim0Var.then(new epg1(tsb0Var))) != null) {
                    qim0Var = qim0VarThen;
                }
                boolean zG3 = x340Var.g(dsb0Var) | x340Var.g(hsb0Var);
                Object objT6 = x340Var.T();
                if (zG3 || objT6 == obj9) {
                    objT6 = new f14(dsb0Var, hsb0Var, (byte) 18);
                    x340Var.s0(objT6);
                }
                ejo1.m(slc1Var, qim0Var, (vu30) objT6, x340Var, 8);
                return rih1Var;
            case 1:
                vu30 vu30Var = (vu30) obj8;
                uim uimVar = (uim) obj7;
                xu30 xu30Var = (xu30) obj6;
                Function0 function0 = (Function0) obj5;
                mdm mdmVar = (mdm) obj;
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var2.g(mdmVar) ? 4 : 2;
                }
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String str2 = (String) vu30Var.invoke(x340Var3, 0);
                    if (ihc1.y0(str2)) {
                        tf80.c("Label must not be blank");
                    }
                    uimVar.getClass();
                    rwq.a.K(nim0.a, str2, Boolean.TRUE, mdmVar, xu30Var, function0, x340Var3, Integer.valueOf((iIntValue << 9) & 7168));
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            default:
                n6a1 n6a1Var = (Brush) obj8;
                r1c0 r1c0Var = (r1c0) obj7;
                c8e1 c8e1Var = (c8e1) obj6;
                hyp0 hyp0Var = (hyp0) obj5;
                qim0 qim0Var2 = (qim0) obj;
                ((Integer) obj3).getClass();
                m4c m4cVar = fkj0.X;
                x340 x340Var4 = (b0k) obj2;
                x340Var4.i0(-84507373);
                boolean zBooleanValue = ((Boolean) x340Var4.k(t4k.y)).booleanValue();
                boolean zH = x340Var4.h(zBooleanValue);
                Object objT7 = x340Var4.T();
                if (zH || objT7 == m4cVar) {
                    objT7 = new qoo(zBooleanValue);
                    x340Var4.s0(objT7);
                }
                qoo qooVar = (qoo) objT7;
                if ((n6a1Var instanceof n6a1) && n6a1Var.a == 16) {
                    z = false;
                }
                if (((crl1) x340Var4.k(t4k.u)).b() && r1c0Var.b() && nbe1.d(c8e1Var.b) && z) {
                    x340Var4.i0(-707487962);
                    af5 af5Var = c8e1Var.a;
                    nbe1 nbe1Var = new nbe1(c8e1Var.b);
                    boolean zI = x340Var4.i(qooVar);
                    Object objT8 = x340Var4.T();
                    if (zI || objT8 == m4cVar) {
                        objT8 = new xba1(qooVar, (lnm) null, (byte) 24);
                        x340Var4.s0(objT8);
                    }
                    qxd0.s(af5Var, nbe1Var, (vu30) objT8, x340Var4);
                    boolean zI2 = x340Var4.i(qooVar) | x340Var4.i(hyp0Var) | x340Var4.g(c8e1Var) | x340Var4.i(r1c0Var) | x340Var4.g(n6a1Var);
                    Object objT9 = x340Var4.T();
                    if (zI2 || objT9 == m4cVar) {
                        kl4 kl4Var = new kl4(qooVar, hyp0Var, c8e1Var, r1c0Var, n6a1Var);
                        x340Var4.s0(kl4Var);
                        objT9 = kl4Var;
                    }
                    qim0VarS = exd0.s(qim0Var2, (iu30) objT9);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(-705473241);
                    x340Var4.r(false);
                    qim0VarS = nim0.a;
                }
                x340Var4.r(false);
                return qim0VarS;
        }
    }

    public /* synthetic */ fsb0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
