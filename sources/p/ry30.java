package p;

import com.google.protobuf.h;
import com.spotify.widgets.recommendationswidget.events.proto.NpvRecommendationsWidgetLifecycleEvent;
import com.spotify.widgets.recommendationswidget.events.proto.NpvRecommendationsWidgetLifecycleEventNonAuth;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ry30 {
    public final t2j0 a;
    public final ru71 b;
    public final String c;
    public final co40 d;
    public final p85 e;

    public ry30(t2j0 t2j0Var, ru71 ru71Var, String str, co40 co40Var, p85 p85Var) {
        this.a = t2j0Var;
        this.b = ru71Var;
        this.c = str;
        this.d = co40Var;
        this.e = p85Var;
    }

    public final h a(int i, Integer num, String str) {
        okb0 okb0VarA = this.e.f() ? this.d.a() : null;
        ru71 ru71Var = this.b;
        ima1 ima1Var = (dma1) ru71Var.c.getValue();
        bma1 bma1Var = ru71.d;
        if (ima1Var.n(bma1Var) && ((dma1) ru71Var.c.getValue()).h(bma1Var, false)) {
            j9p0 j9p0VarN = NpvRecommendationsWidgetLifecycleEvent.n();
            j9p0VarN.n(bb00.q(i));
            if (str != null) {
                j9p0VarN.t(str);
            }
            if (num != null) {
                j9p0VarN.u(num.intValue());
            }
            if (okb0VarA != null) {
                j9p0VarN.r(okb0VarA.a);
                j9p0VarN.q(okb0VarA.b);
                String str2 = okb0VarA.c;
                if (str2 != null) {
                    j9p0VarN.s(str2);
                }
            }
            h hVarBuild = j9p0VarN.build();
            hVarBuild.getClass();
            return hVarBuild;
        }
        k9p0 k9p0VarN = NpvRecommendationsWidgetLifecycleEventNonAuth.n();
        k9p0VarN.t(this.c);
        k9p0VarN.n(bb00.q(i));
        if (str != null) {
            k9p0VarN.u(str);
        }
        if (num != null) {
            k9p0VarN.v(num.intValue());
        }
        if (okb0VarA != null) {
            k9p0VarN.r(okb0VarA.a);
            k9p0VarN.q(okb0VarA.b);
            String str3 = okb0VarA.c;
            if (str3 != null) {
                k9p0VarN.s(str3);
            }
        }
        h hVarBuild2 = k9p0VarN.build();
        hVarBuild2.getClass();
        return hVarBuild2;
    }
}
