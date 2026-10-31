package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ljd1 implements tjd1 {
    public final ArrayList a;
    public final String b;
    public final String c;

    public ljd1(String str, String str2, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljd1)) {
            return false;
        }
        ljd1 ljd1Var = (ljd1) obj;
        return this.a.equals(ljd1Var.a) && u890.j(this.b, ljd1Var.b) && u890.j(this.c, ljd1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
