package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vxv extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zxv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vxv(zxv zxvVar, byte b) {
        super(1);
        this.a = b;
        this.b = zxvVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        w7x w7xVar = w7x.a;
        byte b2 = 4;
        byte b3 = 0;
        rih1 rih1Var = rih1.a;
        zxv zxvVar = this.b;
        switch (b) {
            case 0:
                uxv uxvVar = new uxv(zxvVar, b3);
                ((ji50) obj).b.put(kt51.class, r4o1.P(axv.d, w7xVar, uxvVar, new uxv(zxvVar, (byte) 1)));
                return rih1Var;
            case 1:
                uxv uxvVar2 = new uxv(zxvVar, (byte) 2);
                ((ji50) obj).b.put(vzu0.class, r4o1.P(axv.e, w7xVar, uxvVar2, new uxv(zxvVar, (byte) 3)));
                return rih1Var;
            case 2:
                ((ji50) obj).b.put(hoy0.class, new r3r(new xzq((tyq) zxvVar.c.get(), axv.f), new uxv(zxvVar, b2), 4));
                return rih1Var;
            case 3:
                uxv uxvVar3 = new uxv(zxvVar, (byte) 5);
                ((ji50) obj).b.put(rih1.class, r4o1.P(axv.g, w7xVar, uxvVar3, new uxv(zxvVar, (byte) 6)));
                return rih1Var;
            case 4:
                ((ji50) obj).b.put(yny0.class, new r3r(new xzq((tyq) zxvVar.c.get(), axv.h), new uxv(zxvVar, (byte) 7), 4));
                return rih1Var;
            case 5:
                ((Number) obj).intValue();
                x6h1 x6h1VarC = zxvVar.e.b.c();
                x6h1VarC.i.add(new a7h1("publishable_playlists_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
            default:
                ((Number) obj).intValue();
                x6h1 x6h1VarC2 = zxvVar.e.b.c();
                x6h1VarC2.i.add(new a7h1("published_playlists_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                r6h1 r6h1Var2 = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA2), (u8h1) null);
        }
    }
}
