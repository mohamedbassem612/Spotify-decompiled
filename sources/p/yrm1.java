package p;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.transcript.uiusecases.zoomimageview.ZoomViewArea;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yrm1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yrm1(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                zrm1 zrm1Var = (zrm1) obj;
                luk lukVar = zrm1Var.e;
                if (lukVar != null) {
                    return lukVar.e(new e4n0(zrm1Var, (byte) 22));
                }
                return null;
            case 1:
                zum1 zum1Var = (zum1) obj;
                luk lukVar2 = zum1Var.b;
                if (lukVar2 != null) {
                    return lukVar2.e(new e4n0(zum1Var, (byte) 23));
                }
                return null;
            case 2:
                dvm1 dvm1Var = (dvm1) obj;
                luk lukVar3 = dvm1Var.c;
                if (lukVar3 != null) {
                    return lukVar3.e(new e4n0(dvm1Var, (byte) 24));
                }
                return null;
            case 3:
                fvm1 fvm1Var = (fvm1) obj;
                luk lukVar4 = fvm1Var.p;
                if (lukVar4 != null) {
                    return lukVar4.e(new c44(fvm1Var, (byte) 17));
                }
                return null;
            case 4:
                lym1 lym1Var = (lym1) obj;
                kly0 kly0Var = lym1Var.a;
                bw20 bw20Var = lym1Var.e;
                if (!((wpv0) kly0Var.get()).b.m()) {
                    return new huz((Object) null, (byte) 10);
                }
                mr20 mr20VarA = bw20Var.a("employee", false);
                bw20 bw20Var2 = bw20Var;
                return hu20.e(rqt0.u(h5p1.r(mr20VarA, bw20Var2.a("restrict-settings-for-child", false), bw20Var2.a("is-standalone-audiobooks", false), new any(rqt0.u(new any(bw20Var2.c("type", ""), (byte) 19)), (byte) 21), jym1.h)), new afb1((lnm) null, lym1Var, (byte) 22));
            case 5:
                return Boolean.valueOf(((vzm1) obj).d.b());
            case 6:
                return Boolean.valueOf(((yzm1) obj).d.b());
            case 7:
                f3n1 f3n1Var = (f3n1) obj;
                luk lukVar5 = f3n1Var.b;
                if (lukVar5 != null) {
                    return lukVar5.e(new e4n0(f3n1Var, (byte) 25));
                }
                return null;
            case 8:
                return new d4n1(new zm41((dn41) obj, dw81.Z0, (iu30) null, z691.N0, w0n0.d1, (Function0) null, 100));
            default:
                RecyclerView zoomParentView = ((ZoomViewArea) obj).getZoomParentView();
                if (zoomParentView instanceof RecyclerView) {
                    return new f711(zoomParentView, (byte) 0);
                }
                if (zoomParentView instanceof ViewGroup) {
                    return new f711((ViewGroup) zoomParentView, (byte) 1);
                }
                throw new IllegalStateException("Unsupported type " + (zoomParentView != null ? zoomParentView.getClass() : null) + ", it must be ViewGroup or RecyclerView.");
        }
    }
}
