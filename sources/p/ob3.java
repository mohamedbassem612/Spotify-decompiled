package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ob3 {
    public final String a;
    public final List b;

    public ob3(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob3)) {
            return false;
        }
        ob3 ob3Var = (ob3) obj;
        return this.a.equals(ob3Var.a) && this.b.equals(ob3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
