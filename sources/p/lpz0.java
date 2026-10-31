package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class lpz0 implements Update {
    public static final lpz0 a = new lpz0();

    public final Next a(Object obj, Object obj2) {
        hpz0 hpz0Var = (hpz0) obj;
        gpz0 gpz0Var = (gpz0) obj2;
        if (gpz0Var instanceof fpz0) {
            return Next.h(new hpz0(new y8e0(((fpz0) gpz0Var).a)));
        }
        if (gpz0Var instanceof epz0) {
            return Next.h(new hpz0(new w8e0(((epz0) gpz0Var).a)));
        }
        if (gpz0Var instanceof dpz0) {
            return !(hpz0Var.a instanceof y8e0) ? Next.a(Effects.a(new bpz0[]{bpz0.a})) : Next.j();
        }
        eg.o();
        return null;
    }
}
