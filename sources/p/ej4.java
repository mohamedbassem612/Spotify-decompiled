package p;

import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ej4 implements f620 {
    public final AutofillValue a;

    public ej4(AutofillValue autofillValue) {
        this.a = autofillValue;
    }

    public final Boolean a() {
        if (this.a.isToggle()) {
            return Boolean.valueOf(this.a.getToggleValue());
        }
        return null;
    }

    public final CharSequence b() {
        if (this.a.isText()) {
            return this.a.getTextValue();
        }
        return null;
    }
}
