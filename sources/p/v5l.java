package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v5l implements u9h1 {
    public final i8h1 a;

    public n8h1 b(zv31 zv31Var, int i, String str) {
        n5l n5lVar = (n5l) zv31Var.j;
        if (n5lVar.b) {
            return new byk0(new jpk0(new fyk0()), Integer.valueOf(i), str, n5lVar.d, (byte) 5);
        }
        return new byk0(new jpk0(new fyk0()), Integer.valueOf(i), str, n5lVar.a, (byte) 1);
    }

    public w7h1 c(zv31 zv31Var, int i, String str) {
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
        String str2 = ((n5l) zv31Var.j).d;
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC = y6h1VarA.c();
        x6h1VarC.i.add(new a7h1("connect_device", (String) null, numValueOf, str2, str));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis());
    }

    public n8h1 f(zv31 zv31Var, int i, String str) {
        return new cyk0(new byk0(new jpk0(new fyk0()), Integer.valueOf(i), str, ((n5l) zv31Var.j).d, (byte) 1), (byte) 0);
    }
}
