package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zqf1 implements brf1 {
    public final srt0 a;

    public zqf1(srt0 srt0Var) {
        this.a = srt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqf1) && u890.j(this.a, ((zqf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
