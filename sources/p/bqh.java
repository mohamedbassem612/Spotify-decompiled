package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bqh {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        this.a.clear();
    }

    public final rph b(String str) {
        LinkedHashMap linkedHashMap = this.a;
        rph rphVar = (rph) linkedHashMap.get(str);
        linkedHashMap.remove(str);
        return rphVar;
    }

    public final void c(rph rphVar) {
        LinkedHashMap linkedHashMap = this.a;
        linkedHashMap.clear();
        linkedHashMap.put(rphVar.a, rph.a(rphVar, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 522687));
    }
}
