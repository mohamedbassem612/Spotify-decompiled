package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ewa {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f13p = Pattern.compile("(\r\n|\n)");
    public final ObservableFromPublisher a;
    public final Observable b;
    public final Scheduler c;
    public Disposable d;
    public Disposable e;
    public String f;
    public fxn g;
    public boolean h;
    public fwa i;
    public final rm5 j;
    public List k;
    public final dwa l;
    public final dwa m;
    public final dwa n;
    public final dwa o;

    /* JADX WARN: Type inference failed for: r0v1, types: [p.dwa] */
    /* JADX WARN: Type inference failed for: r0v2, types: [p.dwa] */
    /* JADX WARN: Type inference failed for: r0v3, types: [p.dwa] */
    /* JADX WARN: Type inference failed for: r0v4, types: [p.dwa] */
    public ewa(Scheduler scheduler, Observable observable, ObservableFromPublisher observableFromPublisher, rm5 rm5Var, fwa fwaVar, String str) {
        EmptyDisposable emptyDisposable = EmptyDisposable.a;
        this.d = emptyDisposable;
        this.e = emptyDisposable;
        final byte b = 0;
        this.l = new Consumer(this) { // from class: p.dwa
            public final /* synthetic */ ewa b;

            {
                this.b = this;
            }

            public final void accept(Object obj) {
                byte b2 = b;
                ewa ewaVar = this.b;
                switch (b2) {
                    case 0:
                        ewaVar.i.D((Throwable) obj);
                        break;
                    case 1:
                        ewaVar.b((fxn) obj);
                        break;
                    case 2:
                        ewaVar.i.D((Throwable) obj);
                        break;
                    default:
                        th61 th61Var = (th61) obj;
                        th61Var.getClass();
                        if (ewaVar.g == null) {
                            boolean z = th61Var.h;
                            fwa fwaVar2 = ewaVar.i;
                            if (z) {
                                fwaVar2.U();
                                ewaVar.d.dispose();
                                ewaVar.d = ewaVar.b.observeOn(ewaVar.c).subscribe(ewaVar.m, ewaVar.l);
                            } else {
                                fwaVar2.w();
                            }
                        }
                        ewaVar.i.r();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.m = new Consumer(this) { // from class: p.dwa
            public final /* synthetic */ ewa b;

            {
                this.b = this;
            }

            public final void accept(Object obj) {
                byte b3 = b2;
                ewa ewaVar = this.b;
                switch (b3) {
                    case 0:
                        ewaVar.i.D((Throwable) obj);
                        break;
                    case 1:
                        ewaVar.b((fxn) obj);
                        break;
                    case 2:
                        ewaVar.i.D((Throwable) obj);
                        break;
                    default:
                        th61 th61Var = (th61) obj;
                        th61Var.getClass();
                        if (ewaVar.g == null) {
                            boolean z = th61Var.h;
                            fwa fwaVar2 = ewaVar.i;
                            if (z) {
                                fwaVar2.U();
                                ewaVar.d.dispose();
                                ewaVar.d = ewaVar.b.observeOn(ewaVar.c).subscribe(ewaVar.m, ewaVar.l);
                            } else {
                                fwaVar2.w();
                            }
                        }
                        ewaVar.i.r();
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.n = new Consumer(this) { // from class: p.dwa
            public final /* synthetic */ ewa b;

            {
                this.b = this;
            }

            public final void accept(Object obj) {
                byte b4 = b3;
                ewa ewaVar = this.b;
                switch (b4) {
                    case 0:
                        ewaVar.i.D((Throwable) obj);
                        break;
                    case 1:
                        ewaVar.b((fxn) obj);
                        break;
                    case 2:
                        ewaVar.i.D((Throwable) obj);
                        break;
                    default:
                        th61 th61Var = (th61) obj;
                        th61Var.getClass();
                        if (ewaVar.g == null) {
                            boolean z = th61Var.h;
                            fwa fwaVar2 = ewaVar.i;
                            if (z) {
                                fwaVar2.U();
                                ewaVar.d.dispose();
                                ewaVar.d = ewaVar.b.observeOn(ewaVar.c).subscribe(ewaVar.m, ewaVar.l);
                            } else {
                                fwaVar2.w();
                            }
                        }
                        ewaVar.i.r();
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.o = new Consumer(this) { // from class: p.dwa
            public final /* synthetic */ ewa b;

            {
                this.b = this;
            }

            public final void accept(Object obj) {
                byte b5 = b4;
                ewa ewaVar = this.b;
                switch (b5) {
                    case 0:
                        ewaVar.i.D((Throwable) obj);
                        break;
                    case 1:
                        ewaVar.b((fxn) obj);
                        break;
                    case 2:
                        ewaVar.i.D((Throwable) obj);
                        break;
                    default:
                        th61 th61Var = (th61) obj;
                        th61Var.getClass();
                        if (ewaVar.g == null) {
                            boolean z = th61Var.h;
                            fwa fwaVar2 = ewaVar.i;
                            if (z) {
                                fwaVar2.U();
                                ewaVar.d.dispose();
                                ewaVar.d = ewaVar.b.observeOn(ewaVar.c).subscribe(ewaVar.m, ewaVar.l);
                            } else {
                                fwaVar2.w();
                            }
                        }
                        ewaVar.i.r();
                        break;
                }
            }
        };
        this.c = scheduler;
        observable.getClass();
        this.b = observable;
        this.a = observableFromPublisher;
        rm5Var.getClass();
        this.j = rm5Var;
        this.i = fwaVar;
        str.getClass();
    }

    public final void a(int i) {
        rm5 rm5Var = this.j;
        i8h1 i8h1Var = (i8h1) rm5Var.b;
        x6h1 x6h1VarC = ((urk0) rm5Var.a).b.c();
        x6h1VarC.i.add(new a7h1("gallery", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("carousel", (String) null, numValueOf, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("move_image", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    public final void b(fxn fxnVar) {
        ?? arrayList;
        fxnVar.getClass();
        this.g = fxnVar;
        this.i.S(fxnVar);
        String str = fxnVar.e;
        List list = fxnVar.c;
        this.k = list;
        List listUnmodifiableList = Collections.unmodifiableList(z1p1.D(list, new cwa((byte) 0)));
        boolean zIsEmpty = listUnmodifiableList.isEmpty();
        fwa fwaVar = this.i;
        if (zIsEmpty) {
            fwaVar.W();
        } else {
            fwaVar.h(listUnmodifiableList);
            this.i.y();
        }
        String str2 = fxnVar.d;
        v29 v29Var = fxnVar.g;
        String str3 = fxnVar.f;
        boolean z = fxnVar.h;
        ro6 ro6Var = fxnVar.i;
        String str4 = v29Var == null ? null : v29Var.a;
        boolean zF = jhc1.F(str4);
        Pattern pattern = f13p;
        if (!zF) {
            this.i.K(pattern.matcher(str4).replaceAll("<br/>"), str3, str);
        } else if (!jhc1.F(str2)) {
            this.i.g(pattern.matcher(str2).replaceAll("<br/>"));
        }
        this.i.d(z);
        fwa fwaVar2 = this.i;
        if (ro6Var != null) {
            List<lo6> list2 = ro6Var.a;
            arrayList = new ArrayList(q7h.U(list2, 10));
            for (lo6 lo6Var : list2) {
                lo6Var.getClass();
                LinkedHashMap linkedHashMap = mo6.b;
                mo6 mo6Var = (mo6) mo6.b.get(lo6Var.a);
                if (mo6Var == null) {
                    mo6Var = mo6.t;
                }
                arrayList.add(new io6(mo6Var, lo6Var.b, lo6Var.c));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        fwaVar2.n((List) arrayList);
        cmc0 cmc0Var = v29Var != null ? v29Var.c : null;
        if (cmc0Var != null) {
            String str5 = cmc0Var.c;
            if (!jhc1.F(str5)) {
                this.i.T(str5);
            }
            String str6 = cmc0Var.b;
            if (!jhc1.F(str6)) {
                this.i.B(str6);
            }
            String str7 = cmc0Var.d;
            if (!jhc1.F(str7)) {
                this.i.Z(str7);
            }
            String str8 = cmc0Var.a;
            if (!jhc1.F(str8)) {
                this.i.I(str8);
            }
            String str9 = cmc0Var.e;
            if (!jhc1.F(str9)) {
                this.i.F(str9);
            }
            String str10 = cmc0Var.f;
            if (jhc1.F(str10)) {
                return;
            }
            this.i.x(str10);
        }
    }

    public final void c(Bundle bundle) {
        if (bundle != null) {
            this.f = bundle.getString("locale");
            this.g = (fxn) bundle.getParcelable("data");
            if (!Objects.equals(this.f, upn1.m())) {
                this.g = null;
            }
        }
        this.h = this.g != null;
    }

    public final void d(Bundle bundle) {
        String strM = upn1.m();
        this.f = strM;
        bundle.putString("locale", strM);
        bundle.putParcelable("data", this.g);
    }

    public final void e(fwa fwaVar) {
        fxn fxnVar;
        this.i = fwaVar;
        if (this.h && (fxnVar = this.g) != null) {
            b(fxnVar);
        } else {
            this.e.dispose();
            this.e = this.a.subscribe(this.o, this.n);
        }
    }

    public final void f() {
        this.e.dispose();
        this.d.dispose();
        this.i = null;
    }
}
