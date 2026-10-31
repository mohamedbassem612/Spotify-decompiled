package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n5r0 {
    public final String a;
    public final String b;
    public final Map c;
    public final LinkedHashMap d;
    public final String e;
    public final String f;
    public final String g;

    public n5r0(String str, String str2, Map map, LinkedHashMap linkedHashMap, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = linkedHashMap;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5r0)) {
            return false;
        }
        n5r0 n5r0Var = (n5r0) obj;
        return this.a.equals(n5r0Var.a) && this.b.equals(n5r0Var.b) && this.c.equals(n5r0Var.c) && this.d.equals(n5r0Var.d) && this.e.equals(n5r0Var.e) && this.f.equals(n5r0Var.f) && this.g.equals(n5r0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d((this.d.hashCode() + cy30.e(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
    }
}
