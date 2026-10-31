package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f5b1 implements BiConsumer {
    public final /* synthetic */ LinkedHashMap a;
    public final /* synthetic */ List b;
    public final /* synthetic */ n4b1 c;

    public f5b1(LinkedHashMap linkedHashMap, List list, n4b1 n4b1Var) {
        this.a = linkedHashMap;
        this.b = list;
        this.c = n4b1Var;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i;
        String str = (String) obj;
        ArrayList arrayList = new ArrayList();
        List list = this.c.a;
        int i2 = 0;
        for (Object obj3 : (List) obj2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            lrc1 lrc1Var = (lrc1) obj3;
            String str2 = lrc1Var.a;
            String str3 = lrc1Var.b;
            int i4 = 1;
            String str4 = nhc1.R(str2, ".srt", true) ? "application/x-subrip" : "text/vtt";
            ge30 ge30Var = new ge30();
            ge30Var.a = str3;
            ge30Var.n = asj0.p(str4);
            ge30Var.d = str3;
            ge30Var.o = asj0.p(str4);
            int i5 = lrc1Var.c ? 64 : 0;
            hrc1 hrc1Var = lrc1Var.d;
            if (hrc1Var == hrc1.c) {
                i5 |= 16;
            }
            if (hrc1Var == hrc1.b) {
                i5 |= 1;
            }
            ge30Var.f = i5;
            ArrayList arrayList2 = new ArrayList();
            vqc1 vqc1Var = lrc1Var.e;
            if (vqc1Var != null) {
                int iOrdinal = vqc1Var.ordinal();
                if (iOrdinal == 0) {
                    i = 1;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return;
                    }
                    i = 2;
                }
                arrayList2.add(new wqc1(i));
            }
            zpc1 zpc1Var = lrc1Var.f;
            if (zpc1Var != null) {
                int iOrdinal2 = zpc1Var.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return;
                    }
                    i4 = 2;
                }
                arrayList2.add(new aqc1(i4));
            }
            if (!arrayList2.isEmpty()) {
                ge30Var.l = new hjj0(arrayList2);
            }
            ie30 ie30Var = new ie30(ge30Var);
            String str5 = lrc1Var.a;
            arrayList.add(new zvw0(i2, ie30Var, this.b, str5, str5, ((spl) o7h.q0(list)).c / 1000, ((spl) o7h.q0(list)).c));
            i2 = i3;
        }
        this.a.put(str, arrayList);
    }
}
