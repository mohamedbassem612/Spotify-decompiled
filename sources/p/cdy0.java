package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cdy0 implements gdy0 {
    public final String a;
    public final ArrayList b;

    public cdy0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdy0)) {
            return false;
        }
        cdy0 cdy0Var = (cdy0) obj;
        return u890.j(this.a, cdy0Var.a) && this.b.equals(cdy0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
