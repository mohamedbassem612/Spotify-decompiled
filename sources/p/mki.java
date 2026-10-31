package p;

import com.spotify.widgets.widgetstate.WidgetState;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mki extends hab0 implements xu30 {
    public static final mki a = new mki(3);

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        WidgetState widgetState = (WidgetState) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (widgetState instanceof WidgetState.ActiveSession) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1744923221);
            ye0.a((WidgetState.ActiveSession) widgetState, null, x340Var2, iIntValue & 14);
            x340Var2.r(false);
        } else if (widgetState instanceof WidgetState.InactiveSession) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1744926061);
            w780.b((WidgetState.InactiveSession) widgetState, null, x340Var3, iIntValue & 14);
            x340Var3.r(false);
        } else if (widgetState instanceof WidgetState.LoadingState) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(1744928528);
            t5p1.c(x340Var4, 0);
            x340Var4.r(false);
        } else if (widgetState instanceof WidgetState.TapToReload) {
            x340 x340Var5 = x340Var;
            x340Var5.i0(1744930068);
            j0p1.g(x340Var5, 0);
            x340Var5.r(false);
        } else if (widgetState instanceof WidgetState.Unauthenticated) {
            x340 x340Var6 = x340Var;
            x340Var6.i0(-1741672988);
            Object objT = x340Var6.T();
            if (objT == fkj0.X) {
                objT = ovh.Z0;
                x340Var6.s0(objT);
            }
            WidgetState.Unauthenticated unauthenticated = (WidgetState.Unauthenticated) widgetState;
            afh1.a(unauthenticated, iko1.x(et40.a, (iu30) objT), x340Var6, iIntValue & 14);
            x340Var6.r(false);
        } else if (widgetState instanceof WidgetState.Custom) {
            x340 x340Var7 = x340Var;
            x340Var7.i0(1744938129);
            fq7.w((gt40) null, x340Var7, 0);
            x340Var7.r(false);
        } else if (widgetState instanceof WidgetState.WrappedPlaylist) {
            x340 x340Var8 = x340Var;
            x340Var8.i0(1744939819);
            x340Var8.r(false);
        } else {
            if (!(widgetState instanceof WidgetState.WrappedStory)) {
                throw p3d1.k(x340Var, 1744921798, false);
            }
            x340 x340Var9 = x340Var;
            x340Var9.i0(1744941227);
            x340Var9.r(false);
        }
        return rih1.a;
    }
}
