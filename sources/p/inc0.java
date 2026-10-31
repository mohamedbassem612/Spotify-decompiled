package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class inc0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cm0 b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ inc0(cm0 cm0Var, Context context, byte b) {
        super(2);
        this.a = b;
        this.b = cm0Var;
        this.c = context;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Context context = this.c;
        cm0 cm0Var = this.b;
        switch (b) {
            case 0:
                return new jpg0(f6o1.A(cm0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new ork(context, (byte) 4));
            default:
                return new jpg0(f6o1.A(cm0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new ork(context, (byte) 11));
        }
    }
}
