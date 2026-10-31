package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class au4 implements pdy0 {
    public final boolean a;
    public final zt4 b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public au4(boolean z, zt4 zt4Var, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = zt4Var;
        this.c = z2;
        this.d = z3;
        this.e = lukVar;
        this.f = new idd1(new st4(this, (byte) 6));
    }

    public final boolean a() {
        au4 au4Var = (au4) this.f.getValue();
        return au4Var != null ? au4Var.a() : this.a;
    }

    public final zt4 b() {
        zt4 zt4VarB;
        au4 au4Var = (au4) this.f.getValue();
        return (au4Var == null || (zt4VarB = au4Var.b()) == null) ? this.b : zt4VarB;
    }

    public final boolean c() {
        au4 au4Var = (au4) this.f.getValue();
        return au4Var != null ? au4Var.c() : this.c;
    }

    public final boolean d() {
        au4 au4Var = (au4) this.f.getValue();
        return au4Var != null ? au4Var.d() : this.d;
    }

    public final List models() {
        fpb fpbVar = new fpb("speakeasy_polling_ready_state_enabled", "android-music-libs-voice-assistant-flags", a());
        String str = b().a;
        zt4[] zt4VarArrValues = zt4.values();
        ArrayList arrayList = new ArrayList(zt4VarArrValues.length);
        for (zt4 zt4Var : zt4VarArrValues) {
            arrayList.add(zt4Var.a);
        }
        return p7h.M(new fpb[]{fpbVar, new fpb("third_party_utterance_banner", "android-music-libs-voice-assistant-flags", str, arrayList), new fpb("voice_assistants_alexa_dialog_enabled", "android-music-libs-voice-assistant-flags", c()), new fpb("voice_assistants_settings_enabled", "android-music-libs-voice-assistant-flags", d())});
    }

    public au4(luk lukVar) {
        this(false, zt4.NEVER, false, false, lukVar);
    }
}
