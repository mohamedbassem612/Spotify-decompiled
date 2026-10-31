package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import com.spotify.pam.v2.Action;
import com.spotify.pam.v2.ActionTypeMap;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class s99 implements Update {
    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    public final Next a(Object obj, Object obj2) {
        String uri;
        Action actionN;
        Action actionN2;
        String uri2;
        Action actionN3;
        String uri3;
        aa9 aa9Var = (aa9) obj;
        r99 r99Var = (r99) obj2;
        c380 c380Var = aa9Var.b;
        if (r99Var instanceof p99) {
            p99 p99Var = (p99) r99Var;
            return olj0.f(aa9Var, p99Var.a, false, p99Var.b);
        }
        if (r99Var instanceof n99) {
            n99 n99Var = (n99) r99Var;
            return olj0.f(aa9Var, n99Var.a, true, n99Var.b);
        }
        if (r99Var instanceof q99) {
            q99 q99Var = (q99) r99Var;
            return Next.a(Collections.singleton(new j99(q99Var.a ? 1 : 0, q99Var.b)));
        }
        String str = "";
        Object obj3 = null;
        if (r99Var instanceof k99) {
            k99 k99Var = (k99) r99Var;
            int i = k99Var.a;
            boolean z = k99Var.b;
            s2c1 s2c1Var = (s2c1) c380Var.get(i);
            c380 c380Var2 = ((s2c1) c380Var.get(i)).l;
            if (c380Var2 != null) {
                for (Object obj4 : c380Var2) {
                    if (((ActionTypeMap) obj4).o() == s80.ASTRO_ENROLL) {
                        obj3 = obj4;
                        break;
                    }
                }
                ActionTypeMap actionTypeMap = (ActionTypeMap) obj3;
                if (actionTypeMap != null && (actionN3 = actionTypeMap.n()) != null && (uri3 = actionN3.getUri()) != null) {
                    str = uri3;
                }
            }
            return Next.a(Collections.singleton(new e99(s2c1Var, i, z, str)));
        }
        if (r99Var instanceof l99) {
            l99 l99Var = (l99) r99Var;
            int i2 = l99Var.a;
            boolean z2 = l99Var.b;
            s2c1 s2c1Var2 = (s2c1) c380Var.get(i2);
            c380 c380Var3 = ((s2c1) c380Var.get(i2)).l;
            if (c380Var3 != null) {
                for (Object obj5 : c380Var3) {
                    if (((ActionTypeMap) obj5).o() == s80.ASTRO_MANAGE) {
                        obj3 = obj5;
                        break;
                    }
                }
                ActionTypeMap actionTypeMap2 = (ActionTypeMap) obj3;
                if (actionTypeMap2 != null && (actionN2 = actionTypeMap2.n()) != null && (uri2 = actionN2.getUri()) != null) {
                    str = uri2;
                }
            }
            return Next.a(Collections.singleton(new f99(s2c1Var2, i2, z2, str)));
        }
        if (!(r99Var instanceof m99)) {
            if (!(r99Var instanceof o99)) {
                eg.o();
                return null;
            }
            o99 o99Var = (o99) r99Var;
            int i3 = o99Var.a;
            return Next.a(Collections.singleton(new i99((p7t0) aa9Var.c.get(i3), i3, o99Var.b, o99Var.c)));
        }
        m99 m99Var = (m99) r99Var;
        int i4 = m99Var.a;
        boolean z3 = m99Var.b;
        s2c1 s2c1Var3 = (s2c1) c380Var.get(i4);
        c380 c380Var4 = ((s2c1) c380Var.get(i4)).l;
        if (c380Var4 != null) {
            for (Object obj6 : c380Var4) {
                if (((ActionTypeMap) obj6).o() == s80.ASTRO_REQUEST) {
                    obj3 = obj6;
                    break;
                }
            }
            ActionTypeMap actionTypeMap3 = (ActionTypeMap) obj3;
            if (actionTypeMap3 == null || (actionN = actionTypeMap3.n()) == null || (uri = actionN.getUri()) == null) {
                uri = "spotify:account-management:aom";
            }
        } else {
            uri = "spotify:account-management:aom";
        }
        return Next.a(Collections.singleton(new g99(s2c1Var3, i4, z3, uri)));
    }
}
