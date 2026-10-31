package p;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w3c1 extends View {
    public final GestureDetector a;
    public iu30 b;
    public boolean c;

    public w3c1(Context context) {
        super(context);
        this.a = new GestureDetector(getContext(), new z62(this, (byte) 1));
        setId(2131431102);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.c && motionEvent.getAction() == 0) {
            iu30 iu30Var = this.b;
            if (iu30Var != null) {
                iu30Var.invoke(m7c1.a);
            }
            this.c = true;
        }
        if (this.c && 1 == motionEvent.getAction()) {
            iu30 iu30Var2 = this.b;
            if (iu30Var2 != null) {
                iu30Var2.invoke(m7c1.b);
            }
            this.c = false;
        }
        if (this.a.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setStoryGestureListener(iu30 iu30Var) {
        this.b = iu30Var;
    }
}
