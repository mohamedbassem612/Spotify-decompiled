package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xd70 {
    public final ArrayList a = new ArrayList(5);

    public final pe70 a() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (pe70) arrayList.remove(arrayList.size() - 1);
    }

    public final void b(pe70 pe70Var) {
        pe70Var.getClass();
        ArrayList arrayList = this.a;
        if (arrayList.size() < 5) {
            arrayList.add(pe70Var);
        }
    }
}
