package p;

import com.spotify.connect.esperanto.proto.CommonMessages;
import com.spotify.connect.esperanto.proto.ConnectMessages;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateRequest;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c3l implements y2l {
    public final jn7 a;
    public final q8n b;
    public final nfa0 c;
    public final nma0 d = m5n1.z(new r36(vld.Companion.serializer(), (byte) 0));

    public c3l(jn7 jn7Var, q8n q8nVar, nfa0 nfa0Var) {
        this.a = jn7Var;
        this.b = q8nVar;
        this.c = nfa0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static efg1 h(psh pshVar) throws NoWhenBranchMatchedException {
        int iOrdinal = pshVar.ordinal();
        if (iOrdinal == 0) {
            return dfg1.a;
        }
        if (iOrdinal == 1) {
            return new cfg1(veg1.a);
        }
        if (iOrdinal == 2) {
            return new cfg1(veg1.b);
        }
        if (iOrdinal == 3) {
            return new cfg1(veg1.c);
        }
        if (iOrdinal == 4 || iOrdinal == 5) {
            return new cfg1(veg1.d);
        }
        eg.o();
        return null;
    }

    public final Object a(String str, String str2, ztr ztrVar) {
        f4l f4lVarN = ConnectMessages.AddDeviceToGroupRequest.n();
        f4lVarN.n(str2);
        f4lVarN.q(str);
        Object objB = b("Add device to group failure", new i24(this, f4lVarN.build(), (lnm) null, (byte) 21), ztrVar);
        return objB == d9n.a ? objB : rih1.a;
    }

    public final Object b(String str, iu30 iu30Var, lnm lnmVar) {
        return c921.H(this.b, new z2l(iu30Var, str, (lnm) null, (byte) 0), lnmVar);
    }

    public final mr20 c(ConnectMessages$StateRequest connectMessages$StateRequest) {
        return o4p1.r(x4p1.h(new qbk(this.a.x0(connectMessages$StateRequest), this, (byte) 8), new jk((byte) 17)), this.b);
    }

    public final Object d(String str, a8d1 a8d1Var) {
        l4l l4lVarN = ConnectMessages.LogoutRequest.n();
        l4lVarN.n(str);
        Object objB = b("Logout endpoint", new i24(this, l4lVarN.build(), (lnm) null, (byte) 22), a8d1Var);
        return objB == d9n.a ? objB : rih1.a;
    }

    public final Object e(String str, a8d1 a8d1Var) {
        q4l q4lVarN = ConnectMessages.PullRequest.n();
        osh oshVarO = CommonMessages.LoggingParams.o();
        if (str != null) {
            oshVarO.n(str);
        }
        q4lVarN.n(oshVarO.build());
        return b("Pull playback failure", new i24(this, q4lVarN.build(), (lnm) null, (byte) 23), a8d1Var);
    }

    public final Object f(String str, String str2, aur aurVar) {
        r4l r4lVarN = ConnectMessages.RemoveDeviceFromGroupRequest.n();
        r4lVarN.n(str2);
        r4lVarN.q(str);
        Object objB = b("Remove device from group failure", new i24(this, r4lVarN.build(), (lnm) null, (byte) 24), aurVar);
        return objB == d9n.a ? objB : rih1.a;
    }

    public final mr20 g(boolean z) {
        u4l u4lVarN = ConnectMessages$StateRequest.n();
        u4lVarN.q();
        u4lVarN.n(true);
        u4lVarN.t(false);
        u4lVarN.s(false);
        u4lVarN.r(z);
        ConnectMessages$StateRequest connectMessages$StateRequest = (ConnectMessages$StateRequest) u4lVarN.build();
        connectMessages$StateRequest.getClass();
        return c(connectMessages$StateRequest);
    }
}
