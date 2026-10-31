package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class trh1 implements urh1 {
    public final String a;

    public trh1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof trh1) && u890.j(this.a, ((trh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
