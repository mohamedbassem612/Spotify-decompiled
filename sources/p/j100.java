package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j100 extends c600 {
    public final String a;

    public j100(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j100) && this.a.equals(((j100) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
