package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class r2b {
    public static final p2b Companion = new p2b();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ r2b(int i, String str, String str2, String str3, String str4) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, n2b.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2b)) {
            return false;
        }
        r2b r2bVar = (r2b) obj;
        return u890.j(this.a, r2bVar.a) && u890.j(this.b, r2bVar.b) && u890.j(this.c, r2bVar.c) && u890.j(this.d, r2bVar.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
