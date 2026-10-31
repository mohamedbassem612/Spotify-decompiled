package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tmh1 {
    public final String a;

    public tmh1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tmh1) && this.a.equals(((tmh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
