package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cyb1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ayb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cyb1(ayb1 ayb1Var, byte b) {
        super(1);
        this.a = b;
        this.b = ayb1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        ayb1 ayb1Var = this.b;
        switch (b) {
            case 0:
                ayb1Var.getClass();
                return new m441(new hgo0(ayb1Var, (String) obj, (lnm) null, (byte) 24));
            default:
                String str = ((myb1) obj).a;
                ayb1Var.getClass();
                return new x010(new x010(new m441(new q721((Object) ayb1Var, (Object) str, lnmVar, (byte) 14)), ayb1Var.f, new bu51(3, (lnm) null, (byte) 9), (byte) 1), ayb1Var.d, new dwf0(ayb1Var, (lnm) null, (byte) 27), (byte) 1);
        }
    }
}
