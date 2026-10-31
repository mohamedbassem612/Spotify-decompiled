package p;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class k4x implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m4x b;

    public /* synthetic */ k4x(m4x m4xVar, byte b) {
        this.a = b;
        this.b = m4xVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        m4x m4xVar = this.b;
        switch (b) {
            case 0:
                m4xVar.i.invoke(m4xVar, (p5x) obj2);
                return rih1Var;
            default:
                String str = (String) obj2;
                LinkedHashMap linkedHashMap = uwg.Q0;
                if (linkedHashMap != null) {
                    Object obj3 = linkedHashMap.get(str);
                    obj3.getClass();
                    String str2 = (String) ((List) obj3).get(0);
                    int i = 0;
                    for (Object obj4 : (Iterable) m4xVar.h.invoke()) {
                        int i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        ln90 ln90Var = (ln90) obj4;
                        if (ln90Var instanceof m5x) {
                            LinkedHashMap linkedHashMap2 = uwg.Q0;
                            if (linkedHashMap2 != null) {
                                m5x m5xVar = (m5x) ln90Var;
                                List list = (List) linkedHashMap2.get(m5xVar.c);
                                if (u890.j(list != null ? (String) list.get(0) : null, str2) && m5xVar.d) {
                                    m5xVar.c = str;
                                    m4xVar.i(i);
                                }
                            } else {
                                eg.m("BundledEmojiListLoader.load is not called or complete");
                            }
                        }
                        i = i2;
                    }
                    return rih1Var;
                }
                eg.m("BundledEmojiListLoader.load is not called or complete");
                return null;
        }
    }
}
