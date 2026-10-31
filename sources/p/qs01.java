package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qs01 extends vs01 {
    public final String a;

    public qs01(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qs01) && u890.j(this.a, ((qs01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
