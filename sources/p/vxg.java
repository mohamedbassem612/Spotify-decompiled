package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vxg extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ajq0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vxg(ajq0 ajq0Var, String str, byte b) {
        super(1);
        this.a = b;
        this.b = ajq0Var;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        ajq0 ajq0Var = this.b;
        switch (b) {
            case 0:
                fn31.T(cto1.q((dg30) ajq0Var.a), (o8n) null, 0, new bag(ajq0Var, str, (lnm) null, (byte) 8), 3);
                return rih1Var;
            default:
                tz5 tz5Var = (tz5) ajq0Var.b;
                int iOrdinal = ((pc31) obj).ordinal();
                b7x b7xVar = b7x.a;
                if (iOrdinal == 0) {
                    i8h1 i8h1Var = tz5Var.a;
                    r6h1 r6h1Var = r6h1.c;
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-dialogs-try-again";
                    x6h1VarI.f = "3.0.0";
                    x6h1VarI.g = "22.0.0";
                    x6h1 x6h1VarC = x6h1VarI.a().c();
                    x6h1VarC.i.add(new a7h1("try_again_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("make_playlist_non_collaborative", 1, Collections.singletonMap("playlist_to_be_made_non_collaborative", str)), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
                    return rih1Var;
                }
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                i8h1 i8h1Var2 = tz5Var.a;
                r6h1 r6h1Var2 = r6h1.c;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-dialogs-try-again";
                x6h1VarI2.f = "3.0.0";
                x6h1VarI2.g = "22.0.0";
                x6h1 x6h1VarC3 = x6h1VarI2.a().c();
                x6h1VarC3.i.add(new a7h1("try_again_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1Var2, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
        }
    }
}
