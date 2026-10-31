package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class aav implements cav {
    public final String a;

    public aav(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aav) && u890.j(this.a, ((aav) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
