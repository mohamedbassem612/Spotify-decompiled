package p;

import android.content.Context;
import android.content.IntentFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.creativework.v1.Release;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c9s implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c9s(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        x8c0 lifecycle;
        dt30 dt30Var;
        x8c0 lifecycle2;
        byte b = this.a;
        o6x o6xVar = o6x.a;
        final byte b2 = 3;
        final byte b3 = 2;
        final byte b4 = 0;
        final byte b5 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ((iu30) obj).invoke(lgj0.a);
                break;
            case 3:
                ilc0 ilc0Var = (ilc0) ((t7y) obj2).c;
                String uri = ((Release) ((vi11) obj).b).getUri();
                final klc0 klc0Var = (klc0) ilc0Var;
                klc0Var.getClass();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                klc0Var.n = new dlg1((i8h1) klc0Var.i.a.b.A5.get(), new xok0(yon1.O3().a, uri, (byte) 18), uri);
                CompositeDisposable compositeDisposable = klc0Var.m;
                t1z t1zVar = klc0Var.a;
                Set set = s4b1.f;
                Observable observableA = t1zVar.a(uic.x(uri), Collections.singletonList(p1z.LINKED_ENTITIES));
                Scheduler scheduler = klc0Var.b;
                compositeDisposable.f(new Disposable[]{observableA.subscribeOn(scheduler).observeOn(klc0Var.c).subscribe(new Consumer() { // from class: p.jlc0
                    public final void accept(Object obj3) {
                        String string;
                        byte b6 = b4;
                        klc0 klc0Var2 = klc0Var;
                        switch (b6) {
                            case 0:
                                klc0Var2.getClass();
                                ArrayList arrayList = ((z1z) obj3).a;
                                if (!arrayList.isEmpty()) {
                                    dlg1 dlg1Var = klc0Var2.n;
                                    if (dlg1Var == null) {
                                        u890.C("logger");
                                        throw null;
                                    }
                                    i8h1 i8h1Var = (i8h1) dlg1Var.a;
                                    xok0 xok0Var = (xok0) dlg1Var.b;
                                    String str = (String) dlg1Var.c;
                                    x6h1 x6h1VarC = xok0Var.b.c();
                                    x6h1VarC.i.add(new a7h1("episode_associations", (String) null, (Integer) null, str, (String) null));
                                    x6h1VarC.j = true;
                                    y6h1 y6h1VarA = x6h1VarC.a();
                                    k7h1 k7h1Var = new k7h1();
                                    ((xjn) k7h1Var).a = y6h1VarA;
                                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                                    i8h1Var.f(k7h1Var.a(), (Set) null);
                                }
                                llc0 llc0Var = klc0Var2.d;
                                llc0Var.getClass();
                                boolean zIsEmpty = arrayList.isEmpty();
                                plb0 plb0Var = llc0Var.b;
                                if (zIsEmpty) {
                                    if (plb0Var != null) {
                                        plb0Var.a.setVisibility(8);
                                        return;
                                    } else {
                                        u890.C("binding");
                                        throw null;
                                    }
                                }
                                if (plb0Var == null) {
                                    u890.C("binding");
                                    throw null;
                                }
                                plb0Var.a.setVisibility(0);
                                plb0 plb0Var2 = llc0Var.b;
                                if (plb0Var2 == null) {
                                    u890.C("binding");
                                    throw null;
                                }
                                TextView textView = plb0Var2.b;
                                Context context = llc0Var.a;
                                if (arrayList.size() > 1) {
                                    string = context.getString(2131963019);
                                } else {
                                    dem1 dem1Var = ((iby) o7h.q0(arrayList)).e;
                                    if (dem1Var instanceof syy) {
                                        string = context.getString(2131963021);
                                    } else if (dem1Var instanceof qyy) {
                                        string = context.getString(2131963020);
                                    } else if (dem1Var instanceof xyy) {
                                        string = context.getString(2131963023);
                                    } else if (dem1Var instanceof yyy) {
                                        string = context.getString(2131963024);
                                    } else if (dem1Var instanceof zyy) {
                                        string = context.getString(2131963026);
                                    } else if (dem1Var instanceof azy) {
                                        string = context.getString(2131963027);
                                    } else if (dem1Var instanceof bzy) {
                                        string = context.getString(2131963028);
                                    } else {
                                        if (!(dem1Var instanceof uyy) && !(dem1Var instanceof vyy)) {
                                            eg.o();
                                            return;
                                        }
                                        string = context.getString(2131963022);
                                    }
                                }
                                string.getClass();
                                textView.setText(string);
                                llc0Var.c.C(arrayList);
                                plb0 plb0Var3 = llc0Var.b;
                                if (plb0Var3 != null) {
                                    plb0Var3.c.requestLayout();
                                    return;
                                } else {
                                    u890.C("binding");
                                    throw null;
                                }
                            case 1:
                                klc0Var2.getClass();
                                ((Throwable) obj3).getLocalizedMessage();
                                plb0 plb0Var4 = klc0Var2.d.b;
                                if (plb0Var4 != null) {
                                    plb0Var4.a.setVisibility(8);
                                    return;
                                } else {
                                    u890.C("binding");
                                    throw null;
                                }
                            case 2:
                                klc0Var2.f15p = ((Boolean) obj3).booleanValue();
                                return;
                            default:
                                klc0Var2.q = ((Boolean) obj3).booleanValue();
                                return;
                        }
                    }
                }, new Consumer() { // from class: p.jlc0
                    public final void accept(Object obj3) {
                        String string;
                        byte b6 = b5;
                        klc0 klc0Var2 = klc0Var;
                        switch (b6) {
                            case 0:
                                klc0Var2.getClass();
                                ArrayList arrayList = ((z1z) obj3).a;
                                if (!arrayList.isEmpty()) {
                                    dlg1 dlg1Var = klc0Var2.n;
                                    if (dlg1Var == null) {
                                        u890.C("logger");
                                        throw null;
                                    }
                                    i8h1 i8h1Var = (i8h1) dlg1Var.a;
                                    xok0 xok0Var = (xok0) dlg1Var.b;
                                    String str = (String) dlg1Var.c;
                                    x6h1 x6h1VarC = xok0Var.b.c();
                                    x6h1VarC.i.add(new a7h1("episode_associations", (String) null, (Integer) null, str, (String) null));
                                    x6h1VarC.j = true;
                                    y6h1 y6h1VarA = x6h1VarC.a();
                                    k7h1 k7h1Var = new k7h1();
                                    ((xjn) k7h1Var).a = y6h1VarA;
                                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                                    i8h1Var.f(k7h1Var.a(), (Set) null);
                                }
                                llc0 llc0Var = klc0Var2.d;
                                llc0Var.getClass();
                                boolean zIsEmpty = arrayList.isEmpty();
                                plb0 plb0Var = llc0Var.b;
                                if (zIsEmpty) {
                                    if (plb0Var != null) {
                                        plb0Var.a.setVisibility(8);
                                        return;
                                    } else {
                                        u890.C("binding");
                                        throw null;
                                    }
                                }
                                if (plb0Var == null) {
                                    u890.C("binding");
                                    throw null;
                                }
                                plb0Var.a.setVisibility(0);
                                plb0 plb0Var2 = llc0Var.b;
                                if (plb0Var2 == null) {
                                    u890.C("binding");
                                    throw null;
                                }
                                TextView textView = plb0Var2.b;
                                Context context = llc0Var.a;
                                if (arrayList.size() > 1) {
                                    string = context.getString(2131963019);
                                } else {
                                    dem1 dem1Var = ((iby) o7h.q0(arrayList)).e;
                                    if (dem1Var instanceof syy) {
                                        string = context.getString(2131963021);
                                    } else if (dem1Var instanceof qyy) {
                                        string = context.getString(2131963020);
                                    } else if (dem1Var instanceof xyy) {
                                        string = context.getString(2131963023);
                                    } else if (dem1Var instanceof yyy) {
                                        string = context.getString(2131963024);
                                    } else if (dem1Var instanceof zyy) {
                                        string = context.getString(2131963026);
                                    } else if (dem1Var instanceof azy) {
                                        string = context.getString(2131963027);
                                    } else if (dem1Var instanceof bzy) {
                                        string = context.getString(2131963028);
                                    } else {
                                        if (!(dem1Var instanceof uyy) && !(dem1Var instanceof vyy)) {
                                            eg.o();
                                            return;
                                        }
                                        string = context.getString(2131963022);
                                    }
                                }
                                string.getClass();
                                textView.setText(string);
                                llc0Var.c.C(arrayList);
                                plb0 plb0Var3 = llc0Var.b;
                                if (plb0Var3 != null) {
                                    plb0Var3.c.requestLayout();
                                    return;
                                } else {
                                    u890.C("binding");
                                    throw null;
                                }
                            case 1:
                                klc0Var2.getClass();
                                ((Throwable) obj3).getLocalizedMessage();
                                plb0 plb0Var4 = klc0Var2.d.b;
                                if (plb0Var4 != null) {
                                    plb0Var4.a.setVisibility(8);
                                    return;
                                } else {
                                    u890.C("binding");
                                    throw null;
                                }
                            case 2:
                                klc0Var2.f15p = ((Boolean) obj3).booleanValue();
                                return;
                            default:
                                klc0Var2.q = ((Boolean) obj3).booleanValue();
                                return;
                        }
                    }
                }), klc0Var.j.a().distinctUntilChanged().observeOn(scheduler).subscribe(new Consumer() { // from class: p.jlc0
                    public final void accept(Object obj3) {
                        String string;
                        byte b6 = b3;
                        klc0 klc0Var2 = klc0Var;
                        switch (b6) {
                            case 0:
                                klc0Var2.getClass();
                                ArrayList arrayList = ((z1z) obj3).a;
                                if (!arrayList.isEmpty()) {
                                    dlg1 dlg1Var = klc0Var2.n;
                                    if (dlg1Var == null) {
                                        u890.C("logger");
                                        throw null;
                                    }
                                    i8h1 i8h1Var = (i8h1) dlg1Var.a;
                                    xok0 xok0Var = (xok0) dlg1Var.b;
                                    String str = (String) dlg1Var.c;
                                    x6h1 x6h1VarC = xok0Var.b.c();
                                    x6h1VarC.i.add(new a7h1("episode_associations", (String) null, (Integer) null, str, (String) null));
                                    x6h1VarC.j = true;
                                    y6h1 y6h1VarA = x6h1VarC.a();
                                    k7h1 k7h1Var = new k7h1();
                                    ((xjn) k7h1Var).a = y6h1VarA;
                                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                                    i8h1Var.f(k7h1Var.a(), (Set) null);
                                }
                                llc0 llc0Var = klc0Var2.d;
                                llc0Var.getClass();
                                boolean zIsEmpty = arrayList.isEmpty();
                                plb0 plb0Var = llc0Var.b;
                                if (zIsEmpty) {
                                    if (plb0Var != null) {
                                        plb0Var.a.setVisibility(8);
                                        return;
                                    } else {
                                        u890.C("binding");
                                        throw null;
                                    }
                                }
                                if (plb0Var == null) {
                                    u890.C("binding");
                                    throw null;
                                }
                                plb0Var.a.setVisibility(0);
                                plb0 plb0Var2 = llc0Var.b;
                                if (plb0Var2 == null) {
                                    u890.C("binding");
                                    throw null;
                                }
                                TextView textView = plb0Var2.b;
                                Context context = llc0Var.a;
                                if (arrayList.size() > 1) {
                                    string = context.getString(2131963019);
                                } else {
                                    dem1 dem1Var = ((iby) o7h.q0(arrayList)).e;
                                    if (dem1Var instanceof syy) {
                                        string = context.getString(2131963021);
                                    } else if (dem1Var instanceof qyy) {
                                        string = context.getString(2131963020);
                                    } else if (dem1Var instanceof xyy) {
                                        string = context.getString(2131963023);
                                    } else if (dem1Var instanceof yyy) {
                                        string = context.getString(2131963024);
                                    } else if (dem1Var instanceof zyy) {
                                        string = context.getString(2131963026);
                                    } else if (dem1Var instanceof azy) {
                                        string = context.getString(2131963027);
                                    } else if (dem1Var instanceof bzy) {
                                        string = context.getString(2131963028);
                                    } else {
                                        if (!(dem1Var instanceof uyy) && !(dem1Var instanceof vyy)) {
                                            eg.o();
                                            return;
                                        }
                                        string = context.getString(2131963022);
                                    }
                                }
                                string.getClass();
                                textView.setText(string);
                                llc0Var.c.C(arrayList);
                                plb0 plb0Var3 = llc0Var.b;
                                if (plb0Var3 != null) {
                                    plb0Var3.c.requestLayout();
                                    return;
                                } else {
                                    u890.C("binding");
                                    throw null;
                                }
                            case 1:
                                klc0Var2.getClass();
                                ((Throwable) obj3).getLocalizedMessage();
                                plb0 plb0Var4 = klc0Var2.d.b;
                                if (plb0Var4 != null) {
                                    plb0Var4.a.setVisibility(8);
                                    return;
                                } else {
                                    u890.C("binding");
                                    throw null;
                                }
                            case 2:
                                klc0Var2.f15p = ((Boolean) obj3).booleanValue();
                                return;
                            default:
                                klc0Var2.q = ((Boolean) obj3).booleanValue();
                                return;
                        }
                    }
                }), yoi1.i(klc0Var.k.a, o6xVar).distinctUntilChanged().observeOn(scheduler).subscribe(new Consumer() { // from class: p.jlc0
                    public final void accept(Object obj3) {
                        String string;
                        byte b6 = b2;
                        klc0 klc0Var2 = klc0Var;
                        switch (b6) {
                            case 0:
                                klc0Var2.getClass();
                                ArrayList arrayList = ((z1z) obj3).a;
                                if (!arrayList.isEmpty()) {
                                    dlg1 dlg1Var = klc0Var2.n;
                                    if (dlg1Var == null) {
                                        u890.C("logger");
                                        throw null;
                                    }
                                    i8h1 i8h1Var = (i8h1) dlg1Var.a;
                                    xok0 xok0Var = (xok0) dlg1Var.b;
                                    String str = (String) dlg1Var.c;
                                    x6h1 x6h1VarC = xok0Var.b.c();
                                    x6h1VarC.i.add(new a7h1("episode_associations", (String) null, (Integer) null, str, (String) null));
                                    x6h1VarC.j = true;
                                    y6h1 y6h1VarA = x6h1VarC.a();
                                    k7h1 k7h1Var = new k7h1();
                                    ((xjn) k7h1Var).a = y6h1VarA;
                                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                                    i8h1Var.f(k7h1Var.a(), (Set) null);
                                }
                                llc0 llc0Var = klc0Var2.d;
                                llc0Var.getClass();
                                boolean zIsEmpty = arrayList.isEmpty();
                                plb0 plb0Var = llc0Var.b;
                                if (zIsEmpty) {
                                    if (plb0Var != null) {
                                        plb0Var.a.setVisibility(8);
                                        return;
                                    } else {
                                        u890.C("binding");
                                        throw null;
                                    }
                                }
                                if (plb0Var == null) {
                                    u890.C("binding");
                                    throw null;
                                }
                                plb0Var.a.setVisibility(0);
                                plb0 plb0Var2 = llc0Var.b;
                                if (plb0Var2 == null) {
                                    u890.C("binding");
                                    throw null;
                                }
                                TextView textView = plb0Var2.b;
                                Context context = llc0Var.a;
                                if (arrayList.size() > 1) {
                                    string = context.getString(2131963019);
                                } else {
                                    dem1 dem1Var = ((iby) o7h.q0(arrayList)).e;
                                    if (dem1Var instanceof syy) {
                                        string = context.getString(2131963021);
                                    } else if (dem1Var instanceof qyy) {
                                        string = context.getString(2131963020);
                                    } else if (dem1Var instanceof xyy) {
                                        string = context.getString(2131963023);
                                    } else if (dem1Var instanceof yyy) {
                                        string = context.getString(2131963024);
                                    } else if (dem1Var instanceof zyy) {
                                        string = context.getString(2131963026);
                                    } else if (dem1Var instanceof azy) {
                                        string = context.getString(2131963027);
                                    } else if (dem1Var instanceof bzy) {
                                        string = context.getString(2131963028);
                                    } else {
                                        if (!(dem1Var instanceof uyy) && !(dem1Var instanceof vyy)) {
                                            eg.o();
                                            return;
                                        }
                                        string = context.getString(2131963022);
                                    }
                                }
                                string.getClass();
                                textView.setText(string);
                                llc0Var.c.C(arrayList);
                                plb0 plb0Var3 = llc0Var.b;
                                if (plb0Var3 != null) {
                                    plb0Var3.c.requestLayout();
                                    return;
                                } else {
                                    u890.C("binding");
                                    throw null;
                                }
                            case 1:
                                klc0Var2.getClass();
                                ((Throwable) obj3).getLocalizedMessage();
                                plb0 plb0Var4 = klc0Var2.d.b;
                                if (plb0Var4 != null) {
                                    plb0Var4.a.setVisibility(8);
                                    return;
                                } else {
                                    u890.C("binding");
                                    throw null;
                                }
                            case 2:
                                klc0Var2.f15p = ((Boolean) obj3).booleanValue();
                                return;
                            default:
                                klc0Var2.q = ((Boolean) obj3).booleanValue();
                                return;
                        }
                    }
                })});
                break;
            case 4:
                sk11 sk11Var = (sk11) ((w2z) obj2).c;
                vi11 vi11Var = (vi11) obj;
                String uri2 = ((Release) vi11Var.b).getUri();
                r6h1 r6h1Var = (r6h1) vi11Var.e;
                final uk11 uk11Var = (uk11) sk11Var;
                uk11Var.getClass();
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                uk11Var.n = new ffe1((i8h1) uk11Var.i.a.b.A5.get(), new g5l0(yon1.O3().a, uri2, r6h1Var, (byte) 3), (byte) 25);
                CompositeDisposable compositeDisposable2 = uk11Var.m;
                t1z t1zVar2 = uk11Var.a;
                Set set2 = s4b1.f;
                Observable observableA2 = t1zVar2.a(uic.x(uri2), Collections.singletonList(p1z.RELATED_CONTENT));
                Scheduler scheduler2 = uk11Var.b;
                compositeDisposable2.f(new Disposable[]{observableA2.subscribeOn(scheduler2).observeOn(uk11Var.c).subscribe(new Consumer() { // from class: p.tk11
                    public final void accept(Object obj3) {
                        byte b6 = b4;
                        uk11 uk11Var2 = uk11Var;
                        switch (b6) {
                            case 0:
                                uk11Var2.getClass();
                                ArrayList arrayList = ((z1z) obj3).b;
                                if (!arrayList.isEmpty()) {
                                    ffe1 ffe1Var = uk11Var2.n;
                                    if (ffe1Var == null) {
                                        u890.C("logger");
                                        throw null;
                                    }
                                    i8h1 i8h1Var = (i8h1) ffe1Var.b;
                                    g5l0 g5l0Var = (g5l0) ffe1Var.c;
                                    x6h1 x6h1VarC = g5l0Var.c.c();
                                    x6h1VarC.i.add(new a7h1("related_content", (String) null, (Integer) null, (String) null, (String) null));
                                    x6h1VarC.j = true;
                                    y6h1 y6h1VarA = x6h1VarC.a();
                                    k7h1 k7h1Var = new k7h1();
                                    ((xjn) k7h1Var).a = y6h1VarA;
                                    ((xjn) k7h1Var).b = g5l0Var.b;
                                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                                    i8h1Var.f(k7h1Var.a(), (Set) null);
                                }
                                jl11 jl11Var = uk11Var2.d;
                                jl11Var.getClass();
                                boolean zIsEmpty = arrayList.isEmpty();
                                sb30 sb30Var = jl11Var.a;
                                if (zIsEmpty) {
                                    if (sb30Var != null) {
                                        sb30Var.a.setVisibility(8);
                                        return;
                                    } else {
                                        u890.C("binding");
                                        throw null;
                                    }
                                }
                                if (sb30Var == null) {
                                    u890.C("binding");
                                    throw null;
                                }
                                sb30Var.a.setVisibility(0);
                                jl11Var.b.C(arrayList);
                                sb30 sb30Var2 = jl11Var.a;
                                if (sb30Var2 != null) {
                                    sb30Var2.b.requestLayout();
                                    return;
                                } else {
                                    u890.C("binding");
                                    throw null;
                                }
                            case 1:
                                uk11Var2.getClass();
                                ((Throwable) obj3).getLocalizedMessage();
                                sb30 sb30Var3 = uk11Var2.d.a;
                                if (sb30Var3 != null) {
                                    sb30Var3.a.setVisibility(8);
                                    return;
                                } else {
                                    u890.C("binding");
                                    throw null;
                                }
                            case 2:
                                uk11Var2.f45p = ((Boolean) obj3).booleanValue();
                                return;
                            default:
                                uk11Var2.q = ((Boolean) obj3).booleanValue();
                                return;
                        }
                    }
                }, new Consumer() { // from class: p.tk11
                    public final void accept(Object obj3) {
                        byte b6 = b5;
                        uk11 uk11Var2 = uk11Var;
                        switch (b6) {
                            case 0:
                                uk11Var2.getClass();
                                ArrayList arrayList = ((z1z) obj3).b;
                                if (!arrayList.isEmpty()) {
                                    ffe1 ffe1Var = uk11Var2.n;
                                    if (ffe1Var == null) {
                                        u890.C("logger");
                                        throw null;
                                    }
                                    i8h1 i8h1Var = (i8h1) ffe1Var.b;
                                    g5l0 g5l0Var = (g5l0) ffe1Var.c;
                                    x6h1 x6h1VarC = g5l0Var.c.c();
                                    x6h1VarC.i.add(new a7h1("related_content", (String) null, (Integer) null, (String) null, (String) null));
                                    x6h1VarC.j = true;
                                    y6h1 y6h1VarA = x6h1VarC.a();
                                    k7h1 k7h1Var = new k7h1();
                                    ((xjn) k7h1Var).a = y6h1VarA;
                                    ((xjn) k7h1Var).b = g5l0Var.b;
                                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                                    i8h1Var.f(k7h1Var.a(), (Set) null);
                                }
                                jl11 jl11Var = uk11Var2.d;
                                jl11Var.getClass();
                                boolean zIsEmpty = arrayList.isEmpty();
                                sb30 sb30Var = jl11Var.a;
                                if (zIsEmpty) {
                                    if (sb30Var != null) {
                                        sb30Var.a.setVisibility(8);
                                        return;
                                    } else {
                                        u890.C("binding");
                                        throw null;
                                    }
                                }
                                if (sb30Var == null) {
                                    u890.C("binding");
                                    throw null;
                                }
                                sb30Var.a.setVisibility(0);
                                jl11Var.b.C(arrayList);
                                sb30 sb30Var2 = jl11Var.a;
                                if (sb30Var2 != null) {
                                    sb30Var2.b.requestLayout();
                                    return;
                                } else {
                                    u890.C("binding");
                                    throw null;
                                }
                            case 1:
                                uk11Var2.getClass();
                                ((Throwable) obj3).getLocalizedMessage();
                                sb30 sb30Var3 = uk11Var2.d.a;
                                if (sb30Var3 != null) {
                                    sb30Var3.a.setVisibility(8);
                                    return;
                                } else {
                                    u890.C("binding");
                                    throw null;
                                }
                            case 2:
                                uk11Var2.f45p = ((Boolean) obj3).booleanValue();
                                return;
                            default:
                                uk11Var2.q = ((Boolean) obj3).booleanValue();
                                return;
                        }
                    }
                }), uk11Var.j.a().distinctUntilChanged().observeOn(scheduler2).subscribe(new Consumer() { // from class: p.tk11
                    public final void accept(Object obj3) {
                        byte b6 = b3;
                        uk11 uk11Var2 = uk11Var;
                        switch (b6) {
                            case 0:
                                uk11Var2.getClass();
                                ArrayList arrayList = ((z1z) obj3).b;
                                if (!arrayList.isEmpty()) {
                                    ffe1 ffe1Var = uk11Var2.n;
                                    if (ffe1Var == null) {
                                        u890.C("logger");
                                        throw null;
                                    }
                                    i8h1 i8h1Var = (i8h1) ffe1Var.b;
                                    g5l0 g5l0Var = (g5l0) ffe1Var.c;
                                    x6h1 x6h1VarC = g5l0Var.c.c();
                                    x6h1VarC.i.add(new a7h1("related_content", (String) null, (Integer) null, (String) null, (String) null));
                                    x6h1VarC.j = true;
                                    y6h1 y6h1VarA = x6h1VarC.a();
                                    k7h1 k7h1Var = new k7h1();
                                    ((xjn) k7h1Var).a = y6h1VarA;
                                    ((xjn) k7h1Var).b = g5l0Var.b;
                                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                                    i8h1Var.f(k7h1Var.a(), (Set) null);
                                }
                                jl11 jl11Var = uk11Var2.d;
                                jl11Var.getClass();
                                boolean zIsEmpty = arrayList.isEmpty();
                                sb30 sb30Var = jl11Var.a;
                                if (zIsEmpty) {
                                    if (sb30Var != null) {
                                        sb30Var.a.setVisibility(8);
                                        return;
                                    } else {
                                        u890.C("binding");
                                        throw null;
                                    }
                                }
                                if (sb30Var == null) {
                                    u890.C("binding");
                                    throw null;
                                }
                                sb30Var.a.setVisibility(0);
                                jl11Var.b.C(arrayList);
                                sb30 sb30Var2 = jl11Var.a;
                                if (sb30Var2 != null) {
                                    sb30Var2.b.requestLayout();
                                    return;
                                } else {
                                    u890.C("binding");
                                    throw null;
                                }
                            case 1:
                                uk11Var2.getClass();
                                ((Throwable) obj3).getLocalizedMessage();
                                sb30 sb30Var3 = uk11Var2.d.a;
                                if (sb30Var3 != null) {
                                    sb30Var3.a.setVisibility(8);
                                    return;
                                } else {
                                    u890.C("binding");
                                    throw null;
                                }
                            case 2:
                                uk11Var2.f45p = ((Boolean) obj3).booleanValue();
                                return;
                            default:
                                uk11Var2.q = ((Boolean) obj3).booleanValue();
                                return;
                        }
                    }
                }), yoi1.i(uk11Var.k.a, o6xVar).distinctUntilChanged().observeOn(scheduler2).subscribe(new Consumer() { // from class: p.tk11
                    public final void accept(Object obj3) {
                        byte b6 = b2;
                        uk11 uk11Var2 = uk11Var;
                        switch (b6) {
                            case 0:
                                uk11Var2.getClass();
                                ArrayList arrayList = ((z1z) obj3).b;
                                if (!arrayList.isEmpty()) {
                                    ffe1 ffe1Var = uk11Var2.n;
                                    if (ffe1Var == null) {
                                        u890.C("logger");
                                        throw null;
                                    }
                                    i8h1 i8h1Var = (i8h1) ffe1Var.b;
                                    g5l0 g5l0Var = (g5l0) ffe1Var.c;
                                    x6h1 x6h1VarC = g5l0Var.c.c();
                                    x6h1VarC.i.add(new a7h1("related_content", (String) null, (Integer) null, (String) null, (String) null));
                                    x6h1VarC.j = true;
                                    y6h1 y6h1VarA = x6h1VarC.a();
                                    k7h1 k7h1Var = new k7h1();
                                    ((xjn) k7h1Var).a = y6h1VarA;
                                    ((xjn) k7h1Var).b = g5l0Var.b;
                                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                                    i8h1Var.f(k7h1Var.a(), (Set) null);
                                }
                                jl11 jl11Var = uk11Var2.d;
                                jl11Var.getClass();
                                boolean zIsEmpty = arrayList.isEmpty();
                                sb30 sb30Var = jl11Var.a;
                                if (zIsEmpty) {
                                    if (sb30Var != null) {
                                        sb30Var.a.setVisibility(8);
                                        return;
                                    } else {
                                        u890.C("binding");
                                        throw null;
                                    }
                                }
                                if (sb30Var == null) {
                                    u890.C("binding");
                                    throw null;
                                }
                                sb30Var.a.setVisibility(0);
                                jl11Var.b.C(arrayList);
                                sb30 sb30Var2 = jl11Var.a;
                                if (sb30Var2 != null) {
                                    sb30Var2.b.requestLayout();
                                    return;
                                } else {
                                    u890.C("binding");
                                    throw null;
                                }
                            case 1:
                                uk11Var2.getClass();
                                ((Throwable) obj3).getLocalizedMessage();
                                sb30 sb30Var3 = uk11Var2.d.a;
                                if (sb30Var3 != null) {
                                    sb30Var3.a.setVisibility(8);
                                    return;
                                } else {
                                    u890.C("binding");
                                    throw null;
                                }
                            case 2:
                                uk11Var2.f45p = ((Boolean) obj3).booleanValue();
                                return;
                            default:
                                uk11Var2.q = ((Boolean) obj3).booleanValue();
                                return;
                        }
                    }
                })});
                break;
            case 5:
                zce0.a((Context) obj2).b((pn20) obj, new IntentFilter("on-demand-restricted"));
                break;
            case 6:
                zce0.a((Context) obj2).b((pn20) obj, new IntentFilter("on-demand-restricted"));
                break;
            case 7:
                h5t0 h5t0Var = (h5t0) obj2;
                h5t0Var.g = true;
                iac0 iac0VarH = x9p1.h(view);
                if (iac0VarH != null && (lifecycle = iac0VarH.getLifecycle()) != null) {
                    lifecycle.a(h5t0Var);
                }
                view.getViewTreeObserver().addOnScrollChangedListener((g5t0) obj);
                break;
            case 8:
                rw41 rw41Var = (rw41) obj2;
                if (rw41Var.f && !rw41Var.g) {
                    iro1.j((tl7) obj, rw41Var.d);
                    rw41Var.g = true;
                    break;
                }
                break;
            case 9:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                svh0 svh0Var = (svh0) obj;
                if (!svh0Var.b && ((dt30) svh0Var.c) == null) {
                    g0i g0iVarH = v9p1.H(view);
                    if (g0iVarH == null || (dt30Var = (dt30) g0iVarH.g.getValue()) == null) {
                        dt30Var = null;
                    } else if (dt30Var.c()) {
                        svh0Var.b = true;
                    } else {
                        dt30Var.a();
                    }
                    svh0Var.c = dt30Var;
                    break;
                }
                break;
            case 10:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ((ConstraintLayout) obj).requestApplyInsets();
                break;
            case 11:
                ((lnc1) obj2).c((ImageView) obj);
                break;
            case 12:
                ((ViewGroup) obj2).addView((View) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
            case 13:
                ((EditText) obj2).removeOnAttachStateChangeListener(this);
                EditText editText = (EditText) obj;
                editText.requestFocus();
                if (!editText.hasWindowFocus()) {
                    editText.getViewTreeObserver().addOnWindowFocusChangeListener(new zqi1(editText, (byte) 0));
                } else if (editText.isFocused()) {
                    editText.post(new seg1(editText, (byte) 2));
                }
                break;
            case 14:
                ((lej1) obj2).invoke();
                break;
            case 15:
                ((ViewGroup) obj2).removeOnAttachStateChangeListener(this);
                ((ViewGroup) obj).requestApplyInsets();
                break;
            case 16:
                o6 o6Var = (o6) obj2;
                iac0 iac0VarH2 = x9p1.h(o6Var);
                if (iac0VarH2 == null) {
                    qf80.d("View tree for " + o6Var + " has no ViewTreeLifecycleOwner");
                    jah.d();
                } else {
                    ((p811) obj).a = w6p1.r(o6Var, iac0VarH2.getLifecycle());
                    o6Var.removeOnAttachStateChangeListener(this);
                }
                break;
            case 17:
                iac0 iac0VarH3 = x9p1.h(view);
                if (iac0VarH3 != null) {
                    p811 p811Var = (p811) obj2;
                    tus tusVar = (tus) obj;
                    if (!iac0VarH3.equals(p811Var.a)) {
                        iac0 iac0Var = (iac0) p811Var.a;
                        if (iac0Var != null && (lifecycle2 = iac0Var.getLifecycle()) != null) {
                            lifecycle2.d(tusVar);
                        }
                        p811Var.a = iac0VarH3;
                        iac0VarH3.getLifecycle().a(tusVar);
                    }
                }
                break;
            case 18:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = b8k1.a;
                ((View) obj).requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ((uus) obj).a.e();
                break;
            case 2:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                xab1 xab1Var = ((xgu) obj).b;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                break;
            case 3:
                klc0 klc0Var = (klc0) ((ilc0) ((t7y) obj2).c);
                klc0Var.m.g();
                klc0Var.o.clear();
                break;
            case 4:
                uk11 uk11Var = (uk11) ((sk11) ((w2z) obj2).c);
                uk11Var.m.g();
                uk11Var.o.clear();
                break;
            case 5:
                zce0.a((Context) obj2).d((pn20) obj);
                break;
            case 6:
                zce0.a((Context) obj2).d((pn20) obj);
                break;
            case 7:
                h5t0 h5t0Var = (h5t0) obj2;
                h5t0Var.g = false;
                Object objInvoke = h5t0Var.b.invoke(Boolean.FALSE);
                if (objInvoke != null) {
                    h5t0Var.c.invoke(objInvoke);
                }
                view.getViewTreeObserver().removeOnScrollChangedListener((g5t0) obj);
                break;
            case 8:
            case 9:
            case 10:
                break;
            case 11:
                ImageView imageView = (ImageView) obj;
                g7k1 g7k1Var = ((lnc1) obj2).i;
                if (g7k1Var != null && g7k1Var.e.get() == imageView) {
                    g7k1Var.b();
                }
                imageView.setImageDrawable(null);
                break;
            case 12:
                ((ViewGroup) obj2).addView((View) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
            case 13:
                break;
            case 14:
                ((lej1) obj).invoke();
                break;
            case 15:
            case 16:
            case 17:
            case 18:
                break;
            default:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ((p311) obj).B();
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }

    private final void h(View view) {
    }

    private final void i(View view) {
    }

    private final void j(View view) {
    }

    private final void k(View view) {
    }

    private final void l(View view) {
    }
}
