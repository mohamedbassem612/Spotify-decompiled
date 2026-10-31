package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableError;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class as implements Function {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ cs b;
    public final /* synthetic */ lw c;
    public final /* synthetic */ ai8 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ q941 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;

    public as(cs csVar, lw lwVar, ai8 ai8Var, String str, q941 q941Var, String str2, boolean z) {
        this.b = csVar;
        this.c = lwVar;
        this.d = ai8Var;
        this.e = str;
        this.f = q941Var;
        this.g = str2;
        this.h = z;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                lw lwVar = this.c;
                this.d.a(di8.a(lwVar.a, (wd) null), true);
                cs csVar = this.b;
                return csVar.f.x(new sr(this.e)).Y(5L, new FlowableError(Functions.h(new TimeoutException()))).C(new zr(this.e, this.f, csVar, lwVar, this.g, this.h), false, Integer.MAX_VALUE).y(Boolean.FALSE);
            default:
                cs csVar2 = this.b;
                return Observable.combineLatest(csVar2.e.filter(qr.e), new ObservableFromPublisher(csVar2.f.x(qr.f)), qr.g).timeout(5L, TimeUnit.SECONDS, Observable.error(new TimeoutException())).firstOrError().flatMap(new as(this.c, this.d, csVar2, this.e, this.f, this.g, this.h));
        }
    }

    public as(lw lwVar, ai8 ai8Var, cs csVar, String str, q941 q941Var, String str2, boolean z) {
        this.c = lwVar;
        this.d = ai8Var;
        this.b = csVar;
        this.e = str;
        this.f = q941Var;
        this.g = str2;
        this.h = z;
    }
}
