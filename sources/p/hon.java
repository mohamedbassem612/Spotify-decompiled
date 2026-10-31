package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hon {
    public final String a;
    public final String b;

    public hon(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hon)) {
            return false;
        }
        hon honVar = (hon) obj;
        return u890.j(this.a, honVar.a) && u890.j(this.b, honVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
