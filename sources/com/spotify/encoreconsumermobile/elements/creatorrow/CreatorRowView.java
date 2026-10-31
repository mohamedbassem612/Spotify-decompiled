package com.spotify.encoreconsumermobile.elements.creatorrow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.facepile.FaceView;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b2u;
import p.b8k1;
import p.iu30;
import p.p3o;
import p.td6;
import p.tlv;
import p.v20;
import p.v9w0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/creatorrow/CreatorRowView;", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/p3o;", "viewContext", "Lp/rih1;", "setViewContext", "(Lp/p3o;)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "src_main_java_com_spotify_encoreconsumermobile_elements_creatorrow-creatorrow"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CreatorRowView extends ConstraintLayout implements tlv {
    /* JADX WARN: Multi-variable type inference failed */
    public CreatorRowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, 2131624488, this);
        TextView textView = (TextView) b8k1.n(this, 2131428283);
        v9w0 v9w0VarO = b2u.o((FaceView) b8k1.n(this, 2131428820));
        Collections.addAll(v9w0VarO.c, textView);
        v9w0VarO.a();
    }

    public final void f(Object obj) {
        throw td6.k(obj);
    }

    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new v20(iu30Var, (byte) 23));
    }

    public final void setViewContext(p3o viewContext) {
    }

    public CreatorRowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CreatorRowView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CreatorRowView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
