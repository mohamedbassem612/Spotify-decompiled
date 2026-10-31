package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class faq0 extends jaq0 {
    public final ArrayList a;
    public final String b;

    public faq0(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof faq0)) {
            return false;
        }
        faq0 faq0Var = (faq0) obj;
        return this.a.equals(faq0Var.a) && this.b.equals(faq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
