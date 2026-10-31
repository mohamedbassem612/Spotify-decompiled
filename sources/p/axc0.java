package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.comscore.streaming.ContentMediaFormat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class axc0 implements pti0, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public msi0 c;
    public ExpandedMenuView d;
    public oti0 e;
    public zwc0 f;

    public axc0(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    public final zwc0 a() {
        zwc0 zwc0Var = this.f;
        if (zwc0Var != null) {
            return zwc0Var;
        }
        zwc0 zwc0Var2 = new zwc0(this);
        this.f = zwc0Var2;
        return zwc0Var2;
    }

    @Override // p.pti0
    public final void b(msi0 msi0Var, boolean z) {
        oti0 oti0Var = this.e;
        if (oti0Var != null) {
            oti0Var.b(msi0Var, z);
        }
    }

    @Override // p.pti0
    public final void c(Context context, msi0 msi0Var) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = msi0Var;
        zwc0 zwc0Var = this.f;
        if (zwc0Var != null) {
            zwc0Var.notifyDataSetChanged();
        }
    }

    @Override // p.pti0
    public final void d(oti0 oti0Var) {
        this.e = oti0Var;
    }

    @Override // p.pti0
    public final void e() {
        zwc0 zwc0Var = this.f;
        if (zwc0Var != null) {
            zwc0Var.notifyDataSetChanged();
        }
    }

    @Override // p.pti0
    public final boolean f(ysi0 ysi0Var) {
        return false;
    }

    @Override // p.pti0
    public final boolean g(ysi0 ysi0Var) {
        return false;
    }

    @Override // p.pti0
    public final boolean h() {
        return false;
    }

    @Override // p.pti0
    public final boolean i(alc1 alc1Var) {
        if (!alc1Var.hasVisibleItems()) {
            return false;
        }
        osi0 osi0Var = new osi0();
        osi0Var.a = alc1Var;
        uh3 uh3Var = new uh3(alc1Var.a);
        axc0 axc0Var = new axc0(uh3Var.getContext());
        osi0Var.c = axc0Var;
        axc0Var.e = osi0Var;
        alc1Var.b(axc0Var);
        zwc0 zwc0VarA = osi0Var.c.a();
        qh3 qh3Var = uh3Var.a;
        qh3Var.f120p = zwc0VarA;
        qh3Var.q = osi0Var;
        View view = alc1Var.o;
        if (view != null) {
            qh3Var.e = view;
        } else {
            qh3Var.c = alc1Var.n;
            uh3Var.setTitle(alc1Var.m);
        }
        qh3Var.n = osi0Var;
        vh3 vh3VarCreate = uh3Var.create();
        osi0Var.b = vh3VarCreate;
        vh3VarCreate.setOnDismissListener(osi0Var);
        WindowManager.LayoutParams attributes = osi0Var.b.getWindow().getAttributes();
        attributes.type = ContentMediaFormat.FULL_CONTENT_MOVIE;
        attributes.flags |= 131072;
        osi0Var.b.show();
        oti0 oti0Var = this.e;
        if (oti0Var == null) {
            return true;
        }
        oti0Var.g(alc1Var);
        return true;
    }

    public final sti0 j(ViewGroup viewGroup) {
        if (this.d == null) {
            this.d = (ExpandedMenuView) this.b.inflate(2131623949, viewGroup, false);
            zwc0 zwc0Var = this.f;
            if (zwc0Var == null) {
                zwc0Var = new zwc0(this);
                this.f = zwc0Var;
            }
            this.d.setAdapter((ListAdapter) zwc0Var);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.s(this.f.getItem(i), this, 0);
    }
}
