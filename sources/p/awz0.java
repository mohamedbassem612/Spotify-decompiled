package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class awz0 implements n6r0 {
    public final String a;

    public awz0(String str) {
        this.a = str;
    }

    public final String a() {
        List listQ0 = ihc1.Q0(this.a, new String[]{"/"}, 0, 6);
        return listQ0.size() >= 1 ? (String) listQ0.get(0) : "unknown";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof awz0) && this.a.equals(((awz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String path() {
        return this.a;
    }

    public final String toString() {
        return f4i1.f("{pageIdentifier='", this.a, "'}");
    }
}
