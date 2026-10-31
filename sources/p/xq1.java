package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xq1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dh30 a;

    public xq1(dh30 dh30Var) {
        this.a = dh30Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:1: B:28:0x0085->B:51:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x008b, please report this as an issue */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Map map;
        boolean z;
        Map map2;
        dh30 dh30Var = this.a;
        eyh0 eyh0Var = (eyh0) dh30Var.c;
        ot1 ot1Var = ((dp1) obj).a;
        List list = ((av1) dh30Var.b).d;
        boolean z2 = list instanceof Collection;
        zhu0 zhu0Var = zhu0.c;
        if (z2 && list.isEmpty()) {
            map2 = ot1Var.Z;
            if (!map2.isEmpty()) {
                map = ot1Var.Z;
                if (map.isEmpty()) {
                    eyh0Var.E(2131951949, 3);
                } else {
                    for (Map.Entry entry : map.entrySet()) {
                        if (entry.getKey() == zhu0Var) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!(z ^ (((Number) entry.getValue()).intValue() == 0))) {
                            eyh0Var.E(2131951948, 1);
                        }
                    }
                    eyh0Var.E(2131951949, 3);
                }
            } else {
                for (Map.Entry entry2 : map2.entrySet()) {
                    if (entry2.getKey() == zhu0Var) {
                    }
                }
                map = ot1Var.Z;
                if (map.isEmpty()) {
                    eyh0Var.E(2131951949, 3);
                } else {
                    while (r3.hasNext()) {
                        if (entry.getKey() == zhu0Var) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!(z ^ (((Number) entry.getValue()).intValue() == 0))) {
                            eyh0Var.E(2131951948, 1);
                        }
                    }
                    eyh0Var.E(2131951949, 3);
                }
            }
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    Set set = s4b1.f;
                    if (!uic.g(str, blc0.fh)) {
                    }
                } else {
                    map2 = ot1Var.Z;
                    if (!map2.isEmpty()) {
                        while (r3.hasNext()) {
                            if (entry2.getKey() == zhu0Var && ((Number) entry2.getValue()).intValue() > 0) {
                                eyh0Var.E(2131951947, 2);
                            }
                        }
                    }
                }
                map = ot1Var.Z;
                if (map.isEmpty()) {
                    eyh0Var.E(2131951949, 3);
                } else {
                    while (r3.hasNext()) {
                        if (entry.getKey() == zhu0Var) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!(z ^ (((Number) entry.getValue()).intValue() == 0))) {
                            eyh0Var.E(2131951948, 1);
                        }
                    }
                    eyh0Var.E(2131951949, 3);
                }
            }
        }
        return rih1.a;
    }
}
