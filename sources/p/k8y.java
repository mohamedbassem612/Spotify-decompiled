package p;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k8y {
    public static final Logger c = Logger.getLogger(k8y.class.getName());
    public static final ArrayList d;
    public static final k8y e;
    public static final k8y f;
    public final s8y a;
    public final List b = d;

    static {
        if (oqo1.m()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    c.info("Provider " + str + " not available");
                }
            }
            d = arrayList;
        } else {
            d = new ArrayList();
        }
        e = new k8y(new a0b((byte) 9));
        f = new k8y(new t2b((byte) 9));
    }

    public k8y(s8y s8yVar) {
        this.a = s8yVar;
    }

    public final Object a(String str) {
        Iterator it = this.b.iterator();
        Exception exc = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            s8y s8yVar = this.a;
            if (!zHasNext) {
                return s8yVar.b(str, null);
            }
            try {
                return s8yVar.b(str, (Provider) it.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
    }
}
