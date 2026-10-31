package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o3d extends e1r0 {
    @Override // p.e1r0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final Intent z(Context context, Uri uri) {
        return super.z(context, uri).addFlags(3);
    }
}
