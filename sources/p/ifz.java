package p;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.SeekBar;
import com.spotify.equalizer.uiusecases.equalizerpicker.EqualizerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ifz implements SeekBar.OnSeekBarChangeListener, View.OnTouchListener {
    public final hfz a;
    public int b = 4;
    public boolean c;
    public final /* synthetic */ EqualizerView d;

    public ifz(EqualizerView equalizerView, hfz hfzVar) {
        this.d = equalizerView;
        this.a = hfzVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            hfz hfzVar = this.a;
            int i2 = hfzVar.b;
            boolean z2 = hfzVar.f;
            int i3 = EqualizerView.Y0;
            EqualizerView equalizerView = this.d;
            iu30 iu30Var = equalizerView.W0;
            if (iu30Var != null) {
                iu30Var.invoke(new dfz(i2, i));
            }
            equalizerView.z(z2);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.c = true;
        this.a.f = this.b != 1;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.c = false;
        this.a.f = false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 1 && (parent = view.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        int action2 = motionEvent.getAction();
        this.b = action2;
        if (this.c && action2 != 1) {
            z = true;
        }
        this.a.f = z;
        view.onTouchEvent(motionEvent);
        return true;
    }
}
