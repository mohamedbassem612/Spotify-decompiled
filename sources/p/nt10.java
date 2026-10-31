package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nt10 implements st10 {
    public final String a;

    public nt10(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nt10) && u890.j(this.a, ((nt10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
