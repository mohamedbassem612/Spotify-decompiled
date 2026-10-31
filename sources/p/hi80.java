package p;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hi80 implements ii80 {
    public final InputContentInfo a;

    public hi80(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }

    public final Uri a() {
        return this.a.getContentUri();
    }

    public final Uri b() {
        return this.a.getLinkUri();
    }

    public final Object c() {
        return this.a;
    }

    public final void f() {
        this.a.requestPermission();
    }

    public final ClipDescription getDescription() {
        return this.a.getDescription();
    }

    public hi80(Object obj) {
        this.a = (InputContentInfo) obj;
    }
}
