package p;

import android.content.Context;
import com.spotify.connect.esperanto.proto.CommonMessages$LoggingParams;
import com.spotify.connect.esperanto.proto.ConnectMessages$InstallSpotifyRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class j2l implements but {
    public final g0l a;
    public final Context b;
    public final gur c;
    public final h9n d;
    public final v5l e;
    public final tq f;
    public final v5l g;

    public j2l(g0l g0lVar, Context context, gur gurVar, h9n h9nVar, v5l v5lVar, v5l v5lVar2, tq tqVar) {
        this.a = g0lVar;
        this.b = context;
        this.c = gurVar;
        this.d = h9nVar;
        this.e = v5lVar2;
        this.f = tqVar;
        this.g = v5lVar;
    }

    @Override // p.but
    public final u9h1 a() {
        return this.g;
    }

    @Override // p.but
    public final mr20 b() {
        return new qbk(new wef(yoi1.g(this.a.j()), (byte) 7), this, (byte) 7);
    }

    @Override // p.but
    public final ou80 c(zv31 zv31Var, int i, String str) {
        gur gurVar;
        ou80 ou80Var;
        n5l n5lVar = (n5l) zv31Var.j;
        if (g2l.a[l1d.C(1)] != 1) {
            eg.o();
            return null;
        }
        String str2 = zv31Var.a;
        i8h1 i8h1Var = this.e.a;
        int i2 = n5lVar.c;
        String str3 = n5lVar.d;
        String str4 = n5lVar.a;
        int i3 = g2l.b[l1d.C(i2)];
        gur gurVar2 = this.c;
        b7x b7xVar = b7x.a;
        if (i3 == 1) {
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-connect-menu";
            x6h1VarI.f = "6.6.0";
            x6h1VarI.g = "22.0.0";
            x6h1 x6h1VarR = kk0.r(x6h1VarI, "connect/devicepicker");
            x6h1VarR.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarR.j = false;
            y6h1 y6h1VarA = x6h1VarR.a();
            Integer numValueOf = Integer.valueOf(i);
            x6h1 x6h1VarC = y6h1VarA.c();
            x6h1VarC.i.add(new a7h1("connect_device", (String) null, numValueOf, str4, str));
            x6h1VarC.j = true;
            ou80 ou80Var2 = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a;
            iir iirVar = gurVar2.a;
            String str5 = ou80Var2.a;
            mwh mwhVar = new mwh(this, (byte) 29);
            zor zorVar = (zor) iirVar.b;
            c3l c3lVar = zorVar.a;
            c3lVar.getClass();
            i4l i4lVarN = ConnectMessages$InstallSpotifyRequest.n();
            i4lVarN.n(str3);
            osh oshVarO = CommonMessages$LoggingParams.o();
            oshVarO.n(str5);
            i4lVarN.q((CommonMessages$LoggingParams) oshVarO.build());
            ConnectMessages$InstallSpotifyRequest connectMessages$InstallSpotifyRequest = (ConnectMessages$InstallSpotifyRequest) i4lVarN.build();
            jn7 jn7Var = c3lVar.a;
            connectMessages$InstallSpotifyRequest.getClass();
            Observable observableI = yoi1.i(o4p1.r(new lt20(new i0h(new nwd(jn7Var.callStream("spotify.connect.esperanto.proto.ConnectService", "InstallSpotify", connectMessages$InstallSpotifyRequest), (byte) 24), (byte) 5), new jk(3, null, (byte) 18), (byte) 0), c3lVar.b), zorVar.d);
            Scheduler scheduler = zorVar.c;
            zorVar.g.a(observableI.subscribeOn(scheduler).observeOn(scheduler).doOnError(new wor(mwhVar, str3, str5)).distinctUntilChanged().subscribe(new wor(str3, str5, mwhVar)));
            return ou80Var2;
        }
        if (n5lVar.b) {
            String str6 = n5lVar.f;
            y6h1 y6h1Var2 = y6h1.i;
            x6h1 x6h1VarI2 = i3o1.i();
            x6h1VarI2.h = "music";
            x6h1VarI2.a = "mobile-connect-menu";
            x6h1VarI2.f = "6.6.0";
            x6h1VarI2.g = "22.0.0";
            x6h1 x6h1VarR2 = kk0.r(x6h1VarI2, "connect/devicepicker");
            x6h1VarR2.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarR2.j = false;
            y6h1 y6h1VarA2 = x6h1VarR2.a();
            Integer numValueOf2 = Integer.valueOf(i);
            x6h1 x6h1VarC2 = y6h1VarA2.c();
            gurVar = gurVar2;
            x6h1VarC2.i.add(new a7h1("local_device", (String) null, numValueOf2, str3, str));
            x6h1VarC2.j = true;
            y6h1 y6h1VarA3 = x6h1VarC2.a();
            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
            if (str6 == null) {
                str6 = "";
            }
            ou80Var = i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("disconnect_from_remote_device", 1, Collections.singletonMap("remote_device_id", str6)), y6h1VarA3, r6h1.c, System.currentTimeMillis()), (xj61) null).a;
            iir iirVar2 = gurVar.a;
            zor.i((zor) iirVar2.b, ou80Var.a, 6);
        } else {
            gurVar = gurVar2;
            y6h1 y6h1Var3 = y6h1.i;
            x6h1 x6h1VarI3 = i3o1.i();
            x6h1VarI3.h = "music";
            x6h1VarI3.a = "mobile-connect-menu";
            x6h1VarI3.f = "6.6.0";
            x6h1VarI3.g = "22.0.0";
            x6h1 x6h1VarR3 = kk0.r(x6h1VarI3, "connect/devicepicker");
            x6h1VarR3.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarR3.j = false;
            y6h1 y6h1VarA4 = x6h1VarR3.a();
            Integer numValueOf3 = Integer.valueOf(i);
            x6h1 x6h1VarC3 = y6h1VarA4.c();
            x6h1VarC3.i.add(new a7h1("connect_device", (String) null, numValueOf3, str4, str));
            x6h1VarC3.j = true;
            ou80Var = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("connect_to_remote_device", 1, Collections.singletonMap("remote_device_id", str4)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a;
            iir iirVar3 = gurVar.a;
            zor.k((zor) iirVar3.b, str2, ou80Var.a, 28);
            lur.g((lur) iirVar3.c, str3);
        }
        gurVar.d.a.g();
        return ou80Var;
    }

    @Override // p.but
    public final wly0 getType() {
        return wly0.b;
    }
}
