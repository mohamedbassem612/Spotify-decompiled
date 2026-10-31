package p;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ghn {
    public final p68 a;
    public final uo5 b;

    public ghn(p68 p68Var, d520 d520Var) {
        this.a = p68Var;
        this.b = new uo5(d520Var);
    }

    public final String a(String str) {
        String strSubstring;
        uo5 uo5Var = this.b;
        synchronized (uo5Var) {
            if (Objects.equals((String) uo5Var.c, str)) {
                return (String) uo5Var.d;
            }
            List listL = ((d520) uo5Var.b).L(str, uo5.g);
            if (listL.isEmpty()) {
                ws10.Z.j();
                strSubstring = null;
            } else {
                strSubstring = ((File) Collections.min(listL, uo5.h)).getName().substring(4);
            }
            return strSubstring;
        }
    }

    public final void b(String str) {
        uo5 uo5Var = this.b;
        synchronized (uo5Var) {
            if (!Objects.equals((String) uo5Var.c, str)) {
                uo5.I((d520) uo5Var.b, str, (String) uo5Var.d);
                uo5Var.c = str;
            }
        }
    }
}
