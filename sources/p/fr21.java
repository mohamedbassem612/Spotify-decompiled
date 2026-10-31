package p;

import j$.time.Instant;
import j$.time.ZoneOffset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fr21 {
    public final String a;
    public final Instant b;
    public final ZoneOffset c;
    public final String d;
    public final String e;

    public fr21(String str, Instant instant, ZoneOffset zoneOffset, String str2, String str3) {
        this.a = str;
        this.b = instant;
        this.c = zoneOffset;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr21)) {
            return false;
        }
        fr21 fr21Var = (fr21) obj;
        return this.a.equals(fr21Var.a) && this.b.equals(fr21Var.b) && this.c.equals(fr21Var.c) && this.d.equals(fr21Var.d) && this.e.equals(fr21Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
