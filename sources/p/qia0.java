package p;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qia0 implements hzq0 {
    public final voe0 a;
    public final ajm0 b;
    public ks6 c;
    public final ffr d;

    public qia0(voe0 voe0Var, uqv0 uqv0Var, ajm0 ajm0Var) {
        this.a = voe0Var;
        this.b = ajm0Var;
        this.d = voe0Var.b(new p5(this, (byte) 2));
    }

    public final boolean a(kf30 kf30Var) {
        ffr ffrVar = this.d;
        Object obj = ((ConcurrentHashMap) ffrVar.c).get(kf30Var);
        return ((obj == null || obj == uoe0.b) ? d(kf30Var) : (dzq0) ffrVar.invoke(kf30Var)) == null;
    }

    public final void b(kf30 kf30Var, ArrayList arrayList) {
        h4p1.d(arrayList, this.d.invoke(kf30Var));
    }

    public final List c(kf30 kf30Var) {
        return p7h.N(this.d.invoke(kf30Var));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    public final zbc d(kf30 kf30Var) {
        InputStream inputStream;
        if (kf30Var.a.h(sfb1.k)) {
            wbc.m.getClass();
            String strA = wbc.a(kf30Var);
            ClassLoader classLoader = bcc.class.getClassLoader();
            if (classLoader == null) {
                inputStream = ClassLoader.getSystemResourceAsStream(strA);
            } else {
                URL resource = classLoader.getResource(strA);
                if (resource == null) {
                    inputStream = null;
                } else {
                    URLConnection uRLConnectionOpenConnection = resource.openConnection();
                    uRLConnectionOpenConnection.setUseCaches(false);
                    inputStream = uRLConnectionOpenConnection.getInputStream();
                }
            }
        } else {
            inputStream = null;
        }
        if (inputStream != null) {
            return nb51.q(kf30Var, this.a, this.b, inputStream);
        }
        return null;
    }

    public final Collection i(kf30 kf30Var, iu30 iu30Var) {
        return w7x.a;
    }
}
