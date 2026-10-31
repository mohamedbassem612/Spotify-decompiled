package p;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class prz0 {
    public final zq4 a;
    public List b = z6x.a;
    public final Object c = new Object();

    public prz0(zq4 zq4Var) {
        this.a = zq4Var;
    }

    public final boolean a(String str) {
        synchronized (this.c) {
            long jH = fno1.h();
            for (urz0 urz0Var : this.b) {
                int i = urz0Var.b;
                int i2 = urz0Var.a;
                if (i2 != 0 && i != 0) {
                    Queue queue = (Queue) urz0Var.c.get(str);
                    if (queue != null && queue.size() >= i) {
                        long j = jH - ((long) i2);
                        Object objPeek = queue.peek();
                        objPeek.getClass();
                        if (j > ((Number) objPeek).longValue()) {
                        }
                    }
                }
                return false;
            }
            for (urz0 urz0Var2 : this.b) {
                LinkedHashMap linkedHashMap = urz0Var2.c;
                Queue queue2 = (Queue) linkedHashMap.get(str);
                if (queue2 == null) {
                    linkedHashMap.put(str, new LinkedList());
                    queue2 = (Queue) linkedHashMap.get(str);
                }
                if (queue2.size() == urz0Var2.b) {
                    queue2.poll();
                }
                queue2.add(Long.valueOf(jH));
            }
            return true;
        }
    }
}
