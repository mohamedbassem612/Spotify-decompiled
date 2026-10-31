package p;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n3v0 implements tx31 {
    public final ux31 a;
    public final TextView b;
    public final View c;

    public n3v0(View view, ux31 ux31Var, TextView textView) {
        this.a = ux31Var;
        this.c = view;
        this.b = textView;
    }

    @Override // p.gy31
    public final ImageView getImageView() {
        return this.a.e;
    }

    @Override // p.sx31
    public final TextView getSubtitleView() {
        return this.a.d;
    }

    @Override // p.sx31
    public final TextView getTitleView() {
        return this.a.c;
    }

    public final View getView() {
        return this.c;
    }

    @Override // p.ct31
    public final void i(View view) {
        this.a.i(view);
    }

    @Override // p.sx31
    public final void m(CharSequence charSequence) {
        this.a.m(charSequence);
    }

    @Override // p.ct31
    public final View o() {
        return (View) this.a.b.d;
    }

    @Override // p.qa0
    public final void setActive(boolean z) {
        this.a.setActive(z);
    }

    public final void setAppearsDisabled(boolean z) {
        this.a.setAppearsDisabled(z);
    }

    @Override // p.sx31
    public final void setSubtitle(CharSequence charSequence) {
        this.a.setSubtitle(charSequence);
    }

    @Override // p.sx31
    public final void setTitle(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }
}
