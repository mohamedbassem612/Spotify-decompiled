package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iol1 extends hab0 implements xu30 {
    public final /* synthetic */ WidgetState.WrappedPlaylist a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iol1(WidgetState.WrappedPlaylist wrappedPlaylist, boolean z, float f) {
        super(3);
        this.a = wrappedPlaylist;
        this.b = z;
        this.c = f;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        WidgetState.WrappedPlaylist wrappedPlaylist = this.a;
        String title = wrappedPlaylist.getTitle();
        boolean z = this.b;
        kee1 kee1Var = z ? fim1.k : fim1.j;
        int i = z ? 3 : 2;
        float f = this.c;
        et40 et40Var = et40.a;
        o4p1.g(title, dm5.h0(et40Var, f), kee1Var, i, b0kVar, 0, 0);
        fc11.g(obh.a(et40Var), b0kVar, 0);
        y9g1.a(wrappedPlaylist.getButtonText(), (gt40) null, z ? fim1.g : fim1.f, 0.0f, b0kVar, 0, 10);
        return rih1.a;
    }
}
