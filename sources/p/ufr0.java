package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ufr0 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public ufr0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufr0)) {
            return false;
        }
        ufr0 ufr0Var = (ufr0) obj;
        return this.a.equals(ufr0Var.a) && this.b.equals(ufr0Var.b) && this.c.equals(ufr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
