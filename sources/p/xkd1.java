package p;

import android.view.View;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xkd1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zkd1 b;

    public /* synthetic */ xkd1(zkd1 zkd1Var, byte b) {
        this.a = b;
        this.b = zkd1Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zkd1 zkd1Var = this.b;
        switch (b) {
            case 0:
                ContextTrack contextTrack = (ContextTrack) obj;
                contextTrack.getClass();
                String strB0 = l4o1.b0(contextTrack);
                dtw dtwVar = zkd1Var.E1;
                if (dtwVar == null) {
                    u890.C("audioVideoTransitionViewHolder");
                    throw null;
                }
                dtwVar.f(new k68(strB0));
                dtw dtwVar2 = zkd1Var.C1;
                if (dtwVar2 != null) {
                    dtwVar2.f(new nof1(contextTrack.uri(), l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_POINTER_URI)));
                }
                dtw dtwVar3 = zkd1Var.F1;
                if (dtwVar3 == null) {
                    u890.C("fullEntityButtonViewHolder");
                    throw null;
                }
                dtwVar3.f(new xsy(strB0, true));
                dtw dtwVar4 = zkd1Var.G1;
                if (dtwVar4 == null) {
                    u890.C("artworkVH");
                    throw null;
                }
                String strO = l4o1.o(contextTrack);
                if (strO == null && (strO = l4o1.s(contextTrack)) == null) {
                    strO = "";
                }
                dtwVar4.f(new x27(strB0, strO));
                return rih1Var;
            default:
                nwq0 nwq0Var = (nwq0) obj;
                View view = zkd1Var.A1;
                if (view != null) {
                    view.setVisibility(nwq0Var == nwq0.b ? 0 : 8);
                    return rih1Var;
                }
                u890.C("immersiveVideoOverlayUiContainer");
                throw null;
        }
    }
}
