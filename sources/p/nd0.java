package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nd0 implements pd0 {
    public final String a;

    public nd0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nd0) && this.a.equals(((nd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
