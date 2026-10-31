package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class myz0 {
    public final String a;

    public myz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof myz0) && u890.j(this.a, ((myz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
