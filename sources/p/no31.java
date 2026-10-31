package p;

import android.os.Parcelable;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class no31 implements Init {
    public static final no31 a = new no31();

    public final First e0(Object obj) {
        tr3 tr3Var = (tr3) obj;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        jo31.r(linkedHashSet, tr3Var);
        w7c0 w7c0Var = tr3Var.c;
        if (((tzi0) w7c0Var.a(qzi0.a)) instanceof szi0) {
            linkedHashSet.add(new ro3(nik1.p2.a));
        }
        jo31.q(linkedHashSet, tr3Var);
        Parcelable parcelable = tr3Var.b.c;
        b8e0 b8e0Var = parcelable instanceof b8e0 ? (b8e0) parcelable : null;
        if (b8e0Var != null) {
            linkedHashSet.add(new vn3(o7h.l1(jo31.f(b8e0Var))));
        }
        if (((Boolean) w7c0Var.a(r181.a)).booleanValue()) {
            linkedHashSet.add(new on3(h9k1.c));
        }
        return First.c(tr3Var, linkedHashSet);
    }
}
