package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u9t {
    public final ArrayList a;
    public final char b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public u9t f;
    public u9t g;

    public u9t(ArrayList arrayList, char c, boolean z, boolean z2, u9t u9tVar) {
        this.a = arrayList;
        this.b = c;
        this.d = z;
        this.e = z2;
        this.f = u9tVar;
        this.c = arrayList.size();
    }

    public final List a(int i) {
        ArrayList arrayList = this.a;
        if (i >= 1 && i <= arrayList.size()) {
            return arrayList.subList(0, i);
        }
        hhg1.n(cy30.i(arrayList.size(), "length must be between 1 and ", i, ", was "));
        return null;
    }

    public final List b(int i) {
        ArrayList arrayList = this.a;
        if (i >= 1 && i <= arrayList.size()) {
            return arrayList.subList(arrayList.size() - i, arrayList.size());
        }
        hhg1.n(cy30.i(arrayList.size(), "length must be between 1 and ", i, ", was "));
        return null;
    }
}
