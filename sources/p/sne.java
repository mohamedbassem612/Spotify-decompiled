package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum sne {
    TRACK("track"),
    /* JADX INFO: Fake field, exist only in values array */
    ALBUM("album"),
    /* JADX INFO: Fake field, exist only in values array */
    ARTIST("artist");

    public static final LinkedHashMap b;
    public final String a;

    static {
        sne[] sneVarArrValues = values();
        int iS = zno1.s(sneVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (sne sneVar : sneVarArrValues) {
            linkedHashMap.put(sneVar.a, sneVar);
        }
        b = linkedHashMap;
    }

    sne(String str) {
        this.a = str;
    }
}
