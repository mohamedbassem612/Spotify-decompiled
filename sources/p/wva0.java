package p;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wva0 implements h8l {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object h;
    public final Object i;
    public Dialog t;

    public wva0(LayoutInflater layoutInflater, Bundle bundle, jwa jwaVar, ic9 ic9Var, nwa nwaVar, yqg yqgVar, lzn0 lzn0Var, dg30 dg30Var) {
        this.b = ic9Var;
        this.c = nwaVar;
        View viewInflate = layoutInflater.inflate(2131624667, (ViewGroup) null, false);
        int i = 2131427670;
        EncoreButton encoreButtonT = m5n1.t(viewInflate, 2131427670);
        if (encoreButtonT != null) {
            i = 2131427723;
            EditText editText = (EditText) m5n1.t(viewInflate, 2131427723);
            if (editText != null) {
                i = 2131428203;
                ConstraintLayout constraintLayoutT = m5n1.t(viewInflate, 2131428203);
                if (constraintLayoutT != null) {
                    i = 2131428718;
                    EncoreTextView encoreTextViewT = m5n1.t(viewInflate, 2131428718);
                    if (encoreTextViewT != null) {
                        i = 2131430141;
                        EncoreButton encoreButtonT2 = m5n1.t(viewInflate, 2131430141);
                        if (encoreButtonT2 != null) {
                            i = 2131430270;
                            TextView textView = (TextView) m5n1.t(viewInflate, 2131430270);
                            if (textView != null) {
                                i = 2131430778;
                                ScrollView scrollView = (ScrollView) m5n1.t(viewInflate, 2131430778);
                                if (scrollView != null) {
                                    i = 2131431356;
                                    EncoreTextView encoreTextViewT2 = m5n1.t(viewInflate, 2131431356);
                                    if (encoreTextViewT2 != null) {
                                        i = 2131431397;
                                        View viewT = m5n1.t(viewInflate, 2131431397);
                                        if (viewT != null) {
                                            i = 2131431400;
                                            ConstraintLayout constraintLayoutT2 = m5n1.t(viewInflate, 2131431400);
                                            if (constraintLayoutT2 != null) {
                                                i = 2131431406;
                                                View viewT2 = m5n1.t(viewInflate, 2131431406);
                                                if (viewT2 != null) {
                                                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                    this.d = new p410(frameLayout, encoreButtonT, editText, constraintLayoutT, encoreTextViewT, encoreButtonT2, textView, scrollView, encoreTextViewT2, viewT, constraintLayoutT2, viewT2);
                                                    Calendar calendarD = yqgVar.d();
                                                    this.e = calendarD;
                                                    vva0 vva0Var = vva0.b;
                                                    this.f = r4u.c(new r4u[]{r4u.d(new a0b((byte) 14), r4u.a(new eb80(this, (byte) 4)))});
                                                    String string = jwaVar.a;
                                                    String str = "";
                                                    if (string == null) {
                                                        string = bundle != null ? bundle.getString("birthday") : null;
                                                        if (string == null) {
                                                            string = "";
                                                        }
                                                    }
                                                    this.g = string;
                                                    String string2 = jwaVar.b;
                                                    if (string2 == null) {
                                                        string2 = bundle != null ? bundle.getString("minBirthday") : null;
                                                        if (string2 == null) {
                                                            string2 = "";
                                                        }
                                                    }
                                                    this.h = string2;
                                                    String str2 = jwaVar.c;
                                                    if (str2 == null) {
                                                        String string3 = bundle != null ? bundle.getString("maxBirthday") : null;
                                                        if (string3 != null) {
                                                            str = string3;
                                                        }
                                                    } else {
                                                        str = str2;
                                                    }
                                                    this.i = str;
                                                    b8k1.q(encoreTextViewT2, true);
                                                    DatePickerDialog datePickerDialog = new DatePickerDialog(frameLayout.getContext(), 2132017504, new l6r(this, (byte) 1), calendarD.get(1), calendarD.get(2), calendarD.get(5));
                                                    this.t = datePickerDialog;
                                                    datePickerDialog.updateDate(2000, 0, 1);
                                                    datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
                                                    textView.setText(frameLayout.getResources().getString(2131957047, Integer.valueOf(jwaVar.d + 1), Integer.valueOf(jwaVar.e)));
                                                    rwq0.s(constraintLayoutT, new j8a(constraintLayoutT, (byte) 2));
                                                    rwq0.s(constraintLayoutT2, rre1.U0);
                                                    mmg1.a(scrollView, dg30Var, viewT);
                                                    encoreButtonT.setOnClickListener(new uva0(lzn0Var, (byte) 0));
                                                    editText.setOnClickListener(new zfs(this, (byte) 23));
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final Connection L(Consumer consumer) {
        switch (this.a) {
            case 0:
                p410 p410Var = (p410) this.d;
                EditText editText = (EditText) p410Var.c;
                lgh lghVar = new lgh(consumer, this, (byte) 3);
                editText.addTextChangedListener(lghVar);
                ((EncoreButton) p410Var.e).setOnClickListener(new f1b(consumer, (byte) 10));
                return new cn(this, lghVar, (byte) 28);
            default:
                return new pee0(this, consumer, (byte) 5);
        }
    }

    public void b() {
        p410 p410Var = (p410) this.d;
        ((EncoreTextView) p410Var.d).setVisibility(8);
        EditText editText = (EditText) p410Var.c;
        editText.setTextColor(-1);
        Resources resources = ((FrameLayout) p410Var.b).getResources();
        ThreadLocal threadLocal = qx21.a;
        editText.setBackground(resources.getDrawable(2131231313, null));
    }

    public void c(boolean z) {
        ((ProgressBar) ((mzr0) this.c).g).setVisibility(z ? 0 : 8);
    }

    public final Object getView() {
        switch (this.a) {
            case 0:
                return (FrameLayout) ((p410) this.d).b;
            default:
                return (CoordinatorLayout) ((mzr0) this.c).a;
        }
    }

    public final Bundle serialize() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putString("birthday", (String) this.g);
                bundle.putString("maxBirthday", (String) this.i);
                bundle.putString("minBirthday", (String) this.h);
                return bundle;
            default:
                return mno1.g();
        }
    }

    public final void start() throws ParseException {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                Calendar calendar = (Calendar) this.e;
                p410 p410Var = (p410) obj2;
                ((EncoreTextView) p410Var.f).sendAccessibilityEvent(8);
                ((EditText) p410Var.c).setText((String) this.g);
                if (((String) this.g).length() != 0) {
                    Date date = ((nwa) obj).a.parse((String) this.g);
                    if (date != null) {
                        calendar.setTime(date);
                        ((DatePickerDialog) this.t).updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
                    }
                    break;
                }
                break;
            default:
                mzr0 mzr0Var = (mzr0) obj2;
                Disposable disposable = (Disposable) mzr0Var.e;
                if (disposable != null && !disposable.isDisposed()) {
                    disposable.dispose();
                }
                mzr0Var.e = ((PublishSubject) mzr0Var.c).debounce(100L, TimeUnit.MILLISECONDS, (Scheduler) mzr0Var.a).observeOn((Scheduler) mzr0Var.b).subscribe(new tr41(mzr0Var, (byte) 0));
                NestedScrollView nestedScrollView = (NestedScrollView) ((mzr0) obj).f;
                nestedScrollView.setOnScrollChangeListener(new xmu0(this, nestedScrollView, (byte) 8));
                break;
        }
    }

    public final void stop() {
        switch (this.a) {
            case 0:
                break;
            default:
                Disposable disposable = (Disposable) ((mzr0) this.d).e;
                if (disposable != null && !disposable.isDisposed()) {
                    disposable.dispose();
                    break;
                }
                break;
        }
    }

    private final void d() {
    }

    public wva0(Context context, mzr0 mzr0Var, ekb ekbVar, mzr0 mzr0Var2, uvv0 uvv0Var, PublishSubject publishSubject, lyp lypVar, myp mypVar, nyp nypVar, rrv0 rrv0Var) {
        this.b = context;
        this.c = mzr0Var;
        this.d = mzr0Var2;
        this.e = uvv0Var;
        this.f = publishSubject;
        this.g = lypVar;
        this.h = mypVar;
        this.i = rrv0Var;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) mzr0Var.d;
        Resources resources = context.getResources();
        ThreadLocal threadLocal = qx21.a;
        coordinatorLayout.setBackgroundColor(resources.getColor(2131103941, null));
        ((AppBarLayout) mzr0Var.c).a(new rzg(this, (byte) 12));
        tka0 tka0Var = dtw.C;
        NestedScrollView nestedScrollView = (NestedScrollView) mzr0Var.f;
        Context context2 = nestedScrollView.getContext();
        yxk0 yxk0Var = new yxk0((byte) 1);
        e93 e93Var = (e93) nypVar.a.c;
        nestedScrollView.addView(mhc.b(context2, nestedScrollView, new avv0(uvv0Var, yxk0Var, (oyp) ((jly0) e93Var.Y).get(), (pyp) ((jly0) e93Var.Z).get(), (qyp) ((jly0) e93Var.N0).get(), (ryp) ((jly0) e93Var.O0).get(), (syp) ((jly0) e93Var.P0).get(), (gyp) ((jly0) e93Var.Q0).get(), (hyp) ((jly0) e93Var.R0).get(), (iyp) ((jly0) e93Var.S0).get(), (jyp) ((jly0) e93Var.T0).get()), new wuv0(z6x.a), (ipb1) null, 112).w);
        nestedScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new x22(this, (byte) 7));
    }
}
