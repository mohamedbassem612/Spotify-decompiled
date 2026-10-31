package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ymw0 implements anw0 {
    public final String a;

    public ymw0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ymw0) && this.a.equals(((ymw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
