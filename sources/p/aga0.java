package p;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aga0 implements wax {
    public static final yfa0 f;
    public static final yfa0 g;
    public final HashMap a;
    public final HashMap b;
    public final xfa0 c;
    public boolean d;
    public static final xfa0 e = new xfa0();
    public static final zfa0 h = new zfa0();

    /* JADX WARN: Type inference failed for: r0v1, types: [p.yfa0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [p.yfa0] */
    static {
        final byte b = 0;
        f = new msi1() { // from class: p.yfa0
            @Override // p.vax
            public final void a(Object obj, Object obj2) {
                switch (b) {
                    case 0:
                        ((nsi1) obj2).f((String) obj);
                        break;
                    default:
                        ((nsi1) obj2).g(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final byte b2 = 1;
        g = new msi1() { // from class: p.yfa0
            @Override // p.vax
            public final void a(Object obj, Object obj2) {
                switch (b2) {
                    case 0:
                        ((nsi1) obj2).f((String) obj);
                        break;
                    default:
                        ((nsi1) obj2).g(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public aga0() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    @Override // p.wax
    public final wax c(Class cls, ifp0 ifp0Var) {
        this.a.put(cls, ifp0Var);
        this.b.remove(cls);
        return this;
    }
}
