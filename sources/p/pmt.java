package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pmt {
    public final ArrayList a;
    public final String b;
    public final byte[] c;

    public pmt(String str, ArrayList arrayList, byte[] bArr) {
        this.a = arrayList;
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pmt.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        pmt pmtVar = (pmt) obj;
        return this.a.equals(pmtVar.a) && u890.j(this.b, pmtVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
