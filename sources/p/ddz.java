package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ddz implements ez00 {
    public final String a;
    public final ArrayList b;

    public ddz(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddz)) {
            return false;
        }
        ddz ddzVar = (ddz) obj;
        return this.a.equals(ddzVar.a) && this.b.equals(ddzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
