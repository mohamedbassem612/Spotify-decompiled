package p;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class uaa extends AppCompatImageView {
    public static final /* synthetic */ mma0[] f = {new een0(uaa.class, "isIconActive", "isIconActive()Z", 0), new een0(uaa.class, "shouldUseSmallGlyph", "getShouldUseSmallGlyph()Z", 0)};
    public final be0 d;
    public final ce0 e;

    public uaa(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.d = new be0(this);
        this.e = new ce0(this);
        setImageResource(i2);
        int dimension = (int) getResources().getDimension(2131165821);
        setMinimumWidth(dimension);
        setMinimumHeight(dimension);
        if (getImageTintList() == null) {
            setImageTintList(x74.E(getContext(), 2131101373));
        }
        setIconActive(tro1.z(getContext(), attributeSet, i).a);
    }

    private final boolean getShouldUseSmallGlyph() {
        mma0 mma0Var = f[1];
        return ((Boolean) ((sgp0) this.e).a).booleanValue();
    }

    private final void setShouldUseSmallGlyph(boolean z) {
        this.e.c(f[1], this, Boolean.valueOf(z));
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        ArrayList arrayList = new ArrayList();
        mma0 mma0Var = f[0];
        if (((Boolean) ((sgp0) this.d).a).booleanValue()) {
            arrayList.add(2130970302);
        }
        if (getShouldUseSmallGlyph()) {
            arrayList.add(2130970308);
        }
        return !arrayList.isEmpty() ? View.mergeDrawableStates(super.onCreateDrawableState(arrayList.size() + i), o7h.k1(arrayList)) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof saa)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        saa saaVar = (saa) parcelable;
        super.onRestoreInstanceState(saaVar.a());
        setIconActive(saaVar.b());
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            return parcelableOnSaveInstanceState;
        }
        saa saaVar = new saa(parcelableOnSaveInstanceState);
        mma0 mma0Var = f[0];
        saaVar.g(((Boolean) ((sgp0) this.d).a).booleanValue());
        return saaVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ImageView.ScaleType scaleType = getScaleType();
        int i5 = scaleType == null ? -1 : taa.a[scaleType.ordinal()];
        mmr0 mmr0Var = (i5 == 1 || i5 == 2) ? new mmr0(Integer.valueOf(i), Integer.valueOf(i2)) : new mmr0(Integer.valueOf((i - getPaddingStart()) - getPaddingEnd()), Integer.valueOf((i2 - getPaddingBottom()) - getPaddingTop()));
        setShouldUseSmallGlyph(azo1.u(Math.min(((Number) mmr0Var.a).intValue(), ((Number) mmr0Var.b).intValue()), getResources()));
    }

    public final void setIconActive(boolean z) {
        this.d.c(f[0], this, Boolean.valueOf(z));
    }
}
