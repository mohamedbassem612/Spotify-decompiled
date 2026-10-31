package p;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r7e0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7e0(Object obj, Object obj2, boolean z, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        float f;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zno1.b(0, h7w.A((a6q0) obj4, (Context) obj3), x340Var2, (qim0) null, z);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                gef0 gef0Var = (gef0) obj;
                tef0 tef0Var = (tef0) obj2;
                if (tef0Var.equals(tef0.j)) {
                    tef0Var = new tef0(gef0Var.a, gef0Var.b, gef0Var.c, gef0Var.d, gef0Var.e, gef0Var.f, ((eof0) obj4).a.a(), false, z ? (String) ((sqs0) obj3).b.getValue() : null);
                }
                return First.b(tef0Var);
            case 2:
                ((Number) obj2).intValue();
                u7n0.m(z, (r9u0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                kln1.b((eyr0) obj4, (wxr0) obj3, z, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pk1 pk1Var = new pk1(((fwg0) obj4).o ? qk1.b : qk1.a, false, (String) null, (String) null, z ? rk1.c : tk1.c, 14);
                    boolean zG = x340Var4.g(iu30Var);
                    Object objT = x340Var4.T();
                    if (zG || objT == fkj0.X) {
                        objT = new ebg0(iu30Var, (byte) 5);
                        x340Var4.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    if (ihc1.y0("Toggle save")) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    h7p1.a(pk1Var, new gbx(new y50("Toggle save"), function0), anm1.N("marquee_save_button", u291.r(uyn1.B(nim0.a, 16.0f, 0.0f, 0.0f, 0.0f, 14), 48.0f)), null, null, x340Var4, 0, 24);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                k4m k4mVar = (k4m) obj3;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qim0 qim0VarB = uyn1.B((qim0) obj4, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                    if (z) {
                        x340Var6.i0(1015635721);
                        uwr uwrVar = cbx.a;
                        zov0 zov0Var = cbx.b(x340Var6).g;
                        x340Var6.r(false);
                        f = 16.0f;
                    } else {
                        x340Var6.i0(1015699240);
                        uwr uwrVar2 = cbx.a;
                        zov0 zov0Var2 = cbx.b(x340Var6).g;
                        x340Var6.r(false);
                        f = 12.0f;
                    }
                    qim0 qim0VarR = u291.r(qim0VarB, f * ((Configuration) x340Var6.k(AndroidCompositionLocals_androidKt.a)).fontScale);
                    boolean zE = x340Var6.e(k4mVar.ordinal());
                    Object objT2 = x340Var6.T();
                    if (zE || objT2 == fkj0.X) {
                        objT2 = new q2c(k4mVar, (byte) 1);
                        x340Var6.s0(objT2);
                    }
                    dm5.a((iu30) objT2, qim0VarR, (iu30) null, x340Var6, 0, 4);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ((pek0) obj4).d(z, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                sgc1.m(z, (j2i) obj4, (j2i) obj3, (b0k) obj, czo1.p(433));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                j0o1.a(z, (vtp) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                epo1.v((b180) obj4, z, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                ((leq0) obj4).e(z, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                vrq0.c((zuq0) obj4, z, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                zqo1.i((kis0) obj4, z, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                rwo1.g((a3t0) obj4, z, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                zxo1.l((a9t0) obj4, z, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                w2g0.j((r3g0) obj4, z, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                dio1.i((h4z0) obj4, z, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                kuy kuyVar = (kuy) obj3;
                iez0 iez0Var = (iez0) obj4;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    bez0 bez0Var = iez0Var.a;
                    if (bez0Var == null) {
                        x340Var8.i0(667726003);
                        x340Var8.r(false);
                    } else {
                        x340Var8.i0(667726004);
                        x340Var8.i0(1684108703);
                        Iterator it = bez0Var.b.iterator();
                        while (it.hasNext()) {
                            kuyVar.h(iez0Var, (aez0) it.next(), x340Var8, 0);
                        }
                        x340Var8.r(false);
                        kuyVar.e(bez0Var, x340Var8, 0);
                        x340Var8.r(false);
                    }
                    if (z) {
                        x340Var8.i0(667928527);
                        kuyVar.f((xpw) ((ynb0) kuyVar.g).get(), x340Var8, 0);
                        x340Var8.r(false);
                    } else {
                        x340Var8.i0(667981382);
                        x340Var8.r(false);
                    }
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    rqo1.n((o501) obj4, this.b, false, false, (e601) obj3, x340Var10, 0, 12);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                ((m601) obj4).e(z, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                int iIntValue6 = ((Number) obj).intValue();
                int iIntValue7 = ((Number) obj2).intValue();
                qb01 qb01Var = (qb01) obj4;
                boolean z2 = qb01Var.f;
                if (z2) {
                    qb01Var.b(new jb01(qb01Var, iIntValue6, iIntValue7, (lnm) null));
                } else {
                    String str = (String) obj3;
                    boolean z3 = !z;
                    if (z2) {
                        Logger.k("[ReadReporting] session already started — ignoring", new Object[0]);
                    } else {
                        qb01Var.f = true;
                        bbc bbcVarA = mno1.a(Integer.MAX_VALUE, 0, 6);
                        qb01Var.e = bbcVarA;
                        fn31.T(qb01Var.d, (o8n) null, 0, new ian0(bbcVarA, (lnm) null, (byte) 25), 3);
                        qb01Var.b.a(qb01Var);
                        qb01Var.b(new lb01(qb01Var, str, iIntValue6, iIntValue7, z3, (lnm) null));
                    }
                }
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                lq01.a((x47) obj4, z, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                x340 x340Var11 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    jmb1 jmb1Var = (jmb1) obj4;
                    c380 c380Var = (c380) obj3;
                    if (k4p1.w(jmb1Var.o) && z) {
                        x340Var12.i0(705463798);
                        String strO0 = cwl1.o0(x340Var12, 2131961047);
                        cjc0 cjc0Var = new cjc0(1);
                        uwr uwrVar3 = cbx.a;
                        uwo1.e(strO0, null, cbx.d(x340Var12).j, cbx.a(x340Var12).b.e, null, null, 0, false, cjc0Var, 0, null, x340Var12, 0, 0, 1778);
                        x340Var12.r(false);
                    } else {
                        x340Var12.i0(-669968658);
                        u4p1.v(8, x340Var12, c380Var, !u890.j(jmb1Var.i, j6u.a));
                        x340Var12.r(false);
                    }
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                ((yla) obj4).j(czo1.p(1), (b0k) obj, (qim0) obj3, z);
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                vzn1.g((x5q0) obj4, z, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                x340 x340Var13 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ((pt) obj4).g(0, x340Var14, (qim0) obj3, z);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                ucp1.g((y5q0) obj4, z, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                dro.r(z, (iu30) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                ((ze21) obj4).l(czo1.p(1), (b0k) obj, (qim0) obj3, z);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                up30.b((atb1) obj4, (qim0) obj3, z, (b0k) obj, czo1.p(9));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7e0(Object obj, Object obj2, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7e0(Object obj, boolean z, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7e0(Object obj, boolean z, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7e0(boolean z, Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
