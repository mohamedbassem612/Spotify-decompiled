package p;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.mobius.functions.Consumer;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m9l1 extends hab0 implements vu30 {
    public final /* synthetic */ dbp N0;
    public final /* synthetic */ hcl1 O0;
    public final /* synthetic */ m0t P0;
    public final /* synthetic */ hcl1 Q0;
    public final /* synthetic */ bcl1 R0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ Consumer Y;
    public final /* synthetic */ fq10 Z;
    public final /* synthetic */ ven0 a;
    public final /* synthetic */ xhl b;
    public final /* synthetic */ su c;
    public final /* synthetic */ n8l1 d;
    public final /* synthetic */ abu e;
    public final /* synthetic */ qau f;
    public final /* synthetic */ fbp g;
    public final /* synthetic */ cce h;
    public final /* synthetic */ q9l1 i;
    public final /* synthetic */ q9l1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9l1(ven0 ven0Var, xhl xhlVar, su suVar, n8l1 n8l1Var, abu abuVar, qau qauVar, fbp fbpVar, cce cceVar, q9l1 q9l1Var, q9l1 q9l1Var2, boolean z, Consumer consumer, fq10 fq10Var, dbp dbpVar, hcl1 hcl1Var, m0t m0tVar, hcl1 hcl1Var2, bcl1 bcl1Var) {
        super(2);
        this.a = ven0Var;
        this.b = xhlVar;
        this.c = suVar;
        this.d = n8l1Var;
        this.e = abuVar;
        this.f = qauVar;
        this.g = fbpVar;
        this.h = cceVar;
        this.i = q9l1Var;
        this.t = q9l1Var2;
        this.X = z;
        this.Y = consumer;
        this.Z = fq10Var;
        this.N0 = dbpVar;
        this.O0 = hcl1Var;
        this.P0 = m0tVar;
        this.Q0 = hcl1Var2;
        this.R0 = bcl1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i;
        cce cceVar;
        iu30 iu30Var;
        cce cceVar2;
        cbq0 cbq0Var;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        Object obj3 = fkj0.X;
        int i2 = iIntValue & 11;
        rih1 rih1Var = rih1.a;
        if (i2 == 2) {
            x340 x340Var2 = x340Var;
            if (x340Var2.H()) {
                x340Var2.b0();
                return rih1Var;
            }
        }
        this.a.setValue(rih1Var);
        xhl xhlVar = this.b;
        int i3 = ((uhl) xhlVar).b;
        xhlVar.m();
        x340 x340Var3 = x340Var;
        x340Var3.i0(-380672431);
        n8l1 n8l1Var = this.d;
        bpb1 bpb1Var = n8l1Var.h;
        k8l1 k8l1Var = n8l1Var.g;
        ven0 ven0VarH = rwq.h(bpb1Var, x340Var3, 0);
        abu abuVar = this.e;
        boolean zY = sbl.y(abuVar);
        qau qauVar = this.f;
        s9l1 s9l1Var = qauVar.g;
        List list = s9l1Var != null ? s9l1Var.b : z6x.a;
        boolean zG = x340Var3.g(qauVar) | x340Var3.g((m8l1) ven0VarH.getValue()) | x340Var3.h(zY);
        Object objT = x340Var3.T();
        if (zG || objT == obj3) {
            objT = new jjr0(mqo1.A(list), qauVar.b, s9l1Var != null && s9l1Var.i, s9l1Var != null && s9l1Var.h, zY, ((m8l1) ven0VarH.getValue()).a, ((m8l1) ven0VarH.getValue()).b, ((m8l1) ven0VarH.getValue()).c, zY);
            x340Var3.s0(objT);
        }
        jjr0 jjr0Var = (jjr0) objT;
        Object objT2 = x340Var3.T();
        if (objT2 == obj3) {
            i = 0;
            objT2 = bb00.h(0, x340Var3);
        } else {
            i = 0;
        }
        err0 err0Var = (hdn0) objT2;
        err0Var.t(jjr0Var.a.size());
        Object objT3 = x340Var3.T();
        if (objT3 == obj3) {
            Integer num = jjr0Var.b;
            int iIntValue2 = num != null ? num.intValue() : i;
            if (iIntValue2 < 0) {
                iIntValue2 = i;
            }
            xh6 xh6Var = new xh6(err0Var, (byte) 7);
            kkr0 kkr0Var = lkr0.a;
            kes kesVar = new kes(iIntValue2, 0.0f, xh6Var);
            x340Var3.s0(kesVar);
            objT3 = kesVar;
        }
        jkr0 jkr0Var = (jkr0) objT3;
        boolean zG2 = x340Var3.g(k8l1Var);
        Object objT4 = x340Var3.T();
        if (zG2 || objT4 == obj3) {
            objT4 = new akr0(k8l1Var.a, k8l1Var.b, k8l1Var.c);
            x340Var3.s0(objT4);
        }
        akr0 akr0Var = (akr0) objT4;
        fq10 fq10Var = this.Z;
        boolean zI = x340Var3.i(fq10Var);
        Object objT5 = x340Var3.T();
        if (zI || objT5 == obj3) {
            objT5 = new bkk1(fq10Var, (byte) 10);
            x340Var3.s0(objT5);
        }
        fbp fbpVar = this.g;
        cce cceVar3 = this.h;
        brl.k(fbpVar, cceVar3, this.i, this.t, jkr0Var, jjr0Var, akr0Var, this.X, this.Y, (Function0) objT5, (qim0) null, x340Var3, 0);
        x340 x340Var4 = x340Var3;
        if (abuVar.b()) {
            cceVar = cceVar3;
            iu30Var = null;
            x340Var4.i0(-378446167);
            x340Var4.r(false);
        } else {
            x340Var4.i0(-378707559);
            iu30Var = null;
            sok.e(this.N0, this.O0, cceVar3, this.i, this.t, this.Y, this.X, s9l1Var != null ? s9l1Var.a : null, (qim0) null, x340Var4, 0);
            cceVar = cceVar3;
            x340Var4 = x340Var4;
            x340Var4.r(false);
        }
        Context context = (Context) x340Var4.k(AndroidCompositionLocals_androidKt.b);
        Object objT6 = x340Var4.T();
        if (objT6 == obj3) {
            objT6 = (AccessibilityManager) context.getSystemService(AccessibilityManager.class);
            x340Var4.s0(objT6);
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) objT6;
        x340 x340Var5 = x340Var4;
        ven0 ven0VarG = rwq.g(accessibilityManager != null ? h4p1.f(new jh(accessibilityManager, iu30Var, (byte) 0)) : new huz(Boolean.FALSE, (byte) 10), Boolean.FALSE, (o8n) null, x340Var5, 48, 2);
        x340 x340Var6 = x340Var5;
        boolean z = qauVar.X && list.size() > 1 && !((Boolean) ven0VarG.getValue()).booleanValue();
        Boolean boolValueOf = Boolean.valueOf(z);
        q9l1 q9l1Var = this.t;
        boolean zI2 = x340Var6.i(q9l1Var) | x340Var6.h(z);
        Object objT7 = x340Var6.T();
        if (zI2 || objT7 == obj3) {
            objT7 = new fkj1(q9l1Var, z, (lnm) iu30Var);
            x340Var6.s0(objT7);
        }
        qxd0.t(boolValueOf, x340Var6, (vu30) objT7);
        if (z) {
            x340Var6.i0(-377886989);
            iu30 iu30Var2 = (s9l1Var == null || (cbq0Var = s9l1Var.f) == null) ? iu30Var : cbq0Var.a;
            if (iu30Var2 == null) {
                x340Var6.i0(-377793959);
                x340Var6.r(false);
            } else {
                x340Var6.i0(-377793958);
                sok.g(this.i, this.R0, this.Y, iu30Var2, (qim0) null, x340Var6, 0);
                x340Var6.r(false);
            }
            x340Var6.r(false);
        } else {
            x340Var6.i0(-377681335);
            x340Var6.r(false);
        }
        if (((Boolean) ven0VarG.getValue()).booleanValue()) {
            x340Var6.i0(-377602564);
            thl thlVarD = xhlVar.d(dsa0.m(x340Var6, 2131167207));
            ihl ihlVarK = xhlVar.k();
            boolean zI3 = x340Var6.i(thlVarD);
            Object objT8 = x340Var6.T();
            if (zI3 || objT8 == obj3) {
                objT8 = new iih(thlVarD, (byte) 1);
                x340Var6.s0(objT8);
            }
            guo1.b(this.P0, jkr0Var, n8l1Var, this.Y, xhl.j(nim0.a, ihlVarK, (iu30) objT8), x340Var6, 0);
            x340Var6.r(false);
        } else {
            x340Var6.i0(-377067287);
            x340Var6.r(false);
        }
        l8l1 l8l1Var = ((m8l1) ven0VarH.getValue()).d;
        if (l8l1Var == null) {
            x340Var6.i0(-376911668);
            x340Var6.r(false);
            cceVar2 = cceVar;
        } else {
            x340Var6.i0(-376911667);
            vy71 vy71VarF = dem0.f(6, 2, x340Var6, iu30Var, true);
            iu30 iu30Var3 = l8l1Var.a;
            iu30 iu30Var4 = iu30Var3 instanceof jy81 ? (jy81) iu30Var3 : iu30Var;
            iu30 iu30Var5 = iu30Var4 != null ? iu30Var4.a : iu30Var;
            boolean z2 = l8l1Var.b;
            hcl1 hcl1Var = this.O0;
            boolean zI4 = x340Var6.i(hcl1Var);
            Object objT9 = x340Var6.T();
            if (zI4 || objT9 == obj3) {
                objT9 = new bkk1(hcl1Var, (byte) 11);
                x340Var6.s0(objT9);
            }
            cce cceVar4 = cceVar;
            mod.e(cceVar4, this.N0, vy71VarF, z2, iu30Var3, iu30Var5, (Function0) objT9, (qim0) null, x340Var6, 0);
            cceVar2 = cceVar4;
            x340Var6 = x340Var6;
            boolean zI5 = x340Var6.i(hcl1Var);
            Object objT10 = x340Var6.T();
            if (zI5 || objT10 == obj3) {
                objT10 = new tak1(hcl1Var, (byte) 16);
                x340Var6.s0(objT10);
            }
            qxd0.i(rih1Var, (iu30) objT10, x340Var6);
            x340Var6.r(false);
        }
        if (((Boolean) ven0VarG.getValue()).booleanValue()) {
            x340Var6.i0(-375959223);
            x340Var6.r(false);
        } else {
            x340Var6.i0(-376287885);
            sok.a(this.Q0, iu30Var, x340Var6, 0);
            anm1.d(k8l1Var.d, iu30Var, x340Var6, 0);
            x340Var6.r(false);
        }
        zno1.c(this.P0, iu30Var, x340Var6, 0);
        x340 x340Var7 = x340Var6;
        mym.f(k8l1Var.e, cceVar2, this.N0, (qim0) null, x340Var7, 0);
        x340Var7.r(false);
        if (((uhl) xhlVar).b != i3) {
            qxd0.S(this.c, x340Var7);
        }
        return rih1Var;
    }
}
