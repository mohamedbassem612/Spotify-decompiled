package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v83 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e93 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v83(e93 e93Var, byte b) {
        super(1);
        this.a = b;
        this.b = e93Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        e93 e93Var = this.b;
        switch (b) {
            case 0:
                return new jpg0(f6o1.A((et90) e93Var.V0, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), q83.Y);
            case 1:
                return new jpg0(((d771) e93Var.t).a(), q83.O0);
            default:
                return new jpg0((ze81) e93Var.f, q83.P0);
        }
    }
}
