package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p.bhn0;
import p.bnd;
import p.eeo;
import p.ekl1;
import p.feo;
import p.hkd;
import p.mbb0;
import p.mno1;
import p.mrc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class SubtitleView extends FrameLayout {
    public List a;
    public bnd b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    public int g;
    public mrc1 h;
    public View i;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.EMPTY_LIST;
        this.b = bnd.g;
        this.c = 0.0533f;
        this.d = 0.08f;
        this.e = true;
        this.f = true;
        hkd hkdVar = new hkd(context, 0);
        this.h = hkdVar;
        this.i = hkdVar;
        addView(hkdVar);
        this.g = 1;
    }

    private List<feo> getCuesWithStylingPreferencesApplied() {
        if (this.e && this.f) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (int i = 0; i < this.a.size(); i++) {
            eeo eeoVarA = ((feo) this.a.get(i)).a();
            if (!this.e) {
                eeoVarA.n = false;
                CharSequence charSequence = eeoVarA.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        eeoVarA.c(SpannableString.valueOf(charSequence));
                    }
                    CharSequence charSequence2 = eeoVarA.a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof mbb0)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                mno1.v(eeoVarA);
            } else if (!this.f) {
                mno1.v(eeoVarA);
            }
            arrayList.add(eeoVarA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private bnd getUserCaptionStyle() {
        CaptioningManager captioningManager;
        boolean zIsInEditMode = isInEditMode();
        bnd bndVar = bnd.g;
        if (zIsInEditMode || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return bndVar;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        return new bnd(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
    }

    private <T extends View & mrc1> void setView(T t) {
        removeView(this.i);
        View view = this.i;
        if (view instanceof ekl1) {
            ((ekl1) view).b.destroy();
        }
        this.i = t;
        this.h = t;
        addView(t);
    }

    public final void a() {
        this.h.a(getCuesWithStylingPreferencesApplied(), this.b, this.c, this.d);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f = z;
        a();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.e = z;
        a();
    }

    public void setBottomPaddingFraction(float f) {
        this.d = f;
        a();
    }

    public void setCues(List<feo> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.a = list;
        a();
    }

    public void setFractionalTextSize(float f) {
        this.c = f;
        a();
    }

    public void setStyle(bnd bndVar) {
        this.b = bndVar;
        a();
    }

    public void setViewType(int i) {
        if (this.g == i) {
            return;
        }
        if (i == 1) {
            setView(new hkd(getContext(), 0));
        } else {
            if (i != 2) {
                bhn0.q();
                return;
            }
            setView(new ekl1(getContext()));
        }
        this.g = i;
    }

    public SubtitleView(Context context) {
        this(context, null);
    }
}
