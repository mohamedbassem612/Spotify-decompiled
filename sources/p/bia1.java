package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bia1 extends eia1 {
    public final String a;

    public bia1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bia1) && this.a.equals(((bia1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
