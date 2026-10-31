package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ui3 extends vi3 {
    public final String a;

    public ui3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ui3) && this.a.equals(((ui3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
