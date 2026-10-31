package p;

import com.spotify.externalintegration.ubi.UbiSpecificationId;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oyr {
    public final i8h1 a;
    public final Map b;
    public final Map c = Collections.synchronizedMap(new EnumMap(UbiSpecificationId.class));
    public final Map d = Collections.synchronizedMap(new EnumMap(UbiSpecificationId.class));

    public oyr(i8h1 i8h1Var, Map map) {
        this.a = i8h1Var;
        this.b = map;
    }

    public final spq0 a(boolean z, String str, r710 r710Var) {
        w7h1 w7h1VarH;
        r64 r64Var = (r64) this.b.get(r710Var.c());
        if (r64Var == null) {
            return j5.a;
        }
        v64 v64Var = r64Var.a;
        List list = r64.b;
        if (z) {
            w7h1VarH = r6x0.a(r710Var.d(), v64Var.a).j(str).i(str);
        } else {
            w7h1VarH = r6x0.a(r710Var.d(), r710Var.a() != null ? spq0.a(r710Var.a()) : v64Var.a).h(r710Var.b(), str).h(str);
        }
        return new i5w0(w7h1VarH);
    }

    public final spq0 b(String str, UbiSpecificationId ubiSpecificationId) {
        Object obj;
        Object next;
        List list = (List) this.c.get(ubiSpecificationId);
        Object obj2 = null;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((q710) next).a(), str));
            obj = (q710) next;
        } else {
            obj = null;
        }
        if (obj == null) {
            List list2 = (List) this.d.get(ubiSpecificationId);
            if (list2 != null) {
                for (Object obj3 : list2) {
                    if (u890.j(((q710) obj3).a(), str)) {
                        obj2 = obj3;
                        break;
                    }
                }
                obj2 = (q710) obj2;
            }
            obj = obj2;
        }
        return spq0.a(obj);
    }

    public final void c(r710 r710Var) {
        r64 r64Var = (r64) this.b.get(r710Var.c());
        if (r64Var != null) {
            String strD = r710Var.d();
            v64 v64Var = r64Var.a;
            boolean zEquals = "spotify_media_browser_root_android_auto".equals(strD);
            spq0 i5w0Var = j5.a;
            if (zEquals) {
                v64Var.a = i5w0Var;
            }
            if (r64.b.contains(strD)) {
                v64Var.a = spq0.d(strD);
            }
            if (!"spotify_media_browser_root_android_auto".equals(strD)) {
                List list = r64.b;
                if (!r6x0.b(r710Var.d())) {
                    i5w0Var = v64Var.a;
                }
                i5w0Var = new i5w0(r6x0.a(strD, i5w0Var).e());
            }
            if (i5w0Var.c()) {
                this.a.f((l7h1) i5w0Var.b(), null);
            }
        }
    }
}
