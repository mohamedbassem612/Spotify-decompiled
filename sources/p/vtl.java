package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vtl extends g7 {
    public final /* synthetic */ byte a = 0;
    public final int b;
    public final Object c;

    public vtl(List[] listArr) {
        this.c = listArr;
        int size = 0;
        for (List list : listArr) {
            size += list.size();
        }
        this.b = size;
    }

    public final int b() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public final Object get(int i) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((iu30) obj).invoke(Integer.valueOf(i));
            default:
                List[] listArr = (List[]) obj;
                int size = i;
                for (int i2 = 0; i2 < 3; i2++) {
                    List list = listArr[i2];
                    if (list.size() > size) {
                        return list.get(size);
                    }
                    size -= list.size();
                }
                eg.g(f4i1.c(i, "Invalid index, "));
                return null;
        }
    }

    public vtl(eyl eylVar, iu30 iu30Var) {
        this.c = iu30Var;
        this.b = eylVar.a;
    }
}
