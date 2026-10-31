package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lo7 implements ez00 {
    public final List a;

    public lo7(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lo7) && this.a.equals(((lo7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
