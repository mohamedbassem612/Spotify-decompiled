package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lc10 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p410 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc10(p410 p410Var, String str, byte b) {
        super(2);
        this.a = b;
        this.b = p410Var;
        this.c = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        String str = this.c;
        p410 p410Var = this.b;
        switch (b) {
            case 0:
                zob1 zob1Var = (zob1) obj;
                aap aapVar = (aap) p410Var.g;
                aapVar.getClass();
                f0a f0aVar = (f0a) aapVar.a.c;
                mts mtsVar = ((eto) f0aVar.b).n;
                c8o.l(mtsVar);
                gw70 gw70Var = ((eto) f0aVar.b).b;
                c8o.l(gw70Var);
                eto etoVar = (eto) f0aVar.b;
                zr00 zr00Var = etoVar.l;
                c8o.l(zr00Var);
                y390 y390Var = etoVar.m;
                c8o.l(y390Var);
                iac0 iac0Var = etoVar.l0;
                c8o.l(iac0Var);
                wr00 wr00VarA = y390Var.a(iac0Var, r6h1.c);
                lzn0 lzn0Var = etoVar.Z;
                c8o.l(lzn0Var);
                return new jpg0(new emb(mtsVar, gw70Var, zr00Var, wr00VarA, lzn0Var, zob1Var), new kq00(str, (byte) 8));
            default:
                iac0 iac0Var2 = (iac0) obj2;
                a680 a680Var = (a680) p410Var.d;
                epb1 epb1Var = new epb1((zob1) obj);
                ekb ekbVar = (ekb) p410Var.c;
                xrc0 xrc0VarL = ((bxd) ((k9k) ((a7p) a680Var.f).a.c).b).l();
                c8o.l(xrc0VarL);
                lc20 lc20Var = new lc20(iac0Var2, xrc0VarL);
                epb1Var.f(iac0Var2, new z11(lc20Var, (byte) 21));
                return new jpg0(f6o1.A(new pt((gw70) a680Var.a, (woa) a680Var.b, (kma) a680Var.c, ((vhy) a680Var.d).a((aiy) null), (zrg) a680Var.e, lc20Var, ekbVar), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new kq00(str, (byte) 10));
        }
    }
}
