package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pm40 extends rm40 {
    public final List a;

    public pm40(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pm40) && this.a.equals(((pm40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
