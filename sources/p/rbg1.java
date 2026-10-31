package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rbg1 {
    public final String a;
    public final ArrayList b;

    public rbg1(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbg1)) {
            return false;
        }
        rbg1 rbg1Var = (rbg1) obj;
        return u890.j(this.a, rbg1Var.a) && this.b.equals(rbg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
