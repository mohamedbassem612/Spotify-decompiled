package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lin0 implements oin0 {
    public final String a;

    public lin0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lin0) && this.a.equals(((lin0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
