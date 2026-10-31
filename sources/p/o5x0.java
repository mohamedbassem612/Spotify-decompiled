package p;

import android.os.Bundle;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o5x0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zsc b;

    public /* synthetic */ o5x0(zsc zscVar, byte b) {
        this.a = b;
        this.b = zscVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        zsc zscVar = this.b;
        switch (b) {
            case 0:
                ((lzn0) zscVar.b).e();
                break;
            case 1:
                n4x0 n4x0Var = (n4x0) obj;
                zscVar.B(n4x0Var.d, n4x0Var.e);
                break;
            case 2:
                tv80 tv80Var = ((o4x0) obj).e;
                Set set = s4b1.f;
                String strZ = uic.x("spotify:edit:profile:bio").z();
                if (strZ != null) {
                    ((lzn0) zscVar.b).a(strZ, tv80Var, (Bundle) null);
                }
                break;
            case 3:
                myv myvVar = ((p4x0) obj).d;
                Set set2 = s4b1.f;
                String strZ2 = uic.x("spotify:edit:profile").z();
                if (strZ2 != null) {
                    lzn0 lzn0Var = (lzn0) zscVar.b;
                    Bundle bundle = new Bundle();
                    bundle.putString("user-name", myvVar.a);
                    bundle.putString("display-name", myvVar.c);
                    bundle.putString("image-url", myvVar.d);
                    bundle.putBoolean("has-spotify-image", myvVar.e);
                    bundle.putInt("color", myvVar.f);
                    bundle.putString("pronouns", myvVar.g);
                    bundle.putString("location", myvVar.h);
                    Boolean bool = myvVar.i;
                    bundle.putBoolean("is-kid", bool != null ? bool.booleanValue() : false);
                    lzn0Var.g(bundle, strZ2);
                }
                break;
            case 4:
                String str = ((q4x0) obj).d;
                Set set3 = s4b1.f;
                String strZ3 = uic.C(str, (String) null).z();
                strZ3.getClass();
                String strConcat = strZ3.concat(":followers");
                i8h1 i8h1Var = (i8h1) zscVar.c;
                x6h1 x6h1VarC = ((fql0) zscVar.e).a.c();
                x6h1VarC.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("followers_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                ((lzn0) zscVar.b).a(strConcat, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strConcat)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                break;
            case 5:
                String str2 = ((r4x0) obj).d;
                Set set4 = s4b1.f;
                String strZ4 = uic.C(str2, (String) null).z();
                strZ4.getClass();
                String strConcat2 = strZ4.concat(":following");
                i8h1 i8h1Var2 = (i8h1) zscVar.c;
                x6h1 x6h1VarC3 = ((fql0) zscVar.e).a.c();
                x6h1VarC3.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("following_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                ((lzn0) zscVar.b).a(strConcat2, i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strConcat2)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                break;
            case 6:
                tv80 tv80Var2 = ((s4x0) obj).d;
                Set set5 = s4b1.f;
                String strZ5 = uic.x("spotify:edit:profile:privacy-settings").z();
                if (strZ5 != null) {
                    ((lzn0) zscVar.b).a(strZ5, tv80Var2, (Bundle) null);
                }
                break;
            default:
                y4x0 y4x0Var = (y4x0) obj;
                String str3 = y4x0Var.d;
                tv80 tv80Var3 = y4x0Var.e;
                String str4 = y4x0Var.f;
                lzn0 lzn0Var2 = (lzn0) zscVar.b;
                String str5 = nik1.f7.a;
                Bundle bundleG = cy30.g("user-name", str3);
                if (str4 != null) {
                    bundleG.putString("dm-hierarchy-uri", str4);
                }
                lzn0Var2.a(str5, tv80Var3, bundleG);
                break;
        }
    }
}
