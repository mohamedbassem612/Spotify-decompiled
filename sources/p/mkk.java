package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mkk {
    public final String a;
    public final boolean b;
    public final ArrayList c;

    public mkk(String str, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = z;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkk)) {
            return false;
        }
        mkk mkkVar = (mkk) obj;
        return this.a.equals(mkkVar.a) && this.b == mkkVar.b && this.c.equals(mkkVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
