package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lcw0 implements pcw0 {
    public final String a;

    public lcw0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lcw0) && this.a.equals(((lcw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
