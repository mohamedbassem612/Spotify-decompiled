package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.widgets.widgetstate.WidgetState;
import com.spotify.widgets.widgetstate.WidgetStateKt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class civ extends hab0 implements vu30 {
    public final /* synthetic */ kx5 a;
    public final /* synthetic */ div b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public civ(kx5 kx5Var, div divVar) {
        super(2);
        this.a = kx5Var;
        this.b = divVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        WidgetState loadingState;
        b0k b0kVar = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        b0k b0kVar2 = (x340) b0kVar;
        if (b0kVar2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            b0kVar2.j0(1333953144);
            b0kVar2.j0(-534706435);
            Object objK = b0kVar2.k(p4k.c);
            if (objK == null) {
                bhn0.i("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
                return null;
            }
            b0kVar2.r(false);
            Object obj3 = ((cen0) objK).a.get(div.l);
            b0kVar2.r(false);
            String str = (String) obj3;
            if (str == null || (loadingState = WidgetStateKt.toWidgetState(str)) == null) {
                loadingState = new WidgetState.LoadingState("");
            }
            WidgetState widgetState = loadingState;
            Logger.g("[DynamicNpvWidget] provideContent: id=" + this.a + ", state=" + widgetState, new Object[0]);
            this.b.f(widgetState, null, null, b0kVar2, 32768, 6);
        } else {
            b0kVar2.b0();
        }
        return rih1.a;
    }
}
