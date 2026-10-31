package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lvl1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zrj1 b;
    public final /* synthetic */ d0r c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lvl1(zrj1 zrj1Var, d0r d0rVar, byte b) {
        super(1);
        this.a = b;
        this.b = zrj1Var;
        this.c = d0rVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        d0r d0rVar = this.c;
        zrj1 zrj1Var = this.b;
        switch (b) {
            case 0:
                return f6o1.A(new xzq(((d2q) zrj1Var.c).a(igu.a, d0rVar), new tak1(zrj1Var, (byte) 23)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            default:
                return f6o1.A(new xzq(((s1p) zrj1Var.b).a(igu.a, d0rVar), lcl1.V0), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        }
    }
}
