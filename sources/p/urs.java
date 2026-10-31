package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class urs extends NestedScrollView {
    public final w2z j1;
    public final r2a1 k1;
    public final xga1 l1;
    public final LinkedHashMap m1;
    public final Drawable n1;
    public final Observable o1;

    /* JADX WARN: Multi-variable type inference failed */
    public urs(w2z w2zVar, r2a1 r2a1Var, Context context) {
        super(context, (AttributeSet) null);
        this.j1 = w2zVar;
        this.k1 = r2a1Var;
        LayoutInflater.from(context).inflate(2131626183, (ViewGroup) this);
        int i = 2131427563;
        TextView textView = (TextView) m5n1.t(this, 2131427563);
        if (textView != null) {
            i = 2131428519;
            TextView textView2 = (TextView) m5n1.t(this, 2131428519);
            if (textView2 != null) {
                i = 2131429075;
                if (((ImageView) m5n1.t(this, 2131429075)) != null) {
                    i = 2131430140;
                    TextView textView3 = (TextView) m5n1.t(this, 2131430140);
                    if (textView3 != null) {
                        i = 2131430215;
                        TextView textView4 = (TextView) m5n1.t(this, 2131430215);
                        if (textView4 != null) {
                            i = 2131431547;
                            TextView textView5 = (TextView) m5n1.t(this, 2131431547);
                            if (textView5 != null) {
                                this.l1 = new xga1(this, textView, textView2, textView3, textView4, textView5);
                                LinkedHashMap linkedHashMapM = sqg0.M(new mmr0[]{new mmr0(ipq0.a, textView), new mmr0(ipq0.b, textView2), new mmr0(ipq0.c, textView5), new mmr0(jpq0.a, textView3), new mmr0(jpq0.b, textView4)});
                                this.m1 = linkedHashMapM;
                                Drawable drawable = context.getDrawable(2131231563);
                                byte b = 0;
                                if (drawable != null) {
                                    drawable.setTintList(ColorStateList.valueOf(ago1.o(getContext(), 2130970419, 0)));
                                } else {
                                    drawable = null;
                                }
                                this.n1 = drawable;
                                setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                float fApplyDimension = TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
                                gch0 gch0Var = new gch0();
                                gr31 gr31Var = new gr31();
                                gr31 gr31Var2 = new gr31();
                                gr31 gr31Var3 = new gr31();
                                gr31 gr31Var4 = new gr31();
                                k5 k5Var = new k5(0.0f);
                                k5 k5Var2 = new k5(0.0f);
                                fmv fmvVar = new fmv(b);
                                fmv fmvVar2 = new fmv(b);
                                fmv fmvVar3 = new fmv(b);
                                fmv fmvVar4 = new fmv(b);
                                k5 k5Var3 = new k5(fApplyDimension);
                                k5 k5Var4 = new k5(fApplyDimension);
                                iw61 iw61Var = new iw61();
                                iw61Var.a = gr31Var;
                                iw61Var.b = gr31Var2;
                                iw61Var.c = gr31Var3;
                                iw61Var.d = gr31Var4;
                                iw61Var.e = k5Var3;
                                iw61Var.f = k5Var4;
                                iw61Var.g = k5Var;
                                iw61Var.h = k5Var2;
                                iw61Var.i = fmvVar;
                                iw61Var.j = fmvVar2;
                                iw61Var.k = fmvVar3;
                                iw61Var.l = fmvVar4;
                                gch0Var.setShapeAppearanceModel(iw61Var);
                                gch0Var.m(ColorStateList.valueOf(ago1.o(getContext(), 2130968739, 0)));
                                setBackground(gch0Var);
                                setClipToOutline(true);
                                String string = getContext().getString(2131962783);
                                String string2 = getContext().getString(2131962784);
                                for (Map.Entry entry : linkedHashMapM.entrySet()) {
                                    b8k1.m((TextView) entry.getValue(), fg.g, ((kpq0) entry.getKey()) instanceof ipq0 ? string : string2, (sh) null);
                                }
                                this.l1.a.setText(2131955959);
                                LinkedHashMap linkedHashMap = this.m1;
                                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                    kpq0 kpq0Var = (kpq0) entry2.getKey();
                                    TextView textView6 = (TextView) entry2.getValue();
                                    b2u.q(textView6).a();
                                    arrayList.add(new jxc(textView6, (byte) 2).doOnNext(new lgr(this, kpq0Var, (byte) 9)).map(new tzo(kpq0Var, (byte) 16)));
                                }
                                this.o1 = Observable.merge(arrayList).share();
                                return;
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public Observable<kpq0> getOptionsClicks() {
        return this.o1;
    }
}
