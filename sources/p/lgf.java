package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lgf implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ az20 b;

    public /* synthetic */ lgf(az20 az20Var, byte b) {
        this.a = b;
        this.b = az20Var;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        az20 az20Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Object objD = rqd1.d(nav0Var, (iu30) null, (iu30) null, (xu30) null, new wt3(az20Var, (byte) 3), lnmVar, 7);
                return objD == d9nVar ? objD : rih1Var;
            default:
                Object objD2 = s9p1.D(nav0Var, new zd4(az20Var, (lnm) null, (byte) 3), lnmVar);
                return objD2 == d9nVar ? objD2 : rih1Var;
        }
    }
}
