package p;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wal1 implements isw, iac0 {
    public final ig3 a;
    public final xal1 b;
    public final dtw c;
    public final ConstraintLayout d;
    public final /* synthetic */ sma1 e;

    public wal1(sma1 sma1Var, Context context, lsw lswVar) {
        this.e = sma1Var;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131626336, (ViewGroup) null, false);
        int i = 2131427917;
        FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131427917);
        if (frameLayout != null) {
            ConstraintLayout constraintLayout = constraintLayoutInflate;
            i = 2131431356;
            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
            if (textView != null) {
                this.a = new ig3(constraintLayout, frameLayout, constraintLayout, textView);
                xal1 xal1Var = new xal1(this);
                this.b = xal1Var;
                tka0 tka0Var = dtw.C;
                dtw dtwVarD = mhc.d(context, frameLayout, f6o1.A(v7l1.a((v7l1) sma1Var.d, this, w3l1.g, w3l1.h, (Function0) null, 24), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
                View view = dtwVarD.w;
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(2131165897);
                view.setPaddingRelative(dimensionPixelSize, view.getPaddingTop(), dimensionPixelSize, view.getPaddingBottom());
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    viewGroup.setClipToPadding(false);
                }
                frameLayout.addView(view);
                this.c = dtwVarD;
                constraintLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                a6o1.t(lswVar, new bkk1(this, (byte) 13), new sjf1(0, xal1Var, xal1.class, "stop", "stop()V", 0, (byte) 18));
                this.d = constraintLayout;
                return;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a(Object obj, ysw yswVar) {
        k4m k4mVar;
        z5l1 z5l1Var = (z5l1) obj;
        ig3 ig3Var = this.a;
        TextView textView = ig3Var.b;
        String str = z5l1Var.a;
        textView.setText(str);
        Boolean bool = xoi1.b((Activity) this.e.e) ? Boolean.FALSE : null;
        ArrayList arrayList = z5l1Var.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y5l1 y5l1Var = (y5l1) it.next();
            String str2 = y5l1Var.a;
            String str3 = y5l1Var.b;
            String str4 = y5l1Var.c;
            String str5 = y5l1Var.d;
            String str6 = y5l1Var.e;
            boolean z = y5l1Var.f;
            Iterator it2 = it;
            if (y5l1Var.g) {
                k4mVar = k4m.a;
            } else {
                k4mVar = z ? k4m.b : k4m.d;
            }
            arrayList2.add(new w7l1(new t7l1(new h8l1(str2, str3, str4, str5, str6, k4mVar, y5l1Var.h, (String) null, 640), new s7l1(y5l1Var.i, "watch-feed-entrypoint-card-npv-scroll", bool != null ? bool.booleanValue() : true)), y5l1Var.j, y5l1Var.k, y5l1Var.l, y5l1Var.m, (u7h) null, 96));
            it = it2;
        }
        y7l1 y7l1Var = new y7l1(new x7l1("", arrayList2, ""), (x360) null, false, nik1.p1.a, "npv:carousel", 0, 38);
        tka0 tka0Var = dtw.C;
        this.c.k(y7l1Var, ioa0.a, (vu30) null);
        ConstraintLayout constraintLayout = ig3Var.a;
        constraintLayout.setContentDescription(str);
        b8k1.q(constraintLayout, true);
        constraintLayout.setImportantForAccessibility(1);
        constraintLayout.setFocusable(true);
        constraintLayout.setFocusableInTouchMode(true);
    }

    public final x8c0 getLifecycle() {
        return this.b.a;
    }

    public final View getView() {
        return this.d;
    }
}
