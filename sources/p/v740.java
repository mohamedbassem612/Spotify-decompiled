package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v740 implements ez00 {
    public final List a;

    public v740(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v740) && this.a.equals(((v740) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
