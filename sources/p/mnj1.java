package p;

import android.view.View;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mnj1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pnj1 b;

    public /* synthetic */ mnj1(pnj1 pnj1Var, byte b) {
        this.a = b;
        this.b = pnj1Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pnj1 pnj1Var = this.b;
        switch (b) {
            case 0:
                ContextTrack contextTrack = (ContextTrack) obj;
                dtw dtwVar = pnj1Var.o2;
                if (dtwVar != null) {
                    dtwVar.f(new jpx0(contextTrack));
                    return rih1Var;
                }
                u890.C("promotionalIndicatorViewHolder");
                throw null;
            case 1:
                ContextTrack contextTrack2 = (ContextTrack) obj;
                contextTrack2.getClass();
                String strB0 = l4o1.b0(contextTrack2);
                dtw dtwVar2 = pnj1Var.d2;
                if (dtwVar2 != null) {
                    dtwVar2.f(new k68(strB0));
                }
                dtw dtwVar3 = pnj1Var.a2;
                if (dtwVar3 == null) {
                    u890.C("trackInfoVH");
                    throw null;
                }
                dtwVar3.f(new nof1(contextTrack2.uri(), l4o1.a0(contextTrack2, ContextTrack$Metadata.KEY_POINTER_URI)));
                dtw dtwVar4 = pnj1Var.e2;
                if (dtwVar4 != null) {
                    dtwVar4.f(new xsy(strB0, true));
                }
                dtw dtwVar5 = pnj1Var.c2;
                if (dtwVar5 != null) {
                    String strO = l4o1.o(contextTrack2);
                    if (strO == null && (strO = l4o1.s(contextTrack2)) == null) {
                        strO = "";
                    }
                    dtwVar5.f(new x27(strB0, strO));
                }
                return rih1Var;
            default:
                nwq0 nwq0Var = (nwq0) obj;
                View view = pnj1Var.k2;
                if (view == null) {
                    u890.C("immersiveVideoOverlayUiContainer");
                    throw null;
                }
                view.setVisibility(nwq0Var == nwq0.b ? 0 : 8);
                pnj1Var.i(nwq0Var == nwq0.a);
                return rih1Var;
        }
    }
}
