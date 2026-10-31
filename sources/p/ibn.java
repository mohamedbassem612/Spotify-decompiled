package p;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ibn implements Connection {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public ibn(res resVar, Consumer consumer) {
        this.a = (byte) 4;
        this.c = resVar;
        this.d = consumer;
        this.b = new LinkedHashSet();
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0677  */
    public final void accept(Object obj) {
        boolean z;
        tv80 tv80VarM;
        switch (this.a) {
            case 0:
                ebn ebnVar = (ebn) obj;
                jbn jbnVar = (jbn) this.b;
                phi0 phi0Var = jbnVar.a;
                Toolbar toolbar = (Toolbar) phi0Var.f;
                van vanVar = ebnVar.a;
                toolbar.setTitle(vanVar.a);
                ((SearchView) phi0Var.e).setQueryHint(vanVar.b);
                qxx0 qxx0Var = jbnVar.i;
                if (qxx0Var != null) {
                    qxx0Var.C(ebnVar.c);
                    return;
                } else {
                    u890.C("countryAdapter");
                    throw null;
                }
            case 1:
                Object obj2 = this.b;
                l811 l811Var = (l811) this.d;
                synchronized (obj2) {
                    z = l811Var.a;
                }
                if (z) {
                    return;
                }
                ((Connection) this.c).accept(obj);
                return;
            case 2:
                nxw nxwVar = (nxw) obj;
                boolean z2 = nxwVar.c;
                fyw fywVar = nxwVar.a;
                azw azwVar = (azw) this.b;
                Button button = azwVar.g;
                TextView textView = azwVar.f;
                yyw yywVar = new yyw(azwVar, nxwVar, (byte) 0);
                Consumer consumer = (Consumer) this.c;
                fywVar.getClass();
                if (fywVar instanceof byw) {
                    azwVar.d(false);
                    azwVar.e(true);
                    if (z2) {
                        textView.setText(2131962500);
                    } else {
                        textView.setText(2131962503);
                    }
                    button.setEnabled(false);
                } else if (fywVar instanceof cyw) {
                    yywVar.accept(fywVar);
                } else if (fywVar instanceof dyw) {
                    textView.setText(2131962503);
                    button.setEnabled(!z2);
                    if (nxwVar.d) {
                        consumer.accept(new exw(nxwVar.b()));
                    }
                    if (z2) {
                        azwVar.i.dispose();
                        azwVar.i = Completable.u(750L, TimeUnit.MILLISECONDS, azwVar.t).subscribe(new bm0(consumer, nxwVar, (byte) 22));
                    }
                } else if (!(fywVar instanceof gyw)) {
                    if (fywVar instanceof eyw) {
                        azwVar.d(false);
                        azwVar.e(true);
                        button.setEnabled(true);
                        textView.setText(2131962503);
                    } else {
                        if (!(fywVar instanceof fyw)) {
                            eg.o();
                            return;
                        }
                        azwVar.d(false);
                        button.setEnabled(false);
                        azwVar.e(false);
                        String str = fywVar.b;
                        if (str == null || str.length() == 0) {
                            textView.setText(2131962509);
                        } else {
                            textView.setText(str);
                        }
                        textView.sendAccessibilityEvent(32768);
                    }
                }
                if (!nxwVar.b) {
                    textView.setText(2131962506);
                    button.setEnabled(false);
                }
                azwVar.d(fywVar instanceof gyw);
                return;
            case 3:
                return;
            case 4:
                x6j0 x6j0Var = (x6j0) obj;
                Consumer consumer2 = (Consumer) this.d;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
                res resVar = (res) this.c;
                if (x6j0Var instanceof v6j0) {
                    linkedHashSet.add(fn31.T(smo1.e((q8n) resVar.h), (o8n) null, 0, new l7j0(resVar, x6j0Var, consumer2, (lnm) null), 3));
                    return;
                } else if (x6j0Var instanceof w6j0) {
                    linkedHashSet.add(fn31.T(smo1.e((q8n) resVar.g), (o8n) null, 0, new v4e0(resVar, x6j0Var, consumer2, (lnm) null, (byte) 25), 3));
                    return;
                } else {
                    eg.o();
                    return;
                }
            case 5:
                return;
            case 6:
                v6s0 v6s0Var = (v6s0) obj;
                y6s0 y6s0Var = (y6s0) this.b;
                TextView textView2 = y6s0Var.f;
                Button button2 = y6s0Var.g;
                m6s0 m6s0Var = v6s0Var.a;
                boolean z3 = v6s0Var.b;
                if (u890.j(m6s0Var, l6s0.b)) {
                    if (z3) {
                        textView2.setText(2131962523);
                        y6s0Var.d(false, true);
                    }
                    button2.setEnabled(false);
                } else if (m6s0Var instanceof k6s0) {
                    textView2.setText(2131962506);
                    button2.setEnabled(true);
                    y6s0Var.d(true, true);
                } else if (m6s0Var instanceof n6s0) {
                    textView2.setText(2131962519);
                    button2.setEnabled(false);
                    y6s0Var.d(false, true);
                } else if (m6s0Var instanceof m6s0) {
                    textView2.setText(m6s0Var.c);
                    button2.setEnabled(false);
                    y6s0Var.d(false, true);
                } else if (!(m6s0Var instanceof o6s0)) {
                    if (m6s0Var instanceof p6s0) {
                        textView2.setText((CharSequence) null);
                        button2.setEnabled(true);
                        y6s0Var.d(true, false);
                    } else if (m6s0Var instanceof q6s0) {
                        button2.setEnabled(false);
                    } else if (m6s0Var instanceof r6s0) {
                        textView2.setText((CharSequence) null);
                        button2.setEnabled(true);
                        y6s0Var.d(true, false);
                    } else if (m6s0Var instanceof s6s0) {
                        if (z3) {
                            textView2.setText(2131962523);
                            y6s0Var.d(false, true);
                        }
                        button2.setEnabled(false);
                    } else if (!(m6s0Var instanceof t6s0)) {
                        eg.o();
                        return;
                    } else {
                        textView2.setText(2131962524);
                        button2.setEnabled(false);
                        y6s0Var.d(false, true);
                    }
                }
                if ((m6s0Var instanceof p6s0) && v6s0Var.c) {
                    ((Consumer) this.c).accept(h6s0.a);
                    return;
                }
                return;
            case 7:
                ((PublishSubject) this.b).onNext((z6x0) obj);
                e7x0 e7x0Var = (e7x0) this.c;
                idd1 idd1Var = e7x0Var.h;
                RecyclerView recyclerView = (RecyclerView) e7x0Var.i.c;
                if (recyclerView.getAdapter() == null) {
                    recyclerView.setAdapter((m5k) idd1Var.getValue());
                    ((m5k) idd1Var.getValue()).w(new pn(e7x0Var, (byte) 2));
                    return;
                }
                return;
            case 8:
                m8z0 m8z0Var = (z8z0) obj;
                eaz0 eaz0Var = (eaz0) this.b;
                b7x b7xVar = b7x.a;
                rzo0 rzo0Var = (rzo0) eaz0Var.b;
                xrl0 xrl0Var = (xrl0) rzo0Var.c;
                if (m8z0Var instanceof m8z0) {
                    m8z0 m8z0Var2 = m8z0Var;
                    int i = m8z0Var2.b;
                    String strUri = m8z0Var2.a.uri();
                    i8h1 i8h1VarA = rzo0Var.A();
                    x6h1 x6h1VarC = xrl0Var.a.c();
                    x6h1VarC.i.add(new a7h1("track_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    Integer numValueOf = Integer.valueOf(i);
                    x6h1 x6h1VarC2 = y6h1VarA.c();
                    x6h1VarC2.i.add(new a7h1("queued_track", (String) null, numValueOf, strUri, (String) null));
                    x6h1VarC2.j = true;
                    i8h1VarA.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", strUri)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (m8z0Var instanceof n8z0) {
                    n8z0 n8z0Var = (n8z0) m8z0Var;
                    int i2 = n8z0Var.b;
                    String strUri2 = n8z0Var.a.uri();
                    int i3 = n8z0Var.c;
                    i8h1 i8h1VarA2 = rzo0Var.A();
                    x6h1 x6h1VarC3 = xrl0Var.a.c();
                    x6h1VarC3.i.add(new a7h1("track_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC3.a();
                    Integer numValueOf2 = Integer.valueOf(i2);
                    x6h1 x6h1VarC4 = y6h1VarA2.c();
                    x6h1VarC4.i.add(new a7h1("queued_track", (String) null, numValueOf2, strUri2, (String) null));
                    x6h1VarC4.j = true;
                    y6h1 y6h1VarA3 = x6h1VarC4.a();
                    z7h1 z7h1Var = new z7h1("drag", 1, b7xVar);
                    String strValueOf = String.valueOf(i3);
                    i8h1VarA2.m(new w7h1("", "", z7h1Var, new x7h1("move_entity_in_list", 1, Collections.singletonMap("destination_position", strValueOf != null ? strValueOf : "")), y6h1VarA3, r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (m8z0Var instanceof c8z0) {
                    c8z0 c8z0Var = (c8z0) m8z0Var;
                    int i4 = c8z0Var.a;
                    String strUri3 = c8z0Var.b.uri();
                    i8h1 i8h1VarA3 = rzo0Var.A();
                    x6h1 x6h1VarC5 = xrl0Var.a.c();
                    x6h1VarC5.i.add(new a7h1("track_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    y6h1 y6h1VarA4 = x6h1VarC5.a();
                    Integer numValueOf3 = Integer.valueOf(i4);
                    x6h1 x6h1VarC6 = y6h1VarA4.c();
                    x6h1VarC6.i.add(new a7h1("queued_track", (String) null, numValueOf3, strUri3, (String) null));
                    x6h1VarC6.j = true;
                    i8h1VarA3.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("add_item_to_queue", 1, Collections.singletonMap("item_to_add_to_queue", strUri3)), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (m8z0Var instanceof s7z0) {
                    s7z0 s7z0Var = (s7z0) m8z0Var;
                    int i5 = s7z0Var.a;
                    String strUri4 = s7z0Var.b.uri();
                    i8h1 i8h1VarA4 = rzo0Var.A();
                    x6h1 x6h1VarC7 = xrl0Var.a.c();
                    x6h1VarC7.i.add(new a7h1("track_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    y6h1 y6h1VarA5 = x6h1VarC7.a();
                    Integer numValueOf4 = Integer.valueOf(i5);
                    x6h1 x6h1VarC8 = y6h1VarA5.c();
                    x6h1VarC8.i.add(new a7h1("queued_track", (String) null, numValueOf4, strUri4, (String) null));
                    x6h1VarC8.j = true;
                    i8h1VarA4.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("add_item_to_top_of_queue", 1, Collections.singletonMap("item_to_add_to_queue", strUri4)), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (m8z0Var instanceof t7z0) {
                    t7z0 t7z0Var = (t7z0) m8z0Var;
                    int i6 = t7z0Var.a;
                    String strUri5 = t7z0Var.b.uri();
                    i8h1 i8h1VarA5 = rzo0Var.A();
                    x6h1 x6h1VarC9 = xrl0Var.a.c();
                    x6h1VarC9.i.add(new a7h1("track_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    y6h1 y6h1VarA6 = x6h1VarC9.a();
                    Integer numValueOf5 = Integer.valueOf(i6);
                    x6h1 x6h1VarC10 = y6h1VarA6.c();
                    x6h1VarC10.i.add(new a7h1("queued_track", (String) null, numValueOf5, strUri5, (String) null));
                    x6h1VarC10.j = true;
                    i8h1VarA5.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (m8z0Var instanceof d7z0) {
                    int i7 = ((d7z0) m8z0Var).a;
                    i8h1 i8h1VarA6 = rzo0Var.A();
                    x6h1 x6h1VarC11 = xrl0Var.a.c();
                    x6h1VarC11.i.add(new a7h1("edit_mode_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                    x6h1VarC12.i.add(new a7h1("move_up_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    y6h1 y6h1VarA7 = x6h1VarC12.a();
                    z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                    String strValueOf2 = String.valueOf(i7);
                    i8h1VarA6.m(new w7h1("", "", z7h1Var2, new x7h1("add_items_to_queue", 2, Collections.singletonMap("number_of_items_to_add_to_queue", strValueOf2 != null ? strValueOf2 : "")), y6h1VarA7, r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (m8z0Var instanceof g8z0) {
                    g8z0 g8z0Var = (g8z0) m8z0Var;
                    int i8 = g8z0Var.a;
                    String strUri6 = g8z0Var.b.uri();
                    i8h1 i8h1VarA7 = rzo0Var.A();
                    x6h1 x6h1VarC13 = xrl0Var.a.c();
                    x6h1VarC13.i.add(new a7h1("track_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    y6h1 y6h1VarA8 = x6h1VarC13.a();
                    Integer numValueOf6 = Integer.valueOf(i8);
                    x6h1 x6h1VarC14 = y6h1VarA8.c();
                    x6h1VarC14.i.add(new a7h1("queued_track", (String) null, numValueOf6, strUri6, (String) null));
                    x6h1VarC14.j = true;
                    i8h1VarA7.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("remove_item_from_queue", 1, Collections.singletonMap("item_to_remove_from_queue", strUri6)), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (m8z0Var instanceof f8z0) {
                    int i9 = ((f8z0) m8z0Var).a;
                    i8h1 i8h1VarA8 = rzo0Var.A();
                    x6h1 x6h1VarC15 = xrl0Var.a.c();
                    x6h1VarC15.i.add(new a7h1("edit_mode_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    x6h1 x6h1VarC16 = x6h1VarC15.a().c();
                    x6h1VarC16.i.add(new a7h1("remove_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    y6h1 y6h1VarA9 = x6h1VarC16.a();
                    z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                    String strValueOf3 = String.valueOf(i9);
                    i8h1VarA8.m(new w7h1("", "", z7h1Var3, new x7h1("remove_items_from_queue", 2, Collections.singletonMap("number_of_items_to_remove_from_queue", strValueOf3 != null ? strValueOf3 : "")), y6h1VarA9, r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (m8z0Var instanceof f7z0) {
                    int i10 = ((f7z0) m8z0Var).a;
                    i8h1 i8h1VarA9 = rzo0Var.A();
                    x6h1 x6h1VarC17 = xrl0Var.a.c();
                    x6h1VarC17.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    x6h1 x6h1VarC18 = x6h1VarC17.a().c();
                    x6h1VarC18.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    y6h1 y6h1VarA10 = x6h1VarC18.a();
                    z7h1 z7h1Var4 = new z7h1("hit", 1, b7xVar);
                    String strValueOf4 = String.valueOf(i10);
                    i8h1VarA9.m(new w7h1("", "", z7h1Var4, new x7h1("remove_items_from_queue", 2, Collections.singletonMap("number_of_items_to_remove_from_queue", strValueOf4 != null ? strValueOf4 : "")), y6h1VarA10, r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    if (m8z0Var instanceof i8z0) {
                        int iC = l1d.C(((i8z0) m8z0Var).a);
                        if (iC == 0) {
                            i8h1 i8h1VarA10 = rzo0Var.A();
                            x6h1 x6h1VarC19 = xrl0Var.a.c();
                            x6h1VarC19.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC19.j = false;
                            x6h1 x6h1VarC20 = x6h1VarC19.a().c();
                            x6h1VarC20.i.add(new a7h1("close_edit_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC20.j = false;
                            i8h1VarA10.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC20.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        } else {
                            if (iC != 1) {
                                eg.o();
                                return;
                            }
                            i8h1 i8h1VarA11 = rzo0Var.A();
                            x6h1 x6h1VarC21 = xrl0Var.a.c();
                            x6h1VarC21.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC21.j = false;
                            x6h1 x6h1VarC22 = x6h1VarC21.a().c();
                            x6h1VarC22.i.add(new a7h1("edit_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC22.j = false;
                            tv80VarM = i8h1VarA11.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC22.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        }
                        if (tv80VarM != null) {
                            ((vu30) this.d).invoke(m8z0Var, tv80VarM);
                        }
                        ((Consumer) this.c).accept(m8z0Var);
                        return;
                    }
                    if (m8z0Var instanceof j7z0) {
                        i8h1 i8h1VarA12 = rzo0Var.A();
                        x6h1 x6h1VarC23 = xrl0Var.a.c();
                        x6h1VarC23.i.add(new a7h1("edit_mode_bar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC23.j = false;
                        x6h1 x6h1VarC24 = x6h1VarC23.a().c();
                        x6h1VarC24.i.add(new a7h1("clear_selection_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC24.j = false;
                        i8h1VarA12.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), x6h1VarC24.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    } else if (m8z0Var instanceof t8z0) {
                        i8h1 i8h1VarA13 = rzo0Var.A();
                        x6h1 x6h1VarC25 = xrl0Var.a.c();
                        x6h1VarC25.i.add(new a7h1("snackbar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC25.j = false;
                        x6h1 x6h1VarC26 = x6h1VarC25.a().c();
                        x6h1VarC26.i.add(new a7h1("undo_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC26.j = false;
                        i8h1VarA13.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC26.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                }
                tv80VarM = null;
                if (tv80VarM != null) {
                    ((vu30) this.d).invoke(m8z0Var, tv80VarM);
                }
                ((Consumer) this.c).accept(m8z0Var);
                return;
            default:
                ow71 ow71Var = (uw71) obj;
                if (ow71Var instanceof ow71) {
                    iw71 iw71Var = (iw71) ((qn) this.b).c;
                    fn31.T(iw71Var.g, iw71Var.i, 0, new lm61(iw71Var, ow71Var, (lnm) null, (byte) 19), 2);
                    return;
                } else if (ow71Var instanceof qw71) {
                    ((Connection) this.c).accept(ow71Var);
                    return;
                } else {
                    ((Connection) this.d).accept(ow71Var);
                    return;
                }
        }
    }

    public final void dispose() {
        boolean zIsTerminated;
        n7h1 n7h1Var;
        switch (this.a) {
            case 0:
                ((jbn) this.b).t = null;
                ((Disposable) this.c).dispose();
                ExecutorService executorService = (dik1) this.d;
                if (executorService instanceof AutoCloseable) {
                    executorService.close();
                    return;
                }
                if (!(executorService instanceof ExecutorService)) {
                    bhn0.q();
                    return;
                }
                ExecutorService executorService2 = executorService;
                if (executorService2 == ForkJoinPool.commonPool() || (zIsTerminated = executorService2.isTerminated())) {
                    return;
                }
                executorService2.shutdown();
                boolean z = false;
                while (!zIsTerminated) {
                    try {
                        zIsTerminated = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService2.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
            case 1:
                Object obj = this.b;
                l811 l811Var = (l811) this.d;
                synchronized (obj) {
                    l811Var.a = true;
                }
                ((Connection) this.c).dispose();
                return;
            case 2:
                azw azwVar = (azw) this.b;
                EditText editText = azwVar.e;
                editText.removeTextChangedListener((zyw) this.d);
                editText.setOnEditorActionListener(null);
                editText.setOnClickListener(null);
                editText.setOnFocusChangeListener(null);
                azwVar.i.dispose();
                return;
            case 3:
                smo1.p((llm) this.b, (CancellationException) null);
                ((fai0) ((x2y) this.c).c).k((jun) this.d);
                return;
            case 4:
                Iterator it = ((LinkedHashSet) this.b).iterator();
                while (it.hasNext()) {
                    ((faa0) it.next()).d((CancellationException) null);
                }
                return;
            case 5:
                x8c0 x8c0Var = ((j7m0) this.b).c;
                Object obj2 = ((p811) this.c).a;
                if (obj2 == null) {
                    u890.C("lifecycleObserver");
                    throw null;
                }
                x8c0Var.d((hac0) obj2);
                ((CompositeDisposable) this.d).dispose();
                return;
            case 6:
                EditText editText2 = ((y6s0) this.b).e;
                editText2.setOnEditorActionListener(null);
                editText2.removeTextChangedListener((mca) this.d);
                editText2.setOnFocusChangeListener(null);
                return;
            case 7:
                oxi0 oxi0Var = ((e7x0) this.c).c;
                vik1 vik1Var = oxi0Var.e;
                if (vik1Var != null) {
                    vik1Var.b();
                }
                oxi0Var.e = null;
                oxi0Var.f = null;
                t480 t480Var = oxi0Var.g;
                if (t480Var != null && (n7h1Var = oxi0Var.b) != null) {
                    n7h1Var.e(t480Var);
                }
                oxi0Var.g = null;
                ((CompositeDisposable) this.d).g();
                return;
            case 8:
                return;
            default:
                ((Connection) this.d).dispose();
                ((Connection) this.c).dispose();
                return;
        }
    }

    public /* synthetic */ ibn(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
    }
}
