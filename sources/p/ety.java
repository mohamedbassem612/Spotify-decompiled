package p;

import com.spotify.player.model.command.SignalCommand;
import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ety extends a8d1 implements bv30 {
    public boolean a;
    public final /* synthetic */ fty b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ety(fty ftyVar, lnm lnmVar) {
        super(5, lnmVar);
        this.b = ftyVar;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new ety(this.b, (lnm) obj5).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            Completable completableIgnoreElement = this.b.b.a(new k9u0(SignalCommand.create("switch-to-full-episode"))).ignoreElement();
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
        return rih1.a;
    }
}
