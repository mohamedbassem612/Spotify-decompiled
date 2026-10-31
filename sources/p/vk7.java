package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vk7 extends xk7 {
    public final String b;

    public vk7(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vk7) && this.b.equals(((vk7) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String m() {
        return this.b;
    }
}
