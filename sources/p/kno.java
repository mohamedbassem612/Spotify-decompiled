package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kno implements nno {
    public final String a;

    public kno(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kno) && u890.j(this.a, ((kno) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
