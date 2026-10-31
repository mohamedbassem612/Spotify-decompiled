package p;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.spotify.encoremobile.tooltip.TooltipContainer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ica implements View.OnTouchListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;

    public ica(TooltipContainer tooltipContainer, jj11 jj11Var) {
        this.b = tooltipContainer;
        this.c = jj11Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.a;
        TooltipContainer tooltipContainer = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                tooltipContainer.setOnTouchListener(null);
                ((jj11) obj).h();
                break;
            default:
                jav javVar = (jav) obj;
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - javVar.l;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        javVar.j = false;
                    }
                    javVar.f((AutoCompleteTextView) tooltipContainer);
                }
                break;
        }
        return false;
    }

    public ica(jav javVar, AutoCompleteTextView autoCompleteTextView) {
        this.c = javVar;
        this.b = autoCompleteTextView;
    }
}
