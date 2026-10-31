package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ey51 implements hy51 {
    public final String a;

    public ey51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey51) && this.a.equals(((ey51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
