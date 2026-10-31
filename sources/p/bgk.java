package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bgk extends nln {
    public final yro0 e;
    public final String f;

    public bgk(yro0 yro0Var, String str) {
        super((byte) 4);
        this.e = yro0Var;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgk)) {
            return false;
        }
        bgk bgkVar = (bgk) obj;
        return this.e.equals(bgkVar.e) && this.f.equals(bgkVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() * 31);
    }
}
