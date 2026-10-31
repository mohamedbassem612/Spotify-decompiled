package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lv20 implements nv20 {
    public final List a;

    public lv20(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lv20) && u890.j(this.a, ((lv20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final List w() {
        return this.a;
    }
}
