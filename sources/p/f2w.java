package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f2w extends h2w {
    public final List a;

    public f2w(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f2w) && this.a.equals(((f2w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
