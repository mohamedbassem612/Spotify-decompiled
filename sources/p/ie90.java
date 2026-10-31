package p;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ie90 implements Function {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;

    public ie90(Context context, pe peVar) {
        this.d = context;
        this.e = peVar;
        boolean z = Build.VERSION.SDK_INT >= 28;
        this.f = (AccessibilityManager) context.getSystemService("accessibility");
        this.a = peVar.b(7) && z && !peVar.e();
        boolean z2 = peVar.b(3) && !peVar.d();
        this.b = z2;
        this.c = !z2 || peVar.e();
        peVar.e();
    }

    public String a() {
        if (!this.a || !this.b) {
            return nik1.W6.a;
        }
        b7x b7xVar = (7 & 1) != 0 ? b7x.a : null;
        if ((7 & 4) == 0) {
            return null;
        }
        b7xVar.getClass();
        return "spotify:managed-account-linking:invite-parent";
    }

    public Object apply(Object obj) {
        return ((ats0) this.d).h((r9c) this.e, (m210) this.f, this.a, this.b, this.c);
    }

    public evz b() {
        bw20 bw20Var = (ov20) this.e;
        return h5p1.r(bw20Var.a("can-change-parent-pin", false), bw20Var.a("show-create-managed-account-in-parental-controls", false), bw20Var.a("show-managed-account-list-in-parental-controls", false), this.c ? bw20Var.a("show-linked-parent-in-settings", false) : new huz(Boolean.FALSE, (byte) 10), new mp6(5, (lnm) null, (byte) 2));
    }

    public x010 c() {
        return new x010(((ov20) this.e).a("can-invite-parent-to-manage", false), (ezc) this.f, new ce2(3, (lnm) null, (byte) 23), (byte) 1);
    }

    public /* synthetic */ ie90(Object obj, Object obj2, Object obj3, boolean z, boolean z2, boolean z3) {
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
