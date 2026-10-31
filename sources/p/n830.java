package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.method.LinkMovementMethod;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n830 implements f4h1 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;

    public n830(LayoutInflater layoutInflater, Bundle bundle, swa0 swa0Var, yjn0 yjn0Var, xjn0 xjn0Var, zlc0 zlc0Var, pe peVar, lzn0 lzn0Var, rjn0 rjn0Var, dg30 dg30Var) {
        String string;
        String str = yjn0Var.a;
        this.c = swa0Var;
        this.d = yjn0Var;
        this.e = xjn0Var;
        this.f = peVar;
        View viewInflate = layoutInflater.inflate(2131624669, (ViewGroup) null, false);
        int i = 2131427670;
        EncoreButton encoreButtonT = m5n1.t(viewInflate, 2131427670);
        if (encoreButtonT != null) {
            i = 2131430098;
            EditText editText = (EditText) m5n1.t(viewInflate, 2131430098);
            if (editText != null) {
                i = 2131430102;
                if (m5n1.t(viewInflate, 2131430102) != null) {
                    i = 2131430103;
                    ConstraintLayout constraintLayoutT = m5n1.t(viewInflate, 2131430103);
                    if (constraintLayoutT != null) {
                        i = 2131430105;
                        TextView textView = (TextView) m5n1.t(viewInflate, 2131430105);
                        if (textView != null) {
                            i = 2131430141;
                            EncoreButton encoreButtonT2 = m5n1.t(viewInflate, 2131430141);
                            if (encoreButtonT2 != null) {
                                i = 2131430270;
                                TextView textView2 = (TextView) m5n1.t(viewInflate, 2131430270);
                                if (textView2 != null) {
                                    i = 2131430778;
                                    ScrollView scrollView = (ScrollView) m5n1.t(viewInflate, 2131430778);
                                    if (scrollView != null) {
                                        i = 2131431180;
                                        EncoreTextView encoreTextViewT = m5n1.t(viewInflate, 2131431180);
                                        if (encoreTextViewT != null) {
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
                                                            this.g = new kp5(frameLayout, encoreButtonT, editText, constraintLayoutT, textView, encoreButtonT2, textView2, scrollView, encoreTextViewT, encoreTextViewT2, viewT, constraintLayoutT2, viewT2);
                                                            Context context = layoutInflater.getContext();
                                                            this.h = context;
                                                            if (str == null) {
                                                                string = bundle != null ? bundle.getString("name") : null;
                                                                if (string == null) {
                                                                    string = "";
                                                                }
                                                            } else {
                                                                string = str;
                                                            }
                                                            this.i = string;
                                                            this.b = (bundle != null ? bundle.getBoolean("name_onboarding_shown") : false) || str != null;
                                                            b8k1.q(encoreTextViewT2, true);
                                                            b8k1.q(textView, true);
                                                            encoreButtonT2.setEnabled(false);
                                                            textView2.setText(frameLayout.getResources().getString(2131957047, Integer.valueOf(yjn0Var.b + 1), Integer.valueOf(yjn0Var.c)));
                                                            editText.setFilters((InputFilter[]) new rjn0[]{rjn0Var});
                                                            rwq0.s(constraintLayoutT, new j8a(constraintLayoutT, (byte) 2));
                                                            rwq0.s(constraintLayoutT2, rre1.U0);
                                                            mmg1.a(scrollView, dg30Var, viewT);
                                                            encoreButtonT.setOnClickListener(new uva0(lzn0Var, (byte) 1));
                                                            editText.addTextChangedListener(new p96(this, (byte) 8));
                                                            encoreButtonT2.setOnClickListener(new zfs(this, (byte) 24));
                                                            encoreTextViewT.setText(zlc0Var.a(context.getResources().getString(2131957044), new wwa0(this, (byte) 1)));
                                                            encoreTextViewT.setMovementMethod(LinkMovementMethod.getInstance());
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
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public static final /* synthetic */ RecyclerView b(n830 n830Var) {
        return (RecyclerView) n830Var.h;
    }

    public void c(zuz0 zuz0Var, boolean z) {
        fsl fslVar = (fsl) this.i;
        Integer num = ((muz0) fslVar.c).d;
        ((yir) fslVar.f).f(new wrz0(new xrz0(num != null ? num.intValue() : zuz0Var.c), new g07(zuz0Var.a), z, zuz0Var.d, zuz0Var.e));
    }

    public View d() {
        return (View) this.c;
    }

    public void e() {
        kp5 kp5Var = (kp5) this.g;
        ((TextView) kp5Var.d).clearFocus();
        ((TextView) kp5Var.d).setImportantForAccessibility(2);
        ((ConstraintLayout) kp5Var.c).setVisibility(0);
        ((TextView) kp5Var.f).setVisibility(0);
        EditText editText = (EditText) kp5Var.b;
        editText.setText((String) this.i);
        editText.post(new mqh1(editText, (Context) this.h, (byte) 1));
    }

    public final Object getView() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return (View) obj;
            case 1:
                return (FrameLayout) ((kp5) this.g).a;
            default:
                return (View) obj;
        }
    }

    public final Bundle serialize() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                ((RecyclerView) this.h).saveHierarchyState(sparseArray);
                bundle.putSparseParcelableArray("view_state", sparseArray);
                return bundle;
            case 1:
                Bundle bundle2 = new Bundle();
                bundle2.putString("name", (String) this.i);
                bundle2.putBoolean("name_onboarding_shown", this.b);
                return bundle2;
            default:
                return mno1.g();
        }
    }

    public final void start() {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                w6d1.h(t5p1.j(((a630) obj2).k().b(), 3)).f((iac0) this.d, new z11(this, (byte) 18));
                ((yzu) obj3).e((RecyclerView) this.h, true);
                break;
            case 1:
                kp5 kp5Var = (kp5) obj3;
                pe peVar = (pe) obj;
                if (this.b || !peVar.b(3) || peVar.d()) {
                    ((TextView) kp5Var.d).setVisibility(8);
                    e();
                } else {
                    ((TextView) kp5Var.d).sendAccessibilityEvent(8);
                    TextView textView = (TextView) kp5Var.d;
                    wwa0 wwa0Var = new wwa0(this, (byte) 0);
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(textView.getContext(), 2130772055);
                    animationLoadAnimation.setAnimationListener(new wa50(wwa0Var, (byte) 1));
                    textView.startAnimation(animationLoadAnimation);
                }
                break;
            default:
                ((NestedScrollView) obj3).getViewTreeObserver().addOnScrollChangedListener((z22) obj2);
                fsl fslVar = (fsl) this.i;
                ((yir) fslVar.f).n(new fbz0(fslVar, (byte) 14));
                t01 t01Var = (t01) fslVar.d;
                String str = ((muz0) fslVar.c).a;
                vku vkuVar = (vku) t01Var.e;
                Scheduler scheduler = (Scheduler) t01Var.b;
                vkuVar.a(rqt0.F(w0h1.h(scheduler), new puz0(t01Var, str, null, (byte) 0)).observeOn(scheduler).subscribe(new quz0(t01Var, (byte) 0), mux0.Z));
                ((ConstraintLayout) obj).setOnApplyWindowInsetsListener(ouz0.b);
                break;
        }
    }

    public final void stop() {
        byte b = this.a;
        Object obj = this.g;
        switch (b) {
            case 0:
                ((yzu) obj).t();
                break;
            case 1:
                break;
            default:
                ((NestedScrollView) obj).getViewTreeObserver().removeOnScrollChangedListener((z22) this.e);
                ((vku) ((t01) ((fsl) this.i).d).e).c();
                break;
        }
    }

    private final void f() {
    }

    public n830(fsl fslVar, Context context, ViewGroup viewGroup) {
        this.i = fslVar;
        this.d = context;
        ((t01) fslVar.d).f = this;
        ((cir0) fslVar.b).j(new a0c(fslVar, this, (byte) 3));
        View viewInflate = LayoutInflater.from(context).inflate(2131625570, viewGroup, false);
        ((FrameLayout) viewInflate.findViewById(2131430589)).addView((ConstraintLayout) ((ytp0) ((yir) fslVar.f).c).b);
        this.c = viewInflate;
        this.e = new z22(this, (byte) 3);
        this.f = viewInflate.findViewById(2131430592);
        this.g = viewInflate.findViewById(2131430772);
        PrimaryButtonView primaryButtonViewFindViewById = viewInflate.findViewById(2131431110);
        primaryButtonViewFindViewById.setOnClickListener(new nuz0(fslVar, (byte) 2));
        this.h = primaryButtonViewFindViewById;
    }

    public n830(View view, Context context, iac0 iac0Var, a630 a630Var, Bundle bundle, yzu yzuVar, c711 c711Var, uk00 uk00Var, khc khcVar) {
        this.c = view;
        this.d = iac0Var;
        this.e = a630Var;
        this.f = bundle;
        this.g = yzuVar;
        RecyclerView recyclerViewFindViewById = view.findViewById(2131430614);
        this.h = recyclerViewFindViewById;
        this.b = true;
        view.getContext();
        recyclerViewFindViewById.setLayoutManager(new LinearLayoutManager(1));
        recyclerViewFindViewById.j(new u530(context, view.getResources(), uk00Var));
        recyclerViewFindViewById.j(c711Var);
        rwq0.s(recyclerViewFindViewById, new adx(recyclerViewFindViewById, this, (byte) 3));
        LinkedHashMap linkedHashMap = a630Var.U0;
        if (linkedHashMap != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), (laa) ((vu30) entry.getValue()).invoke(((a630) this.e).k().getMetadata(), (iac0) this.d));
            }
            Map map = ((a630) this.e).V0;
            if (map != null) {
                p1d0 p1d0VarF = khc.f(khcVar, linkedHashMap2, map, new sty(1, ((a630) this.e).k(), snc0.class, "onVisibleScrollRangeChanged", "onVisibleScrollRangeChanged(Lcom/spotify/listcontentruntime/configdsl/ListContentRuntime$ScrollRange;)V", 0, (byte) 28), 12);
                this.i = p1d0VarF;
                RecyclerView recyclerView = (RecyclerView) this.h;
                iac0 iac0Var2 = (iac0) this.d;
                recyclerView.getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
                linearLayoutManager.x1(1);
                p1d0VarF.a(recyclerView, iac0Var2, linearLayoutManager, true);
                return;
            }
            u890.C("instrumentationEnvironments");
            throw null;
        }
        u890.C("elementFactories");
        throw null;
    }
}
