package com.spotify.encoreconsumermobile.elements.addtobutton;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.bqn1;
import p.cdf0;
import p.cvr;
import p.eix;
import p.iu30;
import p.j7p1;
import p.mk1;
import p.pk1;
import p.qk1;
import p.rk1;
import p.sdf0;
import p.tk1;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@adt
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/addtobutton/EncoreAddToButtonView;", "Lp/mk1;", "Lcom/spotify/encoremobile/component/buttons/EncoreButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "Lp/rih1;", "setEnabled", "(Z)V", "src_main_java_com_spotify_encoreconsumermobile_elements_addtobutton-addtobutton"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EncoreAddToButtonView extends EncoreButton implements mk1 {
    public pk1 Y0;
    public boolean Z0;

    public EncoreAddToButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, (eix) null, 8, (DefaultConstructorMarker) null);
        this.Y0 = new pk1(qk1.a, false, null, null, null, 28);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void f(pk1 pk1Var) {
        String string;
        this.Y0 = pk1Var;
        j7p1 j7p1Var = pk1Var.e;
        boolean zJ = u890.j(j7p1Var, tk1.c);
        qk1 qk1Var = qk1.b;
        qk1 qk1Var2 = qk1.a;
        if (zJ) {
            cdf0 cdf0VarA = bqn1.A(getContext(), this.Y0.a == qk1Var2 ? 2131886216 : 2131886214);
            setIcon(cdf0VarA);
            if (this.Z0 || this.Y0.b) {
                cdf0VarA.k();
                this.Z0 = false;
            } else {
                cdf0VarA.o((int) cdf0VarA.b.k());
            }
        } else if (u890.j(j7p1Var, rk1.c)) {
            cdf0 cdf0VarA2 = bqn1.A(getContext(), 2131886212);
            sdf0 sdf0Var = cdf0VarA2.b;
            setIcon(cdf0VarA2);
            if (this.Z0) {
                if (this.Y0.a == qk1Var2) {
                    sdf0Var.d = -1.0f;
                    cdf0VarA2.p(((int) sdf0Var.k()) / 2);
                }
                cdf0VarA2.k();
                this.Z0 = false;
            } else {
                pk1 pk1Var2 = this.Y0;
                if (pk1Var2.b) {
                    if (this.Y0.a == qk1Var2) {
                        sdf0Var.d = -1.0f;
                        cdf0VarA2.p(((int) sdf0Var.k()) / 2);
                    }
                    cdf0VarA2.k();
                    this.Z0 = false;
                } else if (pk1Var2.a == qk1Var) {
                    cdf0VarA2.o((int) sdf0Var.k());
                } else {
                    cdf0VarA2.o((int) sdf0Var.l());
                }
            }
        } else {
            cdf0 cdf0VarA3 = bqn1.A(getContext(), this.Y0.a == qk1Var2 ? 2131886215 : 2131886213);
            setIcon(cdf0VarA3);
            if (this.Z0 || this.Y0.b) {
                cdf0VarA3.k();
                this.Z0 = false;
            } else {
                cdf0VarA3.o((int) cdf0VarA3.b.k());
            }
        }
        pk1 pk1Var3 = this.Y0;
        qk1 qk1Var3 = pk1Var3.a;
        String str = pk1Var3.d;
        String str2 = pk1Var3.c;
        if (qk1Var3 == qk1Var2 && str2 != null && str != null) {
            Context context = getContext();
            pk1 pk1Var4 = this.Y0;
            string = context.getString(2131951917, pk1Var4.c, pk1Var4.d);
        } else if (qk1Var3 == qk1Var2) {
            string = getContext().getString(2131951915);
        } else if (qk1Var3 != qk1Var || str2 == null || str == null) {
            string = getContext().getString(2131951916);
        } else {
            Context context2 = getContext();
            pk1 pk1Var5 = this.Y0;
            string = context2.getString(2131951918, pk1Var5.c, pk1Var5.d);
        }
        setContentDescription(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new cvr(this, iu30Var, (byte) 22));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEnabled(boolean enabled) {
        super/*android.view.View*/.setEnabled(enabled);
        setAlpha(enabled ? 1.0f : 0.3f);
    }

    public EncoreAddToButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EncoreAddToButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EncoreAddToButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 2130969239 : i);
    }
}
