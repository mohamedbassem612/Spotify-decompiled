package p;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.transcript.list.TranscriptListView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ukd implements Runnable {
    public final /* synthetic */ byte a;
    public final int b;
    public final Object c;

    public ukd(efp1 efp1Var, sgp1 sgp1Var, int i) {
        this.a = (byte) 7;
        this.c = sgp1Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vkd vkdVar = (vkd) this.c;
                if (this.b == vkdVar.r1) {
                    vkdVar.p1 = true;
                    vkdVar.M();
                    break;
                }
                break;
            case 1:
                Rect rect = new Rect();
                wj3 wj3Var = (wj3) this.c;
                PlayButtonView playButtonView = (PlayButtonView) wj3Var.X;
                playButtonView.getHitRect(rect);
                int i = rect.top;
                int i2 = this.b;
                rect.top = i - i2;
                rect.left -= i2;
                rect.bottom += i2;
                rect.right += i2;
                ((ConstraintLayout) wj3Var.b).setTouchDelegate(new TouchDelegate(rect, playButtonView));
                break;
            case 2:
                ((sx20) this.c).b.onAudioFocusChange(this.b);
                break;
            case 3:
                ((zbh0) this.c).M1.y0(this.b);
                break;
            case 4:
                nbg1 scroller = ((TranscriptListView) ((vh) this.c).b).getScroller();
                int i3 = this.b;
                int height = scroller.a.getHeight();
                LinearLayoutManager linearLayoutManagerA = scroller.a();
                View viewD = linearLayoutManagerA != null ? linearLayoutManagerA.D(i3) : null;
                int height2 = viewD != null ? (height / 2) - (viewD.getHeight() / 2) : height / 4;
                LinearLayoutManager linearLayoutManagerA2 = scroller.a();
                if (linearLayoutManagerA2 != null) {
                    linearLayoutManagerA2.w1(i3, height2);
                }
                break;
            case 5:
                ((RecyclerView) this.c).y0(this.b);
                break;
            case 6:
                ((h8n1) this.c).b(this.b);
                break;
            default:
                ((sgp1) this.c).D.b(this.b);
                break;
        }
    }

    public /* synthetic */ ukd(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public ukd(int i, g570 g570Var) {
        this.a = (byte) 5;
        this.b = i;
        this.c = g570Var;
    }
}
