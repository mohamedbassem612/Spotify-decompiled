package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.idj.v1.BodySection;
import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vqd0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqd0(r4k0 r4k0Var, s5k0 s5k0Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 26;
        this.d = r4k0Var;
        this.e = s5k0Var;
        this.b = iu30Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((haa0) obj5).a((h8a) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                d3p1.o((wx60) obj5, (iu30) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                d3p1.r((String) obj5, (lb50) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 3:
                p9p1.n((ine0) obj5, (iu30) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 4:
                ((y1f0) obj5).i((vzg1) obj4, (iu30) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 5:
                ((a2f0) obj5).i((vzg1) obj4, (iu30) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 6:
                ((g9f0) obj5).c((e9f0) obj4, (iu30) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 7:
                b2u.f((ebf0) obj5, (iu30) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 8:
                bof0.d((kw9) obj5, (qim0) obj3, (String) obj4, b0kVar, czo1.p(i | 1));
                break;
            case 9:
                bof0.e((vef0) obj5, (String) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 10:
                int iP = czo1.p(i | 1);
                int i2 = MainLayoutContentContainerView.W0;
                ((MainLayoutContentContainerView) obj5).C((gzf0) obj4, (j2i) obj3, b0kVar, iP);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((j0g0) obj5).a((v0g0) obj4, (j6r0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case grn1.d /* 12 */:
                cgj1.e((String) obj5, (xpw) obj4, obj3, b0kVar, czo1.p(i | 1));
                break;
            case 13:
                ((j2e0) obj5).a((kvv) obj4, (iu30) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 14:
                ((z6g0) obj5).c((iu30) obj4, (j2i) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 15:
                lnn1.b((vzq0) obj5, (umf0) obj4, (String) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 16:
                rjo1.e((smh0) obj5, (qim0) obj3, (iu30) obj4, b0kVar, czo1.p(i | 1));
                break;
            case 17:
                rjo1.i((rmh0) obj5, (iu30) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 18:
                ((k8i0) obj5).c((u5i0) obj4, (iu30) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 19:
                pno1.b((p8i0) obj5, (iu30) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                tro1.f((r281) obj5, (Function0) obj4, (Function0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 21:
                kto1.a((joi0) obj5, (iu30) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 22:
                buo1.i((jri0) obj5, (Function0) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 23:
                gyo1.v((scj0) obj5, (iu30) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 24:
                m0p1.j((BodySection) obj5, (Function0) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 25:
                ((utj0) obj5).e((ttj0) obj4, (iu30) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 26:
                ((r4k0) obj5).d((s5k0) obj4, (iu30) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 27:
                ((pek0) obj5).f((zgk0) obj4, (iu30) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 28:
                ((wik0) obj5).g((kak0) obj4, (ihh1) obj3, b0kVar, czo1.p(i | 1));
                break;
            default:
                ((wik0) obj5).j((kak0) obj4, (t4h1) obj3, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vqd0(Object obj, Object obj2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = qim0Var;
        this.e = obj2;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vqd0(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqd0(pek0 pek0Var, zgk0 zgk0Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 27;
        this.d = pek0Var;
        this.e = zgk0Var;
        this.b = iu30Var;
        this.c = i;
    }
}
