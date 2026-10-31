package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mia implements PointerInputEventHandler {
    public static final mia b = new mia(0);
    public static final mia c = new mia(1);
    public static final mia d = new mia(2);
    public static final mia e = new mia(3);
    public static final mia f = new mia(4);
    public static final mia g = new mia(5);
    public static final mia h = new mia(6);
    public static final mia i = new mia(7);
    public static final mia j = new mia(8);
    public static final mia k = new mia(9);
    public static final mia l = new mia(10);
    public static final mia m = new mia(11);
    public static final mia n = new mia(12);
    public static final mia o = new mia(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final mia f23p = new mia(14);
    public static final mia q = new mia(15);
    public static final mia r = new mia(16);
    public static final mia s = new mia(17);
    public final /* synthetic */ byte a;

    public /* synthetic */ mia(byte b2) {
        this.a = b2;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b2 = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Object objH1 = ((j8d1) nav0Var).H1(new lia(2, (lnm) null, (byte) 0), lnmVar);
                return objH1 == d9nVar ? objH1 : rih1Var;
            case 1:
                Object objH2 = ((j8d1) nav0Var).H1(new lia(2, (lnm) null, (byte) 1), lnmVar);
                return objH2 == d9nVar ? objH2 : rih1Var;
            case 2:
                Object objD = rqd1.d(nav0Var, (iu30) null, (iu30) null, (xu30) null, nve.R0, lnmVar, 7);
                return objD == d9nVar ? objD : rih1Var;
            case 3:
                Object objD2 = rqd1.d(nav0Var, (iu30) null, (iu30) null, (xu30) null, nve.S0, lnmVar, 7);
                return objD2 == d9nVar ? objD2 : rih1Var;
            case 4:
                return rih1Var;
            case 5:
                Object objH3 = ((j8d1) nav0Var).H1(new lia(2, (lnm) null, (byte) 2), lnmVar);
                return objH3 == d9nVar ? objH3 : rih1Var;
            case 6:
                Object objH4 = ((j8d1) nav0Var).H1(new lia(2, (lnm) null, (byte) 3), lnmVar);
                return objH4 == d9nVar ? objH4 : rih1Var;
            case 7:
            case 8:
                return rih1Var;
            case 9:
                Object objD3 = s9p1.D(nav0Var, new lia(2, (lnm) null, (byte) 4), lnmVar);
                return objD3 == d9nVar ? objD3 : rih1Var;
            case 10:
                Object objH5 = ((j8d1) nav0Var).H1(new lia(2, (lnm) null, (byte) 5), lnmVar);
                return objH5 == d9nVar ? objH5 : rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                Object objD4 = rqd1.d(nav0Var, (iu30) null, (iu30) null, (xu30) null, vc40.b1, lnmVar, 7);
                return objD4 == d9nVar ? objD4 : rih1Var;
            case grn1.d /* 12 */:
                Object objH6 = ((j8d1) nav0Var).H1(new lia(2, (lnm) null, (byte) 6), lnmVar);
                return objH6 == d9nVar ? objH6 : rih1Var;
            case 13:
                Object objH7 = ((j8d1) nav0Var).H1(new lia(2, (lnm) null, (byte) 8), lnmVar);
                return objH7 == d9nVar ? objH7 : rih1Var;
            case 14:
                Object objH8 = ((j8d1) nav0Var).H1(new lia(2, (lnm) null, (byte) 10), lnmVar);
                return objH8 == d9nVar ? objH8 : rih1Var;
            case 15:
                Object objD5 = s9p1.D(nav0Var, new lia(2, (lnm) null, (byte) 11), lnmVar);
                return objD5 == d9nVar ? objD5 : rih1Var;
            case 16:
            default:
                return rih1Var;
        }
    }
}
