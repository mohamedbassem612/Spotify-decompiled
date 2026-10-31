package p;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum dht {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);

    public static final Set b;
    public static final Set c;
    public final boolean a;

    static {
        dht[] dhtVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (dht dhtVar : dhtVarArrValues) {
            if (dhtVar.a) {
                arrayList.add(dhtVar);
            }
        }
        b = o7h.p1(arrayList);
        c = f46.S0(values());
    }

    dht(boolean z) {
        this.a = z;
    }
}
