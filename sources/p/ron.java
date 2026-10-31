package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ron {
    public final String a;
    public final String b;

    public ron(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ron)) {
            return false;
        }
        ron ronVar = (ron) obj;
        return u890.j(this.a, ronVar.a) && this.b.equals(ronVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
