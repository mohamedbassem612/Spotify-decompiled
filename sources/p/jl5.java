package p;

import android.content.Context;
import android.content.ContextWrapper;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.internal.operators.single.SingleDelayWithCompletable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jl5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;

    public jl5(String str, nl9 nl9Var, hsm1 hsm1Var, vum1 vum1Var) {
        this.a = (byte) 3;
        this.c = vum1Var;
        this.d = nl9Var;
        this.e = hsm1Var;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        Object obj;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                View view2 = (View) obj3;
                Method method2 = (Method) this.d;
                if (method2 == null) {
                    Context context = view2.getContext();
                    String str2 = (String) obj2;
                    while (true) {
                        if (context == null) {
                            int id = view2.getId();
                            if (id == -1) {
                                str = "";
                            } else {
                                str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                            }
                            swg0.h(l1d.t("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view "), view2.getClass(), str);
                            return;
                        }
                        try {
                            if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                                this.d = method;
                                this.e = context;
                                method2 = method;
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                        context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                    }
                }
                try {
                    method2.invoke((Context) this.e, view);
                    return;
                } catch (IllegalAccessException e) {
                    k220.p("Could not execute non-public method for android:onClick", e);
                    return;
                } catch (InvocationTargetException e2) {
                    k220.p("Could not execute method for android:onClick", e2);
                    return;
                }
            case 1:
                r0b r0bVar = (r0b) obj3;
                it8 it8Var = r0bVar.d;
                i8h1 i8h1Var = (i8h1) it8Var.b;
                x6h1 x6h1VarC = ((xok0) it8Var.c).b.c();
                x6h1VarC.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                String str3 = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", (String) obj2)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                String string = ((EditText) ((l7m0) this.d).b).getText().toString();
                rku rkuVar = r0bVar.e;
                i0b i0bVar = r0bVar.a;
                String str4 = (String) this.e;
                SingleDelayWithCompletable singleDelayWithCompletableE = i0bVar.a(str4, new q0b(string)).e(rqt0.F(o6x.a, new w7a(r0bVar, str4, (lnm) null, (byte) 11)));
                Scheduler scheduler = AndroidSchedulers.a;
                RxAndroidPlugins.b(scheduler);
                rkuVar.b(singleDelayWithCompletableE.observeOn(scheduler).subscribe(new mba(r0bVar, (byte) 4), nm.d1));
                return;
            case 2:
                fn31.T((llm) obj3, (o8n) null, 0, new tc1((q881) obj2, (hec) this.d, (iu30) this.e, (lnm) null), 3);
                return;
            case 3:
                nl9 nl9Var = (nl9) this.d;
                if (u890.j((vum1) obj3, tum1.a)) {
                    view.getClass();
                    iac0 iac0VarH = x9p1.h(view);
                    if (iac0VarH != null) {
                        fn31.T(cto1.q(iac0VarH), (o8n) null, 0, new clo(nl9Var, (String) obj2, (lnm) null, (byte) 25), 3);
                    }
                }
                ((t0t) nl9Var.t).b((hsm1) this.e, false);
                return;
            case 4:
                wqk0 wqk0Var = (wqk0) obj3;
                x6h1 x6h1VarC2 = wqk0Var.c.c();
                x6h1VarC2.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                qss qssVar = (qss) obj2;
                int i = qssVar.a;
                int i2 = qssVar.b;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                String str5 = "speed_control_off";
                if (i == 1) {
                    obj = "speed_control_off";
                } else {
                    if (i != 2) {
                        throw null;
                    }
                    obj = "speed_control_on";
                }
                mmr0 mmr0Var = new mmr0("state_before_toggle", obj);
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw null;
                    }
                    str5 = "speed_control_on";
                }
                w7h1 w7h1Var = new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str5)})), y6h1VarA, wqk0Var.b, System.currentTimeMillis());
                rss rssVar = (rss) this.d;
                ((i8h1) rssVar.b.get()).m(w7h1Var, (xj61) null);
                ((Function0) this.e).invoke();
                rssVar.a.b();
                return;
            case 5:
                o0i o0iVar = (o0i) obj2;
                oq00 oq00Var = (oq00) obj3;
                ven0 ven0Var = (ven0) this.e;
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.FALSE);
                    bcl1.f(oq00Var.a, o0iVar.e, "expandable_description", (String) null, (String) null, fa00.g, 12);
                    return;
                }
                qq00 qq00Var = (qq00) this.d;
                int measuredWidth = (qq00Var.getMeasuredWidth() - qq00Var.getPaddingLeft()) - qq00Var.getPaddingRight();
                Spanned spanned = qq00Var.t;
                if (spanned == null) {
                    u890.C("spannedText");
                    throw null;
                }
                if (new StaticLayout(spanned, qq00Var.getPaint(), measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getLineCount() > qq00Var.getMaxLines()) {
                    ven0Var.setValue(Boolean.TRUE);
                    bcl1.f(oq00Var.a, o0iVar.e, "expandable_description", (String) null, (String) null, fa00.h, 12);
                    return;
                }
                return;
            case 6:
                EncoreProgressIndicatorButton encoreProgressIndicatorButton = (EncoreProgressIndicatorButton) ((bih1) obj2).c;
                encoreProgressIndicatorButton.setEnabled(false);
                encoreProgressIndicatorButton.setShowProgressIndicator(true);
                p410 p410Var = (p410) this.d;
                p811 p811Var = (p811) this.e;
                hla hlaVar = new hla(p811Var, (byte) 2);
                hla hlaVar2 = new hla(p811Var, (byte) 3);
                u090 u090Var = new u090((wp20) obj3, (byte) 1);
                ((CompositeDisposable) p410Var.h).b(((g0l) p410Var.d).d().firstOrError().flatMap(new bm00(p410Var, (byte) 20)).observeOn((Scheduler) p410Var.e).subscribe(new w090(hlaVar, u090Var, (byte) 0), new w090(hlaVar2, u090Var, (byte) 1)));
                return;
            case 7:
                iu30 iu30Var = (iu30) this.d;
                if (!((rpo0) obj3).a) {
                    Context context2 = ((ConstraintLayout) ((bnj0) obj2).b).getContext();
                    mw40 mw40VarT = yoi1.T(context2, context2.getString(2131954132), context2.getString(2131954131));
                    String string2 = context2.getString(2131954138);
                    j7b j7bVar = new j7b(iu30Var, (res) this.e, context2, (byte) 4);
                    mw40VarT.a = string2;
                    mw40VarT.c = j7bVar;
                    String string3 = context2.getString(2131954133);
                    d630 d630Var = new d630(iu30Var, (byte) 1);
                    mw40VarT.b = string3;
                    mw40VarT.d = d630Var;
                    mw40VarT.b().b();
                }
                iu30Var.invoke(kpo0.a);
                return;
            default:
                mzr0 mzr0Var = (mzr0) obj3;
                xab1 xab1Var = (xab1) mzr0Var.g;
                if (xab1Var == null || !xab1Var.isActive()) {
                    mzr0Var.g = fn31.T((u9c0) mzr0Var.b, (o8n) null, 0, new p651(mzr0Var, (String) obj2, (vu30) this.d, (r6h1) this.e, (lnm) null, (byte) 3), 3);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ jl5(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public jl5(View view, String str) {
        this.a = (byte) 0;
        this.c = view;
        this.b = str;
    }
}
