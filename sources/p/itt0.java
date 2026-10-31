package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class itt0 {
    public final List a;

    public itt0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof itt0) && this.a.equals(((itt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
