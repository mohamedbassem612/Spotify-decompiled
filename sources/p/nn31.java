package p;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nn31 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pn31 b;

    public /* synthetic */ nn31(pn31 pn31Var, byte b) {
        this.a = b;
        this.b = pn31Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pn31 pn31Var = this.b;
        switch (b) {
            case 0:
                pn31Var.c();
                break;
            default:
                pn31Var.h.a((Set) obj, (ArrayList) null, (ArrayList) null);
                break;
        }
        return rih1Var;
    }
}
