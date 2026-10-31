package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t8y implements v8y {
    public final String a;
    public final int b;

    public t8y(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8y)) {
            return false;
        }
        t8y t8yVar = (t8y) obj;
        return this.a.equals(t8yVar.a) && this.b == t8yVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
