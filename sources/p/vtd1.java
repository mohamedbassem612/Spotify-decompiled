package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vtd1 implements xtd1 {
    public final String a;

    public vtd1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vtd1) && this.a.equals(((vtd1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
