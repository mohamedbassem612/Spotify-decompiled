package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fx1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lz20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fx1(lz20 lz20Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = lz20Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new fx1(this.b, lnmVar, (byte) 0);
            case 1:
                return new fx1(this.b, lnmVar, (byte) 1);
            case 2:
                return new fx1(this.b, lnmVar, (byte) 2);
            case 3:
                return new fx1(this.b, lnmVar, (byte) 3);
            case 4:
                return new fx1(this.b, lnmVar, (byte) 4);
            case 5:
                return new fx1(this.b, lnmVar, (byte) 5);
            case 6:
                return new fx1(this.b, lnmVar, (byte) 6);
            case 7:
                return new fx1(this.b, lnmVar, (byte) 7);
            case 8:
                return new fx1(this.b, lnmVar, (byte) 8);
            case 9:
                return new fx1(this.b, lnmVar, (byte) 9);
            case 10:
                return new fx1(this.b, lnmVar, (byte) 10);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new fx1(this.b, lnmVar, (byte) 11);
            case grn1.d /* 12 */:
                return new fx1(this.b, lnmVar, (byte) 12);
            case 13:
                return new fx1(this.b, lnmVar, (byte) 13);
            default:
                return new fx1(this.b, lnmVar, (byte) 14);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 2:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 3:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 4:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 5:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 6:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 7:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 8:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 9:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 10:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case grn1.d /* 12 */:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 13:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lz20 lz20Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hm5.M(obj);
                lz20.b(lz20Var);
                break;
            case 1:
                hm5.M(obj);
                lz20.b(lz20Var);
                break;
            case 2:
                hm5.M(obj);
                lz20.b(lz20Var);
                break;
            case 3:
                hm5.M(obj);
                lz20.b(lz20Var);
                break;
            case 4:
                hm5.M(obj);
                lz20.b(lz20Var);
                break;
            case 5:
                hm5.M(obj);
                lz20.b(lz20Var);
                break;
            case 6:
                hm5.M(obj);
                lz20.b(lz20Var);
                break;
            case 7:
                hm5.M(obj);
                lz20.b(lz20Var);
                break;
            case 8:
                hm5.M(obj);
                lz20.b(lz20Var);
                break;
            case 9:
                hm5.M(obj);
                lz20.b(lz20Var);
                break;
            case 10:
                hm5.M(obj);
                lz20.b(lz20Var);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                hm5.M(obj);
                lz20.b(lz20Var);
                break;
            case grn1.d /* 12 */:
                hm5.M(obj);
                lz20.b(lz20Var);
                break;
            case 13:
                hm5.M(obj);
                lz20.b(lz20Var);
                break;
            default:
                hm5.M(obj);
                lz20.b(lz20Var);
                break;
        }
        return rih1Var;
    }
}
