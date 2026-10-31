package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class w20 extends StateListAnimatorButton implements tlv {
    public final AttributeSet g;
    public final int h;
    public final int i;

    public w20(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.g = attributeSet;
        this.h = i;
        this.i = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setAppearance(kfc kfcVar) {
        int i;
        if (getBtnTintList() != -1) {
            ColorStateList colorStateListE = x74.E(getContext(), getBtnTintList());
            WeakHashMap weakHashMap = b8k1.a;
            setBackgroundTintList(colorStateListE);
        }
        int iOrdinal = kfcVar.ordinal();
        if (iOrdinal == 0) {
            i = 2132018004;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            i = 2132018007;
        }
        setTextAppearance(i);
        if (getTextTintList() != -1) {
            setTextColor(x74.E(getContext(), getTextTintList()));
        } else {
            if (getTextColorAttr() == -1) {
                eg.m("Either textTintList or textColorAttr must be defined");
                return;
            }
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(getTextColorAttr(), typedValue, true);
            setTextColor(typedValue.data);
        }
    }

    private final void setButtonSize(kfc kfcVar) {
        setDimensions(kfcVar);
        setAppearance(kfcVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setDimensions(kfc kfcVar) {
        int i;
        int i2;
        Resources resources = getContext().getResources();
        int iOrdinal = kfcVar.ordinal();
        if (iOrdinal == 0) {
            i = 2131165719;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            i = 2131165720;
        }
        setMinimumHeight(resources.getDimensionPixelSize(i));
        Resources resources2 = getContext().getResources();
        int iOrdinal2 = kfcVar.ordinal();
        if (iOrdinal2 == 0) {
            i2 = 2131165721;
        } else {
            if (iOrdinal2 != 1) {
                eg.o();
                return;
            }
            i2 = 2131165722;
        }
        int dimensionPixelSize = resources2.getDimensionPixelSize(i2);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Object obj) {
        setText((String) obj);
    }

    /* JADX INFO: renamed from: getActionButtonBackground$src_main_java_com_spotify_encoremobile_buttons_buttons */
    public abstract int getActionButtonBackground();

    /* JADX INFO: renamed from: getBtnTintList$src_main_java_com_spotify_encoremobile_buttons_buttons */
    public abstract int getBtnTintList();

    /* JADX INFO: renamed from: getTextColorAttr$src_main_java_com_spotify_encoremobile_buttons_buttons */
    public abstract int getTextColorAttr();

    /* JADX INFO: renamed from: getTextTintList$src_main_java_com_spotify_encoremobile_buttons_buttons */
    public abstract int getTextTintList();

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        setGravity(17);
        setSingleLine(true);
        setBackground(f0o1.j(getContext(), getActionButtonBackground()));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(this.g, knz0.a, this.h, this.i);
        setButtonSize(kfc.values()[typedArrayObtainStyledAttributes.getInt(0, 0)]);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new v20(iu30Var, (byte) 0));
    }
}
