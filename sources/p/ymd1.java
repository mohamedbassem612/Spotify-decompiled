package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ymd1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r2a1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ymd1(r2a1 r2a1Var, byte b) {
        super(2);
        this.a = b;
        this.b = r2a1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        r2a1 r2a1Var = this.b;
        switch (b) {
            case 0:
                s0k s0kVar = (s0k) r2a1Var.b;
                return new sma1(new jpg0(f6o1.A(new w460(s0kVar.k, false, true, false, (a1r0) null, 56), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new r0k(s0kVar, (byte) 6)), new rma1(2131167023, 2131167025, 2131167023, 8));
            case 1:
                s0k s0kVar2 = (s0k) r2a1Var.b;
                return new jpg0(f6o1.A(s0kVar2.i, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new r0k(s0kVar2, (byte) 5));
            case 2:
                s0k s0kVar3 = (s0k) r2a1Var.b;
                return new sma1(new jpg0(f6o1.A(new w460(s0kVar3.k, false, false, false, (a1r0) null, 56), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new r0k(s0kVar3, (byte) 7)), new rma1(2131167023, (Integer) null, 2131167023, 10));
            case 3:
                return new jpg0(f6o1.A(((s0k) r2a1Var.b).h, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), o0k.Z0);
            case 4:
                s0k s0kVar4 = (s0k) r2a1Var.b;
                return new sma1(new jpg0(f6o1.A(new w460(s0kVar4.k, false, false, false, (a1r0) null, 56), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new r0k(s0kVar4, (byte) 8)), new rma1(2131167023, (Integer) null, 2131167023, 10));
            case 5:
                s0k s0kVar5 = (s0k) r2a1Var.b;
                return new sma1(new jpg0(f6o1.A(new w460(s0kVar5.k, false, false, false, (a1r0) null, 56), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new r0k(s0kVar5, (byte) 9)), new rma1(2131167023, (Integer) null, 2131167023, 10));
            case 6:
                s0k s0kVar6 = (s0k) r2a1Var.b;
                return new sma1(new jpg0(f6o1.A(new w460(s0kVar6.k, false, true, false, (a1r0) null, 56), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new r0k(s0kVar6, (byte) 3)), new rma1(2131167023, (Integer) null, 2131167023, 10));
            case 7:
                s0k s0kVar7 = (s0k) r2a1Var.b;
                return new jpg0(s0kVar7.b.l(new epb1((zob1) obj), o0k.b1, (nu11) null), o0k.c1);
            case 8:
                s0k s0kVar8 = (s0k) r2a1Var.b;
                return new jpg0(f6o1.A(s0kVar8.i, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new r0k(s0kVar8, (byte) 2));
            default:
                s0k s0kVar9 = (s0k) r2a1Var.b;
                return new sma1(new jpg0(f6o1.A(new w460(s0kVar9.k, false, false, false, (a1r0) null, 56), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new r0k(s0kVar9, (byte) 0)), new rma1(2131167023, (Integer) null, 2131167023, 10));
        }
    }
}
