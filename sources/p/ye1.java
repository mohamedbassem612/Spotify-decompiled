package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ye1 {
    public final String a;
    public final ArrayList b;
    public final p10 c;

    public ye1(String str, ArrayList arrayList, p10 p10Var) {
        this.a = str;
        this.b = arrayList;
        this.c = p10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye1)) {
            return false;
        }
        ye1 ye1Var = (ye1) obj;
        return this.a.equals(ye1Var.a) && this.b.equals(ye1Var.b) && this.c.equals(ye1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
