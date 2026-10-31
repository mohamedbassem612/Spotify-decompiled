package p;

import android.content.res.Resources;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtMaybe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class at21 implements e1p0 {
    public final Flowable a;
    public final Resources b;
    public final ffb0 c;
    public final zs21 d;

    public at21(Flowable flowable, Resources resources, ffb0 ffb0Var, zs21 zs21Var) {
        this.a = flowable;
        this.b = resources;
        this.c = ffb0Var;
        this.d = zs21Var;
    }

    @Override // p.e1p0
    public final Maybe a(PlayerState playerState) {
        return new FlowableElementAtMaybe(this.a.x(new n801(this, (byte) 8)).J(new xaz0(this, (byte) 12)));
    }

    @Override // p.e1p0
    public final String getId() {
        return "resize-gesture-hat";
    }
}
