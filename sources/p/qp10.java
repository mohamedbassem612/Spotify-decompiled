package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qp10 implements sp10 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public qp10(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp10)) {
            return false;
        }
        qp10 qp10Var = (qp10) obj;
        return this.a.equals(qp10Var.a) && this.b.equals(qp10Var.b) && this.c.equals(qp10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
