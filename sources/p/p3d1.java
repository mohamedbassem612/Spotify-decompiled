package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract /* synthetic */ class p3d1 {
    public static int[] _values() {
        return l1d.H(4);
    }

    public static int a(int i) {
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static int b(int i) {
        if (i != 0) {
            return i != 4 ? 0 : 1;
        }
        return 2;
    }

    public static final int c(int i) {
        return e(i);
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "taste_profile_side_drawer";
        }
        if (i == 2) {
            return "taste_profile_context_menu";
        }
        throw null;
    }

    public static /* synthetic */ byte e(int i) {
        switch (i) {
            case 1:
                return (byte) 1;
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 4;
            case 5:
                return (byte) 5;
            case 6:
                return (byte) 6;
            case 7:
                return (byte) 7;
            default:
                throw null;
        }
    }

    public static int f(ArrayList arrayList, int i, int i2) {
        return (arrayList.hashCode() + i) * i2;
    }

    public static int g(k4m k4mVar, int i, int i2) {
        return (k4mVar.hashCode() + i) * i2;
    }

    public static int h(lee1 lee1Var, int i, int i2) {
        return (lee1Var.hashCode() + i) * i2;
    }

    public static MessageTemplate i(MessageResponseToken messageResponseToken) {
        return messageResponseToken.getMessageData().getFormat().getTemplate();
    }

    public static Object j(x340 x340Var, int i, boolean z, k9 k9Var) {
        x340Var.i0(i);
        x340Var.r(z);
        return k9Var.P0();
    }

    public static NoWhenBranchMatchedException k(x340 x340Var, int i, boolean z) {
        x340Var.i0(i);
        x340Var.r(z);
        return new NoWhenBranchMatchedException();
    }

    public static u7h l(x340 x340Var, boolean z, long j) {
        x340Var.r(z);
        return new u7h(j);
    }

    public static frr0 m(long j, x340 x340Var) {
        frr0 frr0Var = new frr0(j);
        x340Var.s0(frr0Var);
        return frr0Var;
    }

    public static hrr0 n(long j, x340 x340Var) {
        hrr0 hrr0VarQ = v8r.q(new yr80(j));
        x340Var.s0(hrr0VarQ);
        return hrr0VarQ;
    }

    public static ely0 o(long j, kiv kivVar) {
        return kivVar.a(new u7h(j));
    }

    public static /* synthetic */ void p(e39 e39Var) throws Exception {
        boolean zIsTerminated;
        if (e39Var instanceof AutoCloseable) {
            e39Var.close();
            return;
        }
        if (!(e39Var instanceof ExecutorService)) {
            bhn0.q();
            return;
        }
        ExecutorService executorService = (ExecutorService) e39Var;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void q(l0i l0iVar) {
        if (l0iVar == null) {
            return;
        }
        bhn0.d();
    }
}
