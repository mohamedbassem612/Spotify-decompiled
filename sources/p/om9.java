package p;

import com.spotify.player.model.command.SkipToNextTrackCommand;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class om9 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ rm9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om9(rm9 rm9Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = rm9Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new om9(this.b, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        rm9 rm9Var = this.b;
        Single singleA = rm9Var.d.a(rm9Var.e).a().a(new m9u0(SkipToNextTrackCommand.builder().build()));
        this.a = true;
        Object objJ = fc11.j(singleA, this);
        d9n d9nVar = d9n.a;
        return objJ == d9nVar ? d9nVar : objJ;
    }
}
