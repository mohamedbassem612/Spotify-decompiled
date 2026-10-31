package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kqf1 extends bro1 {
    public final String b;
    public final List c;

    public kqf1(String str, List list) {
        this.b = str;
        this.c = list;
    }

    public static kqf1 r(kqf1 kqf1Var, ArrayList arrayList) {
        String str = kqf1Var.b;
        kqf1Var.getClass();
        return new kqf1(str, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqf1)) {
            return false;
        }
        kqf1 kqf1Var = (kqf1) obj;
        return this.b.equals(kqf1Var.b) && this.c.equals(kqf1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
