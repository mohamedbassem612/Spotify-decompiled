package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w2k implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z2k b;

    public /* synthetic */ w2k(z2k z2kVar, byte b) {
        this.a = b;
        this.b = z2kVar;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        z2k z2kVar = this.b;
        switch (b) {
            case 0:
                z2kVar.v.l((Set) obj);
                break;
            default:
                z2kVar.I();
                break;
        }
        return rih1Var;
    }
}
