package p;

import com.spotify.adsdisplay.elementimpl.survey.events.proto.SurveyAdEvent;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cof0 {
    public final t2j0 a;

    public static void a(cof0 cof0Var, g7d1 g7d1Var, String str, Integer num, String str2, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        int i2 = g7d1Var.d;
        List list = g7d1Var.b;
        m6d1 m6d1VarN = SurveyAdEvent.n();
        m6d1VarN.n(g7d1Var.a);
        String str3 = g7d1Var.h;
        if (str3 == null) {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        m6d1VarN.y(str3);
        m6d1VarN.r(g7d1Var.f);
        String str4 = g7d1Var.g;
        String str5 = str4 != null ? str4 : null;
        m6d1VarN.t(str5 != null ? str5 : "");
        m6d1VarN.w(g7d1Var.k);
        m6d1VarN.s(g7d1Var.j);
        m6d1VarN.q(str);
        if (!list.isEmpty() && i2 >= 0) {
            m6d1VarN.x(((z6d1) list.get(i2)).c);
        }
        if (num != null) {
            m6d1VarN.v(num.intValue());
            m6d1VarN.u(((y6d1) ((z6d1) list.get(i2)).e.get(num.intValue())).a);
        }
        if (str2 != null) {
            m6d1VarN.z(str2);
        }
        cof0Var.a.a(m6d1VarN.build());
    }

    public void b(g7d1 g7d1Var) {
        f7d1 f7d1Var = g7d1Var.c;
        if (u890.j(f7d1Var, e7d1.a)) {
            a(this, g7d1Var, "event_thank_you_displayed", null, null, 12);
        } else if (u890.j(f7d1Var, b7d1.a)) {
            a(this, g7d1Var, "event_survey_on_connect", null, null, 12);
        }
    }

    public void c(g7d1 g7d1Var) {
        String str = u890.j(g7d1Var.c, e7d1.a) ? "event_survey_submitted" : "event_question_next";
        String string = pwo1.h(g7d1Var).toString();
        int iW0 = ihc1.w0(string, "survey", 0, true, 2);
        if (iW0 != -1) {
            string = string.substring(iW0);
        }
        a(this, g7d1Var, str, null, string, 4);
    }
}
