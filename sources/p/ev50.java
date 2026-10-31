package p;

import android.text.TextUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ev50 {
    public final String a;
    public final String b;

    public ev50(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ev50.class == obj.getClass()) {
            ev50 ev50Var = (ev50) obj;
            if (TextUtils.equals(this.a, ev50Var.a) && TextUtils.equals(this.b, ev50Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.a);
        sb.append(",value=");
        return l1d.n(this.b, "]", sb);
    }
}
