package p;

import com.spotify.leavebehindads.events.proto.LeavebehindAdEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hr0 {
    public final t2j0 a;

    public void a(d3d1 d3d1Var, int i, String str, int i2, String str2, String str3) {
        ryb0 ryb0VarN = LeavebehindAdEvent.n();
        if (str2 == null) {
            str2 = "";
        }
        ryb0VarN.r(str2);
        if (str3 == null) {
            str3 = "";
        }
        ryb0VarN.s(str3);
        ryb0VarN.n(zjy.f(2));
        ryb0VarN.q(bb00.a(i));
        ryb0VarN.t(d3d1Var.a());
        ryb0VarN.u(i2 + 1);
        ryb0VarN.v(str);
        this.a.a(ryb0VarN.build());
    }

    public void b(int i, String str, String str2, String str3, d3d1 d3d1Var) {
        ryb0 ryb0VarN = LeavebehindAdEvent.n();
        if (str2 == null) {
            str2 = "";
        }
        ryb0VarN.r(str2);
        if (str3 == null) {
            str3 = "";
        }
        ryb0VarN.s(str3);
        ryb0VarN.n(zjy.f(1));
        ryb0VarN.q("");
        ryb0VarN.t(d3d1Var.a());
        ryb0VarN.u(i + 1);
        ryb0VarN.v(str);
        this.a.a(ryb0VarN.build());
    }
}
