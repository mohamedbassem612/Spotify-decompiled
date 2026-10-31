package p;

import android.view.View;
import android.webkit.WebView;
import com.spotify.nowplaying.scroll.view.NowPlayingScrollView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yl7 implements View.OnScrollChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yl7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                tl7.f((pgr) obj2, i2 - i4, (Float) null, ((NowPlayingScrollView) obj).getResources().getDisplayMetrics().density, 6);
                break;
            default:
                if (!((WebView) obj2).canScrollVertically(1)) {
                    ((Function0) obj).invoke();
                }
                break;
        }
    }
}
