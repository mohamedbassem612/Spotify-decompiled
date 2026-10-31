package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g9a1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b9u0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g9a1(b9u0 b9u0Var, byte b) {
        super(1);
        this.a = b;
        this.b = b9u0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        b9u0 b9u0Var = this.b;
        switch (b) {
            case 0:
                mic1 mic1Var = (mic1) obj;
                String str = mic1Var.a;
                String str2 = mic1Var.b;
                String str3 = mic1Var.c;
                q541 q541VarO = str3 != null ? pxd0.O(str3) : null;
                String str4 = mic1Var.d;
                return new p541(str, str2, q541VarO, str4 != null ? pxd0.N(str4) : 0, mic1Var.e, new b9u0(b9u0Var.a, b9u0Var.b, "SongDNASample"));
            default:
                nic1 nic1Var = (nic1) obj;
                String str5 = nic1Var.a;
                String str6 = nic1Var.b;
                String str7 = nic1Var.c;
                q541 q541VarO2 = str7 != null ? pxd0.O(str7) : null;
                String str8 = nic1Var.d;
                return new p541(str5, str6, q541VarO2, str8 != null ? pxd0.N(str8) : 0, nic1Var.e, new b9u0(b9u0Var.a, b9u0Var.b, "SongDNASampledIn"));
        }
    }
}
