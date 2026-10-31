package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rep0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rep0(String str, boolean z, String str2, boolean z2, String str3, iu30 iu30Var, int i, int i2, byte b) {
        super(1);
        this.a = b;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = z2;
        this.f = str3;
        this.g = iu30Var;
        this.h = i;
        this.i = i2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.f;
        boolean z = this.e;
        String str2 = this.d;
        boolean z2 = this.c;
        String str3 = this.b;
        iu30 iu30Var = this.g;
        int i = this.h;
        int i2 = this.i;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, str3);
                b261.p(e261Var, f46.i0(new epo[]{z2 ? new epo(str2, new n1j((byte) 2, i, i2, iu30Var)) : null, z ? new epo(str, new n1j((byte) 3, i, i2, iu30Var)) : null}));
                break;
            default:
                e261 e261Var2 = (e261) obj;
                b261.n(e261Var2, str3);
                b261.p(e261Var2, f46.i0(new epo[]{z2 ? new epo(str2, new n1j((byte) 5, i, i2, iu30Var)) : null, z ? new epo(str, new n1j((byte) 6, i, i2, iu30Var)) : null}));
                break;
        }
        return rih1Var;
    }
}
