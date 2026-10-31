package p;

import android.os.Bundle;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c0v0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d0v0 b;
    public final /* synthetic */ udx0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0v0(d0v0 d0v0Var, udx0 udx0Var, byte b) {
        super(0);
        this.a = b;
        this.b = d0v0Var;
        this.c = udx0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        udx0 udx0Var = this.c;
        d0v0 d0v0Var = this.b;
        switch (b) {
            case 0:
                xmu0 xmu0Var = d0v0Var.b;
                String str = udx0Var.a;
                i8h1 i8h1Var = (i8h1) xmu0Var.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-profile-entity";
                x6h1VarI.f = "12.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = str;
                x6h1 x6h1VarR = kk0.r(x6h1VarI, "profile");
                x6h1VarR.i.add(new a7h1("public_playlists", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR.j = false;
                x6h1 x6h1VarC = x6h1VarR.a().c();
                x6h1VarC.i.add(new a7h1("edit_playlists_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                ((lzn0) xmu0Var.b).a("spotify:internal:playlists:edit-profile-visibility", i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:playlists:edit-profile-visibility")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                break;
            default:
                xmu0 xmu0Var2 = d0v0Var.b;
                String str2 = udx0Var.a;
                i8h1 i8h1Var2 = (i8h1) xmu0Var2.c;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-profile-entity";
                x6h1VarI2.f = "12.0.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.d = str2;
                x6h1 x6h1VarR2 = kk0.r(x6h1VarI2, "profile");
                x6h1VarR2.i.add(new a7h1("public_playlists", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR2.j = false;
                x6h1 x6h1VarC2 = x6h1VarR2.a().c();
                x6h1VarC2.i.add(new a7h1("add_playlists_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                ((lzn0) xmu0Var2.b).a("spotify:internal:playlists:edit-profile-visibility", i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:playlists:edit-profile-visibility")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                break;
        }
        return rih1Var;
    }
}
