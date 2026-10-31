package p;

import android.app.Activity;
import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r83 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x83 b;
    public final /* synthetic */ wto c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r83(byte b, x83 x83Var, wto wtoVar) {
        super(2);
        this.a = b;
        this.b = x83Var;
        this.c = wtoVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        wto wtoVar = this.c;
        x83 x83Var = this.b;
        switch (b) {
            case 0:
                syo syoVar = (syo) x83Var.b.R0;
                epb1 epb1Var = new epb1((zob1) obj);
                ezo ezoVar = (ezo) syoVar.a.c;
                gw70 gw70VarG = ((hc3) ezoVar.v).g();
                c8o.l(gw70VarG);
                lzn0 lzn0VarH = ((hc3) ezoVar.v).h();
                c8o.l(lzn0VarH);
                yqg yqgVar = (yqg) ((hc3) ezoVar.v).Q.get();
                c8o.l(yqgVar);
                return new jpg0(f6o1.A(new et90(gw70VarG, lzn0VarH, iwv0.B(yqgVar), epb1Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new k83(wtoVar, (byte) 4));
            case 1:
                return new jpg0(((kb3) x83Var.b.O0).a(x83Var.n, new epb1((zob1) obj), x83Var.o.g), new s83((byte) 0, x83Var, wtoVar));
            default:
                zob1 zob1Var = (zob1) obj;
                ezo ezoVar2 = (ezo) ((ryo) x83Var.b.P0).a.c;
                fwo fwoVar = ezoVar2.C;
                hc3 hc3Var = (hc3) ezoVar2.v;
                lzn0 lzn0VarH2 = hc3Var.h();
                c8o.l(lzn0VarH2);
                gw70 gw70VarG2 = hc3Var.g();
                c8o.l(gw70VarG2);
                tm tmVar = new tm(lzn0VarH2, gw70VarG2, new bb01((byte) 7));
                c491 c491Var = new c491();
                Activity activityA = ((hc3) ezoVar2.v).a();
                c8o.l(activityA);
                return new jpg0(new ug3(fwoVar, tmVar, c491Var, activityA, zob1Var), new s83((byte) 1, x83Var, wtoVar));
        }
    }
}
