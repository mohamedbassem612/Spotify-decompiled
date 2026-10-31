package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ytk1 implements auk1 {
    public final String a;

    public ytk1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ytk1) && this.a.equals(((ytk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
