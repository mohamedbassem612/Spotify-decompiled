package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e39 implements AutoCloseable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e39(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                f39 f39Var = (f39) obj;
                f39Var.t.b(null);
                f39Var.N0.b(null);
                break;
            case 1:
                fav favVar = (fav) obj;
                favVar.g.a(false);
                favVar.h.a(false);
                break;
            case 2:
                f8e1 f8e1Var = (f8e1) obj;
                f8e1Var.f.b(null);
                f8e1Var.g.b(null);
                break;
            default:
                jo31.u(new b0f1((llm) obj, (lnm) null, (byte) 7));
                break;
        }
    }
}
