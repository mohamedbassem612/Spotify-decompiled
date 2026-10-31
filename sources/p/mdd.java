package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mdd implements ndd {
    public final String a;

    public mdd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mdd) && u890.j(this.a, ((mdd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
