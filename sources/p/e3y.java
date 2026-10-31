package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e3y implements g3y {
    public final String a;

    public e3y(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3y) && u890.j(this.a, ((e3y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
