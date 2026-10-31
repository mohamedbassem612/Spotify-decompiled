package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lpt0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dfm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lpt0(dfm dfmVar, byte b) {
        super(4);
        this.a = b;
        this.b = dfmVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        Single singleA;
        byte b = this.a;
        dfm dfmVar = this.b;
        switch (b) {
            case 0:
                gn10 gn10Var = (gn10) dfmVar.e;
                w9u0 w9u0Var = (w9u0) dfmVar.d;
                int iOrdinal = ((bpt0) obj3).ordinal();
                if (iOrdinal == 0) {
                    singleA = w9u0Var.a(new g9u0(gn10Var.getName(), false));
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    singleA = w9u0Var.a(new d9u0(gn10Var.getName(), false));
                }
                return singleA.ignoreElement();
            default:
                return new mpt0((Context) obj2, dfmVar, (iu30) obj4);
        }
    }
}
