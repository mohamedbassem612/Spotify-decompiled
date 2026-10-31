package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nhs0 {
    public final String a;
    public final List b;

    public nhs0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhs0)) {
            return false;
        }
        nhs0 nhs0Var = (nhs0) obj;
        return this.a.equals(nhs0Var.a) && this.b.equals(nhs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
