package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wfm extends rzn1 {
    public final Uri f;
    public final vzn1 g;

    public wfm(Uri uri, vzn1 vzn1Var) {
        this.f = uri;
        this.g = vzn1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfm)) {
            return false;
        }
        wfm wfmVar = (wfm) obj;
        return u890.j(this.f, wfmVar.f) && u890.j(this.g, wfmVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + (this.f.hashCode() * 31);
    }

    public /* synthetic */ wfm(Uri uri) {
        this(uri, bgm.c);
    }
}
