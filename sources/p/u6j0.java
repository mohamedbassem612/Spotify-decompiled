package p;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.data.cache.room.MessagesDatabase_Impl;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u6j0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6j0(r3p0 r3p0Var, View view) {
        super(0);
        this.a = (byte) 7;
        this.b = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new nmd((MessagesDatabase_Impl) obj);
            case 1:
                return new SchedulerWorkRunner((Scheduler) obj);
            case 2:
                p1n0 p1n0Var = (p1n0) obj;
                return p1n0Var.i.a(p1n0Var.a, p1n0Var.b, p1n0Var.c, p1n0Var.k().h);
            case 3:
                return ((Observable) ((t1n0) obj).e2.getValue()).map(een.l1).distinctUntilChanged();
            case 4:
                ((bgn0) obj).a.e();
                return rih1Var;
            case 5:
                List list = (List) ((tob1) obj).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((hnn0) obj2).b.e().equals("composable")) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 6:
                return Boolean.valueOf(((rsn0) ((eyn0) obj).g).j());
            case 7:
                r3p0.Y0((View) obj);
                return rih1Var;
            case 8:
                return qdg.b((qdg) obj).b();
            case 9:
                NpvWidgetProvider npvWidgetProvider = (NpvWidgetProvider) obj;
                return npvWidgetProvider.f.a(new ivn0(npvWidgetProvider, (byte) 25));
            case 10:
                return (di8) ((c42) obj).q;
            case 11:
                return ((vuk) obj).f();
            case 12:
                return ((wuk) obj).f;
            case 13:
                return ((mlv0) obj).e();
            case 14:
                return ((ui8) obj).d();
            case 15:
                return ((kb61) obj).z();
            case 16:
                y7c0 y7c0Var = (y7c0) obj;
                return Observable.combineLatest((Observable) ((idd1) y7c0Var.g).getValue(), (Observable) ((idd1) y7c0Var.i).getValue(), (Observable) ((idd1) y7c0Var.h).getValue(), mif1.l1).onErrorReturn(si10.U0).startWithItem(Boolean.FALSE).distinctUntilChanged();
            case 17:
                return q1o1.u((laa) ((pdp0) ((avp0) obj).c).invoke(), (qim0) null, (FrameLayout.LayoutParams) null, 7);
            case 18:
                return ((ivp0) obj).a(dm61.z0(jum1.a, jum1.c, jum1.d));
            case 19:
                ((r1q0) obj).d();
                return rih1Var;
            case 20:
                qaq0 qaq0Var = (qaq0) obj;
                luk lukVarA = qaq0.a(qaq0Var);
                if (lukVarA != null) {
                    return lukVarA.e(new c44(qaq0Var, (byte) 13));
                }
                return null;
            case 21:
                km0.b((km0) obj).b();
                return rih1Var;
            case 22:
                return pbq.k((pbq) obj);
            case 23:
                return b6r0.a((b6r0) obj);
            case 24:
                return (String) ((s7r0) obj).a.invoke();
            case 25:
                Bundle bundle = ((zf30) ((hcr0) obj)).f;
                if (bundle != null && (string = bundle.getString("page_key")) != null) {
                    return string;
                }
                hhg1.n("Missing page_key");
                return null;
            case 26:
                return (op80) obj;
            case 27:
                km0.c((km0) obj).b();
                return rih1Var;
            case 28:
                return ((rmt0) obj).e.e();
            default:
                t1u0 t1u0Var = (t1u0) obj;
                t1u0Var.t = (w9u0) t1u0Var.a.get();
                t1u0Var.X = (xbu0) t1u0Var.b.get();
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6j0(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }
}
