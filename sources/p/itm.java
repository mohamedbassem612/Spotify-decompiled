package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class itm extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mtm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ itm(mtm mtmVar, byte b) {
        super(1);
        this.a = b;
        this.b = mtmVar;
    }

    public final Object invoke(Object obj) {
        lgy lgyVarP;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mtm mtmVar = this.b;
        switch (b) {
            case 0:
                return new rm(mtmVar, (byte) 26);
            case 1:
                String str = (String) obj;
                qtm qtmVar = mtmVar.c;
                if (qtmVar instanceof qtm) {
                    qtm qtmVar2 = qtmVar;
                    Uri.Builder builderAppendQueryParameter = new Uri.Builder().encodedPath("spotify:internal:contribution-notes-management:edit").appendQueryParameter("context_uri", qtmVar2.b).appendQueryParameter("item_uri", qtmVar2.c);
                    String str2 = qtmVar2.d;
                    if (str2 != null) {
                        builderAppendQueryParameter.appendQueryParameter("list_item_id", str2);
                    }
                    String string = builderAppendQueryParameter.build().toString();
                    k3l0 k3l0VarT = p6p1.t(qtmVar.c(), str == null ? "spotify:contribution:" : str);
                    if (str == null) {
                        str = "";
                    }
                    sqk0 sqk0Var = new sqk0(k3l0VarT, str);
                    lgyVarP = k4k.p(2131954552);
                    lgyVarP.b(2131954558);
                    lgyVarP.i = new lw6(mtmVar, sqk0Var, (byte) 2);
                    lgyVarP.g = new kw6(mtmVar, sqk0Var, string, (byte) 3);
                } else {
                    if (!(qtmVar instanceof stm)) {
                        eg.o();
                        return null;
                    }
                    lgyVarP = k4k.p(2131954554);
                }
                mtmVar.i.o(lgyVarP.c());
                return rih1Var;
            default:
                z710.d(mtmVar.h, (String) obj, false, 6);
                return rih1Var;
        }
    }
}
