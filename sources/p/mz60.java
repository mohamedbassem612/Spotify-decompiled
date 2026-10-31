package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mz60 implements oz60 {
    public final String a;

    public mz60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mz60) && u890.j(this.a, ((mz60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
