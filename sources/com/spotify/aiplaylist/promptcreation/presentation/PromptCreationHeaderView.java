package com.spotify.aiplaylist.promptcreation.presentation;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.marqueetextview.MarqueeTextView;
import com.spotify.encoremobile.component.icons.IconChevronLeft;
import com.spotify.encoremobile.component.icons.IconMoreAndroid;
import com.spotify.encoremobile.component.icons.IconX;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bhn0;
import p.d37;
import p.eg;
import p.h0x0;
import p.ihc1;
import p.j360;
import p.k360;
import p.l360;
import p.ltx0;
import p.m5n1;
import p.n360;
import p.ntj;
import p.p1f0;
import p.uaa;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u0015J\u001b\u0010\u001e\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c¢\u0006\u0004\b \u0010\u001fJ\u001b\u0010!\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c¢\u0006\u0004\b!\u0010\u001fJ\u001b\u0010\"\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c¢\u0006\u0004\b\"\u0010\u001f¨\u0006#"}, d2 = {"Lcom/spotify/aiplaylist/promptcreation/presentation/PromptCreationHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getDeviceDimensionsInDp", "()F", "", "title", "Lp/rih1;", "setAccessibilityPaneTitle", "(Ljava/lang/String;)V", "", "isUsDisclaimerEnabled", "setLegalDisclaimerText", "(Z)V", "Lp/l360;", "icon", "setNavigationButton", "(Lp/l360;)V", "isOffline", "setMoreOptionsButtonContent", "Lkotlin/Function0;", "onClickListener", "setOnBackClickListener", "(Lkotlin/jvm/functions/Function0;)V", "setOnCloseClickListener", "setMoreOptionsButtonClickListener", "setLegalDisclaimerClickListener", "src_main_java_com_spotify_aiplaylist_promptcreation-promptcreation"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PromptCreationHeaderView extends ConstraintLayout {
    public final p1f0 T0;
    public Function0 U0;
    public Function0 V0;
    public Function0 W0;
    public Function0 X0;

    /* JADX WARN: Multi-variable type inference failed */
    public PromptCreationHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(2131625466, (ViewGroup) this);
        int i2 = 2131429079;
        IconChevronLeft iconChevronLeft = (IconChevronLeft) m5n1.t(this, 2131429079);
        if (iconChevronLeft != null) {
            i2 = 2131429080;
            if (m5n1.t(this, 2131429080) != null) {
                i2 = 2131429082;
                if (m5n1.t(this, 2131429082) != null) {
                    i2 = 2131429083;
                    IconX iconX = (IconX) m5n1.t(this, 2131429083);
                    if (iconX != null) {
                        i2 = 2131429088;
                        View viewT = m5n1.t(this, 2131429088);
                        if (viewT != null) {
                            i2 = 2131429101;
                            if (m5n1.t(this, 2131429101) != null) {
                                i2 = 2131429752;
                                EncoreTextView encoreTextViewT = m5n1.t(this, 2131429752);
                                if (encoreTextViewT != null) {
                                    i2 = 2131430001;
                                    IconMoreAndroid iconMoreAndroid = (IconMoreAndroid) m5n1.t(this, 2131430001);
                                    if (iconMoreAndroid != null) {
                                        i2 = 2131431115;
                                        EncoreTextView encoreTextViewT2 = m5n1.t(this, 2131431115);
                                        if (encoreTextViewT2 != null) {
                                            i2 = 2131431122;
                                            if (m5n1.t(this, 2131431122) != null) {
                                                i2 = 2131431356;
                                                MarqueeTextView marqueeTextViewT = m5n1.t(this, 2131431356);
                                                if (marqueeTextViewT != null) {
                                                    this.T0 = new p1f0(this, iconChevronLeft, iconX, viewT, encoreTextViewT, iconMoreAndroid, encoreTextViewT2, marqueeTextViewT);
                                                    this.X0 = h0x0.t;
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final float getDeviceDimensionsInDp() {
        DisplayMetrics displayMetrics = ((PromptCreationHeaderView) this.T0.a).getContext().getResources().getDisplayMetrics();
        return displayMetrics.heightPixels / displayMetrics.density;
    }

    private final void setAccessibilityPaneTitle(String title) {
        if (Build.VERSION.SDK_INT >= 28) {
            p1f0 p1f0Var = this.T0;
            ((PromptCreationHeaderView) p1f0Var.a).setAccessibilityPaneTitle(String.format(((MarqueeTextView) p1f0Var.h).getContext().getString(2131963346), Arrays.copyOf(new Object[]{title}, 1)));
        }
    }

    private final void setLegalDisclaimerText(boolean isUsDisclaimerEnabled) {
        p1f0 p1f0Var = this.T0;
        if (!isUsDisclaimerEnabled) {
            ((EncoreTextView) p1f0Var.e).setText(((EncoreTextView) p1f0Var.g).getContext().getString(2131957219));
            return;
        }
        ConstraintLayout constraintLayout = (PromptCreationHeaderView) p1f0Var.a;
        EncoreTextView encoreTextView = (EncoreTextView) p1f0Var.e;
        ConstraintLayout constraintLayout2 = (PromptCreationHeaderView) p1f0Var.a;
        String string = constraintLayout.getContext().getString(2131957220);
        String string2 = constraintLayout2.getContext().getString(2131957221);
        int iW0 = ihc1.w0(string, string2, 0, false, 6);
        int length = string2.length() + iW0;
        ntj ntjVar = new ntj(this, (byte) 4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(ntjVar, iW0, length, 0);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(constraintLayout2.getContext().getColor(2131104471)), 0, spannableStringBuilder.length(), 33);
        encoreTextView.setText(spannableStringBuilder);
        encoreTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void setMoreOptionsButtonContent(boolean isOffline) {
        p1f0 p1f0Var = this.T0;
        if (isOffline) {
            uaa uaaVar = (IconMoreAndroid) p1f0Var.f;
            uaa uaaVar2 = (IconMoreAndroid) p1f0Var.f;
            uaaVar.setEnabled(false);
            uaaVar2.setAlpha(0.3f);
            uaaVar2.setOnClickListener(d37.X);
            return;
        }
        uaa uaaVar3 = (IconMoreAndroid) p1f0Var.f;
        uaa uaaVar4 = (IconMoreAndroid) p1f0Var.f;
        uaaVar3.setEnabled(true);
        uaaVar4.setAlpha(1.0f);
        uaaVar4.setOnClickListener(new ltx0(this, (byte) 0));
    }

    private final void setNavigationButton(l360 icon) {
        int iOrdinal = icon.ordinal();
        p1f0 p1f0Var = this.T0;
        if (iOrdinal == 0) {
            ((IconX) p1f0Var.c).setOnClickListener(new ltx0(this, (byte) 1));
            ((IconChevronLeft) p1f0Var.b).setVisibility(8);
            ((IconX) p1f0Var.c).setVisibility(0);
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            ((IconChevronLeft) p1f0Var.b).setOnClickListener(new ltx0(this, (byte) 2));
            ((IconChevronLeft) p1f0Var.b).setVisibility(0);
            ((IconX) p1f0Var.c).setVisibility(8);
        }
    }

    public final void setLegalDisclaimerClickListener(Function0 onClickListener) {
        this.X0 = onClickListener;
    }

    public final void setMoreOptionsButtonClickListener(Function0 onClickListener) {
        this.W0 = onClickListener;
    }

    public final void setOnBackClickListener(Function0 onClickListener) {
        this.U0 = onClickListener;
    }

    public final void setOnCloseClickListener(Function0 onClickListener) {
        this.V0 = onClickListener;
    }

    public final void y(boolean z, n360 n360Var, boolean z2) {
        p1f0 p1f0Var = this.T0;
        View view = (View) p1f0Var.d;
        EncoreTextView encoreTextView = (EncoreTextView) p1f0Var.e;
        MarqueeTextView marqueeTextView = (MarqueeTextView) p1f0Var.h;
        EncoreTextView encoreTextView2 = (EncoreTextView) p1f0Var.g;
        view.setVisibility(0);
        if (n360Var instanceof j360) {
            float deviceDimensionsInDp = getDeviceDimensionsInDp();
            Resources resources = encoreTextView2.getContext().getResources();
            j360 j360Var = (j360) n360Var;
            String str = j360Var.b;
            int i = j360Var.a;
            String quantityString = resources.getQuantityString(2131820776, i, Integer.valueOf(i));
            encoreTextView2.setVisibility(0);
            encoreTextView2.setText(quantityString);
            marqueeTextView.setText(str);
            marqueeTextView.setContentDescription(str + " " + quantityString);
            marqueeTextView.setVisibility(0);
            encoreTextView.setVisibility(8);
            if (deviceDimensionsInDp < 400.0f) {
                encoreTextView2.setVisibility(8);
            } else {
                encoreTextView2.setVisibility(0);
            }
        } else if (n360Var instanceof k360) {
            marqueeTextView.setVisibility(8);
            encoreTextView2.setVisibility(8);
            encoreTextView.setVisibility(0);
            setLegalDisclaimerText(z2);
        } else {
            marqueeTextView.setVisibility(8);
            encoreTextView2.setVisibility(8);
            encoreTextView.setVisibility(8);
            ((View) p1f0Var.d).setVisibility(8);
        }
        setMoreOptionsButtonContent(z);
        setAccessibilityPaneTitle(n360Var.c());
        setNavigationButton(n360Var.b());
    }

    public PromptCreationHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PromptCreationHeaderView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PromptCreationHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
