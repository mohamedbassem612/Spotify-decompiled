package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wi4 implements pdy0 {
    public final boolean a;
    public final vi4 b;
    public final luk c;
    public final idd1 d = new idd1(new sh4(this, (byte) 19));

    public wi4(boolean z, vi4 vi4Var, luk lukVar) {
        this.a = z;
        this.b = vi4Var;
        this.c = lukVar;
    }

    public final vi4 a() {
        vi4 vi4VarA;
        wi4 wi4Var = (wi4) this.d.getValue();
        return (wi4Var == null || (vi4VarA = wi4Var.a()) == null) ? this.b : vi4VarA;
    }

    public final boolean b() {
        wi4 wi4Var = (wi4) this.d.getValue();
        return wi4Var != null ? wi4Var.b() : this.a;
    }

    public final List models() {
        fpb fpbVar = new fpb("is_page_enabled", "android-feature-upcoming-releases-hub", b());
        String str = a().a;
        vi4[] vi4VarArrValues = vi4.values();
        ArrayList arrayList = new ArrayList(vi4VarArrValues.length);
        for (vi4 vi4Var : vi4VarArrValues) {
            arrayList.add(vi4Var.a);
        }
        return p7h.M(new fpb[]{fpbVar, new fpb("prerelease_card_presave_content", "android-feature-upcoming-releases-hub", str, arrayList)});
    }
}
