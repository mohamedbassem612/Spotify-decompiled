package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class neg {
    public final String a;
    public List b = z6x.a;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public neg(String str) {
        this.a = str;
    }

    public final void a(String str, h661 h661Var, boolean z) {
        if (!this.d.add(str)) {
            StringBuilder sbT = l1d.t("Element with name '", str, "' is already registered in ");
            sbT.append(this.a);
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        this.c.add(str);
        this.e.add(h661Var);
        this.f.add(z6x.a);
        this.g.add(Boolean.valueOf(z));
    }
}
