package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rsg extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tsg b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsg(String str, tsg tsgVar) {
        super(0);
        this.a = (byte) 0;
        this.c = str;
        this.b = tsgVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        tsg tsgVar = this.b;
        switch (b) {
            case 0:
                if (str.equals(tsgVar.e) && tsgVar.d.contains(str)) {
                    tsgVar.c(true);
                }
                break;
            case 1:
                tsgVar.d.add(str);
                tsgVar.c(str.equals(tsgVar.e));
                break;
            default:
                tsgVar.d.remove(str);
                tsgVar.c(false);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rsg(tsg tsgVar, String str, byte b) {
        super(0);
        this.a = b;
        this.b = tsgVar;
        this.c = str;
    }
}
