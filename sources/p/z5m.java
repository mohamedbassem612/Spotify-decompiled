package p;

import com.google.type.DateTime;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z5m extends e6m {
    public final DateTime a;
    public final DateTime b;
    public final String c;

    public z5m(DateTime dateTime, DateTime dateTime2, String str) {
        this.a = dateTime;
        this.b = dateTime2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5m)) {
            return false;
        }
        z5m z5mVar = (z5m) obj;
        return u890.j(this.a, z5mVar.a) && u890.j(this.b, z5mVar.b) && u890.j(this.c, z5mVar.c);
    }

    public final int hashCode() {
        DateTime dateTime = this.a;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        DateTime dateTime2 = this.b;
        int iHashCode2 = (iHashCode + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
