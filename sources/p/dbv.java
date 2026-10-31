package p;

import android.content.res.Resources;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtMaybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeOnErrorNext;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dbv implements e1p0 {
    public final /* synthetic */ byte a = 1;
    public final Resources b;
    public final Object c;
    public final Object d;

    public dbv(Flowable flowable, Resources resources, gh4 gh4Var) {
        this.c = flowable;
        this.b = resources;
        this.d = gh4Var;
    }

    @Override // p.e1p0
    public final Maybe a(PlayerState playerState) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return new FlowableElementAtMaybe(((Flowable) obj).J(new dqu(this, (byte) 2)).x(wcp1.Y0).J(new wcr(this, (byte) 20)));
            default:
                Maybe maybeFlatMapMaybe = Single.zip(pqs.a((pqs) this.d), ((xvo) obj).a(true).firstOrError(), u3x0.O0).onErrorReturnItem(Boolean.FALSE).flatMapMaybe(new n381(playerState, this, (byte) 17));
                MaybeEmpty maybeEmpty = MaybeEmpty.a;
                maybeFlatMapMaybe.getClass();
                Objects.requireNonNull(maybeEmpty, "fallback is null");
                return new MaybeOnErrorNext(maybeFlatMapMaybe, Functions.g(maybeEmpty));
        }
    }

    @Override // p.e1p0
    public final String getId() {
        switch (this.a) {
            case 0:
                return "dsa-sponsored-hat";
            default:
                return "smart-shuffle";
        }
    }

    public dbv(Resources resources, xvo xvoVar, ln91 ln91Var, pqs pqsVar) {
        this.b = resources;
        this.c = xvoVar;
        this.d = pqsVar;
    }
}
