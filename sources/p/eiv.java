package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eiv extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eiv(WidgetState widgetState) {
        super(2);
        j2i j2iVar = nki.a;
        this.a = widgetState;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            WidgetState widgetState = this.a;
            if (widgetState instanceof WidgetState.WrappedPlaylist) {
                x340Var2.i0(-1688370524);
                j2i j2iVar = nki.a;
                zem1.a((WidgetState.WrappedPlaylist) widgetState, null, x340Var2, 384);
                x340Var2.r(false);
            } else if (widgetState instanceof WidgetState.WrappedStory) {
                x340Var2.i0(-1688366655);
                j2i j2iVar2 = nki.a;
                thm1.a((WidgetState.WrappedStory) widgetState, null, x340Var2, 384);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1688363978);
                nki.a.invoke(widgetState, x340Var2, 48);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
