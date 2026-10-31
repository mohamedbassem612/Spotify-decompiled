package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b7h0 implements acr0 {
    public final sv4 a;
    public final mr4 b;
    public final Set c = Collections.singleton(blc0.MARTINI);
    public final Set d = Collections.singleton(c03.d);

    public b7h0(sv4 sv4Var, mr4 mr4Var) {
        this.a = sv4Var;
        this.b = mr4Var;
    }

    @Override // p.acr0
    public final Set a() {
        return this.c;
    }

    @Override // p.acr0
    public final Class b() {
        return f6h0.class;
    }

    @Override // p.acr0
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        s6h0 parcelableExtra = intent.getParcelableExtra("martini-launch-parameters");
        s6h0 s6h0VarO = parcelableExtra instanceof s6h0 ? parcelableExtra : null;
        if (s6h0VarO == null && (s6h0VarO = b3o1.o(s4b1Var)) == null) {
            s6h0VarO = o6h0.a;
        }
        String str = th61Var.a;
        boolean booleanExtra = intent.getBooleanExtra("martini-open-with-keyboard", false);
        String strN = s4b1Var.n("mode");
        int i = 2;
        if (!u890.j(strN, "dictation")) {
            if (u890.j(strN, "realtimeVoice")) {
                i = 3;
            } else if (strN != null || (!u890.j(s4b1Var.n("startDictation"), "true") && !intent.getBooleanExtra("martini-start-dictation", false))) {
                i = 1;
            }
        }
        String stringExtra = intent.getStringExtra("martini-input-placeholder");
        String stringExtra2 = intent.getStringExtra("martini-prompt");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("martini-chat-suggestions");
        Parcelable parcelableExtra2 = intent.getParcelableExtra("martini-intent-groups");
        return new x6h0(s6h0VarO, str, booleanExtra, i, stringExtra, stringExtra2, stringArrayListExtra, parcelableExtra2 instanceof te30 ? (te30) parcelableExtra2 : null, intent.getBooleanExtra("martini-show-history", false), intent.getBooleanExtra("martini-start-new-chat", false), intent.getBooleanExtra("martini-resume-playback-after-tts", false), s4b1Var.n("experienceName"), s4b1Var.n("variant"), intent.getStringExtra("martini-source-surface-uri"));
    }

    @Override // p.acr0
    public final e6w0 d() {
        return new b6w0(true);
    }

    @Override // p.acr0
    public final Set e() {
        return this.d;
    }

    @Override // p.acr0
    public final String getDescription() {
        return "Martini Page";
    }

    @Override // p.acr0
    public final boolean isEnabled() {
        return this.a.a() || this.b.j();
    }
}
