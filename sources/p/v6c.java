package p;

import com.spotify.browse.clientnative.mobius.BrowseState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v6c extends hab0 implements iu30 {
    public final /* synthetic */ BrowseState.Content a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6c(BrowseState.Content content) {
        super(1);
        this.a = content;
    }

    public final Object invoke(Object obj) {
        ((Number) obj).intValue();
        BrowseState.Content content = this.a;
        String requestId = content.getModel().getRequestId();
        String pageId = content.getModel().getPageId();
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-browse-evo";
        x6h1VarI.f = "2.1.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.e = requestId;
        x6h1VarI.d = pageId;
        y6h1 y6h1VarA = x6h1VarI.a();
        p7h.M(new String[]{"find", "browse/genres"});
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
    }
}
