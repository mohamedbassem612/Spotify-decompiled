package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mjg extends baa {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mjg(c5j0 c5j0Var, ljg ljgVar, Scheduler scheduler, Scheduler scheduler2, vlc vlcVar, y4q0 y4q0Var, byte b) {
        super(c5j0Var, ljgVar, scheduler, scheduler2, FormatType.BANNER, vlcVar, y4q0Var, j7a.a);
        switch (b) {
            case 1:
                super(c5j0Var, ljgVar, scheduler, scheduler2, FormatType.BOTTOMSHEET, vlcVar, y4q0Var);
                break;
            case 2:
                super(c5j0Var, ljgVar, scheduler, scheduler2, FormatType.FULLSCREEN, vlcVar, y4q0Var);
                break;
            case 3:
                super(c5j0Var, ljgVar, scheduler, scheduler2, FormatType.SNACKBAR, vlcVar, y4q0Var);
                break;
            case 4:
                super(c5j0Var, ljgVar, scheduler, scheduler2, FormatType.TOOLTIP, vlcVar, y4q0Var);
                break;
            case 5:
                super(c5j0Var, ljgVar, scheduler, scheduler2, FormatType.WEB_VIEW, vlcVar, y4q0Var);
                break;
            default:
                break;
        }
    }
}
