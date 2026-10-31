package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ggl {
    public final i8h1 a;
    public final hs00 b;
    public final yx10 c;
    public final Scheduler d;
    public final w4h e;
    public final dt71 f;
    public final dt71 g;

    public ggl(i8h1 i8h1Var, hs00 hs00Var, yx10 yx10Var, Scheduler scheduler, w4h w4hVar) {
        this.a = i8h1Var;
        this.b = hs00Var;
        this.c = yx10Var;
        this.d = scheduler;
        this.e = w4hVar;
        dt71 dt71VarE = mgo1.e(0, 1, 0, 5);
        this.f = dt71VarE;
        this.g = dt71VarE;
    }

    public final void a(String str, String str2, String str3) {
        Consumer consumer = fcc.Z;
        Scheduler scheduler = this.d;
        yx10 yx10Var = this.c;
        hs00 hs00Var = this.b;
        if (str3 == null) {
            d(1, k4p1.x(str2));
            CompletablePeek completablePeekH = yx10Var.a(str, str2, "local").s(scheduler).h(consumer);
            Predicate predicate = Functions.h;
            completablePeekH.o(predicate).subscribe();
            hs00Var.a(str2).o(predicate).subscribe();
        } else {
            b(1, str3, str2);
            CompletablePeek completablePeekH2 = yx10Var.a(str, str2, "local").s(scheduler).h(consumer);
            Predicate predicate2 = Functions.h;
            completablePeekH2.o(predicate2).subscribe();
            hs00Var.a(str2).o(predicate2).subscribe();
        }
        this.f.a(new fgl(1, new egl(str, str2)));
    }

    public final void b(int i, String str, String str2) {
        boolean zA = dpx0.a(str2);
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(str);
        if (!zA && !u890.j(str2, str)) {
            smc0VarN.add(str2);
        }
        d(i, k4p1.k(smc0VarN));
    }

    public final void c(String str, String str2) {
        this.a.m(new e1l0(o6p1.s(str2)).e(str2), null);
        this.c.d(str, str2).s(this.d).h(fcc.N0).o(Functions.h).subscribe();
    }

    public final void d(int i, List list) {
        Single singleA;
        if (list.isEmpty()) {
            return;
        }
        CollectionPlatformItemsRequest collectionPlatformItemsRequestG = w361.g(list);
        int iC = l1d.C(i);
        w4h w4hVar = this.e;
        if (iC == 0) {
            collectionPlatformItemsRequestG.getClass();
            singleA = w4hVar.a(collectionPlatformItemsRequestG);
        } else if (iC != 1) {
            eg.o();
            return;
        } else {
            collectionPlatformItemsRequestG.getClass();
            singleA = w4hVar.b(collectionPlatformItemsRequestG);
        }
        singleA.subscribeOn(this.d).doOnError(new uz01(i, list)).onErrorComplete().subscribe();
    }

    public final void e(String str, String str2, String str3) {
        hs00 hs00Var = this.b;
        if (str3 == null) {
            d(2, k4p1.x(str2));
            c(str, str2);
            hs00Var.c(str2).o(Functions.h).subscribe();
        } else {
            b(2, str3, str2);
            c(str, str2);
            hs00Var.c(str2).o(Functions.h).subscribe();
        }
        this.f.a(new fgl(2, new egl(str, str2)));
    }
}
