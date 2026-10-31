package p;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a1y implements tbu0 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ jcs b;
    public final Object c;
    public final Object d;
    public final Object e;

    public a1y(jcs jcsVar, zxp zxpVar, yxp yxpVar, o241 o241Var) {
        this.b = jcsVar;
        this.e = o241Var;
        this.c = yxpVar.a("freetier");
        this.d = zxpVar.a("freetier");
    }

    public final SpannableString a(PlayerState playerState, s6g1 s6g1Var) {
        byte b = this.a;
        jcs jcsVar = this.b;
        switch (b) {
            case 0:
                return jcsVar.a(playerState, s6g1Var);
            case 1:
                return jcsVar.a(playerState, s6g1Var);
            default:
                r0e0 r0e0VarH = ((ruc0) this.d).h(playerState);
                List list = r0e0VarH.c;
                if (list.isEmpty()) {
                    list = null;
                }
                String strY0 = list != null ? o7h.y0(list, (CharSequence) null, (String) null, (String) null, (iu30) null, 63) : null;
                String str = r0e0VarH.g;
                return new SpannableString(o7h.y0(f46.i0(new String[]{strY0, str.length() > 0 ? str : null}), " - ", (String) null, (String) null, (iu30) null, 62));
        }
    }

    public final SpannableString b(PlayerState playerState, s6g1 s6g1Var) {
        byte b = this.a;
        jcs jcsVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return jcsVar.b(playerState, s6g1Var);
    }

    public final SpannableString c(PlayerState playerState) {
        byte b = this.a;
        jcs jcsVar = this.b;
        switch (b) {
            case 0:
                return jcsVar.c(playerState);
            case 1:
                return jcsVar.c(playerState);
            default:
                return new SpannableString(((Context) this.e).getString(2131959888));
        }
    }

    public final List d(PlayerState playerState, Boolean bool) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                zo5 zo5Var = (zo5) ((h0y) this.e).b;
                zhq0 zhq0Var = (zhq0) obj;
                return (l4o1.P((ContextTrack) playerState.track().b()) || l4o1.Q((ContextTrack) playerState.track().b())) ? p7h.M(new ojo0[]{eio1.B(zhq0Var), eio1.x(playerState, zhq0Var), eio1.C(zhq0Var, false), new ojo0(new vjo0(2131233419, 2131959883), zo5Var.a(AppLifecycleServicePendingIntent.NOTIFICATION_CHANGE_SEGMENT, new Bundle()), true)}) : p7h.M(new ojo0[]{((cfd) obj2).v(playerState, bool), eio1.y(playerState, zhq0Var, false), eio1.x(playerState, zhq0Var), eio1.w(playerState, zhq0Var, true), new ojo0(new vjo0(2131233419, 2131959883), zo5Var.a(AppLifecycleServicePendingIntent.NOTIFICATION_CHANGE_SEGMENT, new Bundle()), true)});
            case 1:
                cfd cfdVar = (cfd) obj2;
                zhq0 zhq0Var2 = (zhq0) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().b();
                ArrayList arrayList = new ArrayList();
                if (Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack$Metadata.KEY_COLLECTION_CAN_ADD))) {
                    arrayList.add(cfdVar.v(playerState, bool));
                }
                arrayList.add(eio1.y(playerState, zhq0Var2, true));
                arrayList.add(eio1.x(playerState, zhq0Var2));
                arrayList.add(eio1.w(playerState, zhq0Var2, true));
                if (Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack$Metadata.KEY_COLLECTION_CAN_BAN)) && f4p1.h(playerState)) {
                    arrayList.add(cfdVar.u(playerState));
                }
                return o7h.l1(arrayList);
            default:
                return z6x.a;
        }
    }

    public final boolean e(PlayerState playerState, s6g1 s6g1Var) {
        switch (this.a) {
            case 0:
                return o4p1.u(playerState);
            case 1:
                p811 p811Var = new p811();
                ((o241) this.e).a.subscribe(new wrk(p811Var, (byte) 2)).dispose();
                Boolean bool = (Boolean) p811Var.a;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return true;
            default:
                return ((Boolean) playerState.track().i(new we50((s6z0) this.c, (byte) 1)).e(Boolean.FALSE)).booleanValue();
        }
    }

    public a1y(jcs jcsVar, Context context, s6z0 s6z0Var, ruc0 ruc0Var) {
        this.b = jcsVar;
        this.e = context;
        this.c = s6z0Var;
        this.d = ruc0Var;
    }

    public a1y(jcs jcsVar, zxp zxpVar, h0y h0yVar, yxp yxpVar) {
        this.b = jcsVar;
        this.e = h0yVar;
        this.c = yxpVar.a("endless");
        this.d = zxpVar.a("endless");
    }
}
