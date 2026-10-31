package p;

import com.spotify.messages.CreatePlaylist;
import io.reactivex.rxjava3.functions.Action;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nux0 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mzr0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zwu0 d;
    public final /* synthetic */ String e;

    public /* synthetic */ nux0(mzr0 mzr0Var, String str, zwu0 zwu0Var, String str2, byte b) {
        this.a = b;
        this.b = mzr0Var;
        this.c = str;
        this.d = zwu0Var;
        this.e = str2;
    }

    public final void run() {
        byte b = this.a;
        String str = this.e;
        zwu0 zwu0Var = this.d;
        String str2 = this.c;
        mzr0 mzr0Var = this.b;
        switch (b) {
            case 0:
                li9 li9Var = (li9) mzr0Var.b;
                String str3 = str2.length() == 0 ? nik1.G4.a : nik1.H4.b(m4c.n(str2)).a;
                jxa jxaVar = (jxa) mzr0Var.e;
                List list = zwu0Var.c;
                String strV = jxaVar.v(zwu0Var.k, zwu0Var.h);
                ton tonVarN = CreatePlaylist.n();
                tonVarN.r(str3);
                tonVarN.q(strV);
                if (str.length() != 0) {
                    tonVarN.n(str);
                }
                li9Var.a.a(tonVarN.build());
                if (!list.isEmpty()) {
                    li9Var.a(str, list, str3, strV);
                }
                break;
            default:
                ((li9) mzr0Var.b).a(str2, zwu0Var.c, str.length() == 0 ? nik1.G4.a : nik1.H4.b(m4c.n(str)).a, ((jxa) mzr0Var.e).v(zwu0Var.k, zwu0Var.h));
                break;
        }
    }
}
