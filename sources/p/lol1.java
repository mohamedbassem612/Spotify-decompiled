package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lol1 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.WrappedPlaylist a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lol1(float f, float f2, long j, WidgetState.WrappedPlaylist wrappedPlaylist, boolean z) {
        super(2);
        this.a = wrappedPlaylist;
        this.b = j;
        this.c = z;
        this.d = f;
        this.e = f2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            l6m1 l6m1Var = l6m1.PLAYLIST_WIDE;
            WidgetState.WrappedPlaylist wrappedPlaylist = this.a;
            q6m1.a(l6m1Var, wrappedPlaylist, x340Var2, 6);
            eqr0.a(dm5.I(et40.a), 0, 1, apo.r(1437770982, new jol1(this.d, this.e, this.b, wrappedPlaylist, this.c), x340Var2), x340Var2, 3072, 2);
            xpn1.j((gt40) null, x340Var2, 0);
            ueu.a(WidgetInteraction.WrappedVariant.PLAYLIST, wrappedPlaylist.getDismissButtonText(), null, x340Var2, 6);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
