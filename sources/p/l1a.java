package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class l1a {
    public static final k1a Companion = new k1a();
    public final String a;
    public final String b;

    public /* synthetic */ l1a(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1a)) {
            return false;
        }
        l1a l1aVar = (l1a) obj;
        return u890.j(this.a, l1aVar.a) && u890.j(this.b, l1aVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public l1a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
