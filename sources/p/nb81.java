package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nb81 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public nb81(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb81)) {
            return false;
        }
        nb81 nb81Var = (nb81) obj;
        return this.a.equals(nb81Var.a) && this.b.equals(nb81Var.b) && this.c.equals(nb81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
