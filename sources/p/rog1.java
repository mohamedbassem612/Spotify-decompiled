package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.widgets.widgetstate.WidgetState;
import com.spotify.widgets.widgetstate.WidgetStateKt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rog1 extends hab0 implements vu30 {
    public final /* synthetic */ kx5 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ sog1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rog1(kx5 kx5Var, boolean z, sog1 sog1Var) {
        super(2);
        this.a = kx5Var;
        this.b = z;
        this.c = sog1Var;
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
            StringBuilder sb = new StringBuilder("[TranssionCardWidget] provideContent: id=");
            sb.append(this.a);
            sb.append(", isCard=");
            boolean z = this.b;
            sb.append(z);
            sb.append(", state=");
            sb.append(loadingState);
            Logger.g(sb.toString(), new Object[0]);
            this.c.h(loadingState, z, b0kVar2, 0);
        } else {
            b0kVar2.b0();
        }
        return rih1.a;
    }
}
