package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gtg {
    public final String a;
    public final List b;
    public final ktg c;

    public gtg(String str, List list, ktg ktgVar) {
        this.a = str;
        this.b = list;
        this.c = ktgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtg)) {
            return false;
        }
        gtg gtgVar = (gtg) obj;
        return u890.j(this.a, gtgVar.a) && u890.j(this.b, gtgVar.b) && u890.j(this.c, gtgVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iB = f4i1.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        ktg ktgVar = this.c;
        return iB + (ktgVar != null ? ktgVar.hashCode() : 0);
    }

    public /* synthetic */ gtg() {
        this(null, z6x.a, null);
    }
}
