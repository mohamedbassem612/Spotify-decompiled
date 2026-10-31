package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yg90 {
    public final String a;
    public final ArrayList b;

    public yg90(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg90)) {
            return false;
        }
        yg90 yg90Var = (yg90) obj;
        return this.a.equals(yg90Var.a) && this.b.equals(yg90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
