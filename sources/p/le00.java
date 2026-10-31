package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class le00 {
    public final ArrayList a;
    public final int b;
    public final String c;
    public final Integer d;

    public le00(int i, Integer num, String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        this.c = str;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le00)) {
            return false;
        }
        le00 le00Var = (le00) obj;
        return this.a.equals(le00Var.a) && this.b == le00Var.b && this.c.equals(le00Var.c) && u890.j(this.d, le00Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        Integer num = this.d;
        return iD + (num == null ? 0 : num.hashCode());
    }
}
