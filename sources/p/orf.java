package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class orf implements rrf {
    public final String a;
    public final String b;
    public final boolean c;
    public final Long d;

    public orf(Long l, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orf)) {
            return false;
        }
        orf orfVar = (orf) obj;
        return u890.j(this.a, orfVar.a) && u890.j(this.b, orfVar.b) && this.c == orfVar.c && u890.j(this.d, orfVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iG = xcg1.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        Long l = this.d;
        return iG + (l != null ? l.hashCode() : 0);
    }
}
