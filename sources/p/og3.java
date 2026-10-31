package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class og3 {
    public final String a;

    public og3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof og3) && this.a.equals(((og3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
