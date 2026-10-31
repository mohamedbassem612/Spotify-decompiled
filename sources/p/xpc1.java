package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xpc1 implements Iterator, ola0 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    public xpc1(sgg1 sgg1Var) {
        this.c = sgg1Var;
        this.b = sgg1Var.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((n811) obj).a <= ((hjj0) this.c).a.length - 1;
            default:
                return ((Iterator) obj).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (!hasNext()) {
                    hhg1.k();
                    return null;
                }
                n811 n811Var = (n811) obj;
                int i = n811Var.a;
                rij0 rij0Var = ((hjj0) obj2).a[i];
                n811Var.a = i + 1;
                return rij0Var;
            default:
                return ((sgg1) obj2).b.invoke(((Iterator) obj).next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public xpc1(n811 n811Var, hjj0 hjj0Var) {
        this.b = n811Var;
        this.c = hjj0Var;
    }
}
