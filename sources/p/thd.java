package p;

import android.widget.SeekBar;
import com.spotify.encoremobile.widgets.CancellableSeekBar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class thd implements shd {
    public final /* synthetic */ byte a;
    public boolean b;
    public final Object c;

    public /* synthetic */ thd(Object obj, byte b) {
        this.a = b;
        this.c = obj;
    }

    @Override // p.shd
    public final void a(CancellableSeekBar cancellableSeekBar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = (SeekBar.OnSeekBarChangeListener) obj;
                if (onSeekBarChangeListener instanceof shd) {
                    ((shd) onSeekBarChangeListener).a(cancellableSeekBar);
                }
                break;
            default:
                ((wrs) obj).invoke(a0g1.a);
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((SeekBar.OnSeekBarChangeListener) obj).onProgressChanged(seekBar, i, z);
                break;
            default:
                if (z) {
                    ((wrs) obj).invoke(this.b ? new c0g1(i) : new b0g1(i));
                }
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((SeekBar.OnSeekBarChangeListener) obj).onStartTrackingTouch(seekBar);
                break;
            default:
                this.b = true;
                ((wrs) obj).invoke(d0g1.a);
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (!this.b) {
                    ((SeekBar.OnSeekBarChangeListener) obj).onStopTrackingTouch(seekBar);
                } else {
                    this.b = false;
                }
                break;
            default:
                this.b = false;
                ((wrs) obj).invoke(new b0g1(seekBar.getProgress()));
                break;
        }
    }
}
