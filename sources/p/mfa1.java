package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mfa1 implements ofa1 {
    public final yj41 a;

    public mfa1(yj41 yj41Var) {
        this.a = yj41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mfa1) && u890.j(this.a, ((mfa1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
