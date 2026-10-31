package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class paf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LinkedHashMap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ paf(LinkedHashMap linkedHashMap, byte b) {
        super(1);
        this.a = b;
        this.b = linkedHashMap;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        LinkedHashMap linkedHashMap = this.b;
        switch (b) {
            case 0:
                return (String) linkedHashMap.get((String) obj);
            case 1:
                return (String) linkedHashMap.get((String) obj);
            case 2:
                ((qv00) obj).b(zei1.class, linkedHashMap.keySet(), false);
                return rih1Var;
            default:
                ((qv00) obj).b(zei1.class, linkedHashMap.keySet(), false);
                return rih1Var;
        }
    }
}
