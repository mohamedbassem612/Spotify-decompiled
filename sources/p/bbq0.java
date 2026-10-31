package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bbq0 extends dbq0 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public bbq0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbq0)) {
            return false;
        }
        bbq0 bbq0Var = (bbq0) obj;
        return this.a.equals(bbq0Var.a) && this.b.equals(bbq0Var.b) && this.c.equals(bbq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
