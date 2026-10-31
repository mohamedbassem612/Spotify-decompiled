package p;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m930 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m930)) {
            return false;
        }
        m930 m930Var = (m930) obj;
        return Objects.equals(this.a, m930Var.a) && Objects.equals(this.b, m930Var.b) && Objects.equals(this.c, m930Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
