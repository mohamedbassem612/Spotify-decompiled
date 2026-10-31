package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yud {
    public final String a;
    public final fjc1 b;

    public yud(String str, fjc1 fjc1Var) {
        this.a = str;
        this.b = fjc1Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof yud) && ((yud) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() - 902678464;
    }
}
