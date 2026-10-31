package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fmd1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ omd1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fmd1(omd1 omd1Var, byte b) {
        super(2);
        this.a = b;
        this.b = omd1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        byte b2 = 0;
        byte b3 = 4;
        omd1 omd1Var = this.b;
        switch (b) {
            case 0:
                return new jpg0(new d83((byte) 4), new emd1(omd1Var, b2));
            case 1:
                return new jpg0(omd1Var.w.a((zob1) obj, false), zld1.Z);
            case 2:
                zob1 zob1Var = (zob1) obj;
                uxy0 uxy0Var = omd1Var.u;
                return new jpg0(f6o1.A(new et90(new htz0(new epb1(zob1Var), (ofx) uxy0Var.b, (lzn0) uxy0Var.c, 1), new rm0(omd1Var.v.a, zob1Var), zob1Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), zld1.O0);
            case 3:
                return new jpg0(f6o1.A(new rm0(omd1Var.v.a, (zob1) obj), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), zld1.Q0);
            case 4:
                return new jpg0(new d83((byte) 8), new emd1(omd1Var, (byte) 2));
            case 5:
                return new jpg0(new d83((byte) 8), new emd1(omd1Var, b3));
            default:
                return new jpg0(f6o1.A(omd1Var.g, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), kmd1.i);
        }
    }
}
