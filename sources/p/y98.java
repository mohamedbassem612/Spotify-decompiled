package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y98 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y98(uu0 uu0Var, byte b) {
        super(2);
        this.a = b;
        this.b = uu0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        uu0 uu0Var = this.b;
        switch (b) {
            case 0:
                return new jpg0(((d771) uu0Var.g).a(), w08.U0);
            case 1:
                return new jpg0(f6o1.A(ycm.a((ycm) uu0Var.c), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new x98(rcm.a, (byte) 0));
            case 2:
                return new jpg0((jjv0) uu0Var.f, w08.V0);
            case 3:
                return new jpg0(f6o1.A(ycm.a((ycm) uu0Var.c), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new x98(tcm.a, (byte) 0));
            default:
                ytw0 ytw0Var = jfv.b;
                return new jpg0((laa) ((kly0) uu0Var.e).get(), new ps((byte) 3, jfv.h(fdg1.l0(((z98) uu0Var.b).c.c, ngv.e))));
        }
    }
}
