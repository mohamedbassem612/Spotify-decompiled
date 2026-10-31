package p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class bvn implements av30, k3i1, Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ bvn(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    public /* synthetic */ Object apply(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return iu30Var.invoke(obj);
    }

    public void b(String str) {
        this.b.invoke(new oet(str));
    }

    public boolean test(Object obj) {
        return ((Boolean) this.b.invoke((PlayerState) obj)).booleanValue();
    }
}
