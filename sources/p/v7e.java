package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v7e extends w7e {
    public final kfe a;
    public final boolean b;

    public v7e(kfe kfeVar, boolean z) {
        this.a = kfeVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7e)) {
            return false;
        }
        v7e v7eVar = (v7e) obj;
        return this.a == v7eVar.a && this.b == v7eVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
