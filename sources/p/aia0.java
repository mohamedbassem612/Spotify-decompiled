package p;

import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aia0 extends bba {
    public final vku N0;
    public final b7r0 X;
    public final haa0 Y;
    public final Observable Z;
    public final Scheduler g;
    public final Duration h;
    public final Duration i;
    public final jgz0 t;

    /* JADX WARN: Illegal instructions before constructor call */
    public aia0(Scheduler scheduler, x390 x390Var, jgz0 jgz0Var, b7r0 b7r0Var, haa0 haa0Var, Observable observable) {
        Duration durationOfSeconds = Duration.ofSeconds(6L);
        Duration durationOfSeconds2 = Duration.ofSeconds(10L);
        Duration durationOfSeconds3 = Duration.ofSeconds(5L);
        super(scheduler, x390Var, durationOfSeconds);
        this.g = scheduler;
        this.h = durationOfSeconds2;
        this.i = durationOfSeconds3;
        this.t = jgz0Var;
        this.X = b7r0Var;
        this.Y = haa0Var;
        this.Z = observable;
        this.N0 = new vku();
    }

    public final void d() {
        TimeUnit timeUnit;
        x390 x390Var;
        ConcurrentHashMap concurrentHashMap = this.d;
        Collection collectionValues = concurrentHashMap.values();
        ArrayList<wqd> arrayList = new ArrayList(q7h.U(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((aba) it.next()).a);
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (wqd wqdVar : arrayList) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : this.e) {
                if (((xjs) obj).d()) {
                    arrayList3.add(obj);
                }
            }
            arrayList2.add(new mmr0(wqdVar, o7h.l1(arrayList3)));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!((Collection) ((mmr0) obj2).b).isEmpty()) {
                arrayList4.add(obj2);
            }
        }
        for (mmr0 mmr0Var : o7h.l1(arrayList4)) {
            concurrentHashMap.remove(mmr0Var.a);
            b((wqd) mmr0Var.a, (List) mmr0Var.b);
        }
        Collection collectionValues2 = concurrentHashMap.values();
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = collectionValues2.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            timeUnit = TimeUnit.MILLISECONDS;
            if (!zHasNext) {
                break;
            }
            Object next = it2.next();
            aba abaVar = (aba) next;
            abaVar.getClass();
            Instant instantPlus = abaVar.b.plus(this.c);
            this.a.getClass();
            if (instantPlus.isBefore(Instant.ofEpochMilli(Scheduler.a(timeUnit)))) {
                arrayList5.add(next);
            }
        }
        ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(((aba) it3.next()).a);
        }
        Iterator it4 = o7h.l1(arrayList6).iterator();
        while (true) {
            boolean zHasNext2 = it4.hasNext();
            x390Var = this.b;
            if (!zHasNext2) {
                break;
            } else if (((aba) concurrentHashMap.remove((wqd) it4.next())) != null) {
                x390.n(x390Var, 1, "Expired");
            }
        }
        boolean zIsEmpty = concurrentHashMap.isEmpty();
        vku vkuVar = this.N0;
        if (!zIsEmpty) {
            vkuVar.c();
        }
        if (zIsEmpty) {
            return;
        }
        ou80 ou80VarT = x390Var.t("");
        PlayOrigin playOriginCreate = PlayOrigin.create("driving-jumpstart");
        LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(ou80VarT.a);
        y6r0 y6r0Var = this.X.get();
        String str = y6r0Var != null ? y6r0Var.a : null;
        Single singleA = jgz0.a(this.t, playOriginCreate, builderInteractionId.pageInstanceId(str != null ? str : "").build(), (Boolean) null, 28);
        Scheduler scheduler = this.g;
        vkuVar.a(singleA.observeOn(scheduler).timeout(this.h.toMillis(), timeUnit, scheduler).subscribeOn(scheduler).subscribe(new w090(this, ou80VarT, (byte) 4), new zha0(this, (byte) 0)));
    }
}
