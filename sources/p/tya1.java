package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tya1 {
    public final xme a;
    public final boolean b;
    public final sya1 c;
    public final int d;

    public tya1(sya1 sya1Var, boolean z, xme xmeVar, int i) {
        this.c = sya1Var;
        this.b = z;
        this.a = xmeVar;
        this.d = i;
    }

    public static tya1 a(char c) {
        return new tya1(new ks21(new rme(c, (byte) 0), (byte) 27));
    }

    public static tya1 b(String str) {
        dm5.n(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? a(str.charAt(0)) : new tya1(new k0p1(str));
    }

    public final List c(CharSequence charSequence) {
        charSequence.getClass();
        qya1 qya1VarA = this.c.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            qya1 qya1Var = qya1VarA;
            if (!qya1Var.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) qya1Var.next());
        }
    }

    public tya1(sya1 sya1Var) {
        this(sya1Var, false, ome.f, Integer.MAX_VALUE);
    }
}
