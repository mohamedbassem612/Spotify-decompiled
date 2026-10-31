package p;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.playbacknative.AudioDriver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xt7 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xt7(Object obj, boolean z, byte b) {
        super(0);
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0124  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public final Object invoke() {
        View view = null;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        boolean z = false;
        z = false;
        boolean z2 = false;
        byte b = 1;
        switch (this.a) {
            case 0:
                if (!AudioDriver.sUsingOboe) {
                    return new tt7();
                }
                be beVar = new be(new CosmosTransport(new sn0((RxRouter) this.c, (byte) 1)));
                return this.b ? new r5u(beVar, ezt0.a, b) : new r5u(beVar, yt7.a, i);
            case 1:
                kq9 kq9Var = (this.b || ((Configuration) this.c).orientation != 2) ? kq9.a : kq9.c;
                return v8r.q(new go9(kq9Var, kq9Var.a()));
            case 2:
                cug cugVar = (cug) this.c;
                boolean z3 = this.b;
                cugVar.i = z3;
                VideoSurfaceView videoSurfaceView = cugVar.e;
                if (videoSurfaceView != null) {
                    videoSurfaceView.setKeepScreenOn(z3);
                }
                return rih1.a;
            case 3:
                bvt bvtVar = (bvt) this.c;
                boolean z4 = this.b;
                bvtVar.d = Boolean.valueOf(z4);
                ArrayList arrayList = bvtVar.e;
                if (!z4) {
                    return z6x.a;
                }
                List listL1 = o7h.l1(arrayList);
                arrayList.clear();
                return listL1;
            case 4:
                RecyclerView recyclerView = (RecyclerView) this.c;
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                boolean z5 = this.b;
                int i2 = 0;
                while (i2 < recyclerView.getChildCount()) {
                    int i3 = i2 + 1;
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt == null) {
                        tw20.p();
                        return null;
                    }
                    if (RecyclerView.R(childAt) == z5) {
                        view = childAt;
                        return new ds41(iComputeVerticalScrollOffset, view != null ? yap1.l(view, recyclerView) : 0);
                    }
                    i2 = i3;
                }
                return new ds41(iComputeVerticalScrollOffset, view != null ? yap1.l(view, recyclerView) : 0);
            case 5:
                if (this.b && !((w3x) ((ipe0) this.c).c).a) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 6:
                p7h0 p7h0Var = ((n7h0) this.c).k;
                boolean z6 = this.b;
                p7h0Var.Y = true;
                p7h0Var.Z = z6;
                p7h0Var.X = true;
                return rih1.a;
            case 7:
                if (this.b) {
                    twn0 twn0Var = (twn0) this.c;
                    yun0 yun0Var = twn0Var.b;
                    th30 th30Var = twn0Var.k;
                    if (!th30Var.L && !th30Var.U() && yun0Var.h() == null && yun0Var.i().isEmpty() && yun0Var.l().isEmpty()) {
                        List listU = th30Var.c.u();
                        if ((listU instanceof Collection) && listU.isEmpty()) {
                            z = true;
                        } else {
                            Iterator it = listU.iterator();
                            while (it.hasNext()) {
                                if (((zf30) it.next()).q0()) {
                                }
                            }
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                String str = nik1.X0.a;
                su61 su61Var = (su61) this.c;
                i8h1 i8h1Var = su61Var.b;
                x6h1 x6h1VarC = su61Var.e.b.c();
                x6h1VarC.i.add(new a7h1("search_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                tv80 tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str == null ? "" : str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                boolean z7 = this.b;
                lzn0 lzn0Var = su61Var.a;
                if (z7) {
                    lzn0Var.e();
                } else {
                    lzn0Var.a(str, tv80VarM, (Bundle) null);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xt7(boolean z, Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = z;
        this.c = obj;
    }
}
