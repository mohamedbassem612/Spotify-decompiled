package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sz91 implements yz91 {
    public final String a;

    public sz91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sz91) && u890.j(this.a, ((sz91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
