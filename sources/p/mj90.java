package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mj90 {
    public final String a;
    public final int b;
    public final ArrayList c;

    public mj90(int i, String str, ArrayList arrayList) {
        this.a = str;
        this.b = i;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj90)) {
            return false;
        }
        mj90 mj90Var = (mj90) obj;
        return u890.j(this.a, mj90Var.a) && this.b == mj90Var.b && this.c.equals(mj90Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + kaa0.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }
}
