package p;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f670 extends AbstractList {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    public /* synthetic */ f670(List list, byte b) {
        this.a = b;
        this.b = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                return ((h670) list.get(i)).a;
            case 1:
                return ((h670) list.get(i)).b;
            default:
                y570 y570Var = (y570) ((b570) list).b.get(i);
                y570Var.getClass();
                return y570Var;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                return list.size();
            case 1:
                return list.size();
            default:
                return ((b570) list).b.size();
        }
    }
}
