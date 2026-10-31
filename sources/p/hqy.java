package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hqy extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sqy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hqy(sqy sqyVar, byte b) {
        super(1);
        this.a = b;
        this.b = sqyVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        sqy sqyVar = this.b;
        switch (b) {
            case 0:
                return new jpg0(f6o1.A(ycm.a(sqyVar.c), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), yoy.Z0);
            default:
                pdp pdpVar = sqyVar.j;
                pdpVar.getClass();
                tnm tnmVar = (tnm) pdpVar.a.c;
                gw70 gw70Var = (gw70) ((uqy) tnmVar.b).x.get();
                c8o.l(gw70Var);
                uqy uqyVar = (uqy) tnmVar.b;
                f1n0 f1n0Var = (f1n0) uqyVar.w.get();
                c8o.l(f1n0Var);
                gw70 gw70Var2 = (gw70) uqyVar.x.get();
                c8o.l(gw70Var2);
                ((ji50) obj).b.put(op51.class, new r3r(new ar30(gw70Var, new yp51(f1n0Var, gw70Var2, new xgc((byte) 16), tnmVar.v(), (gap) ((jly0) tnmVar.e).get())), lgx.Y0, 4));
                return rih1.a;
        }
    }
}
