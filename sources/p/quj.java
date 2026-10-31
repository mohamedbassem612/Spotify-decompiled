package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class quj implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tuj b;

    public /* synthetic */ quj(tuj tujVar, byte b) {
        this.a = b;
        this.b = tujVar;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tuj tujVar = this.b;
        switch (b) {
            case 0:
                Object objY = fn31.Y(tujVar.g, new bag(tujVar, (List) obj, (lnm) null, (byte) 19), lnmVar);
                return objY == d9n.a ? objY : rih1Var;
            default:
                tujVar.j.m0(rih1Var);
                return rih1Var;
        }
    }
}
