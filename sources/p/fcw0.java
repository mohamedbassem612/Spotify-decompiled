package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fcw0 implements pcw0 {
    public final String a;

    public fcw0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fcw0) && this.a.equals(((fcw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
