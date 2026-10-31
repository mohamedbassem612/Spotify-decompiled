package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ua1 extends wa1 {
    public final String a;

    public ua1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ua1) && this.a.equals(((ua1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
