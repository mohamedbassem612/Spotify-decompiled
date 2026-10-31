package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class t590 extends tv30 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t590(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((x590) ((lyc) this).receiver).F0((ie30) obj, (List) obj2));
            case 1:
                int iIntValue = ((Number) obj2).intValue();
                return Boolean.valueOf(gga0.a((gga0) ((lyc) this).receiver, (h661) obj, iIntValue));
            default:
                return rui0.e((rui0) ((lyc) this).receiver, (oui0) obj, (ioj0) obj2);
        }
    }
}
