package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vs10 implements Function, Function3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContextTrack b;

    public /* synthetic */ vs10(ContextTrack contextTrack, byte b) {
        this.a = b;
        this.b = contextTrack;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        ContextTrack contextTrack = this.b;
        switch (b) {
            case 0:
                boolean zJ = l4o1.J(contextTrack);
                Boolean bool = ((to91) obj).a;
                if (bool != null) {
                    zJ = bool.booleanValue();
                }
                return Boolean.valueOf(zJ);
            case 1:
                return new a500(contextTrack, (List) obj);
            default:
                return Boolean.valueOf(l4o1.J(contextTrack) || ((Boolean) obj).booleanValue());
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        Boolean bool = ((to91) obj).a;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        return new o621(this.b, bool, (kl3) obj2, zBooleanValue);
    }
}
