package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zlh0 implements amh0 {
    public final String a;

    public zlh0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zlh0) && this.a.equals(((zlh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
