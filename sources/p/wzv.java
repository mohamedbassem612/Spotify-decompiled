package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wzv extends l0w {
    public final String a;

    public wzv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wzv) && this.a.equals(((wzv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
