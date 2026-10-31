package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qxe implements nye {
    public final String a;

    public qxe(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxe) && u890.j(this.a, ((qxe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
