package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yum {
    public final List a;
    public final Boolean b;
    public final boolean c;

    public yum(List list, Boolean bool, boolean z) {
        this.a = list;
        this.b = bool;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yum)) {
            return false;
        }
        yum yumVar = (yum) obj;
        return u890.j(this.a, yumVar.a) && u890.j(this.b, yumVar.b) && this.c == yumVar.c;
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31);
    }
}
