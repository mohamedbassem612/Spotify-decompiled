package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oj5 {
    public final CompoundButton a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public oj5(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.a;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.d) {
                    drawableMutate.setTintList(this.b);
                }
                if (this.e) {
                    drawableMutate.setTintMode(this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.a;
        Context context = compoundButton.getContext();
        int[] iArr = moz0.m;
        lvc1 lvc1VarE = lvc1.E(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) lvc1VarE.c;
        b8k1.o(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) lvc1VarE.c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(f0o1.j(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(f0o1.j(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(f0o1.j(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(lvc1VarE.g(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(a8v.c(typedArray.getInt(3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            lvc1VarE.I();
        }
    }
}
