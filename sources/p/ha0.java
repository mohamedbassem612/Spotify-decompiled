package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ha0 {
    public final List a;

    public ha0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ha0) && u890.j(this.a, ((ha0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
