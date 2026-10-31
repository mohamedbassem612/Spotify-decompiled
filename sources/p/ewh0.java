package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ewh0 {
    public final List a;

    public ewh0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ewh0) && this.a.equals(((ewh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
