package p;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cxy implements y371 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ cxy(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.y371
    public final Object a(ywy ywyVar, o571 o571Var, List list, Uri uri, lnm lnmVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                for (mmr0 mmr0Var : (List) obj) {
                    if (((yjd) mmr0Var.a).a(ywyVar.a().a.a.a)) {
                        return ((y371) mmr0Var.b).a(ywyVar, o571Var, list, uri, lnmVar);
                    }
                }
                bhn0.t("Collection contains no element matching the predicate.");
                return null;
            default:
                wwy wwyVar = ywyVar instanceof wwy ? (wwy) ywyVar : null;
                return ((ic9) obj).h(ywyVar.a().a.a, wwyVar != null ? wwyVar.f : null, wwyVar != null ? wwyVar.h() : null, o571Var, list, uri, (onm) lnmVar);
        }
    }
}
