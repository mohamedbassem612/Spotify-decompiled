package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ksn extends ti {
    public final String b;

    public ksn(String str) {
        super(str);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ksn) && this.b.equals(((ksn) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
