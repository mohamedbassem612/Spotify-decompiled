package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tz5 implements u9h1 {
    public final i8h1 a;

    public tz5(i8h1 i8h1Var) {
        this.a = i8h1Var;
        r6h1 r6h1Var = r6h1.c;
    }

    public ou80 a(String str, int i, qq80 qq80Var, String str2) {
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
        String str3 = qq80Var.a;
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC = y6h1VarA.c();
        x6h1VarC.i.add(new a7h1("connect_device", (String) null, numValueOf, str3, str2));
        x6h1VarC.j = true;
        y6h1 y6h1VarA2 = x6h1VarC.a();
        String strC = kno1.C(qq80Var);
        x6h1 x6h1VarC2 = y6h1VarA2.c();
        x6h1VarC2.i.add(new a7h1("jam_session", str, (Integer) null, (String) null, strC));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA3 = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        return this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA3, r6h1.c, System.currentTimeMillis()), (xj61) null).a;
    }

    public n8h1 b(zv31 zv31Var, int i, String str) {
        return new cyk0(new byk0(new jpk0(new fyk0()), Integer.valueOf(i), str, ((sz5) zv31Var.j).a, (byte) 1), (byte) 0);
    }

    public w7h1 c(zv31 zv31Var, int i, String str) {
        return null;
    }

    public n8h1 f(zv31 zv31Var, int i, String str) {
        return new cyk0(new byk0(new jpk0(new fyk0()), Integer.valueOf(i), str, ((sz5) zv31Var.j).a, (byte) 1), (byte) 0);
    }
}
