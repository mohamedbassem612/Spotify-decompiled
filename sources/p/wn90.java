package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wn90 extends rw20 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Iterable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wn90(Iterable iterable, Object obj, byte b) {
        this.b = b;
        this.c = iterable;
        this.d = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.b;
        Object obj = this.d;
        Iterable iterable = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Iterator it = iterable.iterator();
                it.getClass();
                return new ao90(it, (omv0) obj);
            default:
                return new bo90(iterable.iterator(), (su30) obj);
        }
    }
}
