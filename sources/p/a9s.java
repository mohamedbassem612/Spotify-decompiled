package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a9s implements Update {
    public static final a9s a = new a9s();

    public final Next a(Object obj, Object obj2) {
        rgj0 rgj0Var = (rgj0) obj;
        tq80 tq80Var = (tq80) obj2;
        pgj0 pgj0Var = (pgj0) tq80Var.a;
        Object obj3 = null;
        if (pgj0Var instanceof igj0) {
            MessageResponseToken messageResponseToken = rgj0Var.a;
            if (messageResponseToken == null) {
                return Next.j();
            }
            for (Object obj4 : rgj0Var.c) {
                if (u890.j(((Button) obj4).getIdentifier(), ((igj0) pgj0Var).a)) {
                    obj3 = obj4;
                    break;
                }
            }
            Button button = (Button) obj3;
            if (button == null) {
                return Next.j();
            }
            tqw tqwVar = tq80Var.b;
            if (tqwVar != null) {
                ((igj0) pgj0Var).c.putSerializable("UBI_INTERACTION_LOGGING_RESULT", n3o1.y(tqwVar));
            }
            igj0 igj0Var = (igj0) pgj0Var;
            return Next.a(Collections.singleton(new bgj0(igj0Var.c, igj0Var.b, messageResponseToken, button)));
        }
        boolean z = pgj0Var instanceof lgj0;
        tgj0 tgj0Var = tgj0.c;
        if (z) {
            MessageResponseToken messageResponseToken2 = rgj0Var.a;
            return messageResponseToken2 == null ? Next.j() : Next.i(rgj0.a(rgj0Var, null, null, null, tgj0Var, 0, false, 119), Collections.singleton(new egj0(messageResponseToken2)));
        }
        if (pgj0Var instanceof ngj0) {
            rgj0Var.getClass();
            return Next.h(rgj0.a(rgj0Var, null, null, null, ugj0.c, 0, false, 119));
        }
        if (pgj0Var instanceof mgj0) {
            rgj0Var.getClass();
            rgj0 rgj0VarA = rgj0.a(rgj0Var, null, null, null, tgj0Var, 0, false, 119);
            MessageResponseToken messageResponseToken3 = rgj0Var.a;
            return messageResponseToken3 == null ? Next.j() : Next.i(rgj0VarA, Collections.singleton(new cgj0(messageResponseToken3, new DiscardReason$PresentationFailed(((mgj0) pgj0Var).a))));
        }
        if (pgj0Var instanceof kgj0) {
            rgj0Var.getClass();
            kgj0 kgj0Var = (kgj0) pgj0Var;
            return Next.i(rgj0.a(rgj0Var, null, null, null, null, kgj0Var.a, false, 111), Collections.singleton(new fgj0(kgj0Var.a)));
        }
        if (pgj0Var instanceof jgj0) {
            if (((jgj0) pgj0Var).a) {
                return Next.j();
            }
            rgj0Var.getClass();
            return Next.i(rgj0.a(rgj0Var, null, null, null, null, 0, false, 95), Collections.singleton(dgj0.a));
        }
        if (pgj0Var instanceof ogj0) {
            return Next.a(Collections.singleton(new ggj0(((ogj0) pgj0Var).a)));
        }
        eg.o();
        return null;
    }
}
