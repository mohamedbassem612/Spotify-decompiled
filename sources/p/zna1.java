package p;

import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zna1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t45 b;

    public /* synthetic */ zna1(t45 t45Var, byte b) {
        this.a = b;
        this.b = t45Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        t45 t45Var = this.b;
        switch (b) {
            case 0:
                t45.m(t45Var, VoiceAssistantsPerformance.MEASURE_NETWORK_SPEAKEASY, 4);
                break;
            case 1:
                b1f1 b1f1Var = (b1f1) obj;
                if (b1f1Var instanceof r0f1) {
                    t45Var.a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "aborted");
                } else if (b1f1Var instanceof s0f1) {
                    t45Var.a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "bad_request");
                } else if (b1f1Var instanceof t0f1) {
                    t45Var.a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "forbidden");
                } else if (b1f1Var instanceof u0f1) {
                    t45Var.a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "invalid_credentials");
                } else if (b1f1Var instanceof v0f1) {
                    t45Var.a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "permanent_backend_error");
                } else if (b1f1Var instanceof w0f1) {
                    t45Var.a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "permanent_network_error");
                } else if (b1f1Var instanceof x0f1) {
                    t45Var.a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "temporary_backend_error");
                } else if (b1f1Var instanceof y0f1) {
                    t45Var.a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "unexpected_error");
                } else if (!(b1f1Var instanceof a1f1)) {
                    eg.o();
                } else {
                    t45Var.a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "success");
                }
                break;
            case 2:
                t45Var.a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "failure");
                break;
            case 3:
                t45.m(t45Var, VoiceAssistantsPerformance.MEASURE_DETECT_LOGIN, 4);
                break;
            case 4:
                t45Var.g(VoiceAssistantsPerformance.MEASURE_DETECT_LOGIN);
                break;
            default:
                t45.m(t45Var, VoiceAssistantsPerformance.MEASURE_SWITCH_TO_LOCAL, 4);
                break;
        }
    }
}
