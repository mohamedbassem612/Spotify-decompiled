package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cxi0 implements dxi0 {
    public final String a;

    public cxi0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cxi0) && this.a.equals(((cxi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
