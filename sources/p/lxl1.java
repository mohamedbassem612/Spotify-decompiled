package p;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lxl1 implements Disposable {
    public static final /* synthetic */ long c = avg.a.objectFieldOffset(lxl1.class.getDeclaredField("isDisposedField$volatile"));
    public final qku a;
    public final qku b;
    private volatile /* synthetic */ int isDisposedField$volatile;

    public lxl1(qku qkuVar, qku qkuVar2) {
        this.a = qkuVar;
        this.b = qkuVar2;
    }

    public final qku a() {
        return this.b;
    }

    public void dispose() {
        avg.a.putIntVolatile(this, c, 1);
        this.a.dispose();
        this.b.dispose();
    }

    public boolean isDisposed() {
        return avg.a.getIntVolatile(this, c) == 1;
    }

    public final String toString() {
        return "WorkerTaskDisposable(isDisposed=" + isDisposed() + ')';
    }
}
