package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mf4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final lf4 c;
    public final luk d;
    public final idd1 e;

    public mf4(boolean z, boolean z2, lf4 lf4Var, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lf4Var;
        this.d = lukVar;
        this.e = new idd1(new pe4(this, (byte) 18));
    }

    public final boolean a() {
        mf4 mf4Var = (mf4) this.e.getValue();
        return mf4Var != null ? mf4Var.a() : this.a;
    }

    public final boolean b() {
        mf4 mf4Var = (mf4) this.e.getValue();
        return mf4Var != null ? mf4Var.b() : this.b;
    }

    public final lf4 c() {
        lf4 lf4VarC;
        mf4 mf4Var = (mf4) this.e.getValue();
        return (mf4Var == null || (lf4VarC = mf4Var.c()) == null) ? this.c : lf4VarC;
    }

    public final List models() {
        fpb fpbVar = new fpb("audio_recognition_enabled", "android-feature-browse", a());
        fpb fpbVar2 = new fpb("enable_wrapped_title_density", "android-feature-browse", b());
        String str = c().a;
        lf4[] lf4VarArrValues = lf4.values();
        ArrayList arrayList = new ArrayList(lf4VarArrValues.length);
        for (lf4 lf4Var : lf4VarArrValues) {
            arrayList.add(lf4Var.a);
        }
        return p7h.M(new fpb[]{fpbVar, fpbVar2, new fpb("root_page_top_offset_adjustment", "android-feature-browse", str, arrayList)});
    }

    public mf4(luk lukVar) {
        this(false, false, lf4.b, lukVar);
    }
}
