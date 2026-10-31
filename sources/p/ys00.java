package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class ys00 extends tv30 implements vu30 {
    public static final ys00 a = new ys00(2, wpb1.class, "mapToState", "mapToState(Lcom/spotify/watchfeed/pivotspage/elements/explorercard/ExplorerCardElement$Props;Lcom/spotify/watchfeed/pivotspage/elements/explorercard/ExplorerCardElement$ExternalState;)Lcom/spotify/watchfeed/pivotspage/elements/explorercard/ExplorerCardElement$State;", 1);

    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    public final Object invoke(Object obj, Object obj2) {
        String str;
        lx61 lx61Var;
        up70 up70VarA;
        lx61 lx61Var2;
        lx61 lx61Var3;
        mq70 mq70Var;
        z6j1 z6j1Var;
        String str2;
        String str3;
        mq70 mq70Var2;
        mq70 mq70Var3;
        mq70 mq70Var4;
        up70 up70VarA2;
        vs00 vs00Var = (vs00) obj;
        us00 us00Var = (us00) obj2;
        ss00 ss00Var = us00Var.a;
        jo70 jo70Var = ss00Var.a;
        String str4 = "";
        if (jo70Var == null || (str = jo70Var.a) == null) {
            str = "";
        }
        String str5 = vs00Var.a;
        xkk1 xkk1Var = ss00Var.b;
        vp70 vp70Var = vp70.c;
        if (xkk1Var == null || (up70VarA2 = (mq70Var4 = xkk1Var.a).a(vp70Var)) == null || up70VarA2.a.a == null) {
            lx61Var = null;
        } else {
            Set set = s4b1.f;
            lx61Var = new lx61(mq70Var4, upb1.a[uic.x(str5).c.ordinal()] == 1 ? 2 : 1);
        }
        if (((lx61Var == null || (mq70Var3 = lx61Var.a) == null) ? null : mq70Var3.a(vp70Var)) != null) {
            ts00 ts00Var = us00Var.b;
            pjw0 pjw0Var = ts00Var.b;
            String str6 = vs00Var.b;
            xkk1 xkk1Var2 = ts00Var.a;
            if (pjw0Var != null) {
                mjw0 mjw0Var = pjw0Var.b;
                mjw0 mjw0Var2 = mjw0Var instanceof mjw0 ? mjw0Var : null;
                mq70 mq70Var5 = mjw0Var2 != null ? mjw0Var2.a.b : null;
                if (mq70Var5 != null) {
                    up70VarA = mq70Var5.a(vp70Var);
                } else {
                    up70VarA = null;
                }
            } else {
                up70VarA = null;
            }
            if (up70VarA != null) {
                mjw0 mjw0Var3 = pjw0Var.b;
                mjw0 mjw0Var4 = mjw0Var3 instanceof mjw0 ? mjw0Var3 : null;
                mq70 mq70Var6 = mjw0Var4 != null ? mjw0Var4.a.b : null;
                if (mq70Var6 == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                lx61Var2 = new lx61(mq70Var6, 3);
            } else {
                if (((xkk1Var2 == null || (z6j1Var = xkk1Var2.c) == null) ? null : z6j1Var.b.a(vp70Var)) != null) {
                    z6j1 z6j1Var2 = xkk1Var2.c;
                    mq70 mq70Var7 = z6j1Var2 != null ? z6j1Var2.b : null;
                    if (mq70Var7 == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    lx61Var3 = new lx61(mq70Var7, 3);
                } else {
                    if (((xkk1Var2 == null || (mq70Var = xkk1Var2.a) == null) ? null : mq70Var.a(vp70Var)) != null) {
                        Set set2 = s4b1.f;
                        lx61Var3 = new lx61(xkk1Var2.a, upb1.a[uic.x(str6).c.ordinal()] == 1 ? 2 : 1);
                    } else {
                        lx61Var2 = null;
                    }
                }
                lx61Var2 = lx61Var3;
            }
            if (((lx61Var2 == null || (mq70Var2 = lx61Var2.a) == null) ? null : mq70Var2.a(vp70Var)) != null) {
                pp70 pp70Var = lx61Var.a.b;
                u7h u7hVar = pp70Var != null ? new u7h(pp70Var.c.a.b.a()) : null;
                up70 up70VarA3 = lx61Var.a.a(vp70Var);
                if (up70VarA3 == null || (str2 = up70VarA3.a.a) == null) {
                    str2 = "";
                }
                zs00 zs00Var = new zs00(str2, lx61Var.b);
                up70 up70VarA4 = lx61Var2.a.a(vp70Var);
                if (up70VarA4 != null && (str3 = up70VarA4.a.a) != null) {
                    str4 = str3;
                }
                return new ws00(vs00Var, str, p7h.M(new zs00[]{zs00Var, new zs00(str4, lx61Var2.b)}), u7hVar);
            }
        }
        return new ws00(vs00Var, str, (List) null, (u7h) null);
    }
}
