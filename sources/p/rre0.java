package p;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rre0 {
    public final String a;
    public final LocusId b;

    public rre0(String str) {
        if (TextUtils.isEmpty(str)) {
            hhg1.n("id cannot be empty");
            throw null;
        }
        this.a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = x74.l(str);
        } else {
            this.b = null;
        }
    }

    public final String a() {
        return this.a;
    }

    public final LocusId b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rre0.class != obj.getClass()) {
            return false;
        }
        String str = ((rre0) obj).a;
        String str2 = this.a;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        String str = this.a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.a.length() + "_chars");
        sb.append("]");
        return sb.toString();
    }
}
