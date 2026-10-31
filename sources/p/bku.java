package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bku implements ez00 {
    public final String a;
    public final ArrayList b;
    public final int c;
    public final aku d;

    public bku(String str, ArrayList arrayList, int i, aku akuVar) {
        this.a = str;
        this.b = arrayList;
        this.c = i;
        this.d = akuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bku)) {
            return false;
        }
        bku bkuVar = (bku) obj;
        return this.a.equals(bkuVar.a) && this.b.equals(bkuVar.b) && this.c == bkuVar.c && this.d.equals(bkuVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, p3d1.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
