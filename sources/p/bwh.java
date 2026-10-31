package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bwh {
    public final String a;
    public final String b;
    public final boolean c;
    public final List d;

    public bwh(String str, String str2, List list, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwh)) {
            return false;
        }
        bwh bwhVar = (bwh) obj;
        return this.a.equals(bwhVar.a) && this.b.equals(bwhVar.b) && this.c == bwhVar.c && this.d.equals(bwhVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
