package p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oj91 extends bk91 {
    public final LinkedHashSet a;

    public oj91(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oj91) && this.a.equals(((oj91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
