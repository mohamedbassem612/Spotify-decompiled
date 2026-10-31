package p;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g8e0 implements Connectable, Connection {
    public final kp00 a;
    public final PublishSubject b;
    public final Disposable c;
    public dxy d;

    public g8e0(kp00 kp00Var, f7k1 f7k1Var, Scheduler scheduler, Scheduler scheduler2) {
        this.a = kp00Var;
        PublishSubject publishSubject = new PublishSubject();
        this.b = publishSubject;
        this.c = publishSubject.map(new il00(f7k1Var, (byte) 29)).subscribeOn(scheduler).observeOn(scheduler2).subscribe(new rwa0(this, (byte) 9));
    }

    public final Connection L(Consumer consumer) {
        dxy dxyVar = this.d;
        if (dxyVar != null) {
            ((qzh) ((tzo) dxyVar.c).b).n(new i5w(new lbc0(1, consumer, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0, (byte) 9), (byte) 13));
        }
        return this;
    }

    public final Object a(ViewGroup viewGroup) {
        kp00 kp00Var = this.a;
        dxy dxyVar = new dxy(viewGroup, (oh20) kp00Var.b, (wb00) kp00Var.c);
        this.d = dxyVar;
        return (View) dxyVar.b;
    }

    public final void accept(Object obj) {
        this.b.onNext((ph20) obj);
    }

    public final void dispose() {
        this.c.dispose();
    }
}
