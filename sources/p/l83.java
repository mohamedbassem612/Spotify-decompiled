package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l83 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x83 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l83(x83 x83Var, byte b) {
        super(2);
        this.a = b;
        this.b = x83Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        boolean z = true;
        z = true;
        x83 x83Var = this.b;
        switch (b) {
            case 0:
                return new ef3((fd3) x83Var.b.g, (String) obj, (String) obj2);
            case 1:
                jc3 jc3Var = (jc3) x83Var.b.Y;
                return new jpg0(jc3Var.c.b(new epb1((zob1) obj), jc3Var.a, jc3Var.b, jc3Var.d, new tbo0((byte) 1), (4032 & 512) == 0), new j83(x83Var, z ? (byte) 1 : (byte) 0));
            case 2:
                return new jpg0(f6o1.A(new br0((luj) ((bv40) x83Var.b.S0).b), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), b03.e1);
            case 3:
                return new jpg0((rt01) x83Var.b.N0, new j83(x83Var, (byte) 2));
            case 4:
                nfm nfmVar = (nfm) obj2;
                return gm50.C((wcm) obj, nfmVar.a, nfmVar.b, x83Var.k.b(), true);
            case 5:
                gvu gvuVar = (gvu) obj;
                if (!y7y0.t("offline", (Map) obj2) && !x83Var.k.a()) {
                    z = false;
                }
                return new ka10(gvuVar, z);
            default:
                return new jpg0(f6o1.A((nu) x83Var.b.Z, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), q83.f);
        }
    }
}
