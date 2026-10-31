package p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yp10 {
    public final ArrayList a = new ArrayList();

    public final void a(int i, Map map) {
        int iC = l1d.C(i);
        ArrayList arrayList = this.a;
        switch (iC) {
            case 0:
                break;
            case 1:
                r7h.a0(arrayList, new uv4(3, (byte) 28));
                arrayList.add(new kdi1(2, map));
                break;
            case 2:
                r7h.a0(arrayList, new uv4(2, (byte) 28));
                arrayList.add(new kdi1(3, map));
                break;
            case 3:
                r7h.a0(arrayList, new uv4(5, (byte) 28));
                arrayList.add(new kdi1(4, map));
                break;
            case 4:
                r7h.a0(arrayList, new uv4(4, (byte) 28));
                arrayList.add(new kdi1(5, map));
                break;
            case 5:
                arrayList.add(new kdi1(6, map));
                break;
            case 6:
                arrayList.add(new kdi1(7, map));
                break;
            default:
                eg.o();
                break;
        }
    }
}
