package p;

import java.text.Collator;
import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ck50 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Collator b;

    public /* synthetic */ ck50(Collator collator, byte b) {
        this.a = b;
        this.b = collator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return this.b.compare(((xj50) obj).f, ((xj50) obj2).f);
            default:
                return this.b.compare(((nbb0) obj).b, ((nbb0) obj2).b);
        }
    }
}
