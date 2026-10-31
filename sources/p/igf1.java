package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class igf1 {
    public final ArrayList a;
    public final String b;
    public final String c;
    public final String d;

    public igf1(String str, String str2, String str3, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igf1)) {
            return false;
        }
        igf1 igf1Var = (igf1) obj;
        return this.a.equals(igf1Var.a) && u890.j(this.b, igf1Var.b) && u890.j(this.c, igf1Var.c) && u890.j(this.d, igf1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
