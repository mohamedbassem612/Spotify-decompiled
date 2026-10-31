package p;

import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class m3k1 extends tv30 implements vu30 {
    public static final m3k1 a = new m3k1(2, t3k1.class, "onPropsChanged", "onPropsChanged(Lcom/spotify/sharecard/cardproviders/videotimestamp/api/VideoTimestampCardProps;Lcom/spotify/sharecard/cardproviders/videotimestamp/impl/VideoTimestampShareCardElement$State;)Lcom/spotify/mobius/Next;", 1);

    public final Object invoke(Object obj, Object obj2) {
        k3k1 k3k1Var = (k3k1) obj;
        e4k1 e4k1Var = (e4k1) obj2;
        return k3k1Var.equals(new k3k1(e4k1Var.b, e4k1Var.a)) ? Next.j() : Next.i(new e4k1(k3k1Var.a, k3k1Var.b, b4k1.a), Collections.singleton(new u3k1(k3k1Var)));
    }
}
