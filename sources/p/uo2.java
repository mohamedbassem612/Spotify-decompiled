package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uo2 implements vo2 {
    public final String a;

    public uo2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uo2) && u890.j(this.a, ((uo2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
