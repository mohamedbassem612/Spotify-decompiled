package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class md70 {
    public final String a;
    public final b380 b;

    public md70(String str, b380 b380Var) {
        this.a = str;
        this.b = b380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md70)) {
            return false;
        }
        md70 md70Var = (md70) obj;
        return u890.j(this.a, md70Var.a) && this.b.equals(md70Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
