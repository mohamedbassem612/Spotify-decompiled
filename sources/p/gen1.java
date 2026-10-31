package p;

import android.graphics.Rect;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class gen1 implements cgp1, agp1, v0i, acp1 {
    public static final /* synthetic */ gen1 a = new gen1();
    public static final /* synthetic */ gen1 b = new gen1();
    public static final /* synthetic */ gen1 c = new gen1();

    public /* synthetic */ Object m(dxy dxyVar) {
        return AnalyticsConnectorRegistrar.zza(dxyVar);
    }

    public Object zza(Object obj) {
        r5p1 r5p1Var = (r5p1) obj;
        a7o1 a7o1Var = r5p1Var.b;
        String str = r5p1Var.f;
        List listP = l0o1.p(a7o1Var);
        String str2 = r5p1Var.d;
        if (upo1.K(str2)) {
            str2 = "";
        }
        String str3 = str2;
        Rect rectO = l0o1.o(listP);
        if (upo1.K(str)) {
            str = "und";
        }
        float f = r5p1Var.e;
        float f2 = r5p1Var.b.e;
        nqn1 nqn1Var = rqn1.g;
        return new pzd1(str3, rectO, listP, str, f, vtn1.t);
    }
}
