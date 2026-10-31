package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wda1 implements zda1 {
    public final List a;

    public wda1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wda1) && this.a.equals(((wda1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
