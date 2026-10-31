package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class l5z implements Update {
    public static final l5z a = new l5z();

    public final Next a(Object obj, Object obj2) {
        e5z e5zVar = (e5z) obj2;
        if (e5zVar instanceof c5z) {
            return Next.h(((c5z) e5zVar).a);
        }
        if (e5zVar instanceof d5z) {
            return Next.a(Effects.a(new z4z[]{new z4z(((d5z) e5zVar).a)}));
        }
        eg.o();
        return null;
    }
}
