package p;

import android.util.SparseIntArray;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class r3g1 extends w511 {
    public List d = z6x.a;
    public boolean e = true;
    public boolean f;
    public boolean g;
    public boolean h;
    public long i;
    public int t;

    public static final u0e C(r3g1 r3g1Var, SparseIntArray sparseIntArray, ArrayList arrayList, ContextTrack contextTrack) {
        int iHashCode = (contextTrack.uid() == null || contextTrack.uid().length() <= 0) ? contextTrack.uri().hashCode() : contextTrack.uid().hashCode();
        int i = sparseIntArray.get(iHashCode, 0) + 1;
        sparseIntArray.put(iHashCode, i);
        u0e u0eVar = new u0e(contextTrack, iHashCode, i);
        arrayList.add(u0eVar);
        return u0eVar;
    }

    public final vnd1 B(ContextTrack contextTrack, ContextTrack contextTrack2, ContextTrack contextTrack3) {
        ArrayList arrayList = new ArrayList();
        SparseIntArray sparseIntArray = new SparseIntArray();
        if (contextTrack != null) {
            C(this, sparseIntArray, arrayList, contextTrack);
        }
        u0e u0eVarC = C(this, sparseIntArray, arrayList, contextTrack2);
        if (contextTrack3 != null) {
            C(this, sparseIntArray, arrayList, contextTrack3);
        }
        return new vnd1(arrayList, u0eVarC, (byte) 12);
    }

    public final ContextTrack D(int i) {
        return ((u0e) this.d.get(i)).a;
    }

    public final int e() {
        return this.d.size();
    }

    public final long f(int i) {
        boolean z = this.h;
        List list = this.d;
        return z ? ((u0e) list.get(i)).d : ((u0e) list.get(i)).b;
    }
}
