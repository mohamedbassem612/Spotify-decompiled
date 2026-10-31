package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v8e {
    public final String a;
    public final String b;

    public v8e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8e)) {
            return false;
        }
        v8e v8eVar = (v8e) obj;
        return u890.j(this.a, v8eVar.a) && this.b.equals(v8eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
