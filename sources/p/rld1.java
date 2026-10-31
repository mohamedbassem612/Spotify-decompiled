package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rld1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rld1(uw0 uw0Var, byte b) {
        super(2);
        this.a = b;
        this.b = uw0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        byte b2 = 0;
        byte b3 = 6;
        uw0 uw0Var = this.b;
        switch (b) {
            case 0:
                return new jpg0(f6o1.A(new rm0(((x4e) uw0Var.X).a, (zob1) obj), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new pld1(uw0Var, b2));
            case 1:
                return new kpg0(new nu(((Context) uw0Var.d).getString(2131952594)), vkd1.N0);
            case 2:
                return new jpg0(new d83((byte) 1), new pld1(uw0Var, (byte) 5));
            case 3:
                return new jpg0(new mnb((ahr) ((scq) ((inb) uw0Var.Z)).b.d.Gd.get(), (zob1) obj), new pld1(uw0Var, b3));
            case 4:
                return new jpg0(((s7p) uw0Var.Y).a((zob1) obj, false), new pld1(uw0Var, (byte) 8));
            case 5:
                return new kpg0(new nu(((Context) uw0Var.d).getString(2131953500)), vkd1.Z0);
            case 6:
                return new jpg0(f6o1.A((q8x) uw0Var.h, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), zld1.X);
            default:
                kpc kpcVar = (kpc) obj;
                kpcVar.d((6 & 2) != 0 ? 1 : 2, (String) ((idd1) uw0Var.N0).getValue(), new pld1(uw0Var, (byte) 11), false);
                kpcVar.d(2, (String) ((idd1) uw0Var.O0).getValue(), new pld1(uw0Var, (byte) 13), true);
                return rih1.a;
        }
    }
}
