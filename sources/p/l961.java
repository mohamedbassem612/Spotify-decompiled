package p;

import com.spotify.messages.ForegroundServiceStartTwoStepSolutionResult;
import java.util.Random;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l961 {
    public final Random a;
    public final t2j0 b;

    public l961(Random random, t2j0 t2j0Var) {
        this.a = random;
        this.b = t2j0Var;
    }

    public final void a(int i, String str) {
        String str2;
        Random random = this.a;
        if ((i != 1 || random.nextDouble() < 0.9999d) && (i == 1 || random.nextDouble() < 0.99d)) {
            return;
        }
        vd30 vd30VarN = ForegroundServiceStartTwoStepSolutionResult.n();
        vd30VarN.n(str);
        if (i == 1) {
            str2 = "SUCCESS";
        } else if (i == 2) {
            str2 = "SUCCESS_AFTER_CONNECTING_TO_MBS";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "FAILURE";
        }
        vd30VarN.q(str2);
        this.b.a(vd30VarN.build());
    }
}
