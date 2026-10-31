package p;

import android.os.Bundle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nbf0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbf0(int i, str0 str0Var, iu30 iu30Var) {
        super(2);
        this.a = (byte) 27;
        this.b = i;
        this.c = str0Var;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                s110.b((ld5) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                bof0.g((vef0) obj4, (String) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                ot11.d((bff0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                ha71.c((qvf0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                int i2 = MainLayoutContentContainerView.W0;
                ((MainLayoutContentContainerView) obj4).y((gzf0) obj3, (b0k) obj, iP);
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                cgj1.f((String) obj4, (bzf0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 6:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j2i j2iVar = ((cjc1) obj4).a;
                    w0h1.o(3, j2iVar);
                    j2iVar.invoke((qm70) obj3, x340Var2, Integer.valueOf((i >> 6) & 8));
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                ftg0.d((String) obj4, (ctg0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 8:
                return ((lxh0) obj).r(i, (Bundle) obj3, (String) obj2, (String) obj4);
            case 9:
                ((Number) obj2).intValue();
                ((k8i0) obj4).g((qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                m0p1.g((c380) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                ((exj0) obj4).e((iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                a4p1.a((lhg1) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                ((cm0) obj4).g((ehm0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                ((o2n0) obj4).f((l2n0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                ((qlb) obj4).j((v2n0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                i541.f((j3n0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                ((jd6) obj4).h((i4n0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                ((qlb) obj4).k((p4n0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                ((b6n0) obj4).g((s5n0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                ((b6n0) obj4).j((String) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                ((f2o0) obj4).f((String) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                y3o1.d((cbo0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                poo1.l((l6p0) obj4, (umf0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                rc2.f((q0q0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                ((ahi0) obj4).h((g5r0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                rzn1.h((bcb0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 27:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                m4c m4cVar = fkj0.X;
                str0 str0Var = (str0) obj4;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var4, i);
                    boolean zI = x340Var4.i(str0Var);
                    Object objT = x340Var4.T();
                    if (zI || objT == m4cVar) {
                        objT = new ltr0(str0Var, (byte) 0);
                        x340Var4.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    boolean zG = x340Var4.g(iu30Var);
                    Object objT2 = x340Var4.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new dgq0(iu30Var, (byte) 23);
                        x340Var4.s0(objT2);
                    }
                    sio1.j(0, strO0, function0, (Function0) objT2, x340Var4, null);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                kno1.d((h7s0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                wro1.x((cns0) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nbf0(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbf0(String str, int i, Bundle bundle) {
        super(2);
        this.a = (byte) 8;
        this.c = str;
        this.b = i;
        this.d = bundle;
    }
}
