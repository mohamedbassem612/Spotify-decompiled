package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jli0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lzn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jli0(lzn0 lzn0Var, byte b) {
        super(2);
        this.a = b;
        this.b = lzn0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lzn0 lzn0Var = this.b;
                    boolean zI = x340Var2.i(lzn0Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new xg20(lzn0Var, (byte) 2);
                        x340Var2.s0(objT);
                    }
                    wro1.l(new gbx(z50.c, (Function0) objT), anm1.N("member-details-back-button", nim0.a), (max) null, (gdx) null, (idn0) null, i0j.a, x340Var2, 196656, 28);
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
            case 1:
                return new sma1(new jpg0(f6o1.A(new w460(this.b, false, false, false, (a1r0) null, 60), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), br11.d1), new rma1(2131167023, null, null, 14));
            default:
                return new sma1(new jpg0(f6o1.A(new w460(this.b, false, false, false, (a1r0) null, 60), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), ss11.d), new rma1(2131167023, null, null, 14));
        }
    }
}
