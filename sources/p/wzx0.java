package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wzx0 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public wzx0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzx0)) {
            return false;
        }
        wzx0 wzx0Var = (wzx0) obj;
        return this.a.equals(wzx0Var.a) && this.b.equals(wzx0Var.b) && this.c.equals(wzx0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
