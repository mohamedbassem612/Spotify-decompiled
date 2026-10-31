package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pas implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ip91 b;

    public /* synthetic */ pas(ip91 ip91Var, byte b) {
        this.a = b;
        this.b = ip91Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        ip91 ip91Var = this.b;
        switch (b) {
            case 0:
                ContextTrack contextTrack = (ContextTrack) obj;
                String strA0 = l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_CONTEXT_URI);
                if (strA0 == null) {
                    strA0 = "";
                }
                String strUid = contextTrack.uid();
                String str = strUid != null ? strUid : "";
                return ((strA0.length() <= 0 || str.length() <= 0) ? Flowable.I(new to91(null)) : ip91Var.c(str, strA0).toFlowable(BackpressureStrategy.d)).J(new tzo(contextTrack, (byte) 12));
            default:
                return ip91Var.f(((jdu0) obj).a);
        }
    }
}
