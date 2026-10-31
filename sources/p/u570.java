package p;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u570 {
    public final String a;
    public final y570 b;
    public final j380 c;

    public u570(String str, y570 y570Var, Map map) {
        str.getClass();
        this.a = str;
        y570Var.getClass();
        this.b = y570Var;
        this.c = j380.c(map);
    }

    public static u570 a(String str, y570 y570Var) {
        return new u570(str, y570Var, gg11.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u570)) {
            return false;
        }
        u570 u570Var = (u570) obj;
        return Objects.equals(this.a, u570Var.a) && Objects.equals(this.b, u570Var.b) && this.c.equals(u570Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
