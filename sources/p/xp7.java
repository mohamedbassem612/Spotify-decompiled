package p;

import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class xp7 extends tv30 implements vu30 {
    public static final xp7 a = new xp7(2, fq7.class, "onPropsChanged", "onPropsChanged(Lcom/spotify/sharecard/cardproviders/audiochapter/api/AudioChapterCardProps;Lcom/spotify/sharecard/cardproviders/audiochapter/impl/AudioChapterShareCardElement$State;)Lcom/spotify/mobius/Next;", 1);

    public final Object invoke(Object obj, Object obj2) {
        vp7 vp7Var = (vp7) obj;
        return vp7Var.equals(new vp7(((qq7) obj2).a)) ? Next.j() : Next.i(new qq7(vp7Var.a, oq7.a), Collections.singleton(new gq7(vp7Var)));
    }
}
