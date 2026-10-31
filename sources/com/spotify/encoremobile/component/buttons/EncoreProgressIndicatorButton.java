package com.spotify.encoremobile.component.buttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.eix;
import p.i5;
import p.jxx;
import p.lcg;
import p.mnz0;
import p.ncg;
import p.nwx;
import p.o7h;
import p.omz0;
import p.s980;
import p.scg;
import p.ucg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@adt
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R*\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/spotify/encoremobile/component/buttons/EncoreProgressIndicatorButton;", "Lcom/spotify/encoremobile/component/buttons/EncoreButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "icon", "Lp/rih1;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "getIcon", "()Landroid/graphics/drawable/Drawable;", "", "value", "Y0", "Z", "getShowProgressIndicator", "()Z", "setShowProgressIndicator", "(Z)V", "showProgressIndicator", "p/nwx", "src_main_java_com_spotify_encoremobile_component_buttons-buttons"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EncoreProgressIndicatorButton extends EncoreButton {

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    public boolean showProgressIndicator;
    public final jxx Z0;
    public Drawable a1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View, com.google.android.material.button.MaterialButton, com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public EncoreProgressIndicatorButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, (eix) null, 8, (DefaultConstructorMarker) null);
        Context context2 = getContext();
        int i2 = scg.O0;
        ucg ucgVar = new ucg(context2, attributeSet, i);
        lcg lcgVar = new lcg(ucgVar);
        lcgVar.c = 1;
        jxx jxxVar = new jxx(new s980(context2, ucgVar, lcgVar, new ncg(ucgVar)));
        jxxVar.d = new int[0];
        this.Z0 = jxxVar;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, mnz0.a, i, 0);
        setShowProgressIndicator(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, omz0.u, i, 0);
        this.a1 = typedArrayObtainStyledAttributes2.getDrawable(10);
        typedArrayObtainStyledAttributes2.recycle();
        super/*com.google.android.material.button.MaterialButton*/.setIcon((Drawable) (this.showProgressIndicator ? jxxVar : this.a1));
    }

    /* JADX INFO: renamed from: getIcon, reason: from getter */
    public Drawable getA1() {
        return this.a1;
    }

    public final boolean getShowProgressIndicator() {
        return this.showProgressIndicator;
    }

    public final int[] onCreateDrawableState(int i) {
        ArrayList arrayList = new ArrayList();
        if (this.showProgressIndicator) {
            arrayList.add(2130970307);
        }
        return !arrayList.isEmpty() ? View.mergeDrawableStates(super.onCreateDrawableState(arrayList.size() + i), o7h.k1(arrayList)) : super.onCreateDrawableState(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof nwx)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        nwx nwxVar = (nwx) parcelable;
        super.onRestoreInstanceState(((i5) nwxVar).a);
        setShowProgressIndicator(nwxVar.c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, p.i5, p.nwx] */
    public final Parcelable onSaveInstanceState() {
        ?? nwxVar = new nwx(super.onSaveInstanceState());
        nwxVar.c = this.showProgressIndicator;
        return nwxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public void setIcon(Drawable icon) {
        this.a1 = icon;
        ?? r2 = icon;
        if (this.showProgressIndicator) {
            r2 = this.Z0;
        }
        super/*com.google.android.material.button.MaterialButton*/.setIcon((Drawable) r2);
    }

    public final void setShowProgressIndicator(boolean z) {
        this.showProgressIndicator = z;
        super/*com.google.android.material.button.MaterialButton*/.setIcon(z ? this.Z0 : this.a1);
    }

    public EncoreProgressIndicatorButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EncoreProgressIndicatorButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EncoreProgressIndicatorButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 2130969235 : i);
    }
}
