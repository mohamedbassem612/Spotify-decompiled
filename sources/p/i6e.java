package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class i6e {
    public final j6e a;
    public final String b;

    public i6e(j6e j6eVar, String str) {
        this.a = j6eVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6e)) {
            return false;
        }
        i6e i6eVar = (i6e) obj;
        return this.a.equals(i6eVar.a) && this.b.equals(i6eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }
}
