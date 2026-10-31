package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qln implements sln {
    public final String a;

    public qln(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qln) && u890.j(this.a, ((qln) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
