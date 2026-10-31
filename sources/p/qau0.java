package p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qau0 extends hab0 implements Function0 {
    public final /* synthetic */ WidgetState.PlayPauseState a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qau0(WidgetState.PlayPauseState playPauseState, String str, String str2, String str3) {
        super(0);
        this.a = playPauseState;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final Object invoke() {
        int i = pau0.a[this.a.ordinal()];
        String str = this.c;
        String str2 = this.b;
        if (i == 1 || i == 2) {
            return new WidgetInteraction.PlayCommand(str2, str, this.d);
        }
        if (i == 3 || i == 4) {
            return new WidgetInteraction.PauseCommand(str2, str);
        }
        eg.o();
        return null;
    }
}
