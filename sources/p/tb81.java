package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tb81 extends zb81 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public tb81(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb81)) {
            return false;
        }
        tb81 tb81Var = (tb81) obj;
        return this.a.equals(tb81Var.a) && this.b.equals(tb81Var.b) && this.c.equals(tb81Var.c) && this.d.equals(tb81Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
