package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i3h implements g3h {
    public final Context a;
    public final ltm1 b;
    public final agc0 c;
    public final idd1 d = new idd1(new h3h(this, (byte) 0));
    public final idd1 e = new idd1(new d4e(this, (byte) 2));
    public final idd1 f = new idd1(new h3h(this, (byte) 2));
    public final idd1 g = new idd1(new h3h(this, (byte) 1));

    public i3h(Context context, ltm1 ltm1Var, agc0 agc0Var) {
        this.a = context;
        this.b = ltm1Var;
        this.c = agc0Var;
    }

    public final fkt a(String str) {
        this.c.getClass();
        if (sto1.m(str)) {
            return fkt.a;
        }
        if (eyo1.w(str)) {
            return fkt.d;
        }
        Set set = s4b1.f;
        int iOrdinal = uic.x(str).c.ordinal();
        if (iOrdinal == 190) {
            return fkt.c;
        }
        if (iOrdinal == 208 || iOrdinal == 844) {
            return fkt.b;
        }
        return null;
    }

    public final Drawable b(fkt fktVar) {
        int iOrdinal = fktVar.ordinal();
        if (iOrdinal == 0) {
            return (Drawable) this.d.getValue();
        }
        if (iOrdinal == 1) {
            return (Drawable) this.f.getValue();
        }
        if (iOrdinal == 2) {
            return (Drawable) this.g.getValue();
        }
        if (iOrdinal == 3) {
            return (Drawable) this.e.getValue();
        }
        eg.o();
        return null;
    }
}
