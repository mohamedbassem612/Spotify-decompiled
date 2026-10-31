package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bsv implements usv {
    public final List a;

    public bsv(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bsv) && u890.j(this.a, ((bsv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
