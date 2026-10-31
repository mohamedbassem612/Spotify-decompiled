package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vw11 extends x7e0 implements b031, Connectable {
    public xab1 N0;
    public MobiusLoop.Controller O0;
    public final PublishSubject P0;
    public p1f0 Q0;
    public Set R0;
    public int S0;
    public LinkedHashMap T0;
    public Consumer U0;
    public snc0 V0;
    public final kdn0 X;
    public final bpb1 Y;
    public final llm Z;
    public final xw11 d;
    public final kx11 e;
    public final q7r0 f;
    public final s880 g;
    public final w6e0 h;
    public final boq i;
    public final kdn0 t;

    public vw11(xw11 xw11Var, kx11 kx11Var, q7r0 q7r0Var, s880 s880Var, w6e0 w6e0Var, boq boqVar, q8n q8nVar) {
        this.d = xw11Var;
        this.e = kx11Var;
        this.f = q7r0Var;
        this.g = s880Var;
        this.h = w6e0Var;
        this.i = boqVar;
        kdn0 kdn0Var = new kdn0();
        this.t = kdn0Var;
        this.X = kdn0Var;
        this.Y = gio1.b(z6x.a);
        this.Z = us71.h(q8nVar);
        this.P0 = new PublishSubject();
        this.R0 = w7x.a;
        this.S0 = 50;
        j();
    }

    public final Connection L(Consumer consumer) {
        this.U0 = consumer;
        return new n1b0(this, (byte) 25);
    }

    public final void a(Bundle bundle) {
        Set setP1;
        Parcelable[] parcelableArray = bundle.getParcelableArray("filters_state");
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                m620 m620Var = parcelable instanceof m620 ? (m620) parcelable : null;
                if (m620Var != null) {
                    arrayList.add(m620Var);
                }
            }
            setP1 = o7h.p1(arrayList);
        } else {
            setP1 = w7x.a;
        }
        this.R0 = setP1;
        this.S0 = bundle.getInt("sliding_window");
    }

    public final void e() {
        this.N0 = fn31.T(this.Z, (o8n) null, 0, new tw11(this, null), 3);
    }

    public final void f() {
        k().destroy();
        xab1 xab1Var = this.N0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        p1f0 p1f0Var = this.Q0;
        if (p1f0Var != null) {
            MobiusLoop mobiusLoop = ((ac91) p1f0Var.a).d;
            if (mobiusLoop != null) {
                mobiusLoop.dispose();
            }
            ((mko) p1f0Var.b).stop();
            ((zxu) p1f0Var.e).d();
            llm llmVar = ((oyu) p1f0Var.f).n;
            if (llmVar == null) {
                u890.C("coroutineScope");
                throw null;
            }
            smo1.p(llmVar, (CancellationException) null);
            ((nix0) p1f0Var.c).b();
            ((k740) p1f0Var.d).e();
            ((stt0) p1f0Var.g).d();
            ((gst0) p1f0Var.h).c();
        }
        MobiusLoop.Controller controller = this.O0;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        if (controller.isRunning()) {
            controller.stop();
            controller.disconnect();
        }
    }

    public final snc0 k() {
        snc0 snc0Var = this.V0;
        if (snc0Var != null) {
            return snc0Var;
        }
        u890.C("listContentRuntime");
        throw null;
    }

    public final void l(qnc0 qnc0Var) {
        k().a(qnc0Var);
        List list = qnc0Var.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                bpb1 bpb1Var = this.Y;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, arrayList);
                return;
            } else {
                Object next = it.next();
                h8k1 h8k1Var = next instanceof h8k1 ? (h8k1) next : null;
                Object obj = h8k1Var != null ? h8k1Var.a : null;
                ux11 ux11Var = obj instanceof ux11 ? (ux11) obj : null;
                String str = ux11Var != null ? ux11Var.b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("filters_state", (Parcelable[]) this.R0.toArray(new m620[0]));
        bundle.putInt("sliding_window", this.S0);
        return bundle;
    }
}
