package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yob1 {
    public final String a;
    public final String b;
    public final Map c;

    public yob1(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yob1)) {
            return false;
        }
        yob1 yob1Var = (yob1) obj;
        return this.a.equals(yob1Var.a) && u890.j(this.b, yob1Var.b) && u890.j(this.c, yob1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
