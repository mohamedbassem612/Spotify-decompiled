package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pw10 implements rw10 {
    public final String a;

    public pw10(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pw10) && u890.j(this.a, ((pw10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
