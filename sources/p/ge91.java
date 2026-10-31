package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ge91 implements le91 {
    public final ArrayList a;
    public final LinkedHashMap b;
    public final x4e0 c;

    public ge91(ArrayList arrayList, LinkedHashMap linkedHashMap, x4e0 x4e0Var) {
        this.a = arrayList;
        this.b = linkedHashMap;
        this.c = x4e0Var;
    }

    @Override // p.le91
    public final String breadcrumb() {
        return "GotLayout: " + this.a.size() + " slots, strategies=" + this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge91)) {
            return false;
        }
        ge91 ge91Var = (ge91) obj;
        return this.a.equals(ge91Var.a) && this.b.equals(ge91Var.b) && this.c == ge91Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
