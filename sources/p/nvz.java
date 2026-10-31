package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nvz implements t600 {
    public final int a;
    public final String b;

    public nvz(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvz)) {
            return false;
        }
        nvz nvzVar = (nvz) obj;
        return this.a == nvzVar.a && u890.j(this.b, nvzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
