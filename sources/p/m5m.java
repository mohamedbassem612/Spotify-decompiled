package p;

import com.google.type.DateTime;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m5m extends e6m {
    public final String a;
    public final String b;
    public final DateTime c;
    public final String d;

    public m5m(String str, String str2, DateTime dateTime, String str3) {
        this.a = str;
        this.b = str2;
        this.c = dateTime;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5m)) {
            return false;
        }
        m5m m5mVar = (m5m) obj;
        return this.a.equals(m5mVar.a) && this.b.equals(m5mVar.b) && this.c.equals(m5mVar.c) && this.d.equals(m5mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
