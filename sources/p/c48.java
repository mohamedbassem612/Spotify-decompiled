package p;

import com.spotify.externalintegration.loggingservice.events.proto.AudioRouteSegmentEnd;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c48 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d48 b;

    public /* synthetic */ c48(d48 d48Var, byte b) {
        this.a = b;
        this.b = d48Var;
    }

    public final void accept(Object obj) {
        zpd zpdVar;
        byte b = this.a;
        d48 d48Var = this.b;
        switch (b) {
            case 0:
                mmr0 mmr0Var = (mmr0) obj;
                a48 a48Var = (a48) mmr0Var.a;
                Integer num = a48Var.b;
                String str = (String) mmr0Var.b;
                a48 a48Var2 = d48Var.j;
                String str2 = a48Var.a;
                if (u890.j(str2, a48Var2 != null ? a48Var2.a : null)) {
                    if (u890.j(a48Var.c, a48Var2 != null ? a48Var2.c : null)) {
                        if (u890.j(num, a48Var2 != null ? a48Var2.b : null)) {
                        }
                    }
                }
                String str3 = d48Var.j != null ? "route_change" : "start_playback";
                b48 b48VarN = AudioRouteSegmentEnd.n();
                b48VarN.y(str3);
                b48VarN.s(String.valueOf(num));
                b48VarN.q(a48Var.d);
                b48VarN.t(str);
                if (d48.a(a48Var)) {
                    b48VarN.r(str2);
                }
                zpd zpdVar2 = d48Var.l;
                if (zpdVar2 != null) {
                    b48VarN.n(zpdVar2.a);
                }
                a48 a48Var3 = d48Var.j;
                if (a48Var3 != null) {
                    b48VarN.x(String.valueOf(a48Var3.b));
                    b48VarN.v(a48Var3.d);
                    if (d48.a(a48Var3)) {
                        b48VarN.w(a48Var3.a);
                    }
                    zpd zpdVar3 = d48Var.l;
                    if (zpdVar3 != null) {
                        b48VarN.u(zpdVar3.a);
                    }
                }
                d48Var.b.a((AudioRouteSegmentEnd) b48VarN.build());
                d48Var.j = a48Var;
                break;
            case 1:
                int i = ((zpd) obj).a;
                a48 a48Var4 = d48Var.j;
                String str4 = d48Var.k;
                if (a48Var4 != null) {
                    String str5 = a48Var4.a;
                    String str6 = a48Var4.d;
                    Integer num2 = a48Var4.b;
                    if (str4 != null) {
                        b48 b48VarN2 = AudioRouteSegmentEnd.n();
                        b48VarN2.y("car_connection_type_change");
                        b48VarN2.s(String.valueOf(num2));
                        b48VarN2.q(str6);
                        b48VarN2.x(String.valueOf(num2));
                        b48VarN2.v(str6);
                        b48VarN2.t(str4);
                        b48VarN2.n(i);
                        zpd zpdVar4 = d48Var.l;
                        if (zpdVar4 != null) {
                            b48VarN2.u(zpdVar4.a);
                        }
                        if (d48.a(a48Var4)) {
                            b48VarN2.r(str5);
                            b48VarN2.w(str5);
                        }
                        d48Var.b.a((AudioRouteSegmentEnd) b48VarN2.build());
                    }
                }
                if (i == 0) {
                    zpdVar = zpd.c;
                } else if (i != 1) {
                    zpdVar = i != 2 ? zpd.b : zpd.e;
                } else {
                    zpdVar = zpd.d;
                }
                d48Var.l = zpdVar;
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                d48Var.i = !zBooleanValue;
                if (!zBooleanValue) {
                    a48 a48Var5 = d48Var.j;
                    String str7 = d48Var.k;
                    if (a48Var5 != null && str7 != null) {
                        d48Var.b(a48Var5, str7);
                        break;
                    }
                }
                break;
        }
    }
}
