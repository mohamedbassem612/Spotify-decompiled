package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k5d1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cof0 a;

    public k5d1(cof0 cof0Var) {
        this.a = cof0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String str;
        y4d1 y4d1Var = (y4d1) obj;
        g7d1 g7d1Var = y4d1Var.a;
        switch (y4d1Var.b) {
            case 1:
                str = "event_companion_viewed";
                break;
            case 2:
                str = "event_option_selected";
                break;
            case 3:
                str = "event_option_deselected";
                break;
            case 4:
                str = "event_question_next";
                break;
            case 5:
                str = "event_survey_submitted";
                break;
            case 6:
                str = "event_survey_on_connect";
                break;
            case 7:
                str = "event_thank_you_displayed";
                break;
            case 8:
                str = "preselection_timeout";
                break;
            case 9:
                str = "preselection_failure";
                break;
            default:
                throw null;
        }
        cof0.a(this.a, g7d1Var, str, null, null, 12);
        return rih1.a;
    }
}
