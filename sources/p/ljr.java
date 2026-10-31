package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ljr implements qzh {
    public final Context a;
    public final d520 b;
    public final pja c;

    public ljr(Context context) {
        this.a = context;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624082, (ViewGroup) null, false);
        int i = 2131427585;
        EncoreTextView encoreTextViewT = m5n1.t(constraintLayoutInflate, 2131427585);
        if (encoreTextViewT != null) {
            i = 2131427705;
            RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131427705);
            if (recyclerViewT != null) {
                i = 2131427761;
                if (((Space) m5n1.t(constraintLayoutInflate, 2131427761)) != null) {
                    i = 2131430499;
                    EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131430499);
                    if (encoreButtonT != null) {
                        i = 2131430865;
                        EncoreButton encoreButtonT2 = m5n1.t(constraintLayoutInflate, 2131430865);
                        if (encoreButtonT2 != null) {
                            i = 2131430924;
                            View viewT = m5n1.t(constraintLayoutInflate, 2131430924);
                            if (viewT != null) {
                                i = 2131431356;
                                TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                                if (textView != null) {
                                    i = 2131431451;
                                    if (((Space) m5n1.t(constraintLayoutInflate, 2131431451)) != null) {
                                        this.b = new d520(constraintLayoutInflate, encoreTextViewT, recyclerViewT, encoreButtonT, encoreButtonT2, viewT, textView, (byte) 16);
                                        pja pjaVar = new pja();
                                        pjaVar.d = z6x.a;
                                        pjaVar.e = false;
                                        this.c = pjaVar;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void f(Object obj) {
        tja tjaVar = (tja) obj;
        String str = tjaVar.d;
        String str2 = tjaVar.c;
        d520 d520Var = this.b;
        ((EncoreTextView) d520Var.c).setVisibility(8);
        ((TextView) d520Var.h).setText(tjaVar.a);
        RecyclerView recyclerView = (RecyclerView) d520Var.d;
        EncoreButton encoreButton = (EncoreButton) d520Var.f;
        EncoreButton encoreButton2 = (EncoreButton) d520Var.e;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        ArrayList arrayList = tjaVar.b;
        pja pjaVar = this.c;
        pjaVar.d = arrayList;
        pjaVar.e = false;
        pjaVar.h();
        recyclerView.setAdapter(pjaVar);
        Context context = this.a;
        ((GradientDrawable) ((ConstraintLayout) d520Var.b).getBackground()).setStroke((int) context.getResources().getDimension(2131165361), context.getColor(2131100225));
        if (str2.length() > 0) {
            encoreButton2.setVisibility(0);
            encoreButton2.setText(str2);
            encoreButton2.setBackgroundTintList(ColorStateList.valueOf(-1));
        }
        if (str.length() <= 0) {
            encoreButton.setVisibility(8);
        } else {
            encoreButton.setVisibility(0);
            encoreButton.setText(str);
        }
    }

    public final View getView() {
        return (ConstraintLayout) this.b.b;
    }

    public final void n(iu30 iu30Var) {
        d520 d520Var = this.b;
        ((ConstraintLayout) d520Var.b).setOnClickListener(new yer(iu30Var, (byte) 17));
        this.c.f = new m0o(iu30Var, (byte) 15);
        ((EncoreButton) d520Var.e).setOnClickListener(new yer(iu30Var, (byte) 18));
        ((EncoreButton) d520Var.f).setOnClickListener(new yer(iu30Var, (byte) 19));
    }
}
