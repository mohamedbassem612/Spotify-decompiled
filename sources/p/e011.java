package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e011 implements j011 {
    public final List a;

    public e011(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e011) && this.a.equals(((e011) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
