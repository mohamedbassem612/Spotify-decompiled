package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final enum r670 extends a770 {
    public final int h(y570 y570Var) {
        z670 z670Var;
        y570Var.getClass();
        String strB = y570Var.g().B("titleStyle");
        if (((id70) y570Var.n()).a.b == null) {
            z670Var = "description".equals(strB) ? z670.b : z670.d;
        } else if (Objects.equals(strB, "gone") || ((id70) y570Var.n()).a.a == null) {
            z670Var = z670.c;
        } else {
            z670Var = y570Var.g().F("subtitleStyle", "").equals("metadata") ? z670.e : z670.f;
        }
        return z670Var.a;
    }
}
