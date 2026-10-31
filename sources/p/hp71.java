package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class hp71 extends tv30 implements vu30 {
    public static final hp71 a = new hp71(2, op71.class, "init", "init(Lcom/spotify/campfire/chatsharepage/elements/sharewith/ShareWithPageElement$Props;Lcom/spotify/campfire/chatsharepage/elements/sharewith/ShareWithPageElement$State;)Lcom/spotify/mobius/First;", 1);

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    public final Object invoke(Object obj, Object obj2) {
        List list;
        boolean z;
        cp71 cp71Var = (cp71) obj;
        dp71 dp71Var = (fp71) obj2;
        t7q0 t7q0Var = cp71Var.a;
        if (dp71Var instanceof ep71) {
            list = ((ep71) dp71Var).a;
        } else {
            if (!(dp71Var instanceof dp71)) {
                eg.o();
                return null;
            }
            list = dp71Var.a;
        }
        if (dp71Var.a()) {
            t7q0Var.getClass();
            if (t7q0Var instanceof g7q0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return First.c(new dp71(mqo1.F(list == null ? z6x.a : list), cp71Var.a, list == null ? 1 : 2, dp71Var.b(), dp71Var.a()), list == null ? Effects.a(new wo71[]{new vo71(t7q0Var.getUri(), z)}) : w7x.a);
    }
}
