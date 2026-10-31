package p;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nrf implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nrf(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        Object obj = this.c;
        Object obj2 = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Function0 function0 = (Function0) obj2;
                Object objD = rqd1.d(nav0Var, (iu30) null, function0 != null ? new vj0(function0, (byte) 16) : null, (xu30) null, new vj0((Function0) obj, (byte) 17), lnmVar, 5);
                return objD == d9nVar ? objD : rih1Var;
            case 1:
                Object objD2 = rqd1.d(nav0Var, (iu30) null, (iu30) null, (xu30) null, new shg((ven0) obj2, (iu30) obj, (byte) 1), lnmVar, 7);
                return objD2 == d9nVar ? objD2 : rih1Var;
            case 2:
                ame ameVar = new ame((iu30) obj2, (lax) obj, (byte) 16);
                j8d1 j8d1Var = (j8d1) nav0Var;
                j8d1Var.getClass();
                Object objD3 = s9p1.D(nav0Var, new xhg(oap1.B(j8d1Var).b1.g(), ameVar, (lnm) null), lnmVar);
                if (objD3 != d9nVar) {
                    objD3 = rih1Var;
                }
                return objD3 == d9nVar ? objD3 : rih1Var;
            case 3:
                Object objS = smo1.s(new sr1(nav0Var, (b4e1) obj2, (x6e1) obj, (lnm) null, (byte) 6), lnmVar);
                return objS == d9nVar ? objS : rih1Var;
            case 4:
                Object objD4 = s9p1.D(nav0Var, new mi6((es41) obj2, (View) obj, (lnm) null, (byte) 3), lnmVar);
                return objD4 == d9nVar ? objD4 : rih1Var;
            default:
                Object objH1 = ((j8d1) nav0Var).H1(new lhg(lnmVar.getContext(), (yo31) obj, ((sfg1) obj2).U0, (lnm) null, (byte) 7), lnmVar);
                if (objH1 != d9nVar) {
                    objH1 = rih1Var;
                }
                return objH1 == d9nVar ? objH1 : rih1Var;
        }
    }
}
