package com.spotify.encoremobile.component.buttons;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.azo1;
import p.da30;
import p.eix;
import p.o7h;
import p.tro1;
import p.x74;
import p.ycn0;
import p.zcx;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@adt
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0017B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/spotify/encoremobile/component/buttons/EncoreButton;", "Lcom/google/android/material/button/MaterialButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lp/eix;", "flags", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILp/eix;)V", "", "value", "W0", "Z", "isIconActive", "()Z", "setIconActive", "(Z)V", "X0", "setShouldUseSmallGlyph", "shouldUseSmallGlyph", "p/zcx", "src_main_java_com_spotify_encoremobile_component_buttons-buttons"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public class EncoreButton extends MaterialButton {

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    public boolean isIconActive;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    public boolean shouldUseSmallGlyph;

    public EncoreButton(Context context, AttributeSet attributeSet, int i, eix eixVar) {
        super(context, attributeSet, i);
        da30.b(this, attributeSet, i);
        setIconActive(tro1.z(getContext(), attributeSet, i).a);
        setShouldUseSmallGlyph(azo1.u(getIconSize(), getResources()));
        if (((Boolean) ycn0.b.getValue()).booleanValue()) {
            Integer numValueOf = attributeSet != null ? Integer.valueOf(attributeSet.getStyleAttribute()) : null;
            if ((numValueOf != null && numValueOf.intValue() == 2132017551) || ((numValueOf != null && numValueOf.intValue() == 2132017553) || ((numValueOf != null && numValueOf.intValue() == 2132017555) || ((numValueOf != null && numValueOf.intValue() == 2132017552) || ((numValueOf != null && numValueOf.intValue() == 2132017554) || (numValueOf != null && numValueOf.intValue() == 2132017556)))))) {
                setStrokeColor(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}}, new int[]{0}));
                setBackgroundTintList(x74.E(context, 2131101351));
            }
        }
    }

    private final void setShouldUseSmallGlyph(boolean z) {
        if (z != this.shouldUseSmallGlyph) {
            refreshDrawableState();
        }
        this.shouldUseSmallGlyph = z;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        ArrayList arrayList = new ArrayList();
        if (this.isIconActive) {
            arrayList.add(2130970302);
        }
        if (this.shouldUseSmallGlyph) {
            arrayList.add(2130970308);
        }
        return !arrayList.isEmpty() ? View.mergeDrawableStates(super.onCreateDrawableState(arrayList.size() + i), o7h.k1(arrayList)) : super.onCreateDrawableState(i);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof zcx)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        zcx zcxVar = (zcx) parcelable;
        super.onRestoreInstanceState(zcxVar.a());
        setIconActive(zcxVar.b());
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        zcx zcxVar = new zcx(super.onSaveInstanceState());
        zcxVar.g(this.isIconActive);
        return zcxVar;
    }

    public final void setIconActive(boolean z) {
        if (z != this.isIconActive) {
            this.isIconActive = z;
            refreshDrawableState();
        }
    }

    @Override // p.kj5, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        da30.a(this, i);
    }

    public EncoreButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
    }

    public EncoreButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, null);
    }

    public EncoreButton(Context context) {
        this(context, null, 0, null, 14, null);
    }

    public /* synthetic */ EncoreButton(Context context, AttributeSet attributeSet, int i, eix eixVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 2130969235 : i, (i2 & 8) != 0 ? ycn0.a : eixVar);
    }
}
