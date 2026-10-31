package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class byk0 implements n8h1, p8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ jpk0 c;

    public byk0(jpk0 jpk0Var, Integer num, String str, byte b) {
        this.a = b;
        switch (b) {
            case 4:
                this.c = jpk0Var;
                x6h1 x6h1VarC = jpk0Var.b.c();
                x6h1VarC.i.add(new a7h1("grouped_device", (String) null, num, str, (String) null));
                x6h1VarC.j = true;
                this.b = x6h1VarC.a();
                break;
            case 5:
            default:
                this.c = jpk0Var;
                x6h1 x6h1VarC2 = jpk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("groupable_device", (String) null, num, str, (String) null));
                x6h1VarC2.j = true;
                this.b = x6h1VarC2.a();
                break;
            case 6:
                this.c = jpk0Var;
                x6h1 x6h1VarC3 = jpk0Var.b.c();
                x6h1VarC3.i.add(new a7h1("local_device_speakers", (String) null, num, (String) null, str));
                x6h1VarC3.j = true;
                this.b = x6h1VarC3.a();
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                break;
            case 1:
                r6h1 r6h1Var2 = r6h1.c;
                break;
            case 2:
                r6h1 r6h1Var3 = r6h1.c;
                break;
            case 3:
                r6h1 r6h1Var4 = r6h1.c;
                break;
            case 4:
                r6h1 r6h1Var5 = r6h1.c;
                break;
            case 5:
                r6h1 r6h1Var6 = r6h1.c;
                break;
            default:
                r6h1 r6h1Var7 = r6h1.c;
                break;
        }
        return new r6h1(kk0.l(y6h1Var), (u8h1) null);
    }

    public final l7h1 e() {
        byte b = this.a;
        jpk0 jpk0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1Var;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = jpk0Var.c.b;
                return k7h1Var.a();
            case 1:
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1Var;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var2.e = jpk0Var.c.b;
                return k7h1Var2.a();
            case 2:
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1Var;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var3.e = jpk0Var.c.b;
                return k7h1Var3.a();
            case 3:
                k7h1 k7h1Var4 = new k7h1();
                ((xjn) k7h1Var4).a = y6h1Var;
                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var4.e = jpk0Var.c.b;
                return k7h1Var4.a();
            case 4:
                k7h1 k7h1Var5 = new k7h1();
                ((xjn) k7h1Var5).a = y6h1Var;
                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var5.e = jpk0Var.c.b;
                return k7h1Var5.a();
            case 5:
                k7h1 k7h1Var6 = new k7h1();
                ((xjn) k7h1Var6).a = y6h1Var;
                ((xjn) k7h1Var6).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var6.e = jpk0Var.c.b;
                return k7h1Var6.a();
            default:
                k7h1 k7h1Var7 = new k7h1();
                ((xjn) k7h1Var7).a = y6h1Var;
                ((xjn) k7h1Var7).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var7.e = jpk0Var.c.b;
                return k7h1Var7.a();
        }
    }

    public byk0(jpk0 jpk0Var) {
        this.a = (byte) 3;
        this.c = jpk0Var;
        x6h1 x6h1VarC = jpk0Var.b.c();
        x6h1VarC.i.add(new a7h1("groupable_devices_toggle", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public byk0(jpk0 jpk0Var, Integer num, String str, String str2, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = jpk0Var;
                x6h1 x6h1VarC = jpk0Var.b.c();
                x6h1VarC.i.add(new a7h1("connect_device", (String) null, num, str2, str));
                x6h1VarC.j = true;
                this.b = x6h1VarC.a();
                break;
            case 5:
                this.c = jpk0Var;
                x6h1 x6h1VarC2 = jpk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("local_device", (String) null, num, str2, str));
                x6h1VarC2.j = true;
                this.b = x6h1VarC2.a();
                break;
            default:
                this.c = jpk0Var;
                x6h1 x6h1VarC3 = jpk0Var.b.c();
                x6h1VarC3.i.add(new a7h1("bluetooth_device", (String) null, num, str2, str));
                x6h1VarC3.j = true;
                this.b = x6h1VarC3.a();
                break;
        }
    }
}
