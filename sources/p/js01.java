package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class js01 extends vs01 {
    public final List a;

    public js01(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof js01) && this.a.equals(((js01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
