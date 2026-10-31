package p;

import java.io.IOException;
import java.util.NoSuchElementException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m2a {
    public static final bma1 c;
    public static final bma1 d;
    public static final bma1 e;
    public static final bma1 f;
    public final dma1 a;
    public final nfa0 b;

    static {
        nbc nbcVar = bma1.b;
        c = nbcVar.u("premium_badge_campaign");
        d = nbcVar.u("premium_badge_campaign_has_viewed");
        e = nbcVar.u("premium_badge_campaign_last_fetched");
        f = nbcVar.u("premium_badge_campaign_last_failed");
    }

    public m2a(dma1 dma1Var, nfa0 nfa0Var) {
        this.a = dma1Var;
        this.b = nfa0Var;
    }

    public final l1a a() {
        try {
            String strF = this.a.f(c);
            if (strF != null) {
                return (l1a) this.b.a(strF, l1a.Companion.serializer());
            }
            return null;
        } catch (IOException e2) {
            e2.getMessage();
            return null;
        } catch (SerializationException e3) {
            e3.getMessage();
            return null;
        } catch (NoSuchElementException e4) {
            e4.getMessage();
            return null;
        }
    }
}
