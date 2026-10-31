package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ss2 {
    public final String a;
    public final ArrayList b;
    public final String c;

    public ss2(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss2)) {
            return false;
        }
        ss2 ss2Var = (ss2) obj;
        return this.a.equals(ss2Var.a) && this.b.equals(ss2Var.b) && this.c.equals(ss2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
