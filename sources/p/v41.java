package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v41 extends c51 {
    public final String a;

    public v41(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v41) && u890.j(this.a, ((v41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
