package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class kj1 extends tv30 implements vu30 {
    public static final kj1 a = new kj1(2, sj1.class, "init", "init(Lcom/spotify/campfire/chatsharepage/elements/addpeople/AddPeoplePageElement$Props;Lcom/spotify/campfire/chatsharepage/elements/addpeople/AddPeoplePageElement$State;)Lcom/spotify/mobius/First;", 1);

    public final Object invoke(Object obj, Object obj2) {
        fj1 fj1Var = (fj1) obj;
        ij1 ij1Var = (ij1) obj2;
        if (!(ij1Var instanceof hj1)) {
            if (ij1Var instanceof gj1) {
                return First.b(ij1Var);
            }
            eg.o();
            return null;
        }
        String str = fj1Var.a;
        hj1 hj1Var = (hj1) ij1Var;
        z6x z6xVar = hj1Var.d;
        int i = z6xVar == null ? 1 : 2;
        int i2 = hj1Var.a;
        int i3 = fj1Var.c;
        t7q0 t7q0Var = fj1Var.d;
        Map map = hj1Var.c;
        if (z6xVar == null) {
            z6xVar = z6x.a;
        }
        return First.c(new gj1(str, i, fj1Var.b, hj1Var.e, i2, i3, t7q0Var, map, z6xVar, false), Effects.a(new vi1[]{new ui1(fj1Var.a)}));
    }
}
