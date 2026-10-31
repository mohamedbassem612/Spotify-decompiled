package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dwg extends fwg {
    public final String a;
    public final ArrayList b;

    public dwg(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwg)) {
            return false;
        }
        dwg dwgVar = (dwg) obj;
        return this.a.equals(dwgVar.a) && this.b.equals(dwgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
