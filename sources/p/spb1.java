package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class spb1 implements Map.Entry, rla0 {
    public final Object a;
    public Object b;
    public final /* synthetic */ tpb1 c;

    public spb1(tpb1 tpb1Var) {
        this.c = tpb1Var;
        Map.Entry entry = (Map.Entry) ((y6) tpb1Var).e;
        entry.getClass();
        this.a = entry.getKey();
        Map.Entry entry2 = (Map.Entry) ((y6) tpb1Var).e;
        entry2.getClass();
        this.b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        tpb1 tpb1Var = this.c;
        dw91 dw91Var = (dw91) ((y6) tpb1Var).c;
        if (dw91Var.b().e() != ((y6) tpb1Var).b) {
            eg.d();
            return null;
        }
        Object obj2 = this.b;
        dw91Var.put(this.a, obj);
        this.b = obj;
        return obj2;
    }
}
