package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wx7 implements xx7 {
    public final ArrayList a;

    static {
        idd1 idd1Var = o571.c;
    }

    public wx7(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wx7) && this.a.equals(((wx7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
