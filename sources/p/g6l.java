package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g6l extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lag b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6l(lag lagVar, byte b) {
        super(0);
        this.a = b;
        this.b = lagVar;
    }

    public final Object invoke() {
        byte b = this.a;
        lag lagVar = this.b;
        switch (b) {
            case 0:
                return new pzs((mr20) ((idd1) lagVar.d).getValue(), 2131961693, (byte) 19);
            case 1:
                return new nwd((mr20) ((idd1) lagVar.c).getValue(), (byte) 26);
            default:
                return new wef(yoi1.g(((g0l) lagVar.b).d()), (byte) 11);
        }
    }
}
