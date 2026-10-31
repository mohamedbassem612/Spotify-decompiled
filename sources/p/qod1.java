package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qod1 implements dbr0 {
    public final String a;

    public qod1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qod1) && u890.j(this.a, ((qod1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
