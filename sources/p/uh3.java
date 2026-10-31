package p;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class uh3 {
    public final qh3 a;
    public final int b;

    public uh3(Context context, int i) {
        this.a = new qh3(new ContextThemeWrapper(context, vh3.f(context, i)));
        this.b = i;
    }

    public uh3 a(CharSequence[] charSequenceArr, ln5 ln5Var) {
        qh3 qh3Var = this.a;
        qh3Var.o = charSequenceArr;
        qh3Var.q = ln5Var;
        qh3Var.t = -1;
        qh3Var.s = true;
        return this;
    }

    public vh3 create() {
        qh3 qh3Var = this.a;
        vh3 vh3Var = new vh3(qh3Var.a, this.b);
        View view = qh3Var.e;
        th3 th3Var = vh3Var.f;
        if (view != null) {
            th3Var.w = view;
        } else {
            CharSequence charSequence = qh3Var.d;
            if (charSequence != null) {
                th3Var.g(charSequence);
            }
            Drawable drawable = qh3Var.c;
            if (drawable != null) {
                th3Var.s = drawable;
                ImageView imageView = th3Var.t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    th3Var.t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = qh3Var.f;
        if (charSequence2 != null) {
            th3Var.e = charSequence2;
            TextView textView = th3Var.v;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = qh3Var.g;
        if (charSequence3 != null) {
            th3Var.f(-1, charSequence3, qh3Var.h);
        }
        CharSequence charSequence4 = qh3Var.i;
        if (charSequence4 != null) {
            th3Var.f(-2, charSequence4, qh3Var.j);
        }
        CharSequence charSequence5 = qh3Var.k;
        if (charSequence5 != null) {
            th3Var.f(-3, charSequence5, qh3Var.l);
        }
        if (qh3Var.o != null || qh3Var.f120p != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) qh3Var.b.inflate(th3Var.A, (ViewGroup) null);
            int i = qh3Var.s ? th3Var.B : th3Var.C;
            ListAdapter sh3Var = qh3Var.f120p;
            if (sh3Var == null) {
                sh3Var = new sh3(qh3Var.a, i, R.id.text1, qh3Var.o);
            }
            th3Var.x = sh3Var;
            th3Var.y = qh3Var.t;
            if (qh3Var.q != null) {
                alertController$RecycleListView.setOnItemClickListener(new ph3(qh3Var, th3Var));
            }
            if (qh3Var.s) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            th3Var.f = alertController$RecycleListView;
        }
        View view2 = qh3Var.r;
        if (view2 != null) {
            th3Var.g = view2;
            th3Var.h = false;
        }
        vh3Var.setCancelable(true);
        vh3Var.setCanceledOnTouchOutside(true);
        vh3Var.setOnCancelListener(qh3Var.m);
        vh3Var.setOnDismissListener(null);
        osi0 osi0Var = qh3Var.n;
        if (osi0Var != null) {
            vh3Var.setOnKeyListener(osi0Var);
        }
        return vh3Var;
    }

    public Context getContext() {
        return this.a.a;
    }

    public uh3 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        qh3 qh3Var = this.a;
        qh3Var.i = qh3Var.a.getText(i);
        qh3Var.j = onClickListener;
        return this;
    }

    public uh3 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        qh3 qh3Var = this.a;
        qh3Var.g = qh3Var.a.getText(i);
        qh3Var.h = onClickListener;
        return this;
    }

    public uh3 setTitle(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public uh3 setView(View view) {
        this.a.r = view;
        return this;
    }

    public uh3(Context context) {
        this(context, vh3.f(context, 0));
    }
}
