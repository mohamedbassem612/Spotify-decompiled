package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hhx extends EncoreButton implements tlv {
    public final yjq Y0;
    public sru Z0;
    public boolean a1;
    public Float b1;

    public hhx(Context context, int i) {
        super(context, (AttributeSet) null, 2130969239, (eix) null, 8, (DefaultConstructorMarker) null);
        this.Y0 = new yjq(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setDrawable(sru sruVar) {
        setIcon(this.Y0.n(sruVar.a));
        setVisibility(0);
        if (sruVar.a instanceof k1v) {
            this.a1 = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void f(sru sruVar) {
        sru sruVar2 = this.Z0;
        if (sruVar2 == null) {
            this.Z0 = sruVar;
            sruVar2 = sruVar;
        }
        p1v p1vVar = sruVar.a;
        boolean z = p1vVar instanceof k1v;
        if (z) {
            this.b1 = ((k1v) p1vVar).a;
        }
        boolean z2 = this.a1;
        Float f = this.b1;
        if (z2 && p1vVar.equals(new k1v(null)) && f != null) {
            return;
        }
        i();
        this.a1 = false;
        if (p1vVar instanceof m1v) {
            setIcon((Drawable) null);
            setContentDescription(null);
            setVisibility(8);
            this.Z0 = null;
            return;
        }
        p1v p1vVar2 = sruVar2.a;
        yjq yjqVar = this.Y0;
        if (yjqVar.q(p1vVar2, p1vVar)) {
            if (z) {
                this.a1 = true;
            }
            setIcon(yjqVar.p(p1vVar2, p1vVar, new oqr(this, sruVar, (byte) 2)));
        } else {
            setDrawable(sruVar);
        }
        setContentDescription(rwq0.q(getContext(), sruVar));
        setEnabled(!p1vVar.equals(f1v.a));
        setFocusable(true);
        setImportantForAccessibility(1);
        this.Z0 = sruVar;
    }

    public final void i() {
        cdf0 icon = getIcon();
        cdf0 cdf0Var = icon instanceof cdf0 ? icon : null;
        if (cdf0Var != null) {
            cdf0Var.b.removeAllListeners();
        }
        Drawable icon2 = getIcon();
        cdf0 cdf0Var2 = icon2 instanceof cdf0 ? (cdf0) icon2 : null;
        if (cdf0Var2 != null) {
            cdf0Var2.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new aqs(iu30Var, (byte) 18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEnabled(boolean z) {
        super/*android.view.View*/.setEnabled(z);
        setAlpha(z ? 1.0f : 0.3f);
    }
}
