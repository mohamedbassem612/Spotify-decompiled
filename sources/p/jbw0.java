package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jbw0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kbw0 b;
    public final /* synthetic */ xk00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jbw0(kbw0 kbw0Var, xk00 xk00Var, byte b) {
        super(2);
        this.a = b;
        this.b = kbw0Var;
        this.c = xk00Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        xk00 xk00Var = this.c;
        kbw0 kbw0Var = this.b;
        switch (b) {
            case 0:
                return new aso(f6o1.A(new kpg0(kbw0Var.i, new ibw0(kbw0Var, kbw0Var.b(xk00Var, new epb1((zob1) obj)), (byte) 0)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new ewq0(kbw0Var, (byte) 14));
            default:
                return new aso(f6o1.A(new kpg0(kbw0Var.i, new ibw0(kbw0Var, kbw0Var.b(xk00Var, new epb1((zob1) obj)), (byte) 1)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new ewq0(kbw0Var, (byte) 14));
        }
    }
}
