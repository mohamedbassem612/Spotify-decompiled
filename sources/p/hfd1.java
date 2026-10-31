package p;

import androidx.viewpager2.widget.ViewPager2;
import com.spotify.messages.PuffinFiltersUsage;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hfd1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hfd1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final void accept(Object obj) {
        String str;
        String str2;
        String str3;
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                ifd1 ifd1Var = (ifd1) obj3;
                ifd1Var.g = Integer.valueOf(((shd1) obj).a);
                ViewPager2 viewPager2G = ifd1Var.g();
                Integer num = ifd1Var.g;
                viewPager2G.d(num != null ? num.intValue() : 0, false);
                y570 y570Var = (y570) obj2;
                ifd1Var.f(y570Var);
                ifd1Var.h(y570Var, (yfu) obj4);
                break;
            default:
                hvf1 hvf1Var = (hvf1) obj;
                k560 k560Var = (m560) obj4;
                dqy0 dqy0VarN = PuffinFiltersUsage.n();
                me20 me20Var = (me20) obj3;
                dqy0VarN.v(me20Var.f);
                dqy0VarN.s(me20Var.c);
                g7t g7tVar = (g7t) obj2;
                ContextTrack contextTrack = hvf1Var.a;
                dam damVarO = i3o1.o(contextTrack);
                if (damVarO.equals(q9m.a)) {
                    str = "audio_podcast";
                } else if (damVarO.equals(r9m.a)) {
                    str = "audiobook";
                } else if (damVarO.equals(w9m.a)) {
                    str = "track";
                } else if (damVarO.equals(x9m.a)) {
                    str = "unknown";
                } else if (damVarO.equals(v9m.a)) {
                    str = "narration";
                } else if (!damVarO.equals(y9m.a)) {
                    eg.o();
                } else {
                    str = "video";
                }
                dqy0VarN.q(str);
                dqy0VarN.t(hvf1Var.c);
                boolean z = k560Var instanceof k560;
                if (z) {
                    str2 = "BLUETOOTH";
                } else if (!(k560Var instanceof l560)) {
                    eg.o();
                } else {
                    str2 = "WIRED";
                }
                dqy0VarN.n(str2);
                if (z) {
                    str3 = k560Var.a;
                } else if (!(k560Var instanceof l560)) {
                    eg.o();
                } else {
                    str3 = ((l560) k560Var).a;
                }
                dqy0VarN.u(str3);
                String str4 = me20Var.d;
                if (str4 != null) {
                    dqy0VarN.x(str4);
                }
                Integer num2 = hvf1Var.b;
                if (num2 != null) {
                    dqy0VarN.w(num2.intValue());
                }
                if ((contextTrack != null ? contextTrack.uri() : null) != null) {
                    dqy0VarN.r(contextTrack.uri());
                }
                ((t2j0) g7tVar.b).a(dqy0VarN.build());
                break;
        }
    }
}
