package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class psv0 implements rsv0 {
    public final String a;

    public psv0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psv0) && this.a.equals(((psv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
