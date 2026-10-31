package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r1k implements Connectable {
    public final /* synthetic */ byte a;
    public final Connectable[] b;

    public /* synthetic */ r1k(Connectable[] connectableArr, byte b) {
        this.a = b;
        this.b = connectableArr;
    }

    public final Connection L(Consumer consumer) {
        byte b = this.a;
        Connectable[] connectableArr = this.b;
        int i = 0;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList(connectableArr.length);
                int length = connectableArr.length;
                while (i < length) {
                    arrayList.add(connectableArr[i].L(consumer));
                    i++;
                }
                return new q1k(arrayList, (byte) 1);
            case 1:
                ArrayList arrayList2 = new ArrayList(3);
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayList2.add(connectableArr[i2].L(consumer));
                }
                return new q1k(arrayList2, (byte) 0);
            default:
                ArrayList arrayList3 = new ArrayList(connectableArr.length);
                int length2 = connectableArr.length;
                while (i < length2) {
                    arrayList3.add(connectableArr[i].L(consumer));
                    i++;
                }
                return new q1k(arrayList3, (byte) 4);
        }
    }
}
