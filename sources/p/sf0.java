package p;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sf0 {
    public final LinkedHashSet a = new LinkedHashSet();
    public final bpb1 b = gio1.b(new qqj1(false, false));

    public final void a() {
        LinkedHashSet linkedHashSet = this.a;
        boolean z = true;
        boolean z2 = !linkedHashSet.isEmpty();
        if (linkedHashSet.isEmpty()) {
            z = false;
        } else {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                if (((m0u0) it.next()).f()) {
                }
            }
            z = false;
        }
        this.b.m((Object) null, new qqj1(z2, z));
    }
}
