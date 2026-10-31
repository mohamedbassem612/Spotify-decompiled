package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fj9 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gjb b;

    public /* synthetic */ fj9(gjb gjbVar, byte b) {
        this.a = b;
        this.b = gjbVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        gjb gjbVar = this.b;
        switch (b) {
            case 0:
                if (((zi9) obj).a.isEmpty()) {
                    gjbVar.a();
                } else if (!gjbVar.g.contains("social_radar")) {
                    n57.e("Identifier social_radar must have been previously enabled in order to initiate a scan request with it!");
                } else {
                    gjbVar.t.onNext(new cjb());
                }
                break;
            case 1:
                mmr0 mmr0Var = (mmr0) obj;
                Set set = (Set) mmr0Var.a;
                zib zibVar = (zib) mmr0Var.b;
                boolean zIsEmpty = set.isEmpty();
                yib yibVar = yib.a;
                if (zIsEmpty && zibVar.equals(yibVar)) {
                    gjbVar.g();
                    break;
                } else if (!set.isEmpty() && !zibVar.equals(yibVar)) {
                    gjbVar.f();
                    break;
                }
                break;
            default:
                gjbVar.Y.onNext(new wib(5));
                break;
        }
    }
}
