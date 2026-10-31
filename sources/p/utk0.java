package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class utk0 implements n8h1, p8h1 {
    public final y6h1 a;

    public utk0(xok0 xok0Var, int i) {
        String str;
        x6h1 x6h1VarC = xok0Var.b.c();
        switch (i) {
            case 1:
                str = "app_started";
                break;
            case 2:
                str = "car";
                break;
            case 3:
                str = "cast";
                break;
            case 4:
                str = "device_picker";
                break;
            case 5:
                str = "headphones";
                break;
            case 6:
                str = "home_devices";
                break;
            case 7:
                str = "invite_sheet";
                break;
            case 8:
                str = "jam_was_joined";
                break;
            case 9:
                str = "settings";
                break;
            case 10:
                str = "speaker";
                break;
            default:
                throw null;
        }
        x6h1VarC.i.add(new a7h1("onboarding_slate", (String) null, (Integer) null, (String) null, str));
        x6h1VarC.j = true;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        return k7h1Var.a();
    }
}
