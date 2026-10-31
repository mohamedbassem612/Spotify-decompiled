package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rgw implements riw {
    public final List a;

    public rgw(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rgw) && this.a.equals(((rgw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
