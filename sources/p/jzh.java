package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jzh extends uzh {
    public final List a;

    public jzh(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jzh) && this.a.equals(((jzh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
