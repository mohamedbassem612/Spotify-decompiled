package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cuc1 implements euc1 {
    public final List a;

    public cuc1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cuc1) && u890.j(this.a, ((cuc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
