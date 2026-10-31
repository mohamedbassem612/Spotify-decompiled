package p;

import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class wfj1 extends tv30 implements vu30 {
    public static final wfj1 a = new wfj1(2, cgj1.class, "onPropsChanged", "onPropsChanged(Lcom/spotify/sharecard/cardproviders/videochapter/api/VideoChapterCardProps;Lcom/spotify/sharecard/cardproviders/videochapter/impl/VideoChapterShareCardElement$State;)Lcom/spotify/mobius/Next;", 1);

    public final Object invoke(Object obj, Object obj2) {
        ufj1 ufj1Var = (ufj1) obj;
        return ufj1Var.equals(new ufj1(((pgj1) obj2).a)) ? Next.j() : Next.i(new pgj1(ufj1Var.a, ngj1.a), Collections.singleton(new fgj1(ufj1Var)));
    }
}
