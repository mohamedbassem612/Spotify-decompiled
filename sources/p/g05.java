package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g05 implements pdy0 {
    public final boolean a;
    public final f05 b;
    public final luk c;
    public final idd1 d = new idd1(new uz4(this, (byte) 9));

    public g05(boolean z, f05 f05Var, luk lukVar) {
        this.a = z;
        this.b = f05Var;
        this.c = lukVar;
    }

    public final boolean a() {
        g05 g05Var = (g05) this.d.getValue();
        return g05Var != null ? g05Var.a() : this.a;
    }

    public final f05 b() {
        f05 f05VarB;
        g05 g05Var = (g05) this.d.getValue();
        return (g05Var == null || (f05VarB = g05Var.b()) == null) ? this.b : f05VarB;
    }

    public final List models() {
        fpb fpbVar = new fpb("show_track_artwork", "android-reinvent-free-time-cap-upsell", a());
        String str = b().a;
        f05[] f05VarArrValues = f05.values();
        ArrayList arrayList = new ArrayList(f05VarArrValues.length);
        for (f05 f05Var : f05VarArrValues) {
            arrayList.add(f05Var.a);
        }
        return p7h.M(new fpb[]{fpbVar, new fpb("time_cap_upsell_copy_variant", "android-reinvent-free-time-cap-upsell", str, arrayList)});
    }
}
