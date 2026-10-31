package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.encoreconsumermobile.elements.markasplayed.MarkAsPlayedButtonView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gsg0 extends zaz {
    public final wlg0 c;

    public gsg0(Context context) {
        super(context);
        this.c = wlg0.c1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a() {
        return new MarkAsPlayedButtonView(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    public iu30 getActionModelExtractor() {
        return this.c;
    }
}
