package p;

import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class op30 extends tv30 implements vu30 {
    public static final op30 a = new op30(2, up30.class, "onPropsChanged", "onPropsChanged(Lcom/spotify/sharecard/cardproviders/fullcontent/api/FullContentCardProps;Lcom/spotify/sharecard/cardproviders/fullcontent/impl/FullContentShareCardElement$State;)Lcom/spotify/mobius/Next;", 1);

    public final Object invoke(Object obj, Object obj2) {
        mp30 mp30Var = (mp30) obj;
        return mp30Var.equals(new mp30(((fq30) obj2).a)) ? Next.j() : Next.i(new fq30(mp30Var.a, dq30.a), Collections.singleton(new vp30(mp30Var)));
    }
}
