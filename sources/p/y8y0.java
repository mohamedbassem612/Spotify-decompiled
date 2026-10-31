package p;

import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class y8y0 extends tv30 implements vu30 {
    public static final y8y0 a = new y8y0(2, d9y0.class, "onPropsChanged", "onPropsChanged(Lcom/spotify/sharecard/cardproviders/promptedplaylist/api/PromptedPlaylistCardProps;Lcom/spotify/sharecard/cardproviders/promptedplaylist/impl/PromptedPlaylistShareCardElement$State;)Lcom/spotify/mobius/Next;", 1);

    public final Object invoke(Object obj, Object obj2) {
        a3y0 a3y0Var = (a3y0) obj;
        return a3y0Var.equals(new a3y0(((n9y0) obj2).a)) ? Next.j() : Next.i(new n9y0(a3y0Var.a, l9y0.a), Collections.singleton(new e9y0(a3y0Var)));
    }
}
