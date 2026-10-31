package p;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g1s {
    public final ml60 a;
    public final HashMap b;
    public final boolean c;
    public final /* synthetic */ h1s d;

    public g1s(h1s h1sVar, ml60 ml60Var, boolean z) {
        this.d = h1sVar;
        this.a = ml60Var;
        HashMap map = new HashMap();
        mjh1 mjh1VarK = ml60Var.a().k();
        while (mjh1VarK.hasNext()) {
            String str = (String) mjh1VarK.next();
            Uri uri = (Uri) ml60Var.b.get(str);
            uri.getClass();
            map.put(uri, new f1s(this.d, uri, str));
        }
        this.b = map;
        this.c = z;
    }

    public final boolean a(long j, Uri uri, String str) {
        Uri uri2;
        HashMap map = this.b;
        dm5.y(map.containsKey(uri));
        f1s f1sVar = (f1s) map.get(uri);
        f1sVar.getClass();
        f1sVar.i = SystemClock.elapsedRealtime() + j;
        h1s h1sVar = this.d;
        mk60 mk60Var = h1sVar.Z;
        if ((!(mk60Var != null && mk60Var.k && str == null) && f(str, false)) || !((uri2 = h1sVar.R0) == null || uri.equals(uri2))) {
            return true;
        }
        b380 b380Var = h1sVar.N0;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < b380Var.size(); i++) {
            Uri uriB = ((ml60) b380Var.get(i)).b();
            g1s g1sVar = (g1s) h1sVar.d.get(uriB);
            g1sVar.getClass();
            if (!g1sVar.c(uriB, jElapsedRealtime)) {
                h1sVar.R0 = uriB;
                g1sVar.d(uriB, h1sVar.d(uriB));
                return true;
            }
        }
        return false;
    }

    public final bl60 b(Uri uri) {
        HashMap map = this.b;
        dm5.y(map.containsKey(uri));
        f1s f1sVar = (f1s) map.get(uri);
        f1sVar.getClass();
        return f1sVar.e;
    }

    public final boolean c(Uri uri, long j) {
        HashMap map = this.b;
        dm5.y(map.containsKey(uri));
        f1s f1sVar = (f1s) map.get(uri);
        f1sVar.getClass();
        return j <= f1sVar.i;
    }

    public final void d(Uri uri, Uri uri2) {
        HashMap map = this.b;
        dm5.y(map.containsKey(uri));
        f1s f1sVar = (f1s) map.get(uri);
        f1sVar.getClass();
        f1sVar.c(uri2);
    }

    public final void e(Uri uri, boolean z) {
        HashMap map = this.b;
        dm5.y(map.containsKey(uri));
        f1s f1sVar = (f1s) map.get(uri);
        f1sVar.getClass();
        f1sVar.c(z ? f1sVar.a() : f1sVar.a);
    }

    public final boolean f(String str, boolean z) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ml60 ml60Var = this.a;
        HashMap map = this.b;
        if (str == null) {
            Iterator it = map.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                f1s f1sVar = (f1s) it.next();
                if (!f1sVar.b.contains(ml60Var.d) && jElapsedRealtime > f1sVar.i) {
                    str = (String) f1sVar.b.iterator().next();
                    break;
                }
            }
        } else {
            for (f1s f1sVar2 : map.values()) {
                if (f1sVar2.b.contains(str)) {
                    f1sVar2.i = 0L;
                }
            }
        }
        if (str == null) {
            return false;
        }
        Uri uriB = ml60Var.b();
        dm5.y(ml60Var.b.containsKey(str));
        ml60Var.d = str;
        Uri uriB2 = ml60Var.b();
        h1s h1sVar = this.d;
        if (uriB.equals(h1sVar.R0)) {
            h1sVar.i(uriB2, z);
        }
        f1s f1sVar3 = (f1s) map.get(uriB);
        f1sVar3.getClass();
        f1s f1sVar4 = (f1s) map.get(uriB2);
        f1sVar4.getClass();
        f1sVar4.Y = f1sVar3.Y;
        f1sVar3.Y = false;
        return true;
    }
}
