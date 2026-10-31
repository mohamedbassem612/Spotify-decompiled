package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public class wxr extends bez implements jik1, o6r0 {
    public p9v0 G1;
    public t19 H1;

    public final String A(Context context) {
        return this.H1.a;
    }

    public final gn10 Q() {
        return mno1.p;
    }

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return nhc.o(yon1.k6(), (qir0) null);
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.k6();
    }

    public final lik1 getViewUri() {
        return nik1.x2;
    }

    public final String s() {
        return "podcast_episodes_tab";
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p9v0 p9v0Var = this.G1;
        ges gesVarA = p9v0Var.b.a(P0());
        gesVarA.E(this, p9v0Var.a.get());
        return gesVarA;
    }

    public final zf30 b() {
        return this;
    }
}
