package p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nqv extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LinkedHashSet b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nqv(LinkedHashSet linkedHashSet, byte b) {
        super(1);
        this.a = b;
        this.b = linkedHashSet;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = true;
        LinkedHashSet linkedHashSet = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(linkedHashSet.contains(((ftv) obj).a));
            case 1:
                linkedHashSet.add((jh5) obj);
                return rih1.a;
            case 2:
                String str = ((xz31) obj).b;
                if (str != null && !linkedHashSet.add(str)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                long jLongValue = ((Number) obj).longValue();
                return new sgg1(new vfe1((byte) 1, jLongValue), new i46(linkedHashSet, (byte) 1));
        }
    }
}
