package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uje implements vje {
    public final String a;
    public final String b;
    public final List c;

    public uje(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uje)) {
            return false;
        }
        uje ujeVar = (uje) obj;
        return u890.j(this.a, ujeVar.a) && u890.j(this.b, ujeVar.b) && u890.j(this.c, ujeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
