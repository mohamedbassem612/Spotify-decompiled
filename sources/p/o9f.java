package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class o9f implements Update {
    public static final o9f a = new o9f();

    public final Next a(Object obj, Object obj2) {
        r9f r9fVar = (r9f) obj;
        k9f k9fVar = (k9f) obj2;
        if (k9fVar.equals(i9f.a)) {
            return Next.i(r9f.a(r9fVar, 1, (ArrayList) null, false, 6), Effects.a(new d9f[]{d9f.a}));
        }
        if (k9fVar.equals(f9f.a)) {
            return Next.h(r9f.a(r9fVar, 1, (ArrayList) null, false, 6));
        }
        if (k9fVar.equals(g9f.a)) {
            return Next.h(r9f.a(r9fVar, 3, (ArrayList) null, false, 6));
        }
        if (k9fVar instanceof h9f) {
            return Next.h(r9f.a(r9fVar, 2, ((h9f) k9fVar).a, false, 4));
        }
        if (k9fVar instanceof j9f) {
            return Next.h(r9f.a(r9fVar, 0, (ArrayList) null, ((j9f) k9fVar).a, 3));
        }
        eg.o();
        return null;
    }
}
