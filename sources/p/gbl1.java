package p;

import com.google.protobuf.Any;
import com.spotify.watchfeed.component.layout.v1.WatchFeedSurveyLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gbl1 implements j0i {
    public final l6l1 a;
    public final kly0 b;

    public gbl1(jly0 jly0Var, l6l1 l6l1Var) {
        this.a = l6l1Var;
        this.b = jly0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005b  */
    @Override // p.j0i
    public final z0i a(Any any) {
        r160 r160Var;
        vpl vplVar;
        r160 kbl1Var;
        WatchFeedSurveyLayout watchFeedSurveyLayoutW = WatchFeedSurveyLayout.w(any.q());
        String strP = watchFeedSurveyLayoutW.p();
        String uri = watchFeedSurveyLayoutW.getUri();
        String strS = watchFeedSurveyLayoutW.s();
        Any anyN = watchFeedSurveyLayoutW.n();
        l6l1 l6l1Var = this.a;
        z0i z0iVarB = l6l1Var.b(anyN);
        if (z0iVarB instanceof vpl) {
            vplVar = (vpl) z0iVarB;
            r160Var = null;
        } else {
            r160Var = null;
            vplVar = null;
        }
        dq70 dq70VarY = qmo1.y(watchFeedSurveyLayoutW.q().o());
        clj1 clj1VarB = qmo1.B(watchFeedSurveyLayoutW.q().q());
        int iOrdinal = watchFeedSurveyLayoutW.q().p().ordinal();
        int i = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                i = 3;
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        i = 2;
                    } else {
                        i = 4;
                    }
                }
            } else {
                i = 2;
            }
        }
        ibl1 ibl1Var = new ibl1(dq70VarY, clj1VarB, i);
        String title = watchFeedSurveyLayoutW.getTitle();
        h290<WatchFeedSurveyLayout.Option> h290VarR = watchFeedSurveyLayoutW.r();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarR, 10));
        for (WatchFeedSurveyLayout.Option option : h290VarR) {
            arrayList.add(new jbl1(option.o(), option.n(), option.getValue()));
        }
        c9 c9VarF = mqo1.F(arrayList);
        r160 r160VarH = watchFeedSurveyLayoutW.u() ? i1o1.H(watchFeedSurveyLayoutW.o(), l6l1Var) : r160Var;
        if (watchFeedSurveyLayoutW.v()) {
            String strP2 = watchFeedSurveyLayoutW.t().p();
            String strN = watchFeedSurveyLayoutW.t().n();
            if (strN.length() == 0) {
                strN = watchFeedSurveyLayoutW.t().p();
            }
            kbl1Var = new kbl1(strP2, strN);
        } else {
            kbl1Var = r160Var;
        }
        return new lbl1(strP, uri, strS, vplVar, ibl1Var, title, c9VarF, kbl1Var, r160VarH);
    }

    @Override // p.j0i
    public final Class b() {
        return lbl1.class;
    }

    @Override // p.j0i
    public final o1i c() {
        return (o1i) this.b.get();
    }
}
