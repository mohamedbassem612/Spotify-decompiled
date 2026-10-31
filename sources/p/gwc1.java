package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gwc1 {
    public final List a;

    public gwc1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gwc1) && this.a.equals(((gwc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
