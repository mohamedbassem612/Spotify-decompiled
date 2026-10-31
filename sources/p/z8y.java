package p;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z8y implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;

    public /* synthetic */ z8y(byte b, long j) {
        this.a = b;
        this.b = j;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        byte b = this.a;
        long j = this.b;
        switch (b) {
            case 0:
                return j - ((y8y) ((Map.Entry) obj).getValue()).b >= 60000;
            default:
                return ((dpj0) obj).b < j;
        }
    }
}
