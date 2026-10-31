package p;

import android.widget.SeekBar;
import com.spotify.encoremobile.widgets.CancellableSeekBar;
import com.spotify.nowplayingmini.uicomponents.seekbar.FadingSeekBarView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hh10 implements shd {
    public final /* synthetic */ FadingSeekBarView a;

    public hh10(FadingSeekBarView fadingSeekBarView) {
        this.a = fadingSeekBarView;
    }

    public final void a(CancellableSeekBar cancellableSeekBar) {
        FadingSeekBarView fadingSeekBarView = this.a;
        bm51 bm51Var = fadingSeekBarView.X0;
        if (bm51Var != null) {
            gh10 gh10Var = (gh10) bm51Var;
            FadingSeekBarView fadingSeekBarView2 = gh10Var.j;
            if (fadingSeekBarView2 == null) {
                u890.C("viewBinder");
                throw null;
            }
            fadingSeekBarView2.setPositionText(gh10Var.h);
            gh10Var.i = false;
        }
        fadingSeekBarView.setTimestampsVisible(false);
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        bm51 bm51Var;
        if (!z || (bm51Var = this.a.X0) == null) {
            return;
        }
        ((gh10) bm51Var).a(i, true);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a.setTimestampsVisible(true);
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        FadingSeekBarView fadingSeekBarView = this.a;
        bm51 bm51Var = fadingSeekBarView.X0;
        if (bm51Var != null) {
            ((gh10) bm51Var).a(seekBar.getProgress(), false);
        }
        fadingSeekBarView.setTimestampsVisible(false);
    }
}
