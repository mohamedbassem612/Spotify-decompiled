package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.liveroom.livestreampagefragment.v1.proto.LiveStreamStateMessage;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cr6 implements Connectable {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public cr6(lag lagVar, g0h g0hVar, sp spVar, t8x t8xVar) {
        this.a = (byte) 2;
        this.b = lagVar;
        this.c = g0hVar;
        this.d = spVar;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) lagVar.b;
        this.e = coordinatorLayout;
        qzh qzhVarA = t8xVar.a(null);
        this.f = qzhVarA;
        this.g = new PublishSubject();
        RecyclerView recyclerView = (RecyclerView) lagVar.e;
        coordinatorLayout.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(g0hVar);
        e611 itemAnimator = recyclerView.getItemAnimator();
        zw81 zw81Var = itemAnimator instanceof zw81 ? (zw81) itemAnimator : null;
        if (zw81Var != null) {
            zw81Var.g = false;
        }
        ((CoordinatorLayout) lagVar.c).addView((View) spVar.g, 0);
        rwq0.s(recyclerView, kna.P0);
        k8p1.o((View) lagVar.d, (ConstraintLayout) ((h98) qzhVarA).d);
        new fn90(new w9d1(recyclerView.getContext())).i(recyclerView);
    }

    public final Connection L(Consumer consumer) {
        int iB0;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                List<String> list = (List) this.f;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (String strSubstring : list) {
                    int i = 0;
                    for (int i2 = 0; i2 < strSubstring.length(); i2++) {
                        if (strSubstring.charAt(i2) == ':') {
                            i++;
                        }
                    }
                    if (i > 2 && (iB0 = ihc1.B0(strSubstring, ":", 0, 6)) != -1) {
                        strSubstring = strSubstring.substring(0, iB0);
                    }
                    arrayList.add(strSubstring);
                }
                ((vku) this.g).a(((qs6) obj).a(arrayList).map(new fl1((Object) this, (byte) 23)).observeOn((Scheduler) this.e).subscribe(new dn(consumer, (byte) 5)));
                return new rp(this, (byte) 7);
            case 1:
                return new cn(this, consumer, (byte) 5);
            case 2:
                return new w2h(this, consumer);
            case 3:
                return new w2h(this, consumer, (byte) 0);
            case 4:
                vku vkuVar = (vku) this.g;
                Flowable flowableX = ((Flowable) obj).x(dj20.Q0).t(xj20.R0).X(new swm0(this, (byte) 8));
                flowableX.getClass();
                vkuVar.a(flowableX.t(Functions.a).W((Scheduler) this.c).L((Scheduler) this.d).subscribe(new k1p0(consumer, (byte) 0)));
                return new n1b0(this, (byte) 14);
            case 5:
                return new pee0(consumer, this, (byte) 2);
            case 6:
                return new q211(this, consumer);
            default:
                this.e = consumer;
                return new n1b0(this, (byte) 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object a(iud0 iud0Var, Long l, int i, String str, Consumer consumer, lnm lnmVar) {
        dzd0 dzd0Var;
        long jLongValue;
        yqg yqgVar = (yqg) this.c;
        if (lnmVar instanceof dzd0) {
            dzd0Var = (dzd0) lnmVar;
            int i2 = dzd0Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dzd0Var.g = i2 - Integer.MIN_VALUE;
            } else {
                dzd0Var = new dzd0(this, lnmVar);
            }
        } else {
            dzd0Var = new dzd0(this, lnmVar);
        }
        Object obj = dzd0Var.e;
        int i3 = dzd0Var.g;
        if (i3 == 0) {
            hm5.M(obj);
            jLongValue = l != null ? l.longValue() : yqgVar.b();
            long jB = yqgVar.b() - jLongValue;
            if (jB < 0) {
                jB = 0;
            }
            long j = ((long) i) - jB;
            long j2 = j >= 0 ? j : 0L;
            dzd0Var.a = iud0Var;
            dzd0Var.b = str;
            dzd0Var.c = consumer;
            dzd0Var.d = jLongValue;
            dzd0Var.g = 1;
            Object objI = hap1.i(j2, dzd0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = dzd0Var.d;
            consumer = dzd0Var.c;
            str = dzd0Var.b;
            iud0 iud0Var2 = dzd0Var.a;
            hm5.M(obj);
            jLongValue = j3;
            iud0Var = iud0Var2;
        }
        jud0 jud0VarP = LiveStreamStateMessage.p();
        jud0VarP.q(str);
        jud0VarP.n(iud0Var);
        if (iud0Var == iud0.d) {
            jud0VarP.r(jLongValue);
        }
        consumer.accept(new cyd0(jud0VarP.build()));
        return rih1.a;
    }

    public boolean b() {
        Object value = ezn1.o(((m7p0) this.e).a).getValue();
        g7p0 g7p0Var = value instanceof g7p0 ? (g7p0) value : null;
        return g7p0Var != null && g7p0Var.a;
    }

    public cr6(LayoutInflater layoutInflater, ViewGroup viewGroup, gw70 gw70Var) {
        this.a = (byte) 1;
        this.b = gw70Var;
        View viewInflate = layoutInflater.inflate(2131624093, viewGroup, false);
        this.c = viewInflate;
        this.d = (Button) viewInflate.findViewById(2131427863);
        this.e = (Button) viewInflate.findViewById(2131427856);
        this.f = (ProgressBar) viewInflate.findViewById(2131429818);
        this.g = viewInflate.findViewById(2131428817);
        viewInflate.setVisibility(8);
    }

    public cr6(xwm1 xwm1Var, ytp0 ytp0Var, ReplaySubject replaySubject, lzn0 lzn0Var, op31 op31Var, Scheduler scheduler) {
        this.a = (byte) 6;
        this.b = xwm1Var;
        this.d = ytp0Var;
        this.f = replaySubject;
        this.c = lzn0Var;
        this.g = op31Var;
        this.e = scheduler;
    }

    public cr6(u800 u800Var, tr61 tr61Var, ufz0 ufz0Var) {
        this.a = (byte) 7;
        this.b = u800Var;
        this.c = tr61Var;
        this.d = ufz0Var;
    }

    public cr6(i8h1 i8h1Var, h0p0 h0p0Var, rzo0 rzo0Var, m7p0 m7p0Var, x5j1 x5j1Var) {
        this.a = (byte) 5;
        this.b = i8h1Var;
        this.c = h0p0Var;
        this.d = rzo0Var;
        this.e = m7p0Var;
        this.f = x5j1Var;
    }

    public cr6(qs6 qs6Var, lzn0 lzn0Var, ow3 ow3Var, Scheduler scheduler, List list) {
        this.a = (byte) 0;
        this.b = qs6Var;
        this.c = lzn0Var;
        this.d = ow3Var;
        this.e = scheduler;
        this.f = list;
        this.g = new vku();
    }

    public cr6(Flowable flowable, List list, Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3) {
        this.a = (byte) 4;
        this.b = flowable;
        this.f = list;
        this.e = scheduler;
        this.c = scheduler2;
        this.d = scheduler3;
        this.g = new vku();
    }

    public cr6(vld0 vld0Var, yqg yqgVar, zwz0 zwz0Var, Flowable flowable, mr20 mr20Var, o241 o241Var) {
        this.a = (byte) 3;
        b3s b3sVar = b3s.c;
        this.b = vld0Var;
        this.c = yqgVar;
        this.d = zwz0Var;
        this.e = flowable;
        this.f = mr20Var;
        this.g = o241Var;
    }
}
