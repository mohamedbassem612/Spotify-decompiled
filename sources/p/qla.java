package p;

import android.graphics.Color;
import com.spotify.base.java.logging.Logger;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qla implements a3k {
    public final pe a;
    public final tjs0 b;
    public final ti31 c;
    public final kj31 d;
    public final cxc e;
    public final ohm1 f;
    public final xgm1 g;
    public final vhd0 h;

    public qla(pe peVar, tjs0 tjs0Var, ti31 ti31Var, kj31 kj31Var, cxc cxcVar, ohm1 ohm1Var, xgm1 xgm1Var, vhd0 vhd0Var) {
        this.a = peVar;
        this.b = tjs0Var;
        this.c = ti31Var;
        this.d = kj31Var;
        this.e = cxcVar;
        this.f = ohm1Var;
        this.g = xgm1Var;
        this.h = vhd0Var;
    }

    public static Integer b(String str) {
        Integer m231Var;
        if (str.length() == 0) {
            return null;
        }
        try {
            m231Var = Integer.valueOf(Color.parseColor(str));
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (e331.a(m231Var) != null) {
            Logger.k(f4i1.f("Unparseable listening age quiz button color '", str, "'"), new Object[0]);
        }
        return m231Var instanceof m231 ? null : m231Var;
    }

    public static dhz0 c(SceneTemplate.BespokeListeningAgeContent.Card2.QuizButton quizButton, Function0 function0) {
        gec gecVar = new gec(b(ror0.a(quizButton.q()).w()), b(quizButton.n()), ror0.a(quizButton.q()).u(), (String) null);
        iec iecVar = new iec(gecVar, gecVar, new huz(Boolean.TRUE, (byte) 10), quizButton.p() ? 1 : 0, new lla(function0));
        mla mlaVar = new mla(quizButton);
        String strR = quizButton.r();
        if (strR.length() == 0) {
            strR = null;
        }
        return new dhz0(iecVar, mlaVar, strR != null ? new u7h(ror0.e(u7h.j, strR)) : null, b(quizButton.s()));
    }

    public final Object a(Object obj, onm onmVar) {
        return smo1.s(new kla((g7m1) obj, this, null), onmVar);
    }
}
