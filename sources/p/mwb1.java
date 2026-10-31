package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mwb1 {
    public final String a;
    public final String b;
    public final List c;

    public mwb1(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwb1)) {
            return false;
        }
        mwb1 mwb1Var = (mwb1) obj;
        return this.a.equals(mwb1Var.a) && this.b.equals(mwb1Var.b) && this.c.equals(mwb1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
