package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tdg1 implements vdg1 {
    public final String a;

    public tdg1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdg1) && this.a.equals(((tdg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
