package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kkn0 implements Connectable, c7k1 {
    public final LinearLayout X;
    public boolean Y;
    public final hrr0 Z;
    public final View a;
    public final ohv0 b;
    public final fd c;
    public final pp d;
    public final t8h1 e;
    public final Context f;
    public final EditText g;
    public final View h;
    public final Button i;
    public final ProgressBar t;

    public kkn0(View view, ohv0 ohv0Var, fd fdVar, pp ppVar, t8h1 t8h1Var) {
        this.a = view;
        this.b = ohv0Var;
        this.c = fdVar;
        this.d = ppVar;
        this.e = t8h1Var;
        Context context = view.getContext();
        this.f = context;
        this.g = (EditText) view.findViewById(2131430097);
        this.h = view.findViewById(2131427583);
        Button button = (Button) view.findViewById(2131430104);
        this.i = button;
        this.t = (ProgressBar) view.findViewById(2131430529);
        this.X = (LinearLayout) view.findViewById(2131429730);
        this.Z = v8r.q((Object) null);
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(p5x0.W0);
        composeView.setContent(new j2i(-1259502173, new fhk0(this, (byte) 16), true));
        ((ViewGroup) view).addView(composeView);
        View viewFindViewById = view.findViewById(2131430106);
        if (viewFindViewById != null) {
            button.addOnLayoutChangeListener(new x37(viewFindViewById, this, (byte) 12));
        }
    }

    public static final void g(kkn0 kkn0Var, wjn0 wjn0Var, fd fdVar, LinearLayout linearLayout, Consumer consumer) {
        ArrayList arrayList;
        String str;
        String str2;
        Object ccVar;
        Object bcVar;
        Object bcVar2;
        Object bcVar3;
        linearLayout.setVisibility(0);
        Context context = kkn0Var.f;
        ub ubVar = wjn0Var.d;
        String string = context.getString(2131962481);
        fdVar.getClass();
        String string2 = context.getString(2131963687);
        String string3 = context.getString(2131963674);
        String string4 = context.getString(2131963693);
        String string5 = context.getString(2131963694, string);
        String string6 = context.getString(2131963691);
        String string7 = context.getString(2131963692, string);
        String string8 = context.getString(2131963688);
        String string9 = context.getString(2131963689, string);
        String string10 = context.getString(2131963690, string);
        String string11 = context.getString(2131963678);
        String string12 = context.getString(2131963672);
        String string13 = context.getString(2131963671);
        String string14 = context.getString(2131963673);
        String string15 = context.getString(2131963667);
        String string16 = context.getString(2131963668);
        String string17 = context.getString(2131963669);
        String string18 = context.getString(2131963670);
        String string19 = context.getString(2131963665);
        String string20 = context.getString(2131963664);
        String string21 = context.getString(2131963666);
        String string22 = context.getString(2131963681);
        String string23 = context.getString(2131963680);
        String string24 = context.getString(2131963679);
        ArrayList arrayList2 = new ArrayList();
        if (ubVar instanceof sb) {
            qc qcVar = ((sb) ubVar).a;
            if (qcVar instanceof oc) {
                bcVar3 = new cc(string4, new xb(1, ((oc) qcVar).a), new wb(string2, 1), new wb(string3, 2));
                arrayList = arrayList2;
                str = string23;
            } else if (!(qcVar instanceof pc)) {
                eg.o();
                return;
            } else {
                arrayList = arrayList2;
                str = string23;
                bcVar3 = new bc(string5, new wb(string2, 1), new wb(string3, 2), null, false, 24);
            }
            arrayList.add(bcVar3);
            ubVar = ubVar;
        } else {
            arrayList = arrayList2;
            str = string23;
            if (!(ubVar instanceof tb)) {
                eg.o();
                return;
            }
            tb tbVar = (tb) ubVar;
            ed edVar = tbVar.a;
            if (edVar instanceof bd) {
                ccVar = new cc(string6, new xb(2, ((bd) edVar).a), new wb(string2, 1), null);
                str2 = string16;
            } else if (edVar instanceof cd) {
                ccVar = new bc(string7, new wb(string2, 1), null, null, false, 28);
                str2 = string16;
            } else {
                str2 = string16;
                if (!(edVar instanceof dd)) {
                    eg.o();
                    return;
                }
                ccVar = new cc(string19, new xb(2, ((dd) edVar).a), new wb(string2, 1), null);
            }
            arrayList.add(ccVar);
            hc hcVar = tbVar.e;
            if (hcVar instanceof gc) {
                arrayList.add(new cc(string15, new xb(6, ((gc) hcVar).a), new wb(str2, 3), null));
            }
            wc wcVar = tbVar.b;
            if (wcVar instanceof rc) {
                bcVar = new cc(string8, new xb(3, ((rc) wcVar).a), new wb(string3, 2), null);
            } else {
                if (wcVar instanceof sc) {
                    bcVar2 = new bc(string9, new wb(string3, 2), null, null, false, 28);
                } else if (wcVar instanceof tc) {
                    bcVar2 = new bc(string10, new wb(string3, 2), null, null, false, 28);
                } else if (wcVar instanceof vc) {
                    bcVar2 = new bc(string11, new wb(string3, 2), null, null, false, 28);
                } else {
                    if (!(wcVar instanceof uc)) {
                        eg.o();
                        return;
                    }
                    bcVar = new bc(string20, new wb(string3, 2), null, null, false, 28);
                }
                bcVar = bcVar2;
            }
            arrayList.add(bcVar);
        }
        zc zcVarJ = ubVar.j();
        if (zcVarJ instanceof yc) {
            arrayList.add(new bc(string22, new wb(str, 5), null, new xb(8, ((yc) ubVar.j()).a), ubVar.h(), 4));
        } else if (!(zcVarJ instanceof xc)) {
            eg.o();
            return;
        }
        nc ncVarG = ubVar.g();
        if (ncVarG instanceof lc) {
            arrayList.add(new bc(string12, null, null, new xb(4, ((lc) ubVar.g()).a), ubVar.h(), 6));
        } else if (ncVarG instanceof kc) {
            arrayList.add(new bc(string13, null, null, new xb(4, ((kc) ubVar.g()).a), ubVar.h(), 6));
        } else if (ncVarG instanceof ic) {
            arrayList.add(new bc(string12, null, null, new xb(4, ((ic) ubVar.g()).a), ubVar.h(), 6));
            arrayList.add(new bc(string14, null, null, null, false, 30));
        } else if (ncVarG instanceof mc) {
            arrayList.add(new bc(string21, null, null, new xb(4, ((mc) ubVar.g()).a), ubVar.h(), 6));
        } else if (!(ncVarG instanceof jc)) {
            eg.o();
            return;
        }
        hc hcVarB = ubVar.b();
        if (hcVarB instanceof ec) {
            arrayList.add(new bc(string24, null, null, new xb(5, ((ec) ubVar.b()).a), ubVar.h(), 6));
        } else if (hcVarB instanceof gc) {
            arrayList.add(new bc(string17, new wb(string18, 4), null, new xb(7, ((gc) ubVar.b()).b), ubVar.h(), 4));
        } else if (!(hcVarB instanceof fc)) {
            eg.o();
            return;
        }
        int childCount = linearLayout.getChildCount() - arrayList.size();
        if (childCount > 0) {
            linearLayout.removeViews(arrayList.size(), childCount);
        }
        int size = arrayList.size() - linearLayout.getChildCount();
        for (int i = 0; i < size; i++) {
            mdr mdrVar = (mdr) kkn0Var.d.a((l0i) null);
            mdrVar.n(new j9n0(consumer, kkn0Var, (byte) 5));
            View view = mdrVar.a;
            view.setTag(mdrVar);
            linearLayout.addView(view);
        }
        int childCount2 = linearLayout.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            ((mdr) linearLayout.getChildAt(i2).getTag()).f(arrayList.get(i2));
        }
    }

    public static final void h(kkn0 kkn0Var, wjn0 wjn0Var) {
        View view = kkn0Var.h;
        ProgressBar progressBar = kkn0Var.t;
        Button button = kkn0Var.i;
        boolean z = wjn0Var.b;
        if (z && progressBar.getVisibility() != 0) {
            progressBar.setVisibility(0);
            button.setVisibility(4);
        } else if (!z && progressBar.getVisibility() == 0) {
            progressBar.setVisibility(8);
            button.setVisibility(0);
        }
        if (wjn0Var.c) {
            button.setEnabled(true);
        } else {
            button.setEnabled(wjn0Var.d.a() && (wjn0Var.a instanceof ujn0));
        }
        if (view != null) {
            if (button.getVisibility() != 0 || button.isEnabled()) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public static final void i(kkn0 kkn0Var, vjn0 vjn0Var) {
        Context context = kkn0Var.f;
        EditText editText = kkn0Var.g;
        if (!(vjn0Var instanceof ujn0)) {
            Drawable drawable = context.getDrawable(2131231014);
            WeakHashMap weakHashMap = b8k1.a;
            editText.setBackground(drawable);
            editText.setTextColor(context.getColor(2131103273));
            return;
        }
        if (!kkn0Var.Y && editText.getText().toString().length() == 0) {
            kkn0Var.Y = true;
            String str = ((ujn0) vjn0Var).b;
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = u890.q(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            editText.setText(str.subSequence(i, length + 1).toString());
        }
        Drawable drawable2 = context.getDrawable(2131231012);
        WeakHashMap weakHashMap2 = b8k1.a;
        editText.setBackground(drawable2);
        editText.setTextColor(context.getColor(2131101773));
    }

    public final Connection L(Consumer consumer) {
        zyw zywVar = new zyw(consumer, this);
        this.g.addTextChangedListener(zywVar);
        this.i.setOnClickListener(new f1b(consumer, (byte) 11));
        return new jkn0(this, consumer, zywVar);
    }

    @Override // p.c7k1
    public final String b() {
        return this.a.getContext().getString(2131962531);
    }

    @Override // p.c7k1
    public final void c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        t8h1.n(this.e, yon1.G1("SIGNUP_DISPLAYNAME", "signup/displayname", 1888, "signup"));
    }

    @Override // p.c7k1
    public final void a() {
    }
}
