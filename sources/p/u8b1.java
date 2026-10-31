package p;

import android.content.Context;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u8b1 extends hab0 implements xu30 {
    public final /* synthetic */ WidgetState.WrappedPlaylist a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8b1(WidgetState.WrappedPlaylist wrappedPlaylist) {
        super(3);
        this.a = wrappedPlaylist;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        WidgetState.WrappedPlaylist wrappedPlaylist = this.a;
        String title = wrappedPlaylist.getTitle();
        kee1 kee1Var = fim1.h;
        kiv kivVar = p4k.a;
        x340 x340Var = (b0k) obj2;
        float fB = s3v.b(((s3v) x340Var.k(kivVar)).a) * 0.75f;
        et40 et40Var = et40.a;
        o4p1.g(title, dm5.h0(et40Var, fB), kee1Var, 3, x340Var, 3072, 0);
        fc11.g(obh.a(et40Var), x340Var, 0);
        String buttonText = wrappedPlaylist.getButtonText();
        p3v p3vVarB = c9b1.b((Context) x340Var.k(p4k.b), wrappedPlaylist.getButtonText(), ((s3v) x340Var.k(kivVar)).a);
        y9g1.a(buttonText, (gt40) null, (kee1) null, p3vVarB != null ? p3vVarB.a : 32.0f, x340Var, 0, 6);
        return rih1.a;
    }
}
