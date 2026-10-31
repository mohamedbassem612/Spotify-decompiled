package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zlc extends bmc {
    public final String a;

    public zlc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zlc) && this.a.equals(((zlc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
