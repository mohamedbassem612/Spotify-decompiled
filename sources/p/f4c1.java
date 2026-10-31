package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f4c1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g4c1 b;

    public /* synthetic */ f4c1(g4c1 g4c1Var, byte b) {
        this.a = b;
        this.b = g4c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        g4c1 g4c1Var = this.b;
        switch (b) {
            case 0:
                iu30 pauseListener$src_main_java_com_spotify_campaigns_storytelling_storytelling = g4c1Var.getPauseListener$src_main_java_com_spotify_campaigns_storytelling_storytelling();
                if (pauseListener$src_main_java_com_spotify_campaigns_storytelling_storytelling != null) {
                    pauseListener$src_main_java_com_spotify_campaigns_storytelling_storytelling.invoke(Boolean.TRUE);
                }
                break;
            case 1:
                iu30 pauseListener$src_main_java_com_spotify_campaigns_storytelling_storytelling2 = g4c1Var.getPauseListener$src_main_java_com_spotify_campaigns_storytelling_storytelling();
                if (pauseListener$src_main_java_com_spotify_campaigns_storytelling_storytelling2 != null) {
                    pauseListener$src_main_java_com_spotify_campaigns_storytelling_storytelling2.invoke(Boolean.FALSE);
                }
                break;
            case 2:
                iu30 muteListener$src_main_java_com_spotify_campaigns_storytelling_storytelling = g4c1Var.getMuteListener$src_main_java_com_spotify_campaigns_storytelling_storytelling();
                if (muteListener$src_main_java_com_spotify_campaigns_storytelling_storytelling != null) {
                    muteListener$src_main_java_com_spotify_campaigns_storytelling_storytelling.invoke(Boolean.TRUE);
                }
                break;
            case 3:
                iu30 muteListener$src_main_java_com_spotify_campaigns_storytelling_storytelling2 = g4c1Var.getMuteListener$src_main_java_com_spotify_campaigns_storytelling_storytelling();
                if (muteListener$src_main_java_com_spotify_campaigns_storytelling_storytelling2 != null) {
                    muteListener$src_main_java_com_spotify_campaigns_storytelling_storytelling2.invoke(Boolean.FALSE);
                }
                break;
            case 4:
                Function0 closeListener$src_main_java_com_spotify_campaigns_storytelling_storytelling = g4c1Var.getCloseListener$src_main_java_com_spotify_campaigns_storytelling_storytelling();
                if (closeListener$src_main_java_com_spotify_campaigns_storytelling_storytelling != null) {
                    closeListener$src_main_java_com_spotify_campaigns_storytelling_storytelling.invoke();
                }
                break;
            case 5:
                Function0 shareListener$src_main_java_com_spotify_campaigns_storytelling_storytelling = g4c1Var.getShareListener$src_main_java_com_spotify_campaigns_storytelling_storytelling();
                if (shareListener$src_main_java_com_spotify_campaigns_storytelling_storytelling != null) {
                    shareListener$src_main_java_com_spotify_campaigns_storytelling_storytelling.invoke();
                }
                break;
            case 6:
                Function0 previousListener$src_main_java_com_spotify_campaigns_storytelling_storytelling = g4c1Var.getPreviousListener$src_main_java_com_spotify_campaigns_storytelling_storytelling();
                if (previousListener$src_main_java_com_spotify_campaigns_storytelling_storytelling != null) {
                    previousListener$src_main_java_com_spotify_campaigns_storytelling_storytelling.invoke();
                }
                break;
            default:
                Function0 nextListener$src_main_java_com_spotify_campaigns_storytelling_storytelling = g4c1Var.getNextListener$src_main_java_com_spotify_campaigns_storytelling_storytelling();
                if (nextListener$src_main_java_com_spotify_campaigns_storytelling_storytelling != null) {
                    nextListener$src_main_java_com_spotify_campaigns_storytelling_storytelling.invoke();
                }
                break;
        }
    }
}
