package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qto implements tto {
    public final List a;

    public qto(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qto) && this.a.equals(((qto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
