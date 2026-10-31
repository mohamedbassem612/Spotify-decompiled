package p;

import com.spotify.personalizedepisodes.contentservice.v1.GetPresetResponse;
import com.spotify.personalizedepisodes.contentservice.v1.ListPresetsResponse;
import com.spotify.personalizedepisodes.contentservice.v1.PersonalizePresetResponse;
import com.spotify.personalizedepisodes.contentservice.v1.Preset;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a9w0 {
    public final m9w0 a;

    public a9w0(m9w0 m9w0Var) {
        this.a = m9w0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        x8w0 x8w0Var;
        e9w0 m231Var;
        if (onmVar instanceof x8w0) {
            x8w0Var = (x8w0) onmVar;
            int i = x8w0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x8w0Var.c = i - Integer.MIN_VALUE;
            } else {
                x8w0Var = new x8w0(this, onmVar);
            }
        } else {
            x8w0Var = new x8w0(this, onmVar);
        }
        Object objB = x8w0Var.a;
        int i2 = x8w0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                m9w0 m9w0Var = this.a;
                x8w0Var.c = 1;
                objB = m9w0Var.b(str, x8w0Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            GetPresetResponse getPresetResponse = (GetPresetResponse) rwq.r((sy21) objB);
            if (!getPresetResponse.o()) {
                throw new IllegalStateException("Check failed.");
            }
            m231Var = d1u.J(getPresetResponse.n());
            Throwable thA = e331.a(m231Var);
            if (thA == null || !(thA instanceof CancellationException)) {
                return m231Var;
            }
            throw thA;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(onm onmVar) {
        y8w0 y8w0Var;
        ArrayList m231Var;
        if (onmVar instanceof y8w0) {
            y8w0Var = (y8w0) onmVar;
            int i = y8w0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y8w0Var.c = i - Integer.MIN_VALUE;
            } else {
                y8w0Var = new y8w0(this, onmVar);
            }
        } else {
            y8w0Var = new y8w0(this, onmVar);
        }
        Object objC = y8w0Var.a;
        int i2 = y8w0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                m9w0 m9w0Var = this.a;
                y8w0Var.c = 1;
                objC = m9w0Var.c(y8w0Var);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objC);
            }
            h290<Preset> h290VarN = ((ListPresetsResponse) rwq.r((sy21) objC)).n();
            m231Var = new ArrayList(q7h.U(h290VarN, 10));
            for (Preset preset : h290VarN) {
                preset.getClass();
                m231Var.add(d1u.J(preset));
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null || !(thA instanceof CancellationException)) {
            return m231Var;
        }
        throw thA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        z8w0 z8w0Var;
        d9w0 m231Var;
        if (onmVar instanceof z8w0) {
            z8w0Var = (z8w0) onmVar;
            int i = z8w0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z8w0Var.c = i - Integer.MIN_VALUE;
            } else {
                z8w0Var = new z8w0(this, onmVar);
            }
        } else {
            z8w0Var = new z8w0(this, onmVar);
        }
        Object objA = z8w0Var.a;
        int i2 = z8w0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                m9w0 m9w0Var = this.a;
                z8w0Var.c = 1;
                objA = m9w0Var.a(str, z8w0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            m231Var = d1u.I((PersonalizePresetResponse) rwq.r((sy21) objA));
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null || !(thA instanceof CancellationException)) {
            return m231Var;
        }
        throw thA;
    }
}
