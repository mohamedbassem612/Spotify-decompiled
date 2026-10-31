package p;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mh2 implements m5 {
    public final View a;
    public final djx0 b;
    public final ohv0 c;
    public final t8h1 d;
    public final wnh1 e;
    public final BehaviorSubject f;
    public final PublishSubject g;

    public mh2(View view, ohv0 ohv0Var, t8h1 t8h1Var, wnh1 wnh1Var) {
        djx0 djx0Var = new djx0((byte) 27);
        this.a = view;
        this.b = djx0Var;
        this.c = ohv0Var;
        this.d = t8h1Var;
        this.e = wnh1Var;
        ComposeView composeViewFindViewById = view.findViewById(2131427545);
        this.f = BehaviorSubject.f();
        this.g = new PublishSubject();
        composeViewFindViewById.setViewCompositionStrategy(p5x0.W0);
        composeViewFindViewById.setContent(new j2i(1811071826, new xb2(this, (byte) 4), true));
    }

    public final Connection L(Consumer consumer) {
        return new cn(this, this.g.subscribe(new dn(consumer, (byte) 3)), (byte) 3);
    }

    @Override // p.c7k1
    public final String b() {
        return this.a.getContext().getString(2131962528);
    }

    @Override // p.c7k1
    public final void c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        t8h1.n(this.d, yon1.G1("SIGNUP_BIRTHDAY", "signup/birthday", 1886, "signup"));
    }

    @Override // p.c7k1
    public final void a() {
    }

    @Override // p.m5
    public final void R(int i, int i2, int i3) {
    }
}
