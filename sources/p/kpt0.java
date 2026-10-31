package p;

import android.widget.FrameLayout;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.Restrictions;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kpt0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dfm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kpt0(dfm dfmVar, byte b) {
        super(2);
        this.a = b;
        this.b = dfmVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        dfm dfmVar = this.b;
        switch (b) {
            case 0:
                jpt0 jpt0Var = (jpt0) obj;
                cpt0 cpt0Var = (cpt0) obj2;
                ContextTrack contextTrack = cpt0Var.b;
                String strUri = contextTrack.uri();
                boolean z = cpt0Var.a;
                ipt0 ipt0Var = jpt0Var.a;
                if (u890.j(ipt0Var, gpt0.a) && !cpt0Var.c) {
                    ipt0Var = fpt0.a;
                }
                boolean z2 = cpt0Var.a;
                Restrictions restrictions = cpt0Var.d;
                boolean zIsEmpty = z2 ? restrictions.disallowPausingReasons().isEmpty() : restrictions.disallowResumingReasons().isEmpty();
                qmr qmrVar = (qmr) dfmVar.i;
                idd1 idd1Var = (idd1) qmrVar.b;
                idd1 idd1Var2 = (idd1) qmrVar.b;
                rgg rggVar = (rgg) ((Map) idd1Var.getValue()).get(contextTrack.uri());
                if (rggVar == null && (rggVar = (rgg) ((Map) idd1Var2.getValue()).get(l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_CONTEXT_URI))) == null) {
                    rggVar = (rgg) ((Map) idd1Var2.getValue()).get(l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_ALBUM_URI));
                }
                return new ept0(strUri, z, ipt0Var, zIsEmpty, rggVar, jpt0Var.b);
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fqg0 fqg0VarU = q1o1.u(dfmVar, (qim0) null, (FrameLayout.LayoutParams) null, 7);
                    jpt0 jpt0Var2 = new jpt0((ipt0) null, 3);
                    uwr uwrVar = cbx.a;
                    mta mtaVar = cbx.b(x340Var2).d;
                    otw.c(fqg0VarU, jpt0Var2, u291.r(nim0.a, 56.0f), (ipb1) null, x340Var2, 64, 8);
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
        }
    }
}
