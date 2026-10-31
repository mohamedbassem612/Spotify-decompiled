package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rmb implements umb {
    public final String a;

    public rmb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rmb) && this.a.equals(((rmb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
