package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d840 implements xn11 {
    public final String a;
    public final ArrayList b;

    public d840(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d840)) {
            return false;
        }
        d840 d840Var = (d840) obj;
        return this.a.equals(d840Var.a) && this.b.equals(d840Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
