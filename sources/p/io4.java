package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class io4 implements pdy0 {
    public final ho4 a;
    public final luk b;
    public final idd1 c = new idd1(new zn4(this, (byte) 7));

    public io4(ho4 ho4Var, luk lukVar) {
        this.a = ho4Var;
        this.b = lukVar;
    }

    public final ho4 a() {
        ho4 ho4VarA;
        io4 io4Var = (io4) this.c.getValue();
        return (io4Var == null || (ho4VarA = io4Var.a()) == null) ? this.a : ho4VarA;
    }

    @Override // p.pdy0
    public final List models() {
        String str = a().a;
        ho4[] ho4VarArrValues = ho4.values();
        ArrayList arrayList = new ArrayList(ho4VarArrValues.length);
        for (ho4 ho4Var : ho4VarArrValues) {
            arrayList.add(ho4Var.a);
        }
        return k4p1.x(new fpb("quickplay_mix", "android-libs-quickplay", str, arrayList));
    }
}
