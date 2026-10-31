package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nea1 implements qea1 {
    public final String a;

    public nea1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nea1) && u890.j(this.a, ((nea1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
