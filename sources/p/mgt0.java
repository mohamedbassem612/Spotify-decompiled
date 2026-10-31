package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mgt0 extends rgt0 {
    public final Uri a;
    public final boolean b;

    public mgt0(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgt0)) {
            return false;
        }
        mgt0 mgt0Var = (mgt0) obj;
        return u890.j(this.a, mgt0Var.a) && this.b == mgt0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
