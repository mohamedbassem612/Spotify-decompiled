package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j0l1 extends f1l1 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String[] e;

    public j0l1(int i, String str, String str2, String str3, String[] strArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0l1)) {
            return false;
        }
        j0l1 j0l1Var = (j0l1) obj;
        return this.a == j0l1Var.a && u890.j(this.b, j0l1Var.b) && u890.j(this.c, j0l1Var.c) && u890.j(this.d, j0l1Var.d) && u890.j(this.e, j0l1Var.e);
    }

    public final int hashCode() {
        return cy30.d(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d) + Arrays.hashCode(this.e);
    }
}
