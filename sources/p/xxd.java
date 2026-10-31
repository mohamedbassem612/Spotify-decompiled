package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xxd extends yxd {
    public final String a;
    public final ArrayList b;
    public final txd c;

    public xxd(String str, ArrayList arrayList, txd txdVar) {
        this.a = str;
        this.b = arrayList;
        this.c = txdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxd)) {
            return false;
        }
        xxd xxdVar = (xxd) obj;
        return this.a.equals(xxdVar.a) && this.b.equals(xxdVar.b) && u890.j(this.c, xxdVar.c);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        txd txdVar = this.c;
        return iF + (txdVar == null ? 0 : txdVar.hashCode());
    }
}
