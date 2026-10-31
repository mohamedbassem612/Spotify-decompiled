package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rg00 extends mh00 {
    public final List a;

    public rg00(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rg00) && this.a.equals(((rg00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
