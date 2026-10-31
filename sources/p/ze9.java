package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ze9 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ af9 b;

    public /* synthetic */ ze9(af9 af9Var, byte b) {
        this.a = b;
        this.b = af9Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        af9 af9Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                mmr0 mmr0Var = (mmr0) obj;
                ve9 ve9Var = (ve9) mmr0Var.a;
                int iIntValue = ((Number) mmr0Var.b).intValue();
                af9Var.getClass();
                String str = ve9Var.a;
                te9 te9Var = ve9Var.b.b;
                ConcurrentHashMap concurrentHashMap = af9Var.g;
                te9 te9Var2 = (te9) concurrentHashMap.get(str);
                if (te9Var2 != null && te9Var2 != te9Var) {
                    it8.m(af9Var.f, str, "range_updated", Integer.valueOf(iIntValue), te9Var.name(), (String) null, l1d.m("previousRange=", te9Var2.name()), 16);
                }
                concurrentHashMap.put(str, te9Var);
                break;
            case 1:
                ye9 ye9Var = (ye9) obj;
                af9Var.getClass();
                xe9 xe9Var = ye9Var.a;
                if (xe9Var != null) {
                    String str2 = xe9Var.a;
                    Map map = ye9Var.b;
                    Object linkedList = map.get(str2);
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        map.put(str2, linkedList);
                    }
                    ((Queue) linkedList).add(xe9Var);
                }
                break;
            default:
                long jB = af9Var.d.b();
                ArrayList arrayList = new ArrayList();
                Map map2 = ((ye9) obj).b;
                for (Map.Entry entry : map2.entrySet()) {
                    String str3 = (String) entry.getKey();
                    Queue queue = (Queue) entry.getValue();
                    while (queue.peek() != null && jB - ((xe9) queue.peek()).d > ((Number) af9Var.c.f.b()).intValue()) {
                        queue.poll();
                    }
                    if (queue.isEmpty()) {
                        arrayList.add(str3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    map2.remove((String) it.next());
                }
                break;
        }
    }
}
