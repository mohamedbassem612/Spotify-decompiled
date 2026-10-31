package p;

import com.google.type.LatLng;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c6m extends e6m {
    public final LatLng a;
    public final String b;
    public final b6m c;

    public c6m(LatLng latLng, String str, b6m b6mVar) {
        this.a = latLng;
        this.b = str;
        this.c = b6mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6m)) {
            return false;
        }
        c6m c6mVar = (c6m) obj;
        return this.a.equals(c6mVar.a) && u890.j(this.b, c6mVar.b) && u890.j(this.c, c6mVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b6m b6mVar = this.c;
        return iHashCode2 + (b6mVar != null ? b6mVar.hashCode() : 0);
    }
}
