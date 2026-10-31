package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jqi0 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public jqi0(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqi0)) {
            return false;
        }
        jqi0 jqi0Var = (jqi0) obj;
        return u890.j(this.a, jqi0Var.a) && u890.j(this.b, jqi0Var.b) && u890.j(this.c, jqi0Var.c) && this.d.equals(jqi0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
