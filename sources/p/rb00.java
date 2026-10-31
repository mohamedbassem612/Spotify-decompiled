package p;

import com.spotify.messages.PushNotificationInteractionV1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rb00 {
    public final yqg a;
    public final t2j0 b;

    public rb00(yqg yqgVar, t2j0 t2j0Var) {
        this.a = yqgVar;
        this.b = t2j0Var;
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        awy0 awy0VarN = PushNotificationInteractionV1.n();
        awy0VarN.s(str);
        if (str2 != null) {
            awy0VarN.t(str2);
        }
        if (str3 != null) {
            awy0VarN.q(str3);
        }
        if (str4 != null) {
            awy0VarN.r(str4);
        }
        if (str5 != null) {
            awy0VarN.n(str5);
        }
        awy0VarN.u(this.a.b());
        this.b.a(awy0VarN.build());
    }
}
