package com.spotify.creativeworkplatform.encore.elements;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b2u;
import p.bhn0;
import p.g47;
import p.gw70;
import p.kba;
import p.m5n1;
import p.td6;
import p.tlv;
import p.v9w0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/spotify/creativeworkplatform/encore/elements/DefaultCreator;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/gw70;", "imageLoader", "Lp/rih1;", "setImageLoader", "(Lp/gw70;)V", "src_main_java_com_spotify_creativeworkplatform_encore-encore"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DefaultCreator extends ConstraintLayout implements tlv {
    public final kba T0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View, com.spotify.creativeworkplatform.encore.elements.ArtworkView] */
    public DefaultCreator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(2131624487, (ViewGroup) this);
        int i2 = 2131427630;
        ?? r2 = (ArtworkView) m5n1.t(this, 2131427630);
        if (r2 != 0) {
            i2 = 2131427687;
            if (m5n1.t(this, 2131427687) != null) {
                i2 = 2131428283;
                TextView textView = (TextView) m5n1.t(this, 2131428283);
                if (textView != null) {
                    this.T0 = new kba(this, (ArtworkView) r2, textView);
                    v9w0 v9w0VarO = b2u.o(r2);
                    Collections.addAll(v9w0VarO.c, textView);
                    v9w0VarO.a();
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void f(Object obj) {
        throw td6.k(obj);
    }

    public final void setImageLoader(gw70 imageLoader) {
        ((ArtworkView) this.T0.b).setViewContext(new g47(imageLoader));
    }

    public DefaultCreator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DefaultCreator(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DefaultCreator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
