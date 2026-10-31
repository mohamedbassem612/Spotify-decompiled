package p;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t4n extends cwb {
    public final y52 Q0;
    public boolean R0;
    public boolean S0;

    public t4n(Context context, y52 y52Var) {
        super(context, 2132017486);
        this.Q0 = y52Var;
    }

    public final void cancel() {
        if (((Boolean) this.Q0.invoke()).booleanValue()) {
            super.cancel();
        } else {
            this.R0 = false;
        }
    }

    public final void dismiss() {
        this.R0 = true;
        if (this.S0) {
            return;
        }
        super/*p.ak5*/.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.R0) {
            this.S0 = true;
            try {
                return super/*android.app.Dialog*/.dispatchTouchEvent(motionEvent);
            } catch (NullPointerException e) {
                n57.g("Failed to dispatch a touch event to a bottom sheet", e);
            } finally {
                this.S0 = false;
                if (this.R0) {
                    super/*p.ak5*/.dismiss();
                }
            }
        }
        return true;
    }
}
