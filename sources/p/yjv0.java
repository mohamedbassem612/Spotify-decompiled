package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yjv0 implements akv0 {
    public final String a;

    public yjv0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yjv0) && u890.j(this.a, ((yjv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
