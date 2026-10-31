package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iw7 implements ez00 {
    public final String a;
    public final int b;
    public final ArrayList c;

    public iw7(int i, String str, ArrayList arrayList) {
        this.a = str;
        this.b = i;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw7)) {
            return false;
        }
        iw7 iw7Var = (iw7) obj;
        return this.a.equals(iw7Var.a) && this.b == iw7Var.b && this.c.equals(iw7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
