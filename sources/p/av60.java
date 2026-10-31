package p;

import com.spotify.tap.spoton.events.proto.SpotOnCommandLifecycle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class av60 {
    public final t2j0 a;
    public final g0l b;

    public /* synthetic */ av60(t2j0 t2j0Var, g0l g0lVar) {
        this.a = t2j0Var;
        this.b = g0lVar;
    }

    public static /* synthetic */ void b(av60 av60Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        if ((i & 64) != 0) {
            str7 = null;
        }
        if ((i & 128) != 0) {
            str8 = null;
        }
        av60Var.a(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        z1b1 z1b1VarN = SpotOnCommandLifecycle.n();
        z1b1VarN.s(str);
        z1b1VarN.x(str6);
        e1l e1lVar = (e1l) this.b.Y.h();
        z1b1VarN.t(e1lVar != null ? e1lVar.a : false);
        if (str2 != null) {
            z1b1VarN.r(str2);
        }
        if (str3 != null) {
            z1b1VarN.q(str3);
        }
        if (str4 != null) {
            z1b1VarN.w(str4);
        }
        if (str5 != null) {
            z1b1VarN.n(str5);
        }
        if (str7 != null) {
            z1b1VarN.u(str7);
        }
        if (str8 != null) {
            z1b1VarN.v(str8);
        }
        this.a.a(z1b1VarN.build());
    }
}
