package p;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i0v {
    public final String a;
    public final Map b;

    public i0v(String str, Map map) {
        this.a = str;
        this.b = map;
        if (TextUtils.isEmpty(str)) {
            hhg1.n("Media url must be set");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0v)) {
            return false;
        }
        i0v i0vVar = (i0v) obj;
        return u890.j(this.a, i0vVar.a) && u890.j(this.b, i0vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ i0v(String str) {
        this(str, b7x.a);
    }
}
