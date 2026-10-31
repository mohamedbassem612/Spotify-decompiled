package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f44 implements pdy0 {
    public final boolean a;
    public final tgp0 b;
    public final luk c;
    public final idd1 d = new idd1(new d44(this, (byte) 1));
    public final idd1 e = new idd1(new d44(this, (byte) 0));

    public f44(boolean z, tgp0 tgp0Var, luk lukVar) {
        this.a = z;
        this.b = tgp0Var;
        this.c = lukVar;
    }

    public static f44 b(aey0 aey0Var) {
        return new f44(aey0Var.c("android-address:show_address_settings_item", false), null, null);
    }

    public final boolean a() {
        f44 f44Var = (f44) this.e.getValue();
        return f44Var != null ? f44Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("show_address_settings_item", "android-address", a()));
    }
}
