package p;

import com.spotify.contribution.repositoryimpl.c;
import com.spotify.contribution.repositoryimpl.d;
import com.spotify.contribution.repositoryimpl.e;
import com.spotify.contribution.repositoryimpl.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fpm extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fpm(f fVar, byte b) {
        super(1);
        this.a = b;
        this.b = fVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        f fVar = this.b;
        switch (b) {
            case 0:
                Set set = (Set) obj;
                Set<hpm> set2 = set;
                ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
                for (hpm hpmVar : set2) {
                    arrayList.add(new jpm(new jvm(hpmVar.a, null, null), new lqm(Collections.singletonList(ovm.a), hpmVar.b, null, 4), 1));
                }
                return new epm(h4p1.l(new c(fVar, arrayList, null)), set, (byte) 0);
            case 1:
                Set set3 = (Set) obj;
                return new epm(new m441(new d(fVar, o7h.l1(set3), null)), set3, (byte) 1);
            default:
                Set set4 = (Set) obj;
                Set set5 = set4;
                ArrayList arrayList2 = new ArrayList(q7h.U(set5, 10));
                Iterator it = set5.iterator();
                if (it.hasNext()) {
                    throw pze0.g(it);
                }
                return new epm(new m441(new e(fVar, arrayList2, null)), set4, (byte) 3);
        }
    }
}
