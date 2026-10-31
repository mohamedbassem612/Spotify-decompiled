package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tj51 implements cpe0 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public tj51(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj51)) {
            return false;
        }
        tj51 tj51Var = (tj51) obj;
        return u890.j(this.a, tj51Var.a) && this.b.equals(tj51Var.b) && u890.j(this.c, tj51Var.c) && this.d.equals(tj51Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return this.d.hashCode() + ((iD + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
