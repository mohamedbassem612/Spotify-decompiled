package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jyb extends dsa0 {
    public final List c;
    public final ArrayList d;

    public jyb(ArrayList arrayList, List list) {
        this.c = list;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyb)) {
            return false;
        }
        jyb jybVar = (jyb) obj;
        return u890.j(this.c, jybVar.c) && this.d.equals(jybVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
