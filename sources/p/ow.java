package p;

import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
@o661
public final class ow {
    public static final nw Companion = new nw();
    public final String a;
    public final String b;
    public final Date c;

    public /* synthetic */ ow(int i, String str, String str2, Date date) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, mw.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = date;
    }

    public final Date a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow)) {
            return false;
        }
        ow owVar = (ow) obj;
        return u890.j(this.a, owVar.a) && u890.j(this.b, owVar.b) && u890.j(this.c, owVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public ow(String str, String str2, Date date) {
        this.a = str;
        this.b = str2;
        this.c = date;
    }
}
