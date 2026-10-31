package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pdf1 {
    public final String a;
    public final ArrayList b;

    public pdf1(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdf1)) {
            return false;
        }
        pdf1 pdf1Var = (pdf1) obj;
        return this.a.equals(pdf1Var.a) && this.b.equals(pdf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
