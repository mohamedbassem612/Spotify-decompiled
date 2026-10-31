package p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yn41 implements MobiusLoop.Logger {
    public final String a;
    public final vu30 b;
    public final Function0 c;
    public long d;

    public yn41(String str) {
        jh31 jh31Var = jh31.Z;
        xn41 xn41Var = xn41.a;
        this.a = str;
        this.b = jh31Var;
        this.c = xn41Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(Object obj, Object obj2, Next next) {
        if (next.d()) {
            String string = ((oam0) obj).a.toString();
            String string2 = ((oam0) next.g()).a.toString();
            if (string.equals(string2)) {
                return;
            }
            boolean zEquals = string.equals("ShuttingDown");
            Function0 function0 = this.c;
            String str = this.a;
            vu30 vu30Var = this.b;
            if (zEquals && !string2.equals("ShuttingDown")) {
                vu30Var.invoke("Scope %s left (+%dms)", new Object[]{str, Long.valueOf((((Number) function0.invoke()).longValue() - this.d) / 1000000)});
            }
            switch (string2.hashCode()) {
                case -1393078604:
                    if (string2.equals("Initialized")) {
                        vu30Var.invoke("Scope %s entered (+%dms)", new Object[]{str, Long.valueOf((((Number) function0.invoke()).longValue() - this.d) / 1000000)});
                        return;
                    }
                    return;
                case -235759507:
                    if (string2.equals("Initializing")) {
                        this.d = ((Number) function0.invoke()).longValue();
                        vu30Var.invoke("Scope %s entering", new Object[]{str});
                        return;
                    }
                    return;
                case 1291987198:
                    if (!string2.equals("WaitingForShutdownHooks")) {
                        return;
                    }
                    break;
                case 1443627140:
                    if (!string2.equals("ShuttingDown")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            if (string.equals("WaitingForShutdownHooks")) {
                return;
            }
            this.d = ((Number) function0.invoke()).longValue();
            String string3 = obj2.toString();
            switch (string3.hashCode()) {
                case -1027403732:
                    if (string3.equals("RemoveSubscriber")) {
                        string3 = "unsubscribed";
                    }
                    break;
                case -176925257:
                    if (string3.equals("ComponentInitialized")) {
                        string3 = "aborted";
                    }
                    break;
                case -44679439:
                    if (string3.equals("Deinitialize")) {
                        string3 = "parent";
                    }
                    break;
                case 1865687486:
                    if (string3.equals("ConditionUnsatisfied")) {
                        string3 = "condition";
                    }
                    break;
            }
            vu30Var.invoke("Scope %s leaving (%s)", new Object[]{str, string3});
        }
    }

    public final void e(Object obj) {
    }

    public final void c(Object obj, First first) {
    }

    public final void d(Object obj, Object obj2) {
    }

    public final void f(Object obj, Exception exc) {
    }

    public final void b(Object obj, Object obj2, Exception exc) {
    }
}
