package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cvd implements dvd {
    public final List a;

    public cvd(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvd) && u890.j(this.a, ((cvd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
