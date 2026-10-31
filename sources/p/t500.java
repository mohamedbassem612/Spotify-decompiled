package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t500 implements y600 {
    public final String a;

    public t500(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t500) && u890.j(this.a, ((t500) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
