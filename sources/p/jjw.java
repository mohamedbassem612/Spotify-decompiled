package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jjw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ elw a;

    public jjw(elw elwVar) {
        this.a = elwVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00da A[RETURN] */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objC;
        ddw ddwVar = (ddw) obj;
        yeu yeuVar = this.a.d;
        Set set = s4b1.f;
        String strS = uic.x(ddwVar.a).s();
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        if (strS != null && strS.length() != 0) {
            String strZ = uic.w(strS).z();
            if (strZ != null) {
                f1n0 f1n0Var = yeuVar.a;
                tv80 tv80Var = ddwVar.g;
                dwn0 dwn0Var = new dwn0(strZ, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null);
                mmr0 mmr0Var = new mmr0("entityUri", ddwVar.b);
                mmr0 mmr0Var2 = new mmr0("contextUri", ddwVar.c);
                mmr0 mmr0Var3 = new mmr0("isPlaying", Boolean.valueOf(ddwVar.d));
                Long l = ddwVar.e;
                mmr0 mmr0Var4 = new mmr0("timestamp", new Long(l != null ? l.longValue() : 0L));
                Boolean bool = Boolean.FALSE;
                mmr0 mmr0Var5 = new mmr0("isOpenedFromChat", bool);
                mmr0 mmr0Var6 = new mmr0("isFollowing", bool);
                String str = ddwVar.f;
                String strH0 = ihc1.H0(str, "spotify:chat:");
                if (strH0.equals(str) || strH0.length() <= 0) {
                    strH0 = null;
                }
                objC = f1n0Var.c(dwn0Var, mno1.h(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, mmr0Var5, mmr0Var6, new mmr0("groupChatId", strH0)}), onmVar);
                if (objC != d9nVar) {
                }
            }
            if (objC == d9nVar) {
                return objC;
            }
            return rih1Var;
        }
        Logger.k(f4i1.f("GroupFeedActivityCarouselItem: cannot route to member details — invalid user URI '", ddwVar.a, "'"), new Object[0]);
        objC = rih1Var;
        if (objC == d9nVar) {
            return objC;
        }
        return rih1Var;
    }
}
