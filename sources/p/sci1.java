package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sci1 implements vci1 {
    public final String a;

    public sci1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sci1) && u890.j(this.a, ((sci1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
