package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zdm {
    public final int a;
    public final boolean b;

    public zdm(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdm)) {
            return false;
        }
        zdm zdmVar = (zdm) obj;
        return this.a == zdmVar.a && this.b == zdmVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
