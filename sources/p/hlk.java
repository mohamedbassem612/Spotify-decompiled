package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hlk extends vlk {
    public final String a;
    public final boolean b;

    public hlk(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlk)) {
            return false;
        }
        hlk hlkVar = (hlk) obj;
        return this.a.equals(hlkVar.a) && this.b == hlkVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
