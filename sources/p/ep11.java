package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ep11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hp11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep11(hp11 hp11Var, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = hp11Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 2;
        hp11 hp11Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                hp11Var.a((b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                iac0 iac0Var = (iac0) obj2;
                ajq0 ajq0Var = hp11Var.d;
                String str = ((lik1) ajq0Var.c).a;
                if (((ge4) ajq0Var.a).j()) {
                    return new jpg0(f6o1.A(a1x.a((a1x) ajq0Var.b, 1, iac0Var, str), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), ny1.h);
                }
                l1q l1qVar = (l1q) ((ynb0) ajq0Var.d).get();
                x32 x32Var = (x32) ((ynb0) ajq0Var.e).get();
                return new jpg0(f6o1.A(l1qVar.a(new lt20(yoi1.g(Observable.zip(x32Var.a.b(new oi("AdsComponentDataSourceObservableFactory", false, new v1(str, (byte) 18))).filter(ns80.g), x32Var.b.b(new m72(str, d3d1.h, 5)), new clv(str, (byte) 2)).filter(t9w.e).map(e4y.e).onErrorReturn(mm10.t)), new re1(3, (lnm) null, (byte) 1), (byte) 0), str), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), ny1.i);
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    hp11Var.a(x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(0, (wux) null, apo.r(-1824626100, new ep11(hp11Var, b2), x340Var4), x340Var4, 3072, 7);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                m640 m640Var = hp11Var.i;
                w6e0 w6e0Var = hp11Var.j;
                return new jpg0(f6o1.A(new rwj(new z8b0(1, (byte) 25), Collections.singletonMap(rih1Var, f46.S0(new aq21[]{new zp21(v740.class), new yp21(w281.class)})), new rn8(m640Var.a, new epb1((xe01) w6e0Var.c), m640Var.b, m640Var.c, m640Var.d), w6e0Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), hm11.W0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ep11(hp11 hp11Var, byte b) {
        super(2);
        this.a = b;
        this.b = hp11Var;
    }
}
