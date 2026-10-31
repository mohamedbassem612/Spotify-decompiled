package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.encoreconsumermobile.elements.share.ShareButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ee71 extends zaz {
    public final s571 c;

    public ee71(Context context) {
        super(context);
        this.c = s571.V0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a() {
        return new ShareButton(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    public iu30 getActionModelExtractor() {
        return this.c;
    }
}
