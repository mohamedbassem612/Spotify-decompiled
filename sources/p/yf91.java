package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yf91 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.WrappedPlaylist a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf91(WidgetState.WrappedPlaylist wrappedPlaylist, float f) {
        super(2);
        this.a = wrappedPlaylist;
        this.b = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            l6m1 l6m1Var = l6m1.PLAYLIST_SMALL;
            WidgetState.WrappedPlaylist wrappedPlaylist = this.a;
            q6m1.a(l6m1Var, wrappedPlaylist, x340Var2, 6);
            j2h1.b(eqr0.H(dm5.I(et40.a), 0.0f, 32.0f, 0.0f, 12.0f, 5), ql3.f, apo.r(1205207918, new xf91(wrappedPlaylist, this.b), x340Var2), x340Var2, 384, 0);
            xpn1.j((gt40) null, x340Var2, 0);
            ueu.a(WidgetInteraction.WrappedVariant.PLAYLIST, wrappedPlaylist.getDismissButtonText(), null, x340Var2, 6);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
