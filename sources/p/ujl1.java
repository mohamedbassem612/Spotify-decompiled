package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ujl1 implements BiConsumer {
    public final /* synthetic */ byte a;
    public Serializable b;
    public Serializable c;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    this.b = (Integer) obj2;
                    break;
                } else if (iIntValue == 1) {
                    this.c = (String) obj2;
                    break;
                } else if (num.intValue() < 0) {
                    t8e1.o(num, "The current AndroidX version doesn't support this callback value: ");
                    break;
                }
                break;
            default:
                Integer num2 = (Integer) obj;
                ArrayList arrayList = (ArrayList) this.c;
                int iIntValue2 = num2.intValue();
                if (iIntValue2 == 0) {
                    if (obj2 != null) {
                    }
                    break;
                } else if (iIntValue2 == 1) {
                    if (obj2 != null) {
                    }
                    break;
                } else if (iIntValue2 == 2) {
                    ((ArrayList) this.b).add(new ubc((byte) 29));
                    break;
                } else if (iIntValue2 == 3) {
                    if (!(obj2 instanceof List)) {
                        arrayList.add(new ubc((byte) 29));
                    } else {
                        List list = (List) obj2;
                        if (!list.isEmpty()) {
                            arrayList.add(new ubc((byte) 29));
                        }
                    }
                    break;
                } else if (num2.intValue() < 0) {
                    t8e1.o(num2, "The current AndroidX version doesn't support this callback value: ");
                    break;
                }
                break;
        }
    }
}
