package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ora0 implements sra0 {
    public final List a;

    public ora0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ora0) && this.a.equals(((ora0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
