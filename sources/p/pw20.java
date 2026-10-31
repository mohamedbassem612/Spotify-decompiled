package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pw20 extends rw20 {
    public final /* synthetic */ byte b = 0;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw20(Iterable iterable, Iterable iterable2) {
        super(iterable);
        this.c = iterable2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((Iterable) obj).iterator();
            default:
                w6 qw20Var = new qw20(this, ((Iterable[]) obj).length);
                do90 do90Var = new do90();
                do90Var.b = co90.e;
                do90Var.c = qw20Var;
                return do90Var;
        }
    }

    public pw20(Iterable[] iterableArr) {
        this.c = iterableArr;
    }
}
