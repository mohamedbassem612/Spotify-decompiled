package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u181 extends v181 {
    public final String a;

    public u181(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u181) && u890.j(this.a, ((u181) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
