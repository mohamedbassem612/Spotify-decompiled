package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b05 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final a05 c;
    public final luk d;
    public final idd1 e = new idd1(new uz4(this, (byte) 5));

    public b05(boolean z, boolean z2, a05 a05Var, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = a05Var;
        this.d = lukVar;
    }

    public final boolean a() {
        b05 b05Var = (b05) this.e.getValue();
        return b05Var != null ? b05Var.a() : this.a;
    }

    public final boolean b() {
        b05 b05Var = (b05) this.e.getValue();
        return b05Var != null ? b05Var.b() : this.b;
    }

    public final a05 c() {
        a05 a05VarC;
        b05 b05Var = (b05) this.e.getValue();
        return (b05Var == null || (a05VarC = b05Var.c()) == null) ? this.c : a05VarC;
    }

    public final List models() {
        fpb fpbVar = new fpb("premium_referrals_settings_item_enabled", "android-referrals-settings", a());
        fpb fpbVar2 = new fpb("referral_settings_row_hidden", "android-referrals-settings", b());
        String str = c().a;
        a05[] a05VarArrValues = a05.values();
        ArrayList arrayList = new ArrayList(a05VarArrValues.length);
        for (a05 a05Var : a05VarArrValues) {
            arrayList.add(a05Var.a);
        }
        return p7h.M(new fpb[]{fpbVar, fpbVar2, new fpb("settings_sub_header_copy", "android-referrals-settings", str, arrayList)});
    }
}
