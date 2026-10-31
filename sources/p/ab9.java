package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ab9 {
    public final String a;

    public ab9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab9) && this.a.equals(((ab9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
