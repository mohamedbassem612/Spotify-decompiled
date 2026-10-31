package p;

import com.spotify.player.model.ContextTrack;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l61 implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public l61(ylm ylmVar, Object obj) {
        this.a = (byte) 0;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((ContextTrack) obj).equals((ContextTrack) obj2);
            case 1:
                Set set = s4b1.f;
                return uic.g(((q0a) obj).b.b, (blc0) obj2);
            case 2:
                Set set2 = s4b1.f;
                return uic.j(((q0a) obj).b.b, (b3i1) obj2);
            case 3:
                return u890.j(((k7p0) obj).a, (l7p0) obj2);
            default:
                return u890.j(((k480) obj).a, (String) obj2);
        }
    }

    public /* synthetic */ l61(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
