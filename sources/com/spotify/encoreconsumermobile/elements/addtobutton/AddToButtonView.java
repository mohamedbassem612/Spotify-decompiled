package com.spotify.encoreconsumermobile.elements.addtobutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.bqn1;
import p.cdf0;
import p.cg1;
import p.eg;
import p.iu30;
import p.j7p1;
import p.mk1;
import p.pk1;
import p.qk1;
import p.rk1;
import p.sk1;
import p.tk1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@adt
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/addtobutton/AddToButtonView;", "Lp/mk1;", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorImageButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", "listener", "Lp/rih1;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "src_main_java_com_spotify_encoreconsumermobile_elements_addtobutton-addtobutton"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AddToButtonView extends StateListAnimatorImageButton implements mk1 {
    public pk1 d;
    public boolean e;

    public AddToButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new pk1(qk1.a, false, null, null, null, 28);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void f(pk1 pk1Var) {
        String string;
        this.d = pk1Var;
        j7p1 j7p1Var = pk1Var.e;
        boolean z = j7p1Var instanceof sk1;
        qk1 qk1Var = qk1.a;
        if (z) {
            b();
        } else if (j7p1Var instanceof tk1) {
            cdf0 cdf0VarA = bqn1.A(getContext(), this.d.a == qk1Var ? 2131886216 : 2131886214);
            setImageDrawable(cdf0VarA);
            if (this.e || this.d.b) {
                cdf0VarA.k();
                this.e = false;
            } else {
                cdf0VarA.o((int) cdf0VarA.b.k());
            }
        } else {
            if (!(j7p1Var instanceof rk1)) {
                eg.o();
                return;
            }
            b();
        }
        pk1 pk1Var2 = this.d;
        qk1 qk1Var2 = pk1Var2.a;
        String str = pk1Var2.d;
        String str2 = pk1Var2.c;
        if (qk1Var2 == qk1Var && str2 != null && str != null) {
            Context context = getContext();
            pk1 pk1Var3 = this.d;
            string = context.getString(2131951917, pk1Var3.c, pk1Var3.d);
        } else if (qk1Var2 == qk1Var) {
            string = getContext().getString(2131951915);
        } else if (qk1Var2 != qk1.b || str2 == null || str == null) {
            string = getContext().getString(2131951916);
        } else {
            Context context2 = getContext();
            pk1 pk1Var4 = this.d;
            string = context2.getString(2131951918, pk1Var4.c, pk1Var4.d);
        }
        setContentDescription(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        cdf0 cdf0VarA = bqn1.A(getContext(), this.d.a == qk1.a ? 2131886215 : 2131886213);
        setImageDrawable(cdf0VarA);
        if (!this.e && !this.d.b) {
            cdf0VarA.o((int) cdf0VarA.b.k());
        } else {
            cdf0VarA.k();
            this.e = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        super/*android.view.View*/.setOnClickListener(new cg1(this, iu30Var, (byte) 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @adt
    public void setOnClickListener(View.OnClickListener listener) {
        super/*android.view.View*/.setOnClickListener(listener);
    }

    public AddToButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AddToButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AddToButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
