package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vkv0 implements blv0 {
    public final String a;

    public vkv0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vkv0) && u890.j(this.a, ((vkv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
