package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xlw0 implements ez00 {
    public final String a;

    public xlw0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xlw0) && this.a.equals(((xlw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
