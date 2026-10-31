package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class t610 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t610(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                y610 y610Var = (y610) this.b;
                String str = (String) this.c;
                ArrayList arrayList = y610Var.r;
                if (arrayList.contains(str)) {
                    Logger.b("Client with tag %s is already connected.", new Object[]{str});
                }
                arrayList.add(str);
                Logger.b("Client connected: %s - all connected clients: %s", new Object[]{str, arrayList});
                return;
            default:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                com.spotify.mobius.functions.Consumer consumer = (com.spotify.mobius.functions.Consumer) this.c;
                synchronized (atomicBoolean) {
                    try {
                        if (!atomicBoolean.get()) {
                            consumer.accept(obj);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
