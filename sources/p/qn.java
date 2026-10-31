package p;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.loadingdots.ThreeDotsLoaderView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qn implements Connectable, sek1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public qn(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.a = (byte) 8;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624665, viewGroup, false);
        int i = 2131429032;
        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131429032);
        if (textView != null) {
            i = 2131430541;
            ThreeDotsLoaderView threeDotsLoaderViewT = m5n1.t(constraintLayoutInflate, 2131430541);
            if (threeDotsLoaderViewT != null) {
                ConstraintLayout constraintLayout = constraintLayoutInflate;
                this.b = new w2z(constraintLayout, textView, threeDotsLoaderViewT);
                this.c = constraintLayout;
                return;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final Connection L(Consumer consumer) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new cn(((en) this.c).L(consumer), this, (byte) 1);
            case 1:
                fns fnsVar = igu.a;
                bs50 bs50Var = pyf0.a;
                gaa0 gaa0VarF = op71.f();
                bs50Var.getClass();
                return new jt3(new p811(), smo1.e(flo1.l(bs50Var, gaa0VarF)), new p811(), consumer, (g931) obj, (bt3) this.c);
            case 2:
                dt71 dt71VarE = mgo1.e(0, 1, 0, 5);
                return new cn(fn31.T(smo1.e((o8n) obj), (o8n) null, 0, new vs0((e8c) this.c, dt71VarE, consumer, (lnm) null, (byte) 17), 3), dt71VarE, (byte) 6);
            case 3:
                return new rp(this, (byte) 22);
            case 4:
                return ((r5z) obj).L(consumer);
            case 5:
                dt71 dt71VarE2 = mgo1.e(0, 1, 0, 5);
                Object obj2 = new Object();
                l811 l811Var = new l811();
                return new kk00(obj2, l811Var, fn31.T(smo1.e((o8n) obj), (o8n) null, 0, new og5((byte) 17, (xj00) this.c, dt71VarE2, obj2, l811Var, consumer, (lnm) null), 3), dt71VarE2);
            case 6:
                llm llmVarE = smo1.e(flo1.l(guo1.B(), (q8n) this.c));
                fn31.T(llmVarE, (o8n) null, 0, new xr00(this, consumer, (lnm) null, (byte) 0), 3);
                return new yr00(llmVarE);
            case 7:
                llm llmVarE2 = smo1.e(flo1.l(guo1.B(), (q8n) this.c));
                bpb1 bpb1VarB = gio1.b((Object) null);
                fn31.T(llmVarE2, (o8n) null, 0, new l2w(this, bpb1VarB, consumer, (lnm) null, (byte) 27), 3);
                return new wr20(bpb1VarB, llmVarE2, (byte) 0);
            case 8:
                return new cn(this, consumer, (byte) 22);
            case 9:
                return new yr00(this, consumer);
            case 10:
                return new yr00(this, consumer, (byte) 0);
            case 11:
                Connectable connectableA = ((nve0) obj).a();
                if (connectableA == null) {
                    return new cn(ook0.a1, z7i0.c1, (byte) 27);
                }
                Class cls = (Class) this.c;
                Connection connectionL = connectableA.L(new xu2(consumer, (byte) 14));
                return new cn(new uah0(cls, connectionL, (byte) 26), new n0g0(0, connectionL, Connection.class, "dispose", "dispose()V", 0, (byte) 9), (byte) 27);
            case 12:
                return new pee0((lzn0) obj, (y1c1) this.c, (byte) 9);
            case 13:
                return new ibn(this, ((iw71) this.c).j.L(consumer), ((dx71) obj).g.L(consumer), (byte) 9);
            case 14:
                return new pee0(((a) obj).L(consumer), (p1f0) this.c, (byte) 13);
            default:
                this.c = consumer;
                return new xj81(this, (byte) 4);
        }
    }

    public View getRoot() {
        return (ConstraintLayout) this.c;
    }

    public View getView() {
        return (View) ((idd1) this.c).getValue();
    }

    public qn(d4m1 d4m1Var) {
        this.a = (byte) 15;
        this.b = gio1.b(d4m1Var);
    }

    public qn(u961 u961Var, en enVar) {
        this.a = (byte) 0;
        this.b = u961Var;
        this.c = enVar;
        ((EncoreTextView) u961Var.d).setVisibility(4);
        ((EncoreTextView) u961Var.b).setVisibility(4);
        RecyclerView recyclerView = (RecyclerView) u961Var.c;
        recyclerView.j(new fyd((byte) 4));
        recyclerView.setAdapter(enVar);
        enVar.w(new pn(this, (byte) 0));
    }

    public /* synthetic */ qn(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public qn(r5z r5zVar, u800 u800Var, Bundle bundle) {
        this.a = (byte) 4;
        this.b = r5zVar;
        this.c = new idd1(new j5z(u800Var, (byte) 0));
        if (bundle != null) {
            r5zVar.f = bundle.getParcelable("EpisodeLimitsPageViewBinderImpl.savedState");
        }
    }
}
