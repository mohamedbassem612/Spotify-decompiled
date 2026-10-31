package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mzo0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qzo0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mzo0(qzo0 qzo0Var, byte b) {
        super(2);
        this.a = b;
        this.b = qzo0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        u3g1 u3g1Var;
        ArrayList arrayList;
        byte b = this.a;
        qzo0 qzo0Var = this.b;
        switch (b) {
            case 0:
                izo0 izo0Var = (izo0) obj;
                gzo0 gzo0Var = (gzo0) obj2;
                PlayerState playerState = gzo0Var.a;
                ContextTrack contextTrack = (ContextTrack) playerState.track().b();
                ContextTrack contextTrack2 = (ContextTrack) o7h.C0(playerState.prevTracks());
                gjf1 gjf1VarG = contextTrack2 != null ? qzo0Var.g(contextTrack2, false, gzo0Var) : null;
                contextTrack.getClass();
                gjf1 gjf1VarG2 = qzo0Var.g(contextTrack, true, gzo0Var);
                ContextTrack contextTrack3 = (ContextTrack) o7h.s0(playerState.nextTracks());
                gjf1 gjf1VarG3 = contextTrack3 != null ? qzo0Var.g(contextTrack3, false, gzo0Var) : null;
                o131 o131VarI = zr7.I(playerState.restrictions());
                hry0 hry0Var = gzo0Var.d;
                boolean z = gzo0Var.c;
                t62 t62Var = gzo0Var.e;
                Map map = gzo0Var.g;
                boolean zK = qzo0Var.Y.k();
                boolean z2 = gzo0Var.h;
                u3g1 u3g1Var2 = new u3g1(hry0Var, zK, map, t62Var);
                ArrayList arrayList2 = new ArrayList();
                if (gjf1VarG != null) {
                    Boolean boolValueOf = Boolean.valueOf(o131VarI.e);
                    Boolean bool = Boolean.FALSE;
                    u3g1Var = u3g1Var2;
                    arrayList = arrayList2;
                    arrayList.add(u3g1Var.c1(gjf1VarG, boolValueOf, bool, bool, bool));
                } else {
                    u3g1Var = u3g1Var2;
                    arrayList = arrayList2;
                }
                Boolean bool2 = Boolean.FALSE;
                u3g1 u3g1Var3 = u3g1Var;
                arrayList.add(u3g1Var3.c1(gjf1VarG2, bool2, Boolean.valueOf(z), Boolean.TRUE, Boolean.valueOf(z2)));
                if (gjf1VarG3 != null) {
                    arrayList.add(u3g1Var3.c1(gjf1VarG3, Boolean.valueOf(o131VarI.d), bool2, bool2, bool2));
                }
                return new jzo0(new s3g1(o7h.l1(arrayList), gjf1VarG != null ? 1 : 0, o131VarI), new v7u0(((Number) playerState.position(((Number) new n0g0(0, qzo0Var.i, yqg.class, "currentTimeMillis", "currentTimeMillis()J", 0, (byte) 28).invoke()).longValue()).e(0L)).longValue(), ((Number) playerState.duration().e(0L)).longValue(), ((ContextTrack) playerState.track().b()).uri()), izo0Var.b, gzo0Var.f, izo0Var.c);
            default:
                return qzo0Var.X.getString(2131959229, (String) obj, (String) obj2);
        }
    }
}
