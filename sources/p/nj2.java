package p;

import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.widgets.widgetstate.WidgetState;
import j$.time.Clock;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nj2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nj2(ta60 ta60Var, String str, af afVar, j2i j2iVar, int i, int i2) {
        super(2);
        this.a = (byte) 14;
        this.b = ta60Var;
        this.e = str;
        this.f = afVar;
        this.g = j2iVar;
        this.c = i;
        this.d = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        Object obj3 = this.b;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                fq7.k((String) obj6, (Function0) obj3, (Function0) obj5, (qim0) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 1:
                ((Number) obj2).intValue();
                sto1.a((wdm) obj6, (o0i) obj5, (ny7) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 2:
                ((Number) obj2).intValue();
                l3p1.k((Function0) obj3, (hux) obj5, (String) obj6, (qim0) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 3:
                ((Number) obj2).intValue();
                o6p1.b((String) obj6, (af5) obj3, (qim0) obj4, (xu30) obj5, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 4:
                ((Number) obj2).intValue();
                qon1.b((String) obj6, (String) obj3, (qim0) obj4, (Locale) obj5, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 5:
                ((Number) obj2).intValue();
                u4p1.d((x6r) obj6, (iu30) obj3, (qim0) obj4, (Clock) obj5, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 6:
                ((Number) obj2).intValue();
                ((div) obj3).f((WidgetState) obj5, (String) obj6, (String) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 7:
                ((Number) obj2).intValue();
                ((vqv) obj6).f((qim0) obj4, (vu30) obj3, (mmr0[]) obj5, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 8:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.d;
                Object obj7 = this.b;
                otw.c((maa) obj6, obj7, (qim0) obj4, (ipb1) obj5, (b0k) obj, iP, b2);
                break;
            case 9:
                ((Number) obj2).intValue();
                qim0 qim0Var = (qim0) obj4;
                int iP2 = czo1.p(i | 1);
                byte b3 = this.d;
                Object obj8 = this.b;
                otw.b((maa) obj6, obj8, (joa0) obj5, qim0Var, (b0k) obj, iP2, b3);
                break;
            case 10:
                ((Number) obj2).intValue();
                kno1.e((hw61) obj6, (j2i) obj3, (qim0) obj4, (j2i) obj5, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                too1.b((qim0) obj4, (xtb0) obj6, (vzq0) obj3, (iu30) obj5, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                shx.a((c380) obj6, (qim0) obj4, (hcx) obj3, (idn0) obj5, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 13:
                ((Number) obj2).intValue();
                gyo1.m((hx10) obj6, (iu30) obj3, (qim0) obj4, (iu30) obj5, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 14:
                ((Number) obj2).intValue();
                ulo1.b((ta60) obj3, (String) obj6, (af) obj5, (j2i) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 15:
                ((Number) obj2).intValue();
                g6p1.c((lik1) obj6, (a001) obj3, (idm) obj5, (qim0) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 16:
                ((Number) obj2).intValue();
                rrn1.s((eab1) obj6, (gw70) obj3, (iu30) obj5, (qim0) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            default:
                ((Number) obj2).intValue();
                ero1.f((rgi1) obj6, (Function0) obj3, (gw70) obj5, (qim0) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ nj2(Object obj, Object obj2, Object obj3, qim0 qim0Var, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.f = obj3;
        this.g = qim0Var;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ nj2(Object obj, Object obj2, qim0 qim0Var, Object obj3, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.g = qim0Var;
        this.f = obj3;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ nj2(Object obj, qim0 qim0Var, Object obj2, Object obj3, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.g = qim0Var;
        this.b = obj2;
        this.f = obj3;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nj2(wdm wdmVar, o0i o0iVar, ny7 ny7Var, Function0 function0, int i, int i2) {
        super(2);
        this.a = (byte) 1;
        this.e = wdmVar;
        this.f = o0iVar;
        this.g = ny7Var;
        this.b = function0;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ nj2(Object obj, Parcelable parcelable, String str, Object obj2, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.f = parcelable;
        this.e = str;
        this.g = obj2;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nj2(qim0 qim0Var, xtb0 xtb0Var, vzq0 vzq0Var, iu30 iu30Var, int i, int i2) {
        super(2);
        this.a = (byte) 11;
        this.g = qim0Var;
        this.e = xtb0Var;
        this.b = vzq0Var;
        this.f = iu30Var;
        this.c = i;
        this.d = i2;
    }
}
