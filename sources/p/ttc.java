package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class ttc {
    public static final stc Companion = new stc();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ ttc(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, rtc.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttc)) {
            return false;
        }
        ttc ttcVar = (ttc) obj;
        return u890.j(this.a, ttcVar.a) && u890.j(this.b, ttcVar.b) && u890.j(this.c, ttcVar.c) && u890.j(this.d, ttcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public ttc(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
