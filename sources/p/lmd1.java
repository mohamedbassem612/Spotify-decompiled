package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lmd1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ omd1 b;
    public final /* synthetic */ hho c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lmd1(omd1 omd1Var, hho hhoVar, byte b) {
        super(2);
        this.a = b;
        this.b = omd1Var;
        this.c = hhoVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        hho hhoVar = this.c;
        omd1 omd1Var = this.b;
        switch (b) {
            case 0:
                return new jpg0(f6o1.A(omd1Var.f.a((zob1) obj, hhoVar, 2), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), kmd1.b);
            default:
                return new jpg0(f6o1.A(omd1Var.f.a((zob1) obj, hhoVar, 2), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), kmd1.e);
        }
    }
}
