package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class az50 implements isw {
    public final hrr0 X = xto.t(new zn60(null, null, 15));
    public g3f1 Y;
    public final View Z;
    public final iu30 a;
    public final boolean b;
    public final Context c;
    public final boolean d;
    public final boolean e;
    public final zob1 f;
    public final aod g;
    public final ce60 h;
    public final iu30 i;
    public final pe t;

    public az50(String str, acq acqVar, iu30 iu30Var, boolean z, Context context, boolean z2, boolean z3, zob1 zob1Var, aod aodVar, ce60 ce60Var, iu30 iu30Var2, ViewGroup viewGroup, pe peVar) {
        this.a = iu30Var;
        this.b = z;
        this.c = context;
        this.d = z2;
        this.e = z3;
        this.f = zob1Var;
        this.g = aodVar;
        this.h = ce60Var;
        this.i = iu30Var2;
        this.t = peVar;
        View viewInflate = LayoutInflater.from(context).inflate(2131624706, viewGroup, false);
        ComposeView composeViewN = b8k1.n(viewInflate, 2131428870);
        tka0 tka0Var = dtw.C;
        Context context2 = viewInflate.getContext();
        ViewGroup viewGroup2 = (ViewGroup) viewInflate;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        int i = 0;
        k8p1.o(b8k1.n(viewInflate, 2131428825), mhc.b(context2, viewGroup2, f6o1.A(acqVar.a(str, g9p1.y(yon1.O1().c, nik1.z0.a).b(), new xy50(this, (byte) 0)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new ke10(i, 59, (String) null, viewGroup2.getContext().getString(2131955887), (String) null, (String) null), (ipb1) null, 112).w);
        composeViewN.setContent(apo.j(-73718396, new fc3(this, (byte) 9), true));
        this.Z = viewInflate;
    }

    public final void a(Object obj, ysw yswVar) {
        vy50 vy50Var = (vy50) obj;
        List list = vy50Var.a;
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Context context = this.c;
            if (!zHasNext) {
                this.X.setValue(new zn60(mqo1.F(arrayList), l0p1.k(context, list), 12));
                this.Y = vy50Var.b;
                return;
            }
            arrayList.add(l0p1.p((c3f1) it.next(), context));
        }
    }

    public final View getView() {
        return this.Z;
    }
}
