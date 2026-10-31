package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pho0 implements qho0 {
    public final String a;

    public pho0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pho0) && this.a.equals(((pho0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
