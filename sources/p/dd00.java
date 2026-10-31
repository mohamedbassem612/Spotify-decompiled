package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dd00 {
    public final ArrayList a;
    public final LinkedHashMap b;
    public final ArrayList c;

    public dd00(ArrayList arrayList, LinkedHashMap linkedHashMap, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = linkedHashMap;
        this.c = arrayList2;
    }

    public final List a() {
        return this.a;
    }

    public final Map b() {
        return this.b;
    }

    public final List c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd00)) {
            return false;
        }
        dd00 dd00Var = (dd00) obj;
        return this.a.equals(dd00Var.a) && this.b.equals(dd00Var.b) && this.c.equals(dd00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
