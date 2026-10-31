package p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sa5 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sa5(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(u890.j(obj, obj2));
            case 1:
            case 2:
                return obj2;
            case 3:
                Map mapU = sqg0.U(((vnn0) obj).g);
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapU.size()));
                for (Map.Entry entry : mapU.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((dnn0) entry.getValue()).a);
                }
                return up30.o(obj2, linkedHashMap);
            case 4:
                return obj2;
            default:
                return new bab1(Collections.singletonList(new z9b1(UUID.randomUUID(), obj2)));
        }
    }
}
