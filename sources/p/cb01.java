package p;

import java.security.AccessControlException;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cb01 implements t6b0 {
    public static final boolean i;
    public static final HashMap t;
    public int[] a;
    public String b;
    public int c;
    public String[] d;
    public String[] e;
    public String[] f;
    public h6b0 g;
    public String[] h;

    static {
        try {
            i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            i = false;
        }
        HashMap map = new HashMap();
        t = map;
        kf30 kf30Var = new kf30("kotlin.jvm.internal.KotlinClass");
        map.put(new heg(kf30Var.b(), kf30Var.a.g()), h6b0.CLASS);
        kf30 kf30Var2 = new kf30("kotlin.jvm.internal.KotlinFileFacade");
        map.put(new heg(kf30Var2.b(), kf30Var2.a.g()), h6b0.FILE_FACADE);
        kf30 kf30Var3 = new kf30("kotlin.jvm.internal.KotlinMultifileClass");
        map.put(new heg(kf30Var3.b(), kf30Var3.a.g()), h6b0.MULTIFILE_CLASS);
        kf30 kf30Var4 = new kf30("kotlin.jvm.internal.KotlinMultifileClassPart");
        map.put(new heg(kf30Var4.b(), kf30Var4.a.g()), h6b0.MULTIFILE_CLASS_PART);
        kf30 kf30Var5 = new kf30("kotlin.jvm.internal.KotlinSyntheticClass");
        map.put(new heg(kf30Var5.b(), kf30Var5.a.g()), h6b0.SYNTHETIC_CLASS);
    }

    @Override // p.t6b0
    public final r6b0 i(heg hegVar, ab11 ab11Var) {
        h6b0 h6b0Var;
        kf30 kf30VarA = hegVar.a();
        if (kf30VarA.equals(eia0.a)) {
            return new vqv0(this, (byte) 14);
        }
        if (kf30VarA.equals(eia0.q)) {
            return new n0v0(this, (byte) 18);
        }
        if (i || this.g != null || (h6b0Var = (h6b0) t.get(hegVar)) == null) {
            return null;
        }
        this.g = h6b0Var;
        return new bb01((Object) this, (byte) 0);
    }

    @Override // p.t6b0
    public final void a() {
    }
}
