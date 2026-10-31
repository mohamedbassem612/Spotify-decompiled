package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ui60 implements zi60 {
    public final int a;
    public final String b;
    public final List c;

    public ui60(String str, List list, int i) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui60)) {
            return false;
        }
        ui60 ui60Var = (ui60) obj;
        return this.a == ui60Var.a && u890.j(this.b, ui60Var.b) && this.c.equals(ui60Var.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
