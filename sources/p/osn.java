package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class osn implements psn {
    public final String a;

    public osn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof osn) && this.a.equals(((osn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
