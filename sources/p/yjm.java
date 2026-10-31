package p;

import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yjm extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ruz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjm(ruz ruzVar, lnm lnmVar) {
        super(2, lnmVar);
        this.c = ruzVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        yjm yjmVar = new yjm(this.c, lnmVar);
        yjmVar.b = obj;
        return yjmVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        c9n c9nVar = (c9n) this.b;
        boolean z = this.a;
        try {
            if (!z) {
                hm5.M(obj);
                Completable completableIgnoreElement = this.c.a(new e9u0(PauseCommand.builder().options(CommandOptions.builder().onlyForLocalDevice(true).systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("music-quiz").build()).build())).ignoreElement();
                this.b = c9nVar;
                this.a = true;
                Object objI = fc11.i(completableIgnoreElement, this);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (Throwable unused) {
            smo1.t(c9nVar);
        }
        return rih1.a;
    }
}
