package p;

import com.spotify.libs.connect.events.proto.ConnectPossibleVolumeSpike;
import com.spotify.messages.PuffinHeadphonesOptimized;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cpr {
    public final t2j0 a;

    public void a(xtk1 xtk1Var) {
        String str;
        e5l e5lVarN = ConnectPossibleVolumeSpike.n();
        e5lVarN.n(xtk1Var.a);
        e5lVarN.w(xtk1Var.b);
        e5lVarN.x(xtk1Var.c);
        e5lVarN.z(xtk1Var.e);
        e5lVarN.A(xtk1Var.d);
        h06 h06Var = xtk1Var.f;
        SimpleDateFormat simpleDateFormat = hq80.a;
        int iOrdinal = h06Var.ordinal();
        if (iOrdinal == 0) {
            str = "foreground";
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            str = "background_lockscreen";
        }
        e5lVarN.q(str);
        e5lVarN.r(xtk1Var.g);
        e5lVarN.v(xtk1Var.h);
        e5lVarN.y(xtk1Var.i);
        e5lVarN.u(xtk1Var.j);
        e5lVarN.s(xtk1Var.l);
        e5lVarN.t(xtk1Var.k);
        this.a.a(e5lVarN.build());
    }

    public void b(hpq0 hpq0Var) {
        hqy0 hqy0VarN = PuffinHeadphonesOptimized.n();
        hqy0VarN.t(hpq0Var.a);
        hqy0VarN.y(hpq0Var.b);
        hqy0VarN.x(hpq0Var.c);
        hqy0VarN.w(hpq0Var.d);
        hqy0VarN.v(hpq0Var.e);
        String str = hpq0Var.f;
        if (str != null) {
            hqy0VarN.n(str);
        }
        if (str != null) {
            hqy0VarN.q(hpq0Var.g);
        }
        String str2 = hpq0Var.j;
        if (str2 != null) {
            hqy0VarN.u(str2);
        }
        String str3 = hpq0Var.h;
        if (str3 != null) {
            hqy0VarN.r(str3);
        }
        String str4 = hpq0Var.i;
        if (str4 != null) {
            hqy0VarN.s(str4);
        }
        this.a.a(hqy0VarN.build());
    }
}
