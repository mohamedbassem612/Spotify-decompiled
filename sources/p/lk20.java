package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lk20 extends CancellationException {
    public final /* synthetic */ byte a = 1;

    public lk20() {
        super("Window insets animation cancelled");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        switch (this.a) {
            case 1:
                setStackTrace(new StackTraceElement[0]);
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    public /* synthetic */ lk20(String str) {
        super(str);
    }
}
