package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uo60 {
    public final UUID a;
    public String b;
    public final kj41 c;
    public final nif1 d;
    public nif1 e;
    public wma1 f;
    public int g;
    public final LinkedHashSet h = new LinkedHashSet();
    public final LinkedHashMap i = new LinkedHashMap();
    public String j;

    public uo60(UUID uuid, String str, kj41 kj41Var, nif1 nif1Var, nif1 nif1Var2, wma1 wma1Var) {
        this.a = uuid;
        this.b = str;
        this.c = kj41Var;
        this.d = nif1Var;
        this.e = nif1Var2;
        this.f = wma1Var;
    }

    public final int a() {
        Collection collectionValues = this.i.values();
        int i = 0;
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return 0;
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (((vo60) it.next()).n && (i = i + 1) < 0) {
                p7h.S();
                throw null;
            }
        }
        return i;
    }

    public final int b() {
        Collection collectionValues = this.i.values();
        int i = 0;
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return 0;
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (((vo60) it.next()).f49p && (i = i + 1) < 0) {
                p7h.S();
                throw null;
            }
        }
        return i;
    }
}
