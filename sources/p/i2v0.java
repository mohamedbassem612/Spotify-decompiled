package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i2v0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bhx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2v0(Object obj, bhx bhxVar, byte b) {
        super(0);
        this.a = b;
        this.b = bhxVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bhx bhxVar = this.b;
        switch (b) {
            case 0:
                bhxVar.a();
                break;
            case 1:
                l2v0.c(new i2v0(bhxVar, (byte) 0));
                break;
            case 2:
                bhxVar.a();
                break;
            case 3:
                xae.a(new i2v0(bhxVar, (byte) 2));
                break;
            case 4:
                bhxVar.a();
                break;
            case 5:
                xae.a(new i2v0(bhxVar, (byte) 4));
                break;
            case 6:
                bhxVar.a();
                break;
            default:
                l2v0.d(new i2v0(bhxVar, (byte) 6));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2v0(bhx bhxVar, byte b) {
        super(0);
        this.a = b;
        this.b = bhxVar;
    }
}
