package p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mgp0 implements Connection {
    public final rku a = new rku();
    public boolean b;
    public final /* synthetic */ x2y c;
    public final /* synthetic */ Consumer d;
    public final /* synthetic */ t3x e;

    public mgp0(x2y x2yVar, Consumer consumer, t3x t3xVar) {
        this.c = x2yVar;
        this.d = consumer;
        this.e = t3xVar;
    }

    public final void accept(Object obj) {
        lgp0 lgp0Var = (lgp0) obj;
        x2y x2yVar = this.c;
        zeu zeuVar = (zeu) x2yVar.c;
        ObservableEmitter observableEmitter = (ObservableEmitter) x2yVar.d;
        if (lgp0Var instanceof ggp0) {
            observableEmitter.onNext(x2y.a(((ggp0) lgp0Var).a, x2yVar));
            return;
        }
        if (lgp0Var instanceof hgp0) {
            Notification notification = ((hgp0) lgp0Var).a;
            for (Emitter emitter : (CopyOnWriteArraySet) zeuVar.b) {
                emitter.getClass();
                buo1.x(emitter, notification);
            }
            observableEmitter.onNext(x2y.a(q490.e, x2yVar));
            return;
        }
        if (lgp0Var instanceof jgp0) {
            jgp0 jgp0Var = (jgp0) lgp0Var;
            Iterator it = jgp0Var.b.iterator();
            while (it.hasNext()) {
                buo1.x(jgp0Var.a, (Notification) it.next());
            }
            return;
        }
        if (!(lgp0Var instanceof igp0)) {
            if (!(lgp0Var instanceof kgp0)) {
                eg.o();
                return;
            } else {
                this.a.b(((Observable) x2yVar.b).materialize().subscribe(new w090(this, this.d, (byte) 22)));
                return;
            }
        }
        Notification notification2 = ((igp0) lgp0Var).a;
        for (Emitter emitter2 : (CopyOnWriteArraySet) zeuVar.b) {
            emitter2.getClass();
            buo1.x(emitter2, notification2);
        }
    }

    public final void dispose() {
        synchronized (this) {
            this.a.a();
            this.b = true;
        }
        this.e.invoke();
    }
}
