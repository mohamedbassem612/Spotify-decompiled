package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xob0 implements Iterator {
    public final /* synthetic */ byte a;
    public Iterator b;

    public xob0(Iterator it) {
        this.a = (byte) 0;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Map.Entry entry = (Map.Entry) this.b.next();
                if (!(entry.getValue() instanceof yob0)) {
                    return entry;
                }
                wob0 wob0Var = new wob0();
                wob0Var.a = entry;
                return wob0Var;
            case 1:
                return (String) this.b.next();
            case 2:
                return (String) this.b.next();
            case 3:
                return (String) this.b.next();
            default:
                return (String) this.b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                this.b.remove();
                return;
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
