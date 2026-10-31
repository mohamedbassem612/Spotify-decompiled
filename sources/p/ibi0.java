package p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ibi0 extends hab0 implements vu30 {
    public static final ibi0 N0;
    public static final ibi0 O0;
    public static final ibi0 P0;
    public static final ibi0 Q0;
    public static final ibi0 R0;
    public static final ibi0 S0;
    public static final ibi0 T0;
    public static final ibi0 U0;
    public static final ibi0 V0;
    public static final ibi0 W0;
    public static final ibi0 X;
    public static final ibi0 X0;
    public static final ibi0 Y;
    public static final ibi0 Y0;
    public static final ibi0 Z;
    public static final ibi0 Z0;
    public static final ibi0 a1;
    public static final ibi0 b;
    public static final ibi0 b1;
    public static final ibi0 c;
    public static final ibi0 c1;
    public static final ibi0 d;
    public static final ibi0 d1;
    public static final ibi0 e;
    public static final ibi0 e1;
    public static final ibi0 f;
    public static final ibi0 g;
    public static final ibi0 h;
    public static final ibi0 i;
    public static final ibi0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new ibi0(i2, (byte) 0);
        c = new ibi0(i2, (byte) 1);
        d = new ibi0(i2, (byte) 2);
        e = new ibi0(i2, (byte) 3);
        f = new ibi0(i2, (byte) 4);
        g = new ibi0(i2, (byte) 5);
        h = new ibi0(i2, (byte) 6);
        i = new ibi0(i2, (byte) 7);
        t = new ibi0(i2, (byte) 8);
        X = new ibi0(i2, (byte) 9);
        Y = new ibi0(i2, (byte) 10);
        Z = new ibi0(i2, (byte) 11);
        N0 = new ibi0(i2, (byte) 12);
        O0 = new ibi0(i2, (byte) 13);
        P0 = new ibi0(i2, (byte) 14);
        Q0 = new ibi0(i2, (byte) 15);
        R0 = new ibi0(i2, (byte) 16);
        S0 = new ibi0(i2, (byte) 17);
        T0 = new ibi0(i2, (byte) 18);
        U0 = new ibi0(i2, (byte) 19);
        V0 = new ibi0(i2, (byte) 20);
        W0 = new ibi0(i2, (byte) 21);
        X0 = new ibi0(i2, (byte) 22);
        Y0 = new ibi0(i2, (byte) 23);
        Z0 = new ibi0(i2, (byte) 24);
        a1 = new ibi0(i2, (byte) 25);
        b1 = new ibi0(i2, (byte) 26);
        c1 = new ibi0(i2, (byte) 27);
        d1 = new ibi0(i2, (byte) 28);
        e1 = new ibi0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ibi0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((cbi0) obj).b;
            case 1:
                return ((fdi0) obj).b;
            case 2:
                return ((d2m0) obj).a((String) obj2);
            case 3:
                return ((xkn0) obj).c;
            case 4:
                wsn0 wsn0Var = (wsn0) obj;
                vsn0 vsn0Var = (vsn0) obj2;
                List list = vsn0Var.a;
                ssn0 ssn0Var = vsn0Var.b;
                int i2 = wsn0Var.a;
                zzq0 zzq0Var = wsn0Var.b;
                List<usn0> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (usn0 usn0Var : list2) {
                    ntn0 ntn0Var = usn0Var.a;
                    boolean z = usn0Var.b;
                    hux huxVar = ntn0Var.a;
                    int i3 = ntn0Var.b;
                    lik1 lik1Var = ntn0Var.c;
                    mtn0 mtn0Var = ntn0Var.d;
                    ssn0 ssn0Var2 = u890.j(ssn0Var.a, lik1Var) ? ssn0Var : null;
                    arrayList.add(new btn0(huxVar, i3, lik1Var, mtn0Var, z, ssn0Var2 != null ? new xsn0(ssn0Var2.c) : zsn0.a));
                }
                return new dtn0(i2, zzq0Var, mqo1.F(arrayList));
            case 5:
                return ((erp0) obj).a;
            case 6:
                return ((rup0) obj).a;
            case 7:
                return u0p1.r((lnt0) obj, (ant0) obj2);
            case 8:
                return oon1.F((tmx0) obj, (fa10) obj2);
            case 9:
                return ((omx0) obj).b;
            case 10:
                return upn1.C((xnx0) obj, (ga10) obj2);
            case 11:
                return ((tnx0) obj).b;
            case 12:
                return new hux0(56, (String) null, (String) null, (String) null, (String) null, wqn1.l((Intent) obj) != null, false);
            case 13:
                return ltn1.s((Bundle) obj);
            case 14:
                return ((lzx0) obj).c;
            case 15:
                return ((mq01) obj).c;
            case 16:
                pla1 pla1Var = (rla1) obj2;
                if (pla1Var instanceof pla1) {
                    return new h3r(new d3r(pla1Var.a().toString()));
                }
                if (pla1Var instanceof qla1) {
                    return new j3r(((qla1) pla1Var).a());
                }
                eg.o();
                return null;
            case 17:
                pla1 pla1Var2 = (rla1) obj2;
                if (pla1Var2 instanceof pla1) {
                    return new h3r(new d3r(pla1Var2.a().toString()));
                }
                if (pla1Var2 instanceof qla1) {
                    return new j3r(((qla1) pla1Var2).a());
                }
                eg.o();
                return null;
            case 18:
                pla1 pla1Var3 = (rla1) obj2;
                if (pla1Var3 instanceof pla1) {
                    return new h3r(new d3r(pla1Var3.a().toString()));
                }
                if (pla1Var3 instanceof qla1) {
                    return new j3r(((qla1) pla1Var3).a());
                }
                eg.o();
                return null;
            case 19:
                pla1 pla1Var4 = (rla1) obj2;
                if (pla1Var4 instanceof pla1) {
                    return new h3r(new d3r(pla1Var4.a().toString()));
                }
                if (pla1Var4 instanceof qla1) {
                    return new j3r(((qla1) pla1Var4).a());
                }
                eg.o();
                return null;
            case 20:
                return ((wc11) obj).b;
            case 21:
                return new ed11((jo70) obj, (xkk1) obj2);
            case 22:
                return new kdn0(Boolean.FALSE);
            case 23:
                return null;
            case 24:
                PlayerState playerState = (PlayerState) obj2;
                return new ue21(((ContextTrack) playerState.track().b()).uri(), x8p1.m(playerState), x8p1.p(x8p1.m(playerState), playerState.restrictions()), x8p1.n(playerState.restrictions()));
            case 25:
                return null;
            case 26:
                return ((y081) obj).c;
            case 27:
                return ((hc81) obj).b;
            case 28:
                return Boolean.valueOf(u890.j(((ContextTrack) ((spq0) obj).b()).uri(), ((ContextTrack) ((spq0) obj2).b()).uri()));
            default:
                return null;
        }
    }
}
