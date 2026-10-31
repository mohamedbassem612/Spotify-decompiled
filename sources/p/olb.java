package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class olb extends plb {
    public final int a;
    public final String b;
    public final String c;
    public final List d;

    public olb(int i, String str, String str2, List list) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olb)) {
            return false;
        }
        olb olbVar = (olb) obj;
        return this.a == olbVar.a && this.b.equals(olbVar.b) && this.c.equals(olbVar.c) && this.d.equals(olbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(l1d.C(this.a) * 31, 31, this.b), 31, this.c);
    }
}
