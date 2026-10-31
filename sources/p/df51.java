package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class df51 extends zf51 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public df51(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df51)) {
            return false;
        }
        df51 df51Var = (df51) obj;
        return u890.j(this.a, df51Var.a) && u890.j(this.b, df51Var.b) && u890.j(this.c, df51Var.c) && this.d.equals(df51Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
