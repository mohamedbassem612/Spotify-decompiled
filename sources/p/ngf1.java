package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ngf1 {
    public final ArrayList a;
    public final ogf1 b;

    public ngf1(ArrayList arrayList, ogf1 ogf1Var) {
        this.a = arrayList;
        this.b = ogf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngf1)) {
            return false;
        }
        ngf1 ngf1Var = (ngf1) obj;
        return this.a.equals(ngf1Var.a) && this.b.equals(ngf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
