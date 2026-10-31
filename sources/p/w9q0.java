package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w9q0 {
    public final String a;

    public w9q0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w9q0) && this.a.equals(((w9q0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
