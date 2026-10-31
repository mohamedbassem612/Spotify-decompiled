package p;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class q8d0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ mzc c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ q8d0(AtomicBoolean atomicBoolean, mzc mzcVar, Function0 function0, byte b) {
        this.a = b;
        this.b = atomicBoolean;
        this.c = mzcVar;
        this.d = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Function0 function0 = this.d;
        mzc mzcVar = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case 0:
                if (!atomicBoolean.get()) {
                    try {
                        mzcVar.b(function0.invoke());
                    } catch (Throwable th) {
                        mzcVar.c(th);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!atomicBoolean.get()) {
                    try {
                        mzcVar.b(function0.invoke());
                    } catch (Throwable th2) {
                        mzcVar.c(th2);
                    }
                    break;
                }
                break;
        }
    }
}
