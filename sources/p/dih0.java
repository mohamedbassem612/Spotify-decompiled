package p;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dih0 extends cih0 {
    public final /* synthetic */ eih0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dih0(eih0 eih0Var, Context context) {
        super(eih0Var, context);
        this.b = eih0Var;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        eyh0.b(bundle);
        eih0 eih0Var = this.b;
        eih0Var.g.a(str, new bih0(eih0Var, str, new ruc0(result, (byte) 13), bundle), bundle);
    }
}
