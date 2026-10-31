package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oc91 implements pc91 {
    public final String a;
    public final List b;

    public oc91(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc91)) {
            return false;
        }
        oc91 oc91Var = (oc91) obj;
        return this.a.equals(oc91Var.a) && this.b.equals(oc91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
