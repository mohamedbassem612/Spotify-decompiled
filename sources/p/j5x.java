package p;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j5x extends tho1 {
    public final /* synthetic */ byte c = 0;
    public final WeakReference d;

    public j5x(EditText editText) {
        this.d = new WeakReference(editText);
    }

    public void r() {
        switch (this.c) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.d.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    public final void s() {
        byte b = this.c;
        WeakReference weakReference = this.d;
        switch (b) {
            case 0:
                k5x.a((EditText) weakReference.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) weakReference.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    public j5x(SwitchCompat switchCompat) {
        this.d = new WeakReference(switchCompat);
    }
}
