package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oho0 implements qho0 {
    public final String a;

    public oho0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oho0) && u890.j(this.a, ((oho0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
