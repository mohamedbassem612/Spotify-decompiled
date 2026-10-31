package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zvh implements ez00 {
    public final String a;
    public final List b;

    public zvh(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvh)) {
            return false;
        }
        zvh zvhVar = (zvh) obj;
        return this.a.equals(zvhVar.a) && this.b.equals(zvhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
