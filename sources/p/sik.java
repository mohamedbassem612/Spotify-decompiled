package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sik extends vik {
    public final List a;

    public sik(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sik) && u890.j(this.a, ((sik) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
