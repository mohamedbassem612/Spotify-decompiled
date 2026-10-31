package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f9b1 extends hab0 implements xu30 {
    public final /* synthetic */ WidgetState.WrappedPlaylist a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9b1(WidgetState.WrappedPlaylist wrappedPlaylist) {
        super(3);
        this.a = wrappedPlaylist;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        WidgetState.WrappedPlaylist wrappedPlaylist = this.a;
        String title = wrappedPlaylist.getTitle();
        kiv kivVar = p4k.a;
        x340 x340Var = (b0k) obj2;
        kee1 kee1Var = m9b1.b(((s3v) x340Var.k(kivVar)).a) ? fim1.h : fim1.j;
        int i = m9b1.b(((s3v) x340Var.k(kivVar)).a) ? 5 : 4;
        float fB = s3v.b(((s3v) x340Var.k(kivVar)).a) * 0.75f;
        et40 et40Var = et40.a;
        o4p1.g(title, dm5.h0(et40Var, fB), kee1Var, i, x340Var, 0, 0);
        fc11.g(dm5.Q(et40Var, m9b1.b), x340Var, 0);
        y9g1.a(wrappedPlaylist.getButtonText(), (gt40) null, (kee1) null, m9b1.b(((s3v) x340Var.k(kivVar)).a) ? 16.0f : 32.0f, x340Var, 0, 6);
        return rih1.a;
    }
}
