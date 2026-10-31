package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ad11 {
    public final String a;

    public ad11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ad11) && this.a.equals(((ad11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
