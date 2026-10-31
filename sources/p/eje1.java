package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eje1 implements fje1 {
    public final int a;

    public eje1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eje1) && this.a == ((eje1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
