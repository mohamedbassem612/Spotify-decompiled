package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w57 {
    public final String a;

    public w57(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w57) && u890.j(this.a, ((w57) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
