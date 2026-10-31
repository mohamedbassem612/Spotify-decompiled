package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class op81 extends eq81 {
    public final String a;

    public op81(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof op81) && u890.j(this.a, ((op81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
