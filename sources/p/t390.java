package p;

import com.spotify.betamax.player.offline.exception.BetamaxDownloadException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t390 {
    public final yqg a;
    public final ArrayList b;
    public final LinkedHashMap c = new LinkedHashMap();

    public t390(List list, yqg yqgVar) {
        this.a = yqgVar;
        this.b = new ArrayList(list);
    }

    public final Map.Entry a(String str) {
        Object next;
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (u890.j(((swu) ((Map.Entry) next).getKey()).a(), str)) {
                return (Map.Entry) next;
            }
        }
        next = null;
        return (Map.Entry) next;
    }

    public final void b(String str, long j, BetamaxDownloadException betamaxDownloadException) {
        long jB = this.a.b();
        Map.Entry entryA = a(str);
        if (entryA != null) {
            swu swuVar = (swu) entryA.getKey();
            Iterator it = ((List) entryA.getValue()).iterator();
            while (it.hasNext()) {
                ((vma) it.next()).g(swuVar, j, betamaxDownloadException, jB);
            }
        }
        c(str);
    }

    public final void c(String str) {
        swu swuVar;
        Map.Entry entryA = a(str);
        if (entryA == null || (swuVar = (swu) entryA.getKey()) == null) {
            return;
        }
    }
}
