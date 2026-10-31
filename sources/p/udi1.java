package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class udi1 implements xdi1 {
    public final String a;

    public udi1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof udi1) && u890.j(this.a, ((udi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
