package p;

import com.spotify.gamesservice.musicguesser.v1.CompleteGameRequest;
import com.spotify.gamesservice.musicguesser.v1.QuestionScore;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n240 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ q240 a;

    public n240(q240 q240Var) {
        this.a = q240Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String str;
        f240 f240Var = (f240) obj;
        fyh fyhVarP = CompleteGameRequest.p();
        fyhVarP.q(f240Var.a);
        for (r3z0 r3z0Var : f240Var.b) {
            q3z0 q3z0VarN = QuestionScore.n();
            q3z0VarN.s(r3z0Var.a);
            q3z0VarN.n(r3z0Var.d);
            q3z0VarN.r(r3z0Var.c);
            String str2 = r3z0Var.b;
            if (str2 != null) {
                q3z0VarN.q(str2);
            }
            fyhVarP.n((QuestionScore) q3z0VarN.build());
        }
        CompleteGameRequest completeGameRequest = (CompleteGameRequest) fyhVarP.build();
        w6b1 w6b1VarA = f7b1.a(blc0.L6);
        if (w6b1VarA != null && (str = (String) o7h.s0(w6b1VarA.c)) != null) {
            mmr0 mmr0Var = new mmr0("complete_game_request", completeGameRequest.toByteArray());
            q240 q240Var = this.a;
            Object objY = fn31.Y(q240Var.b, new sr1(q240Var, str, f240Var, mno1.h(new mmr0[]{mmr0Var, new mmr0("music_guesser_playlist_uri", q240Var.e.c)}), (lnm) null, (byte) 21), onmVar);
            if (objY == d9n.a) {
                return objY;
            }
        }
        return rih1.a;
    }
}
