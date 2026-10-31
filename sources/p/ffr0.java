package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ffr0 implements qfr0, sfr0 {
    public final String a;

    public ffr0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffr0) && u890.j(this.a, ((ffr0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
