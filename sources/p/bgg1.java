package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class bgg1 implements Iterator {
    public final /* synthetic */ byte a;
    public final Iterator b;

    public bgg1(Iterator it, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                it.getClass();
                this.b = it;
                break;
            default:
                it.getClass();
                this.b = it;
                break;
        }
    }

    public abstract Object a(Object obj);

    public /* synthetic */ Object b(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return a(this.b.next());
            default:
                return b(this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                this.b.remove();
                break;
            default:
                this.b.remove();
                break;
        }
    }
}
