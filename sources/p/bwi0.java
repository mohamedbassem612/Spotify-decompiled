package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bwi0 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public bwi0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwi0)) {
            return false;
        }
        bwi0 bwi0Var = (bwi0) obj;
        return this.a.equals(bwi0Var.a) && this.b.equals(bwi0Var.b) && this.c.equals(bwi0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
