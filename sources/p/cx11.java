package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cx11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s880 b;
    public final /* synthetic */ p1f0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cx11(s880 s880Var, p1f0 p1f0Var, byte b) {
        super(2);
        this.a = b;
        this.b = s880Var;
        this.c = p1f0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        p1f0 p1f0Var = this.c;
        s880 s880Var = this.b;
        switch (b) {
            case 0:
                return ((kdy0) s880Var.c).e(new epb1((zob1) obj), (iac0) obj2, p1f0Var);
            case 1:
                return ((kdy0) s880Var.c).e(new epb1((zob1) obj), (iac0) obj2, p1f0Var);
            case 2:
                return ((kdy0) s880Var.c).e(new epb1((zob1) obj), (iac0) obj2, p1f0Var);
            case 3:
                fx6 fx6Var = (fx6) s880Var.b;
                new epb1((zob1) obj);
                return new jpg0(new dx0(new yfx(fx6Var.a.e, (byte) 1)), v160.P0);
            case 4:
                a680 a680Var = (a680) s880Var.d;
                return new jpg0(((bb8) a680Var.a).a(new epb1((zob1) obj), (lik1) a680Var.d, ((nix0) p1f0Var.c).h, (gst0) p1f0Var.h, (stt0) p1f0Var.g, new i26(p1f0Var, (byte) 23), new z77(a680Var, p1f0Var, (byte) 15), new hh(a680Var, p1f0Var, (iac0) obj2, (byte) 25)), db8.Y);
            default:
                Object obj3 = s880Var.e;
                new epb1((zob1) obj);
                return new jpg0(f6o1.A(new cx0((byte) 11), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), wiu.Z);
        }
    }
}
