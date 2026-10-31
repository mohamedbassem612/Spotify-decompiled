package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class wqy0 implements Update {
    public final Next a(Object obj, Object obj2) {
        vqy0 vqy0Var = (vqy0) obj2;
        boolean z = ((zqy0) obj).a;
        boolean z2 = vqy0Var instanceof rqy0;
        lqy0 lqy0Var = lqy0.c;
        iqy0 iqy0Var = iqy0.c;
        if (z2) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (z) {
                linkedHashSet.add(lqy0Var);
            }
            linkedHashSet.add(iqy0Var);
            return Next.a(linkedHashSet);
        }
        if (vqy0Var instanceof qqy0) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            if (z) {
                linkedHashSet2.add(lqy0Var);
            }
            linkedHashSet2.add(iqy0Var);
            return Next.a(linkedHashSet2);
        }
        if (vqy0Var instanceof uqy0) {
            return Next.a(Collections.singleton(new jqy0(z)));
        }
        if (vqy0Var instanceof pqy0) {
            return !((pqy0) vqy0Var).a ? Next.a(Collections.singleton(iqy0Var)) : Next.j();
        }
        if ((vqy0Var instanceof tqy0) || (vqy0Var instanceof sqy0)) {
            return Next.a(Collections.singleton(iqy0Var));
        }
        eg.o();
        return null;
    }
}
