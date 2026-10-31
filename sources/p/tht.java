package p;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tht extends mgo1 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ AbstractCollection d;

    public /* synthetic */ tht(AbstractCollection abstractCollection, byte b) {
        this.c = b;
        this.d = abstractCollection;
    }

    public static /* synthetic */ void z(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public final void k(jyc jycVar) {
        byte b = this.c;
        AbstractCollection abstractCollection = this.d;
        switch (b) {
            case 0:
                exq0.r(jycVar, null);
                ((ArrayList) abstractCollection).add(jycVar);
                return;
            default:
                if (jycVar == null) {
                    z(0);
                    throw null;
                }
                exq0.r(jycVar, null);
                ((LinkedHashSet) abstractCollection).add(jycVar);
                return;
        }
    }

    public final void n(jyc jycVar, jyc jycVar2) {
        switch (this.c) {
            case 0:
                if (jycVar2 instanceof qv30) {
                    qv30 qv30Var = (qv30) jycVar2;
                    Map linkedHashMap = qv30Var.d1;
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                        qv30Var.d1 = linkedHashMap;
                    }
                    linkedHashMap.put(yht.a, jycVar);
                    return;
                }
                return;
            default:
                if (jycVar2 != null) {
                    return;
                }
                z(2);
                throw null;
        }
    }
}
