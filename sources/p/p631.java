package p;

import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.Completable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p631 implements iu30 {
    public final ruz a;

    public p631(ruz ruzVar) {
        this.a = ruzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(lnm lnmVar) {
        o631 o631Var;
        if (lnmVar instanceof o631) {
            o631Var = (o631) lnmVar;
            int i = o631Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o631Var.c = i - Integer.MIN_VALUE;
            } else {
                o631Var = new o631(this, lnmVar);
            }
        } else {
            o631Var = new o631(this, lnmVar);
        }
        Object obj = o631Var.a;
        int i2 = o631Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Completable completableIgnoreElement = this.a.a(new h9u0(ResumeCommand.builder().options(CommandOptions.builder().systemInitiated(true).build()).build())).ignoreElement();
                o631Var.c = 1;
                Object objI = fc11.i(completableIgnoreElement, o631Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            n57.t("Failed to resume context player after TTS", e2);
        }
        return rih1.a;
    }
}
