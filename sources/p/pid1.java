package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pid1 implements tjd1 {
    public final String a;
    public final ArrayList b;
    public final String c;

    public pid1(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pid1)) {
            return false;
        }
        pid1 pid1Var = (pid1) obj;
        return u890.j(this.a, pid1Var.a) && this.b.equals(pid1Var.b) && u890.j(this.c, pid1Var.c);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
