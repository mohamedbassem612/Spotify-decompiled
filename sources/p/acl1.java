package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class acl1 {
    public final String a;
    public final ArrayList b;

    public acl1(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acl1)) {
            return false;
        }
        acl1 acl1Var = (acl1) obj;
        return this.a.equals(acl1Var.a) && this.b.equals(acl1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
