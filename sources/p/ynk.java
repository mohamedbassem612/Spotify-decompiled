package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ynk implements pdy0 {
    public final xnk a;
    public final luk b;
    public final idd1 c;

    public ynk(xnk xnkVar, luk lukVar) {
        this.a = xnkVar;
        this.b = lukVar;
        this.c = new idd1(new vjh(this, (byte) 16));
    }

    public final xnk a() {
        xnk xnkVarA;
        ynk ynkVar = (ynk) this.c.getValue();
        return (ynkVar == null || (xnkVarA = ynkVar.a()) == null) ? this.a : xnkVarA;
    }

    public final List models() {
        String str = a().a;
        xnk[] xnkVarArrValues = xnk.values();
        ArrayList arrayList = new ArrayList(xnkVarArrValues.length);
        for (xnk xnkVar : xnkVarArrValues) {
            arrayList.add(xnkVar.a);
        }
        return Collections.singletonList(new fpb("concert_friends_entrypoint_type", "concert-friend-matcher", str, arrayList));
    }

    public ynk(luk lukVar) {
        this(xnk.SHARE, lukVar);
    }
}
