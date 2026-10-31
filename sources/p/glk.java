package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class glk extends vlk {
    public final List a;

    public glk(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof glk) && u890.j(this.a, ((glk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
