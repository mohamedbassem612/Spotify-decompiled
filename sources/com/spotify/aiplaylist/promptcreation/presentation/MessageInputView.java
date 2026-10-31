package com.spotify.aiplaylist.promptcreation.presentation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.af0;
import p.ahs;
import p.b0j0;
import p.bhn0;
import p.c0j0;
import p.cto1;
import p.d0j0;
import p.dg90;
import p.dj20;
import p.e0j0;
import p.eb80;
import p.eea0;
import p.fn31;
import p.g0j0;
import p.hid0;
import p.hvi0;
import p.iac0;
import p.iu30;
import p.l811;
import p.lnm;
import p.lua0;
import p.m4e0;
import p.m5n1;
import p.mre0;
import p.n811;
import p.nua0;
import p.o8n;
import p.p7h;
import p.p96;
import p.qx21;
import p.r4u;
import p.rwq0;
import p.u890;
import p.upa0;
import p.w6e0;
import p.x9g0;
import p.x9p1;
import p.xj20;
import p.y29;
import p.yj20;
import p.yzi0;
import p.zud0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/spotify/aiplaylist/promptcreation/presentation/MessageInputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "messageId", "Lp/rih1;", "setCreateButtonClickListener", "(Ljava/lang/String;)V", "setSaveButtonClickListener", "Lp/nua0;", "keyboardState", "setEditTextMaxLines", "(Lp/nua0;)V", "src_main_java_com_spotify_aiplaylist_promptcreation-promptcreation"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MessageInputView extends ConstraintLayout {
    public static final /* synthetic */ int X0 = 0;
    public final w6e0 T0;
    public Drawable U0;
    public iu30 V0;
    public final r4u W0;

    /* JADX WARN: Multi-variable type inference failed */
    public MessageInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(2131625230, (ViewGroup) this);
        int i2 = 2131427870;
        if (m5n1.t(this, 2131427870) != null) {
            i2 = 2131428275;
            EncoreButton encoreButtonT = m5n1.t(this, 2131428275);
            if (encoreButtonT != null) {
                i2 = 2131429968;
                EditText editText = (EditText) m5n1.t(this, 2131429968);
                if (editText != null) {
                    i2 = 2131430745;
                    EncoreButton encoreButtonT2 = m5n1.t(this, 2131430745);
                    if (encoreButtonT2 != null) {
                        i2 = 2131430922;
                        EncoreButton encoreButtonT3 = m5n1.t(this, 2131430922);
                        if (encoreButtonT3 != null) {
                            this.T0 = new w6e0(this, encoreButtonT, editText, encoreButtonT2, encoreButtonT3);
                            Resources resources = getRootView().getResources();
                            ThreadLocal threadLocal = qx21.a;
                            this.U0 = resources.getDrawable(2131233377, null);
                            this.V0 = hvi0.t;
                            this.W0 = r4u.c(new r4u[]{r4u.d(new ahs(b0j0.b, (byte) 5), r4u.a(new eb80(this, (byte) 27))), r4u.d(new ahs(c0j0.b, (byte) 5), r4u.a(new zud0(this, (byte) 13))), r4u.d(new ahs(d0j0.b, (byte) 5), r4u.a(new mre0(this, (byte) 10))), r4u.d(new ahs(e0j0.b, (byte) 5), r4u.a(new m4e0(this, (byte) 8))), r4u.d(yj20.N0, r4u.a(new dg90(this, (byte) 25))), r4u.d(dj20.N0, r4u.a(new upa0(this, (byte) 23))), r4u.d(xj20.O0, r4u.a(new eea0(this, (byte) 22)))});
                            editText.setRawInputType(114689);
                            editText.setOnEditorActionListener(new y29(this, (byte) 3));
                            editText.addTextChangedListener(new p96(this, (byte) 9));
                            rwq0.s(editText, new x9g0(new l811(), this, (byte) 24));
                            encoreButtonT3.setOnClickListener(new hid0(this, (byte) 6));
                            editText.setCompoundDrawablesRelativeWithIntrinsicBounds(this.U0, (Drawable) null, (Drawable) null, (Drawable) null);
                            return;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCreateButtonClickListener(String messageId) {
        ((EncoreButton) this.T0.d).setOnClickListener(new g0j0(this, messageId, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setEditTextMaxLines(nua0 keyboardState) {
        boolean zJ = u890.j(keyboardState, lua0.a);
        w6e0 w6e0Var = this.T0;
        if (zJ && ((EditText) w6e0Var.b).getText().length() == 0) {
            ((EditText) w6e0Var.b).setSingleLine(true);
        } else {
            ((EditText) w6e0Var.b).setSingleLine(false);
            ((EditText) w6e0Var.b).setMaxLines(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSaveButtonClickListener(String messageId) {
        ((EncoreButton) this.T0.e).setOnClickListener(new g0j0(this, messageId, (byte) 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B() {
        w6e0 w6e0Var = this.T0;
        EditText editText = (EditText) w6e0Var.b;
        EditText editText2 = (EditText) w6e0Var.b;
        if (editText.getText().length() > 0) {
            InputMethodManager inputMethodManager = (InputMethodManager) getRootView().getContext().getSystemService(InputMethodManager.class);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(editText2.getWindowToken(), 0);
            }
            this.V0.invoke(new yzi0(editText2.getText().toString()));
            editText2.getText().clear();
            editText2.clearFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        EditText editText = (EditText) this.T0.b;
        List listM = p7h.M(new Integer[]{2131960613, 2131960609, 2131960610, 2131960611});
        n811 n811Var = new n811();
        iac0 iac0VarH = x9p1.h(editText);
        if (iac0VarH != null) {
            fn31.T(cto1.q(iac0VarH), (o8n) null, 0, new af0(n811Var, listM, editText, (lnm) null, (byte) 16), 3);
        }
    }

    public MessageInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public MessageInputView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ MessageInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
