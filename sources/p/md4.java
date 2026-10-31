package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class md4 implements pdy0 {
    public final ld4 a;
    public final luk b;
    public final idd1 c = new idd1(new wb4(this, (byte) 19));

    public md4(ld4 ld4Var, luk lukVar) {
        this.a = ld4Var;
        this.b = lukVar;
    }

    public final ld4 a() {
        ld4 ld4VarA;
        md4 md4Var = (md4) this.c.getValue();
        return (md4Var == null || (ld4VarA = md4Var.a()) == null) ? this.a : ld4VarA;
    }

    @Override // p.pdy0
    public final List models() {
        String str = a().a;
        ld4[] ld4VarArrValues = ld4.values();
        ArrayList arrayList = new ArrayList(ld4VarArrValues.length);
        for (ld4 ld4Var : ld4VarArrValues) {
            arrayList.add(ld4Var.a);
        }
        return k4p1.x(new fpb("foreground_refresh_frequency", "android-devicelocation-locationrefresh", str, arrayList));
    }
}
