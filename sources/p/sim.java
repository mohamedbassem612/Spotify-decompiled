package p;

import android.content.Context;
import android.view.View;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sim extends zaz {
    public final afm c;

    public sim(Context context) {
        super(context);
        this.c = afm.T0;
    }

    @Override // p.zaz
    public final View a() {
        return new ContextMenuButton(getContext(), null, 0, 6, null);
    }

    @Override // p.zaz
    public iu30 getActionModelExtractor() {
        return this.c;
    }
}
