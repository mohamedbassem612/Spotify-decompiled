package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.tome.pageactivity.PageActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class my5 implements but {
    public final Context a;
    public final sfr b;
    public final tz5 c;
    public final tz5 d;

    public my5(Context context, sfr sfrVar, a0b a0bVar, tz5 tz5Var) {
        this.a = context;
        this.b = sfrVar;
        this.c = tz5Var;
        this.d = tz5Var;
    }

    @Override // p.but
    public final u9h1 a() {
        return this.d;
    }

    @Override // p.but
    public final mr20 b() {
        return rqt0.u(new c64(new fu20(d5p1.h(this.b.c), new s4(2, (lnm) null, (byte) 13), (byte) 1), this, (byte) 6));
    }

    @Override // p.but
    public final ou80 c(zv31 zv31Var, int i, String str) {
        Object obj = zv31Var.j;
        if (ky5.a[l1d.C(1)] != 1) {
            eg.o();
            return null;
        }
        sz5 sz5Var = (sz5) obj;
        String str2 = sz5Var.a;
        String str3 = sz5Var.b;
        i8h1 i8h1Var = this.c.a;
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
        String str4 = sz5Var.a;
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC = y6h1VarA.c();
        x6h1VarC.i.add(new a7h1("connect_device", (String) null, numValueOf, str4, str));
        x6h1VarC.j = true;
        y6h1 y6h1VarA2 = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        tv80 tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(f4i1.f("spotify:atv-pin-entry:", Uri.encode(str2), "")));
        Context context = this.a;
        intent.setClassName(context.getApplicationContext(), PageActivity.class.getName());
        intent.setFlags(536870912);
        Intent intentAddFlags = intent.addFlags(268435456);
        intentAddFlags.putExtra("apple_tv_device_ip", str3);
        gg.I(intentAddFlags, tv80VarM);
        context.startActivity(intentAddFlags);
        return tv80VarM.a;
    }

    @Override // p.but
    public final wly0 getType() {
        return wly0.e;
    }
}
