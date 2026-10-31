package com.spotify.checkout.elements.utils;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bhn0;
import p.ce0;
import p.een0;
import p.m5n1;
import p.mma0;
import p.sgp0;
import p.xga1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/spotify/checkout/elements/utils/AdditionalInfoView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "", "<set-?>", "b", "Ljava/lang/Object;", "getInfo", "()Ljava/util/List;", "setInfo", "(Ljava/util/List;)V", "info", "src_main_java_com_spotify_checkout_elements-elements"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AdditionalInfoView extends FrameLayout {
    public static final /* synthetic */ mma0[] c = {new een0(AdditionalInfoView.class, "info", "getInfo()Ljava/util/List;", 0)};
    public final xga1 a;
    public final ce0 b;

    public AdditionalInfoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(2131626316, this);
        TextView textView = (TextView) m5n1.t(this, 2131427526);
        if (textView == null) {
            bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(2131427526)));
            throw null;
        }
        this.a = new xga1(this, textView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.b = new ce0(this);
    }

    public final List<String> getInfo() {
        mma0 mma0Var = c[0];
        return (List) ((sgp0) this.b).a;
    }

    public final void setInfo(List<String> list) {
        this.b.c(c[0], this, list);
    }

    public AdditionalInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public AdditionalInfoView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public AdditionalInfoView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ AdditionalInfoView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
