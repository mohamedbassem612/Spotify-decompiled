package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oao implements isw {
    public final /* synthetic */ byte a;
    public final wzn b;
    public final LinearLayout c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ bpb1 e;

    public oao(Context context, ViewGroup viewGroup, ne neVar, bpb1 bpb1Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.d = context;
                this.e = bpb1Var;
                wzn wznVarE = wzn.e(LayoutInflater.from(context), viewGroup);
                this.b = wznVarE;
                LinearLayout linearLayout = (LinearLayout) wznVarE.a;
                RecyclerView recyclerView = (RecyclerView) wznVarE.b;
                recyclerView.setItemAnimator((e611) null);
                neVar.f(recyclerView, new LinearLayoutManager(1), false);
                this.c = linearLayout;
                break;
            default:
                this.d = context;
                this.e = bpb1Var;
                wzn wznVarE2 = wzn.e(LayoutInflater.from(context), viewGroup);
                this.b = wznVarE2;
                LinearLayout linearLayout2 = (LinearLayout) wznVarE2.a;
                RecyclerView recyclerView2 = (RecyclerView) wznVarE2.b;
                recyclerView2.setItemAnimator((e611) null);
                recyclerView2.j(new j1e(recyclerView2, (byte) 2));
                neVar.f(recyclerView2, new LinearLayoutManager(0), false);
                this.c = linearLayout2;
                break;
        }
    }

    public final void a(Object obj, ysw yswVar) {
        byte b = this.a;
        Context context = this.d;
        wzn wznVar = this.b;
        bpb1 bpb1Var = this.e;
        int i = 8;
        Drawable drawable = null;
        Drawable drawable2 = null;
        CharSequence charSequence = null;
        switch (b) {
            case 0:
                mao maoVar = (mao) obj;
                String str = maoVar.f;
                bpb1Var.m((Object) null, maoVar.g);
                TextView textView = (TextView) wznVar.d;
                TextView textView2 = (TextView) wznVar.c;
                String str2 = maoVar.e;
                textView.setVisibility((str2 == null || ihc1.y0(str2)) ? 8 : 0);
                textView.setText(str2);
                if (str != null && !ihc1.y0(str)) {
                    i = 0;
                }
                textView2.setVisibility(i);
                Drawable drawable3 = context.getDrawable(2131231786);
                if (drawable3 != null) {
                    drawable3.setTint(context.getColor(2131101343));
                    drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
                    drawable = drawable3;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l1d.m("  ", str));
                if (drawable != null) {
                    spannableStringBuilder.setSpan(new ImageSpan(drawable, 1), 0, 1, 33);
                }
                textView2.setText(spannableStringBuilder);
                break;
            default:
                dbo dboVar = (dbo) obj;
                String str3 = dboVar.f;
                bpb1Var.m((Object) null, dboVar.g);
                TextView textView3 = (TextView) wznVar.d;
                TextView textView4 = (TextView) wznVar.c;
                String str4 = dboVar.e;
                textView3.setVisibility((str4 == null || ihc1.y0(str4)) ? 8 : 0);
                textView3.setText(str4);
                if (str3 != null && !ihc1.y0(str3)) {
                    i = 0;
                }
                textView4.setVisibility(i);
                if (str3 != null) {
                    Drawable drawable4 = context.getDrawable(2131231786);
                    if (drawable4 != null) {
                        drawable4.setTint(context.getColor(2131101343));
                        drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), drawable4.getIntrinsicHeight());
                        drawable2 = drawable4;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("  ".concat(str3));
                    if (drawable2 != null) {
                        spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 1), 0, 1, 33);
                    }
                    charSequence = spannableStringBuilder2;
                }
                textView4.setText(charSequence);
                break;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }
}
