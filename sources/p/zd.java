package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zd implements Serializable {
    public final String a;
    public final String b;

    public zd(String str, String str2) {
        this.a = str2;
        this.b = fpi1.y(str) ? null : str;
    }

    private final Object writeReplace() {
        return new yd(this.a);
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj instanceof zd) {
            zd zdVar = (zd) obj;
            String str = zdVar.b;
            String str2 = this.b;
            if (str == null) {
                zEquals = str2 == null;
            } else {
                zEquals = str.equals(str2);
            }
            if (zEquals && zdVar.a.equals(this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return this.a.hashCode() ^ (str != null ? str.hashCode() : 0);
    }
}
