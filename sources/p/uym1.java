package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uym1 implements yym1 {
    public final String a;

    public uym1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uym1) && u890.j(this.a, ((uym1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
