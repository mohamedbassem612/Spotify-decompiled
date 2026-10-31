package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i9w implements j9w {
    public final String a;
    public final String b;

    public i9w(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9w)) {
            return false;
        }
        i9w i9wVar = (i9w) obj;
        return u890.j(this.a, i9wVar.a) && this.b.equals(i9wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
