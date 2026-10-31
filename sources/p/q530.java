package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q530 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p410 b;

    public /* synthetic */ q530(p410 p410Var, byte b) {
        this.a = b;
        this.b = p410Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        p410 p410Var = this.b;
        switch (b) {
            case 0:
                ((bpb1) p410Var.f).m((Object) null, (p530) obj);
                break;
            default:
                bpb1 bpb1Var = (bpb1) p410Var.f;
                bpb1Var.m((Object) null, p530.a((p530) bpb1Var.getValue(), (List) null, (String) null, (xkg0) null, ((Boolean) obj).booleanValue(), (Set) null, (g3d0) null, 55));
                break;
        }
    }
}
