package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gcj1 {
    public final boolean a;
    public final boolean b;

    public gcj1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static boolean a(adj1 adj1Var) {
        return (adj1Var.d() || adj1Var.c()) && adj1Var.isVisible() && !adj1Var.f();
    }

    public static Next b(adj1 adj1Var, String str) {
        return Next.a(Effects.a(new ljb0[]{new ljb0(adj1Var.a().d, str)}));
    }

    public static Set c(adj1 adj1Var, adj1 adj1Var2) {
        if (a(adj1Var) || !a(adj1Var2)) {
            return (!a(adj1Var) || a(adj1Var2)) ? w7x.a : Collections.singleton(fas0.a);
        }
        return Collections.singleton(v631.a);
    }

    public static adj1 d(adj1 adj1Var, boolean z, boolean z2) {
        if (adj1Var instanceof xcj1) {
            return xcj1.h((xcj1) adj1Var, z2, false, false, z, 0, 93);
        }
        if (adj1Var instanceof ycj1) {
            return ycj1.h((ycj1) adj1Var, z2, false, false, z, 0, 93);
        }
        if (adj1Var instanceof zcj1) {
            return zcj1.h((zcj1) adj1Var, z2, false, false, z, 0, 93);
        }
        if (adj1Var instanceof bdj1) {
            return bdj1.h((bdj1) adj1Var, z2, false, false, false, z, 0, 93);
        }
        if (adj1Var instanceof cdj1) {
            return cdj1.h((cdj1) adj1Var, z2, false, false, z, 0, 93);
        }
        eg.o();
        return null;
    }

    public static adj1 e(adj1 adj1Var, boolean z) {
        if (adj1Var instanceof xcj1) {
            return xcj1.h((xcj1) adj1Var, false, false, z, false, 0, 119);
        }
        if (adj1Var instanceof ycj1) {
            return ycj1.h((ycj1) adj1Var, false, false, z, false, 0, 119);
        }
        if (adj1Var instanceof zcj1) {
            return zcj1.h((zcj1) adj1Var, false, false, z, false, 0, 119);
        }
        if (adj1Var instanceof bdj1) {
            return bdj1.h((bdj1) adj1Var, false, false, z, false, false, 0, 119);
        }
        if (adj1Var instanceof cdj1) {
            return cdj1.h((cdj1) adj1Var, false, false, z, false, 0, 119);
        }
        eg.o();
        return null;
    }
}
