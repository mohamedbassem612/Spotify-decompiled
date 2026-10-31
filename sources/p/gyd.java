package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gyd extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bs0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gyd(bs0 bs0Var, byte b) {
        super(1);
        this.a = b;
        this.b = bs0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bs0 bs0Var = this.b;
        switch (b) {
            case 0:
                ((z2s) obj).R(etd.class, f6o1.A((tm) bs0Var.d, new ViewGroup.LayoutParams(-2, -2), (ScrollCardType) null, 2), fjd.O0, fjd.P0, fjd.Q0, false, wnb.R0);
                break;
            default:
                o4o1.o((y2s) obj, (kdn0) bs0Var.b, new gyd(bs0Var, (byte) 0));
                break;
        }
        return rih1Var;
    }
}
