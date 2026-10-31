package p;

import com.spotify.carapplibrary.api.CommandFailedException;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class row {
    public final a710 a;

    public row(a710 a710Var) {
        this.a = a710Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.carapplibrary.api.CommandFailedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(sdh sdhVar, onm onmVar) throws CommandFailedException {
        qow qowVar;
        if (onmVar instanceof qow) {
            qowVar = (qow) onmVar;
            int i = qowVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qowVar.c = i - Integer.MIN_VALUE;
            } else {
                qowVar = new qow(this, onmVar);
            }
        } else {
            qowVar = new qow(this, onmVar);
        }
        Object objJ = qowVar.a;
        int i2 = qowVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(sdhVar.b().a.a);
            y6r0 y6r0Var = sdhVar.b().b;
            Single singleD = this.a.d(spq0.d(builderInteractionId.pageInstanceId(y6r0Var != null ? y6r0Var.a : null).build()));
            qowVar.c = 1;
            objJ = fc11.j(singleD, qowVar);
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
