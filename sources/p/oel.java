package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oel implements qel {
    public final String a;
    public final boolean b;

    public oel(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oel)) {
            return false;
        }
        oel oelVar = (oel) obj;
        return this.a.equals(oelVar.a) && this.b == oelVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
