package p;

import com.spotify.mobius.functions.Consumer;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class ces implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ges b;

    public /* synthetic */ ces(ges gesVar, byte b) {
        this.a = b;
        this.b = gesVar;
    }

    public final void accept(Object obj) {
        uk4 uk4Var;
        byte b = this.a;
        String str = "airplane mode";
        ges gesVar = this.b;
        switch (b) {
            case 0:
                int iOrdinal = ((i5e0) obj).b.ordinal();
                if (iOrdinal == 0) {
                    str = "forced offline";
                } else if (iOrdinal != 1) {
                    str = iOrdinal != 2 ? "unknown" : "no network connection";
                }
                gesVar.X0.r("network error", str);
                break;
            case 1:
                gesVar.X0.r("something went wrong", "");
                break;
            case 2:
                uk4 uk4Var2 = gesVar.l1;
                int iOrdinal2 = ((i5e0) obj).b.ordinal();
                if (iOrdinal2 == 0) {
                    uk4 uk4Var3 = gesVar.k1;
                    ges gesVar2 = (ges) uk4Var3.b;
                    Runnable runnable = (Runnable) uk4Var3.c;
                    if (runnable != null) {
                        ix7 ix7Var = gesVar2.X0;
                        if (ix7Var != null) {
                            i8h1 i8h1Var = (i8h1) ix7Var.b;
                            x6h1 x6h1VarC = ((pdl0) ix7Var.c).b.c();
                            x6h1VarC.i.add(new a7h1("toast", "network error", (Integer) null, (String) null, "forced offline"));
                            x6h1VarC.j = true;
                            x6h1 x6h1VarC2 = x6h1VarC.a().c();
                            x6h1VarC2.i.add(new a7h1("toast_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC2.j = false;
                            y6h1 y6h1VarA = x6h1VarC2.a();
                            String str2 = (String) ix7Var.d;
                            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                        }
                        runnable.run();
                    }
                } else if (iOrdinal2 == 1) {
                    uk4Var2.k("network error", "airplane mode");
                } else if (iOrdinal2 == 2) {
                    uk4Var2.k("network error", "no network connection");
                } else if (iOrdinal2 == 3 && (uk4Var = gesVar.j1) != null) {
                    uk4Var.k("network error", "unknown");
                }
                break;
            default:
                uk4 uk4Var4 = gesVar.j1;
                if (uk4Var4 != null) {
                    uk4Var4.k("something went wrong", "");
                }
                break;
        }
    }
}
