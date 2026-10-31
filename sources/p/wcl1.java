package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wcl1 {
    public final String a;
    public final x360 b;
    public final ArrayList c;
    public final String d;

    public wcl1(String str, String str2, ArrayList arrayList, x360 x360Var) {
        this.a = str;
        this.b = x360Var;
        this.c = arrayList;
        this.d = str2;
    }

    public final x360 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final List c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcl1)) {
            return false;
        }
        wcl1 wcl1Var = (wcl1) obj;
        return this.a.equals(wcl1Var.a) && u890.j(this.b, wcl1Var.b) && this.c.equals(wcl1Var.c) && this.d.equals(wcl1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x360 x360Var = this.b;
        return this.d.hashCode() + ((((this.c.hashCode() + ((iHashCode + (x360Var == null ? 0 : x360Var.hashCode())) * 31)) * 31) - 580014870) * 31);
    }
}
