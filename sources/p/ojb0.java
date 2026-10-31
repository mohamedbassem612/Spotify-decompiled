package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ojb0 implements vi0 {
    public final ji0 a;

    public ojb0(ji0 ji0Var) {
        this.a = ji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ojb0) && this.a.equals(((ojb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
