package p;

import com.spotify.playlistmixing.endpoints.PlaylistMixDuplicationError;
import com.spotify.playlistmixing.proto.DuplicateMixRequest;
import com.spotify.playlistmixing.proto.DuplicateMixResponse;
import com.spotify.playlistmixing.proto.TransitionOverride;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ack0 implements ybk0 {
    public final bck0 a;
    public final kkg1 b;

    public ack0(bck0 bck0Var, kkg1 kkg1Var) {
        this.a = bck0Var;
        this.b = kkg1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(String str, String str2, onm onmVar, lhg1 lhg1Var) {
        zbk0 zbk0Var;
        if (onmVar instanceof zbk0) {
            zbk0Var = (zbk0) onmVar;
            int i = zbk0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zbk0Var.c = i - Integer.MIN_VALUE;
            } else {
                zbk0Var = new zbk0(this, onmVar);
            }
        } else {
            zbk0Var = new zbk0(this, onmVar);
        }
        Object objJ = zbk0Var.a;
        int i2 = zbk0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                gfv gfvVarO = DuplicateMixRequest.o();
                gfvVarO.r(str);
                gfvVarO.q();
                if (lhg1Var != null && str2 != null) {
                    jkg1 jkg1VarN = TransitionOverride.n();
                    jkg1VarN.n(qmo1.q(str2));
                    this.b.getClass();
                    jkg1VarN.q(kkg1.c(lhg1Var));
                    gfvVarO.n((TransitionOverride) jkg1VarN.build());
                }
                DuplicateMixRequest duplicateMixRequest = (DuplicateMixRequest) gfvVarO.build();
                bck0 bck0Var = this.a;
                duplicateMixRequest.getClass();
                Single singleTimeout = bck0Var.a(duplicateMixRequest).timeout(5L, TimeUnit.SECONDS);
                zbk0Var.c = 1;
                objJ = fc11.j(singleTimeout, zbk0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            return ((DuplicateMixResponse) objJ).getPlaylistUri();
        } catch (Exception unused) {
            return new m231(PlaylistMixDuplicationError.DuplicateCreationFailed.a);
        }
    }
}
