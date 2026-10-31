package p;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class toh0 {
    public static final toh0 d = new toh0(new o3e0());
    public static final String e;
    public static final String f;
    public static final String g;
    public final Uri a;
    public final String b;
    public final Bundle c;

    static {
        String str = zoi1.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
    }

    public toh0(o3e0 o3e0Var) {
        this.a = (Uri) o3e0Var.b;
        this.b = (String) o3e0Var.c;
        this.c = (Bundle) o3e0Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toh0)) {
            return false;
        }
        toh0 toh0Var = (toh0) obj;
        if (Objects.equals(this.a, toh0Var.a) && Objects.equals(this.b, toh0Var.b)) {
            if ((this.c == null) == (toh0Var.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c != null ? 1 : 0);
    }
}
