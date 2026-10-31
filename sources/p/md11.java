package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class md11 implements Function0 {
    public final /* synthetic */ byte a;
    public final String b;

    public /* synthetic */ md11(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public final Object invoke() {
        String str;
        byte b = this.a;
        String str2 = this.b;
        switch (b) {
            case 0:
                String strK = gvg.k(new StringBuilder(), sfb1.n.a.a, '.');
                str = nhc1.Y(str2, strK, false) ? strK : null;
                return str == null ? "" : str;
            default:
                String strK2 = gvg.k(new StringBuilder(), sfb1.l.a.a, '.');
                str = nhc1.Y(str2, strK2, false) ? strK2 : null;
                return str == null ? "" : str;
        }
    }
}
