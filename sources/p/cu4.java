package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cu4 implements pdy0 {
    public final boolean a;
    public final bu4 b;
    public final luk c;
    public final idd1 d;

    public cu4(boolean z, bu4 bu4Var, luk lukVar) {
        this.a = z;
        this.b = bu4Var;
        this.c = lukVar;
        this.d = new idd1(new st4(this, (byte) 7));
    }

    public final bu4 a() {
        bu4 bu4VarA;
        cu4 cu4Var = (cu4) this.d.getValue();
        return (cu4Var == null || (bu4VarA = cu4Var.a()) == null) ? this.b : bu4VarA;
    }

    public final boolean b() {
        cu4 cu4Var = (cu4) this.d.getValue();
        return cu4Var != null ? cu4Var.b() : this.a;
    }

    public final List models() {
        fpb fpbVar = new fpb("is_updated_card_ui_enabled", "android-music-quiz-card-element-impl", b());
        String str = a().a;
        bu4[] bu4VarArrValues = bu4.values();
        ArrayList arrayList = new ArrayList(bu4VarArrValues.length);
        for (bu4 bu4Var : bu4VarArrValues) {
            arrayList.add(bu4Var.a);
        }
        return p7h.M(new fpb[]{fpbVar, new fpb("tag_value", "android-music-quiz-card-element-impl", str, arrayList)});
    }

    public cu4(luk lukVar) {
        this(false, bu4.BETA, lukVar);
    }
}
