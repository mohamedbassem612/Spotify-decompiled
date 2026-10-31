package p;

import com.spotify.carapplibrary.api.CommandFailedException;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fpw {
    public final a710 a;

    public fpw(a710 a710Var) {
        this.a = a710Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.carapplibrary.api.CommandFailedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(sdh sdhVar, onm onmVar) throws CommandFailedException {
        epw epwVar;
        if (onmVar instanceof epw) {
            epwVar = (epw) onmVar;
            int i = epwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                epwVar.c = i - Integer.MIN_VALUE;
            } else {
                epwVar = new epw(this, onmVar);
            }
        } else {
            epwVar = new epw(this, onmVar);
        }
        Object objJ = epwVar.a;
        int i2 = epwVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(sdhVar.b().a.a);
            y6r0 y6r0Var = sdhVar.b().b;
            Single singleH = this.a.h(builderInteractionId.pageInstanceId(y6r0Var != null ? y6r0Var.a : null).build());
            epwVar.c = 1;
            objJ = fc11.j(singleH, epwVar);
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
        feh fehVar = (feh) objJ;
        fehVar.getClass();
        if (fehVar instanceof beh) {
            throw new CommandFailedException(((beh) fehVar).a);
        }
        return rih1.a;
    }
}
