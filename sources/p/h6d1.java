package p;

import com.spotify.mobius.First;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class h6d1 extends tv30 implements vu30 {
    public static final h6d1 a = new h6d1(2, w6d1.class, "init", "init(Lcom/spotify/adsdisplay/element/survey/models/SurveyAdProps;Lcom/spotify/adsdisplay/element/survey/models/SurveyAdState;)Lcom/spotify/mobius/First;", 1);

    public final Object invoke(Object obj, Object obj2) {
        x6d1 x6d1Var = (x6d1) obj;
        g7d1 g7d1VarP = pwo1.p((g7d1) obj2, x6d1Var);
        if (u890.j(g7d1VarP.c, b7d1.a)) {
            return First.c(g7d1VarP, Collections.singleton(new a5d1(g7d1VarP)));
        }
        vxo1 vxo1VarW = suo1.w(x6d1Var);
        if (vxo1VarW instanceof yri1) {
            return First.b(g7d1VarP);
        }
        if (vxo1VarW instanceof uri1) {
            k6d1 k6d1Var = ((uri1) vxo1VarW).c;
            return First.c(g7d1VarP, f46.S0(new g5d1[]{new x4d1(g7d1VarP, k6d1Var), new w4d1(g7d1VarP, k6d1Var)}));
        }
        eg.o();
        return null;
    }
}
