package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tv9 implements dw9 {
    public final String a;

    public tv9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv9) && this.a.equals(((tv9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
