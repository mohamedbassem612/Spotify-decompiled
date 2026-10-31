package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gze1 implements i570, o5s {
    public final s4w0 a;
    public final yeu0 b;
    public final vku c;

    public gze1(iac0 iac0Var, s4w0 s4w0Var, yeu0 yeu0Var) {
        this.a = s4w0Var;
        this.b = yeu0Var;
        iac0Var.getLifecycle().a(this);
        this.c = new vku();
    }

    public final void a(j570 j570Var, u570 u570Var) {
        w7h1 w7h1VarA;
        Object obj = u570Var.c.get("isCurrentlySaved");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        String strB = ((sc70) j570Var).b.c.B("uri");
        if (bool == null || strB == null || strB.length() == 0) {
            return;
        }
        Set set = s4b1.f;
        if (!uic.g(strB, blc0.de)) {
            Logger.k("TogglePresaveCommandHandler", new Object[]{f4i1.f("Expected prerelease URI but got '", strB, "'")});
            return;
        }
        boolean z = !bool.booleanValue();
        String str = new y6b1(strB, false).e;
        if (str == null) {
            Logger.k("TogglePresaveCommandHandler", new Object[]{f4i1.f("Failed to extract prerelease ID from URI '", strB, "'")});
            return;
        }
        HubsImmutableComponentBundle hubsImmutableComponentBundleR = u570Var.b.r();
        boolean zBooleanValue = bool.booleanValue();
        yeu0 yeu0Var = this.b;
        String str2 = ((c4n0) yeu0Var.c).getViewUri().a;
        x6h1 x6h1VarG = y1a1.G(hubsImmutableComponentBundleR, str2);
        x6h1VarG.g = "22.0.0";
        y6h1 y6h1Var = (y6h1) ((x5j1) new x5j1(x6h1VarG.a(), (byte) 12).f().c).b;
        if (zBooleanValue) {
            v7h1 v7h1Var = new v7h1();
            ((xjn) v7h1Var).a = y6h1Var;
            ((xjn) v7h1Var).c = Long.valueOf(System.currentTimeMillis());
            t6h1 t6h1Var = t6h1.f;
            o3b1 o3b1VarJ = f3o1.j();
            o3b1VarJ.c = "hit";
            o3b1VarJ.b = "remove_presave";
            o3b1VarJ.a = (byte) 1;
            o3b1.b(o3b1VarJ, "prerelease_id", str);
            o3b1.b(o3b1VarJ, "item_to_be_removed_from_presaved", strB);
            o3b1.b(o3b1VarJ, "context_uri", str2);
            v7h1Var.e = o3b1VarJ.a();
            w7h1VarA = (w7h1) v7h1Var.a();
        } else {
            v7h1 v7h1Var2 = new v7h1();
            ((xjn) v7h1Var2).a = y6h1Var;
            ((xjn) v7h1Var2).c = Long.valueOf(System.currentTimeMillis());
            t6h1 t6h1Var2 = t6h1.f;
            o3b1 o3b1VarJ2 = f3o1.j();
            o3b1VarJ2.c = "hit";
            o3b1VarJ2.b = "presave";
            o3b1VarJ2.a = (byte) 1;
            o3b1.b(o3b1VarJ2, "prerelease_id", str);
            o3b1.b(o3b1VarJ2, "item_to_be_presaved", strB);
            o3b1.b(o3b1VarJ2, "context_uri", str2);
            v7h1Var2.e = o3b1VarJ2.a();
            w7h1VarA = v7h1Var2.a();
        }
        ((i8h1) yeu0Var.b).m(w7h1VarA, (xj61) null);
        this.c.a(this.a.d(strB, (tv80) null, z).subscribe(ps4.b1, new eze1((byte) 1, this, strB, z)));
    }

    public final void onDestroy(iac0 iac0Var) {
        iac0Var.getLifecycle().d(this);
    }

    public final void onStop(iac0 iac0Var) {
        this.c.c();
    }
}
