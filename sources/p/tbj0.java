package p;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.cosmos.p000servicebasedrouter.AndroidServicebasedrouterProperties$TestHelper;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tbj0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ccj0 a;

    public tbj0(ccj0 ccj0Var) {
        this.a = ccj0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ccj0 ccj0Var = this.a;
        Resources resources = ccj0Var.b;
        r35 r35Var = (r35) ccj0Var.g.get();
        Context context = ccj0Var.a;
        Set set = s4b1.f;
        String strZ = uic.C(ccj0Var.h.a, (String) null).z();
        if (strZ == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        a6j0 a6j0Var = new a6j0(strZ, resources.getString(2131958580), (String) null, (String) null, (dqi1) null, sqg0.J(new mmr0[]{new mmr0("feature", "campfire_invite"), new mmr0("new_message_invite", AndroidServicebasedrouterProperties$TestHelper.TRUE), new mmr0("friend_request", AndroidServicebasedrouterProperties$TestHelper.TRUE), new mmr0("locale", resources.getConfiguration().getLocales().get(0).getLanguage())}), (o371) null, 92);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        Object objA = r35Var.a(context, a6j0Var, yon1.G1("CHAT_ADD_FRIENDS", "chat/add-friends", 315, "chat").a, nik1.e5.a, "android-libs-inappmessaging", (String) null, onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objA != d9nVar) {
            objA = rih1Var;
        }
        return objA == d9nVar ? objA : rih1Var;
    }
}
