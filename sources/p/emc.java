package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class emc {
    public final fmc a;
    public final BehaviorSubject b = BehaviorSubject.g(new ConcurrentHashMap());
    public final vku c;
    public final xj d;

    public emc(fmc fmcVar) {
        this.a = fmcVar;
        vku vkuVar = new vku();
        this.c = vkuVar;
        vkuVar.a(fmcVar.a.hide().subscribe((Consumer) new mba(this, (byte) 11)));
        this.d = xj.O0;
    }

    public final Observable a() {
        return this.b.map(new fna(this, (byte) 4)).distinctUntilChanged();
    }

    public final Observable b(String str) {
        return this.a.a.hide().filter(new ljp1(str, (byte) 4)).map(uh21.O0);
    }
}
