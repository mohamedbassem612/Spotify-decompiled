package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hcj1 {
    public final boolean a;
    public final boolean b;
    public final h44 c;

    public hcj1(boolean z, boolean z2, h44 h44Var) {
        this.a = z;
        this.b = z2;
        this.c = h44Var;
    }

    public static boolean a(adj1 adj1Var) {
        return adj1Var.d() && adj1Var.isVisible() && !adj1Var.f();
    }

    public static Next b(adj1 adj1Var, String str) {
        return Next.a(Effects.a(new kjb0[]{new kjb0(adj1Var.a().d, str)}));
    }

    public static Set c(adj1 adj1Var, adj1 adj1Var2) {
        if (a(adj1Var) || !a(adj1Var2)) {
            return (!a(adj1Var) || a(adj1Var2)) ? w7x.a : Collections.singleton(gas0.a);
        }
        return Collections.singleton(w631.a);
    }
}
