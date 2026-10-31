package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ban0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ wp20 b;
    public final /* synthetic */ wto c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ban0(wto wtoVar, wp20 wp20Var) {
        super(1);
        this.c = wtoVar;
        this.b = wp20Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        wto wtoVar = this.c;
        wp20 wp20Var = this.b;
        switch (b) {
            case 0:
                return new jpg0((laa) ((kly0) wp20Var.c).get(), new n82(wtoVar.f.d * 1000, wtoVar, (byte) 8));
            default:
                return new jpg0(f6o1.A((maa) ((kly0) wp20Var.e).get(), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new k83(wtoVar, (byte) 7));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ban0(wp20 wp20Var, wto wtoVar) {
        super(1);
        this.b = wp20Var;
        this.c = wtoVar;
    }
}
