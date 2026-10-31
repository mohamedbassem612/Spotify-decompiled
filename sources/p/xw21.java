package p;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xw21 extends i520 {
    public static final s8s0 f;
    public final ClassLoader c;
    public final i520 d = i520.a;
    public final idd1 e = new idd1(new ww21(this, (byte) 0));

    static {
        new sua((byte) 23);
        String str = s8s0.b;
        f = gtv0.f("/");
    }

    public xw21(ClassLoader classLoader) {
        this.c = classLoader;
    }

    public static String m(s8s0 s8s0Var) {
        s8s0 s8s0Var2 = f;
        s8s0Var2.getClass();
        return c.a(s8s0Var2, s8s0Var, true).d(s8s0Var2).a.r();
    }

    @Override // p.i520
    public final c291 a(s8s0 s8s0Var) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // p.i520
    public final void c(s8s0 s8s0Var, s8s0 s8s0Var2) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // p.i520
    public final void e(s8s0 s8s0Var) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // p.i520
    public final List f(s8s0 s8s0Var) {
        String strM = m(s8s0Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (mmr0 mmr0Var : (List) this.e.getValue()) {
            i520 i520Var = (i520) mmr0Var.a;
            s8s0 s8s0Var2 = (s8s0) mmr0Var.b;
            try {
                List listF = i520Var.f(s8s0Var2.e(strM));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listF) {
                    if (sua.i((s8s0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(sua.v((s8s0) it.next(), s8s0Var2));
                }
                r7h.W(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return o7h.l1(linkedHashSet);
        }
        t8e1.p(s8s0Var, "file not found: ");
        return null;
    }

    @Override // p.i520
    public final q420 g(s8s0 s8s0Var) {
        if (!sua.i(s8s0Var)) {
            return null;
        }
        String strM = m(s8s0Var);
        for (mmr0 mmr0Var : (List) this.e.getValue()) {
            q420 q420VarG = ((i520) mmr0Var.a).g(((s8s0) mmr0Var.b).e(strM));
            if (q420VarG != null) {
                return q420VarG;
            }
        }
        return null;
    }

    @Override // p.i520
    public final wia0 h(s8s0 s8s0Var) {
        if (!sua.i(s8s0Var)) {
            t8e1.p(s8s0Var, "file not found: ");
            return null;
        }
        String strM = m(s8s0Var);
        Iterator it = ((List) this.e.getValue()).iterator();
        while (it.hasNext()) {
            mmr0 mmr0Var = (mmr0) it.next();
            try {
                return ((i520) mmr0Var.a).h(((s8s0) mmr0Var.b).e(strM));
            } catch (FileNotFoundException unused) {
            }
        }
        t8e1.p(s8s0Var, "file not found: ");
        return null;
    }

    @Override // p.i520
    public final c291 i(s8s0 s8s0Var, boolean z) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // p.i520
    public final fka1 j(s8s0 s8s0Var) throws IOException {
        if (!sua.i(s8s0Var)) {
            t8e1.p(s8s0Var, "file not found: ");
            return null;
        }
        s8s0 s8s0Var2 = f;
        s8s0Var2.getClass();
        URL resource = this.c.getResource(c.a(s8s0Var2, s8s0Var, false).d(s8s0Var2).a.r());
        if (resource == null) {
            t8e1.p(s8s0Var, "file not found: ");
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        return si1.v(uRLConnectionOpenConnection.getInputStream());
    }
}
