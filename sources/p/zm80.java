package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zm80 implements an80 {
    public final String a;

    public zm80(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm80) && this.a.equals(((zm80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
