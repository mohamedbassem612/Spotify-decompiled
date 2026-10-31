package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aqa extends lap1 {
    public final lqa c;
    public final wkt d;
    public final Uri e;

    public aqa(lqa lqaVar, wkt wktVar, Uri uri) {
        this.c = lqaVar;
        this.d = wktVar;
        this.e = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqa)) {
            return false;
        }
        aqa aqaVar = (aqa) obj;
        return this.c.equals(aqaVar.c) && u890.j(this.d, aqaVar.d) && u890.j(this.e, aqaVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        Uri uri = this.e;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
