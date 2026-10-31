package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pl91 extends tl91 {
    public final String a;

    public pl91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pl91) && u890.j(this.a, ((pl91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
