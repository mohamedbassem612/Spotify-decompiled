package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cw6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ em0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cw6(em0 em0Var, byte b) {
        super(1);
        this.a = b;
        this.b = em0Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006e  */
    public final Object invoke(Object obj) {
        jx11 jx11Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        em0 em0Var = this.b;
        Object obj2 = null;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                qu6 qu6Var = (qu6) obj;
                for (Object obj3 : jx11.f) {
                    if (((jx11) obj3).a().equals(qu6Var.a)) {
                        obj2 = obj3;
                        jx11Var = (jx11) obj2;
                        if (jx11Var != null) {
                            em0Var.P0(jx11Var);
                        }
                        break;
                    }
                }
                jx11Var = (jx11) obj2;
                if (jx11Var != null) {
                    em0Var.P0(jx11Var);
                }
                break;
            default:
                Integer num = ((kv6) obj).a;
                hrr0 hrr0Var = (hrr0) em0Var.d;
                hrr0Var.setValue(num);
                bpb1 bpb1Var = (bpb1) em0Var.f;
                vfm0 vfm0Var = (vfm0) bpb1Var.getValue();
                Integer num2 = (Integer) hrr0Var.getValue();
                bpb1Var.m((Object) null, vfm0.a(vfm0Var, num2 != null ? Collections.singleton(new irc0(Collections.singleton(Integer.valueOf(num2.intValue())))) : w7x.a, (g3d0) null, 5));
                break;
        }
        return rih1Var;
    }
}
