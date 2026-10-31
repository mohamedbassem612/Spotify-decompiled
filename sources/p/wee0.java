package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wee0 {
    public final List a;

    public wee0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wee0) && u890.j(this.a, ((wee0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
